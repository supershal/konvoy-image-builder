package _self

import _self.buildTypes.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project
import jetbrains.buildServer.configs.kotlin.v2019_2.RelativeId
import jetbrains.buildServer.configs.kotlin.v2019_2.projectFeatures.buildReportTab

object KIBProject: Project({
   buildType(BuildChainAMICentOS79)
})
