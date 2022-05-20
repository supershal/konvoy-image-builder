package _self.buildTypes

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.finishBuildTrigger
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.retryBuild
import jetbrains.buildServer.configs.kotlin.v2019_2.triggers.vcs

object BuildChainAMICentOS79 : BuildType({
    // templates(DockerWithAwsCreds)
    id("BuildChainAMICentOS79")
    name = "Build Chain - AMI CentOS 7"

    steps {
        // step {
        //     name = "AWS STS Get and Set"
        //     id = "RUNNER_234"
        //     type = "AWS_STS_Get_and_Set"
        //     enabled = false
        //     param("session.duration", "14400")
        //     param("external.id", "zxx6a9615e772903c38da8631ce1984451ce2df7912aa04ca837245899933927715775d03cbe80d301b")
        //     param("role.arn", "arn:aws:iam::999867407951:role/TeamCity/TeamCity-PowerUser")
        // }
        script {
            name = "Build AMI"
            id = "RUNNER_226"
            scriptContent = """
                cat <<EOF > buildchain-overrides.yaml
                build_name_extra: -buildchain
                EOF
                
                make devkit.run WHAT="make centos7 ADDITIONAL_OVERRIDES=buildchain-overrides.yaml ADDITIONAL_ARGS=\"--extra-vars kubernetes-version=%dep.MesosphereOnly_ClosedSource_SecureSigning_BuildNokmemRpmRepos.teamcity.build.branch%\" BUILD_DRY_RUN=true"
            """.trimIndent()
        }
        // script {
        //     name = "AWS Credential used"
        //     id = "RUNNER_244"
        //     enabled = false
        //     scriptContent = "echo %env.AWS_ACCESS_KEY_ID%"
        // }
    }
    vcs {
        root(DslContext.settingsRoot)
    }

    triggers {
        vcs {
            id = "vcsTrigger"
            enabled = false
            branchFilter = """
                +:*
                -:<default>
            """.trimIndent()
        }
        finishBuildTrigger {
            id = "TRIGGER_153"
            buildType = "MesosphereOnly_ClosedSource_SecureSigning_BuildNokmemRpmRepos"
            successfulOnly = true
            branchFilter = """
                +:v*
                -:v1.21.0
            """.trimIndent()
        }
        retryBuild {
            id = "retryBuildTrigger"
            delaySeconds = 120
        }
    }

    dependencies {
        snapshot(AbsoluteId("MesosphereOnly_ClosedSource_SecureSigning_BuildNokmemRpmRepos")) {
        }
    }

    requirements {
        exists("DOCKER_VERSION", "RQ_26")
    }
})
