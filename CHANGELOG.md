# Changelog

## [1.15.0](https://github.com/supershal/konvoy-image-builder/compare/v1.14.0...v1.15.0) (2022-05-24)


### Features

* Add "dry run" build mode ([#228](https://github.com/supershal/konvoy-image-builder/issues/228)) ([e56fdea](https://github.com/supershal/konvoy-image-builder/commit/e56fdea37b217cb4c218ddd366fbe6bb6a203879))
* adds a rhel 8 packer build ([ae94571](https://github.com/supershal/konvoy-image-builder/commit/ae9457178b5d89ea68722eb297ec65ab2656b48b))
* adds an upload artifacts command to konvoy image builder ([#214](https://github.com/supershal/konvoy-image-builder/issues/214)) ([9ed1806](https://github.com/supershal/konvoy-image-builder/commit/9ed18066608bf2570ce4ed76b5559d82ade78e93))
* adds goss validation for rhel ([3a72a50](https://github.com/supershal/konvoy-image-builder/commit/3a72a5026c45dff2f88a7d20a93caf4e370b5ec2))
* adds instance type override option to build app ([c57bf18](https://github.com/supershal/konvoy-image-builder/commit/c57bf186800fd19d6b4f041f89b809da4c3d0b9e))
* adds nvidia-container-toolkit and setup ([7bd1d3e](https://github.com/supershal/konvoy-image-builder/commit/7bd1d3e35b013eddcb5bb5acb26b16de6c77b9cd))
* adds RHEL 8.4 packer config ([#128](https://github.com/supershal/konvoy-image-builder/issues/128)) ([44967dd](https://github.com/supershal/konvoy-image-builder/commit/44967dd5df4e97c3934734000c2858f3e5d7b989))
* allow user to run ssh communicator through bastion ([#251](https://github.com/supershal/konvoy-image-builder/issues/251)) ([84e9674](https://github.com/supershal/konvoy-image-builder/commit/84e967431ac9b1dc8b7563536006c8b15e574562))
* **ansible:** `list-images` use role dependencies ([e334541](https://github.com/supershal/konvoy-image-builder/commit/e334541b05dce2fc44b8b4d467702128008d710c))
* **ansible:** split `containerd` role from `packages` ([edd3d35](https://github.com/supershal/konvoy-image-builder/commit/edd3d353d989f31253260cfadec8c5e0503dff28))
* **ansible:** split `kubeadm` role from `packages` ([772be9b](https://github.com/supershal/konvoy-image-builder/commit/772be9bb76eba471af32e63fd49c1a52ca02837f))
* **ansible:** split `repo` role from `packages` ([c7e961c](https://github.com/supershal/konvoy-image-builder/commit/c7e961c764b6de0fda888695d2c5bd9b84c3ec2c))
* **azure:** add azure `--instance-type` ([f5e1940](https://github.com/supershal/konvoy-image-builder/commit/f5e1940cfd776c5cab3c660af1c28ac17af681b3))
* **azure:** support flatcar images ([6773d1c](https://github.com/supershal/konvoy-image-builder/commit/6773d1cf609eb6f3a6e20ef538d38b67665128b7))
* **azure:** support oracle images ([c11780a](https://github.com/supershal/konvoy-image-builder/commit/c11780a1d9fa48089bbb8f35b483a1a9202f2612))
* **azure:** support rhel images ([cdef472](https://github.com/supershal/konvoy-image-builder/commit/cdef4724278ce6e7860ca431d699c07cd9d565da))
* **azure:** support sles images ([49a7745](https://github.com/supershal/konvoy-image-builder/commit/49a774523ebaab6b7a26a229330f9dea5173b7b3))
* **azure:** support ubuntu images ([91dac7f](https://github.com/supershal/konvoy-image-builder/commit/91dac7ffc7edf6251898c96143b11a2406b34f3d))
* bulild vsphere template in air gapped environment ([#246](https://github.com/supershal/konvoy-image-builder/issues/246)) ([5a2c62f](https://github.com/supershal/konvoy-image-builder/commit/5a2c62f95a0293a20dda1ebfd78f7c5fcbb4915e))
* bump Containerd to 1.4.11 ([#127](https://github.com/supershal/konvoy-image-builder/issues/127)) ([339424d](https://github.com/supershal/konvoy-image-builder/commit/339424da56068c00e3dfa7af08a8d8d32ae0e3fe))
* bump k8s to 1.22.4 ([d36a81d](https://github.com/supershal/konvoy-image-builder/commit/d36a81dd2646e72e247ecca1aedf336bd449cb95))
* bump k8s to v1.21.6 ([b2fcdc5](https://github.com/supershal/konvoy-image-builder/commit/b2fcdc5533a73f38200c2b278b903de191ce8360))
* bump kubernetes to 1.22.8 and use the new automated repos ([809bbd9](https://github.com/supershal/konvoy-image-builder/commit/809bbd9baf29df21e44512444da3795a8195cca6))
* convert centos 7 minimal iso to docker image ([#195](https://github.com/supershal/konvoy-image-builder/issues/195)) ([b8ecfc5](https://github.com/supershal/konvoy-image-builder/commit/b8ecfc57bf0444471e8882ebf27e8e6df6f981bb))
* create RHEL 8.2 and RHEL 8.4 fips image for air-gapped installations ([#208](https://github.com/supershal/konvoy-image-builder/issues/208)) ([51af272](https://github.com/supershal/konvoy-image-builder/commit/51af272d1c039c564551dbe7f70218629a426edf))
* create vsphere template image for RedHat 8.4 and 7.9 ([#239](https://github.com/supershal/konvoy-image-builder/issues/239)) ([b5e7abe](https://github.com/supershal/konvoy-image-builder/commit/b5e7abe50acf824e7244a8fb63440164b8ec03ac))
* disable firewalld and flush Iptable rules ([#156](https://github.com/supershal/konvoy-image-builder/issues/156)) ([9924865](https://github.com/supershal/konvoy-image-builder/commit/9924865e9cb77fb7b60f51b6d6e5812c4a6430a0))
* gather images dynamically ([3fe415f](https://github.com/supershal/konvoy-image-builder/commit/3fe415f0b6fa176c4b9baa0f363303b867f08ff3))
* **gpu:** add image tags ([0013788](https://github.com/supershal/konvoy-image-builder/commit/001378809917a73b795e6c83f7bef789201f1811))
* **oracle:** support installing RHCK kernel  ([#327](https://github.com/supershal/konvoy-image-builder/issues/327)) ([126b7aa](https://github.com/supershal/konvoy-image-builder/commit/126b7aad53924ae53b5846341a689436f485fd6f))
* os package bundle  ([#176](https://github.com/supershal/konvoy-image-builder/issues/176)) ([dba46ae](https://github.com/supershal/konvoy-image-builder/commit/dba46aebd4abd806621f30a9c9054f7f25033cd6))
* push image on release ([52a05f2](https://github.com/supershal/konvoy-image-builder/commit/52a05f294ca360a6efc46d833e81f00b92cfc1ee))
* remove image.yaml argument from provision ([dc99b7e](https://github.com/supershal/konvoy-image-builder/commit/dc99b7e66501d4f1f448efa97ef12bfff7cd98b2))
* remove outdated packages and unarchive again on changes ([3d54f5c](https://github.com/supershal/konvoy-image-builder/commit/3d54f5c810e665e98aa5b83d5ac20f8ddb9ca13e))
* remove special variables for flatcar provisions ([e1fca56](https://github.com/supershal/konvoy-image-builder/commit/e1fca56fb0c815c68cc225c2449fd020e6054a42))
* RHEL 8.4, RHEL 8.2 & RHEL 7.9 GPU support ([#135](https://github.com/supershal/konvoy-image-builder/issues/135)) ([a4163a3](https://github.com/supershal/konvoy-image-builder/commit/a4163a37113ac3940106f19b2c85c2b8efeea67d))
* rhel82 FIPS ([#200](https://github.com/supershal/konvoy-image-builder/issues/200)) ([1688a02](https://github.com/supershal/konvoy-image-builder/commit/1688a028fc8a350eb04c3bd1355f40c06b90a2f4))
* set cloudinit feature flag ([f26bdf5](https://github.com/supershal/konvoy-image-builder/commit/f26bdf58bdf46448c07740d736aa005e922e41ed))
* support azure ([#230](https://github.com/supershal/konvoy-image-builder/issues/230)) ([016481a](https://github.com/supershal/konvoy-image-builder/commit/016481af838a878dcbfa7e7f94c5be958e35364d))
* Upgrade NVIDIA GPU drivers to 470.x  ([#96](https://github.com/supershal/konvoy-image-builder/issues/96)) ([eb7bfe0](https://github.com/supershal/konvoy-image-builder/commit/eb7bfe04c6527dfd1dc4e15f2ce71b60cea5400e))
* use containerd with flatcar ([#300](https://github.com/supershal/konvoy-image-builder/issues/300)) ([b96f8bc](https://github.com/supershal/konvoy-image-builder/commit/b96f8bc65fa63cd047fe8d2ae1802005e2fe37c4))
* use published os-packages-bundles ([680d56e](https://github.com/supershal/konvoy-image-builder/commit/680d56e9035980b47a40fc3a532c443d71db173e))


### Bug Fixes

* (flatcar) restart containerd upon reconfig ([f9a2ea7](https://github.com/supershal/konvoy-image-builder/commit/f9a2ea79d1cde43158f25909589613439e64d989))
* (redhat) restart containerd upon reconfig ([2ec9a23](https://github.com/supershal/konvoy-image-builder/commit/2ec9a2306c193184348acfcf2a57052acac3ca74))
* add ignore to lint issues ([95e80f0](https://github.com/supershal/konvoy-image-builder/commit/95e80f0bcce74504042746e19375c240218122ed))
* add missing RPMs needed for CentOS 7 minimal ([1b54d34](https://github.com/supershal/konvoy-image-builder/commit/1b54d34d425843d346af102ffe2da773368d4c21))
* add testify to go.mod ([91c38d5](https://github.com/supershal/konvoy-image-builder/commit/91c38d500238fae2f996e6164bf65e5505986587))
* adds a v1 ([ac6e72f](https://github.com/supershal/konvoy-image-builder/commit/ac6e72fb197e73050f56b941a1f850dfe5338f0a))
* adds more conditions for iptables service ([#169](https://github.com/supershal/konvoy-image-builder/issues/169)) ([386041a](https://github.com/supershal/konvoy-image-builder/commit/386041a1ea57ef8b954d6c0a6a748d1af52a5c0f))
* allow for setting disksize in ec2_gpu target ([64e1d18](https://github.com/supershal/konvoy-image-builder/commit/64e1d18d5baa89ceee3b948bdaa013906e1e7fe4))
* Allow user to provide a subset of registry configuration fields ([3571d3a](https://github.com/supershal/konvoy-image-builder/commit/3571d3ade91131fe9cbd439788500d733a1a1613))
* allows for selecting nvidia runtime via docker cli ([a6b89f9](https://github.com/supershal/konvoy-image-builder/commit/a6b89f9eb863afe10b9592863f015c80ce4c4082))
* allows users to set kubernetes version through flag in build command ([04681f1](https://github.com/supershal/konvoy-image-builder/commit/04681f120d929103253e8efd02f03ada63311f3a))
* always select x86_64 arch for Flatcar ([#171](https://github.com/supershal/konvoy-image-builder/issues/171)) ([d8b792b](https://github.com/supershal/konvoy-image-builder/commit/d8b792b562a30549880360575675845015e4c367))
* **ansible:** allow rsa public keys ([#271](https://github.com/supershal/konvoy-image-builder/issues/271)) ([291e922](https://github.com/supershal/konvoy-image-builder/commit/291e9220b843560e7c905b48dd0c1b63ca8a7ab2))
* **ansible:** reuse roles for image saving ([e298986](https://github.com/supershal/konvoy-image-builder/commit/e298986a6c16e6b2ba82619bab46045346a9f097))
* apply suggestions from code review to clean up build name and examples ([6151b30](https://github.com/supershal/konvoy-image-builder/commit/6151b30332c7e59dd733c1d85a2d908c2277ec5c))
* **app:** remove unused `gen.go` ([8bf34b3](https://github.com/supershal/konvoy-image-builder/commit/8bf34b35eb56e30f6226b3092bed9a5db20fba53))
* **aws:** deprecate `--aws-instance-type` ([e0dcc56](https://github.com/supershal/konvoy-image-builder/commit/e0dcc561e0286db15ac480f55e8a3291e6e5f544))
* **azure:** always ensure image definitions ([965a769](https://github.com/supershal/konvoy-image-builder/commit/965a769a5d0a50287576144d1d67bcee133c7b78))
* **azure:** append build name to image sku ([#326](https://github.com/supershal/konvoy-image-builder/issues/326)) ([b921f42](https://github.com/supershal/konvoy-image-builder/commit/b921f42a9df41a721d3a571a03a2c3c3d961d4ec))
* **azure:** fix rhel 8 build name ([9e8ec95](https://github.com/supershal/konvoy-image-builder/commit/9e8ec952b789bb7ceb4c469c5a1b3512402d640c))
* change kubelet and kubeadm sysusr prefix ([272831b](https://github.com/supershal/konvoy-image-builder/commit/272831bfab6e1e97693575758c17e812a8a2408b))
* check cloud init version as well ([eb307f7](https://github.com/supershal/konvoy-image-builder/commit/eb307f732cd0992cb658fd69e1248577ccf1a041))
* cleanup vsphere VM when building vSphere template in dry run ([#283](https://github.com/supershal/konvoy-image-builder/issues/283)) ([44b1a94](https://github.com/supershal/konvoy-image-builder/commit/44b1a9423b34ab444d095834a4537fafe7ca10ea))
* **cmd:** add subcommads to `build` and `generate` ([4fb3798](https://github.com/supershal/konvoy-image-builder/commit/4fb3798804ca403ae547566046a7052f6dfacdf9))
* configure NetworkManager to prevent interfering with interfaces ([#231](https://github.com/supershal/konvoy-image-builder/issues/231)) ([36de19f](https://github.com/supershal/konvoy-image-builder/commit/36de19f3ec5b6401240d5ee0082ae59b3efacc2c))
* create systemd drop-in to disable NetworkManager-cloud-setup service ([2f6011a](https://github.com/supershal/konvoy-image-builder/commit/2f6011aeef8770802c5fd5db7ccb18fdda3ae1c2))
* debian installs to dist-packages when installing cloud init. Carve ([ce92e75](https://github.com/supershal/konvoy-image-builder/commit/ce92e75b7531abbd22f45d7da218158143d998b0))
* **devkit:** pass `AZURE_TENANT_ID` to devkit ([94f44bc](https://github.com/supershal/konvoy-image-builder/commit/94f44bca8b26886af8d7d303484a118270c5420f))
* disable nm-cloud-setup only for AWS provider ([9da50ce](https://github.com/supershal/konvoy-image-builder/commit/9da50ce65525199efdf33e647f81751484fb1968))
* don't run goreleaser on PRs ([a620aaf](https://github.com/supershal/konvoy-image-builder/commit/a620aaf163d798d90c0e911409edbce2fa3ce663))
* ec2_gpu exclusive run handler for systemd reload ([a1ba975](https://github.com/supershal/konvoy-image-builder/commit/a1ba9751312e3f20e0a76af03e0255cdd76c7ad5))
* fixes undefined variables in flatcar ec2_gpu runs ([d061a11](https://github.com/supershal/konvoy-image-builder/commit/d061a11c10d11f277a9a366b77de210ec4f8a7f2))
* fixes version lock to set fact ([ebaba83](https://github.com/supershal/konvoy-image-builder/commit/ebaba83028e79adf8fb295b26961a18a15e9be50))
* **flatcar:** fix no update settings ([#308](https://github.com/supershal/konvoy-image-builder/issues/308)) ([03a618c](https://github.com/supershal/konvoy-image-builder/commit/03a618cf8b4901fbcf66572185c55ea77094cc16))
* go-mod tidy ([7ccfaa7](https://github.com/supershal/konvoy-image-builder/commit/7ccfaa77ee44e2ef775c8c4f2c52390fdfa57eb8))
* hardcode v3.4.x etcd version ([8d9c8e9](https://github.com/supershal/konvoy-image-builder/commit/8d9c8e924906cf55ddbab161b410fe60eee0d804))
* have extra-vars work ([a9b962b](https://github.com/supershal/konvoy-image-builder/commit/a9b962ba6071d68e2b45f22b43b68de1a47581ff))
* lint errors ([46a6b19](https://github.com/supershal/konvoy-image-builder/commit/46a6b195ca8528b19fa171e21f739d1f5cc8e951))
* lint errors ([53586e0](https://github.com/supershal/konvoy-image-builder/commit/53586e00b7c2a55d666a329f114de2bb56b7270c))
* **lint:** don't lint CHANGELOG.md ([b8401b2](https://github.com/supershal/konvoy-image-builder/commit/b8401b2b00d1751da70a60789daf87613c611014))
* **lint:** fix markdown rules ([b052bff](https://github.com/supershal/konvoy-image-builder/commit/b052bff48bd215d032c364518b94d54015e0d617))
* **lint:** fix textlint rules ([731e192](https://github.com/supershal/konvoy-image-builder/commit/731e192937f5761da0d1fda01d9b8b3f76c2cf9f))
* linting errors in changelog ([4eb2f96](https://github.com/supershal/konvoy-image-builder/commit/4eb2f9613953743b4bb007f97ccdd81bc6acee64))
* makefile targets for NVIDIA GPU support ([#285](https://github.com/supershal/konvoy-image-builder/issues/285)) ([b56c5af](https://github.com/supershal/konvoy-image-builder/commit/b56c5afd51bad97844112854521a6aae8d7ff305))
* makes docs ([9d7ec72](https://github.com/supershal/konvoy-image-builder/commit/9d7ec72f87a3ce40250344eb01c1d46b0e0dd7be))
* move goreleaser to where it really is ([82992d5](https://github.com/supershal/konvoy-image-builder/commit/82992d53d1c1b5a75baa15f5d14120000e58b706))
* no default container runtime and set the socket to be in docker again ([629e306](https://github.com/supershal/konvoy-image-builder/commit/629e306339fbcd47ec797593c1d4e7f8f04d04d8))
* **os-packages:** prevent clean error ([cda2e50](https://github.com/supershal/konvoy-image-builder/commit/cda2e50d6b4da98d15209168b19791bb3e44cd1a))
* **os-packages:** set defaults for targets ([3bfc439](https://github.com/supershal/konvoy-image-builder/commit/3bfc439a2daf17baae37fe364a1d48c5588c574c))
* ova packer template ([ebcd1da](https://github.com/supershal/konvoy-image-builder/commit/ebcd1da234e4fd8d7a13030b4b49b77ee74a093b))
* **packer:** fix spacing typo in packer template ([92fa950](https://github.com/supershal/konvoy-image-builder/commit/92fa950a29d8694dfd83e1817b643cc4c23095f0))
* **pkg:** remove unused `config` package ([1c6509a](https://github.com/supershal/konvoy-image-builder/commit/1c6509a97fe057b93b2d6414bb6b303df44adaea))
* prevents use of cgroupsv2 for flatcar gpu ([6a7546b](https://github.com/supershal/konvoy-image-builder/commit/6a7546b90d644969278c75d9d79ccf2ad95ac334))
* propogate release variables to buildkit run ([5ef5c3c](https://github.com/supershal/konvoy-image-builder/commit/5ef5c3c55748b347cc2d16257702b4d304b553f5))
* README remove old  test status ([67102d1](https://github.com/supershal/konvoy-image-builder/commit/67102d10fed6449af281b5b8474d27ff5023b63f))
* **release:** run goreleaser on release publish ([f1218a1](https://github.com/supershal/konvoy-image-builder/commit/f1218a13167678c7e49ebc71347eb9f4f7f869a9))
* remove crictl socket info ([e7abd91](https://github.com/supershal/konvoy-image-builder/commit/e7abd919a5ac3d20a78c73211e86c9af4193abdf))
* remove execute bits from playbook ([8a44a81](https://github.com/supershal/konvoy-image-builder/commit/8a44a8127ee6911f3976d22ef146de6a46508bf9))
* remove extra "release"  keyword from vsphere template name ([#336](https://github.com/supershal/konvoy-image-builder/issues/336)) ([a14f6ef](https://github.com/supershal/konvoy-image-builder/commit/a14f6ef6e4e1f2f9306f9138f947c281979b27ab))
* remove note to add promotion job ([d9cd670](https://github.com/supershal/konvoy-image-builder/commit/d9cd6705fe0ef14eeff9bb3d6a29c7bd4d54ca03))
* remove refs to subscription manager ([51d2229](https://github.com/supershal/konvoy-image-builder/commit/51d2229b2a7452a5da746ce0f015c55201bdfdd8))
* remove unused 'global' playbook ([a3356c0](https://github.com/supershal/konvoy-image-builder/commit/a3356c0680449d4108c809f1d9f2e3b7e3bea24f))
* remove unused 'images' group vars ([31eb405](https://github.com/supershal/konvoy-image-builder/commit/31eb4058eb4c9d278bbaecd7f6578722ad4799a1))
* replace broken centos 8 appstream repo with alma linux repos ([#227](https://github.com/supershal/konvoy-image-builder/issues/227)) ([ada2ca9](https://github.com/supershal/konvoy-image-builder/commit/ada2ca94bfd842526a4af9878a1b67ff80e2afa3))
* RHEL8.2 now needs GPU nodes for builds and tests ([#142](https://github.com/supershal/konvoy-image-builder/issues/142)) ([a2f92ce](https://github.com/supershal/konvoy-image-builder/commit/a2f92ceb6241470669578cdc5ad17942bdcc46de))
* run make docs for generate ([29091b1](https://github.com/supershal/konvoy-image-builder/commit/29091b1a06c5fb3a0973b0bac077b1760d7477d6))
* run make docs to fix broken tests ([22ffc33](https://github.com/supershal/konvoy-image-builder/commit/22ffc330869ef89a68275211cc98fae17aa5a939))
* set correct path for kubelet service ([2bb596e](https://github.com/supershal/konvoy-image-builder/commit/2bb596e94d663a19de58465b45731d68e5ca94de))
* set language in code block ([9ee8b7f](https://github.com/supershal/konvoy-image-builder/commit/9ee8b7f5b09b93682397b1b66119c9fe7363f3ff))
* set outputs from release please ([#351](https://github.com/supershal/konvoy-image-builder/issues/351)) ([65dce6f](https://github.com/supershal/konvoy-image-builder/commit/65dce6f1271198d4c45f8004f8b89e0dc478bcfc))
* set the correct KIB version ami tag ([d92dd74](https://github.com/supershal/konvoy-image-builder/commit/d92dd744a92edcd8b3d0aae10a0cba44d78b5dd0))
* support flatcar 3033.2.0 ([#299](https://github.com/supershal/konvoy-image-builder/issues/299)) ([43bdfd2](https://github.com/supershal/konvoy-image-builder/commit/43bdfd27298414130c4b3703636377c2c64fd8c7))
* template containerd config correctly with correct runtime endpoint ([504e73a](https://github.com/supershal/konvoy-image-builder/commit/504e73a2dad153e8d3c1ef6bb97930bcd7502fa2))
* update docs ([31749c9](https://github.com/supershal/konvoy-image-builder/commit/31749c9f09dcfb45aeab6a6deb4ae7dbc07f0b5f))
* update for upcoming linter bump ([#155](https://github.com/supershal/konvoy-image-builder/issues/155)) ([700ff91](https://github.com/supershal/konvoy-image-builder/commit/700ff91f824bdfb3c182483fe601451bbe1cbdb9))
* updates invalid PHONY attribute ([#134](https://github.com/supershal/konvoy-image-builder/issues/134)) ([3fdc298](https://github.com/supershal/konvoy-image-builder/commit/3fdc298f0acb9d9682b08265ff9aee44e5ac699a))
* updates kernel source retrieval ([2cfdb6b](https://github.com/supershal/konvoy-image-builder/commit/2cfdb6be2fa5924f8051649bcb3ea931ef474741))
* use "v" in versions ([3e57aae](https://github.com/supershal/konvoy-image-builder/commit/3e57aae595cde0a1d605d437be0354acbadc1322))
* use bastion in offline fips ova rhel builds ([#307](https://github.com/supershal/konvoy-image-builder/issues/307)) ([8d3e338](https://github.com/supershal/konvoy-image-builder/commit/8d3e3387779df6117e65ed98783ae1bc1194a69d))
* use crictl to pull images and supports mirrors ([#252](https://github.com/supershal/konvoy-image-builder/issues/252)) ([f14f841](https://github.com/supershal/konvoy-image-builder/commit/f14f841c5d325d9677349c18f5e717109e661e7f))
* use dev/xvda as default volume for flatcar ([d350a26](https://github.com/supershal/konvoy-image-builder/commit/d350a26d88ff667588f7025a0f2ea030bcb8b571))
* use t3 small instances for molecule rhel tests ([2d4fcde](https://github.com/supershal/konvoy-image-builder/commit/2d4fcdece69236b4d1cb1ee61464d3341705a944))
* wire up provision flags correctly ([5e03de0](https://github.com/supershal/konvoy-image-builder/commit/5e03de08a566c2948a69e1b682703a71fbbfc6fe))

## [1.14.0](https://github.com/mesosphere/konvoy-image-builder/compare/v1.13.2...v1.14.0) (2022-05-20)


### Features

* **gpu:** add image tags ([0013788](https://github.com/mesosphere/konvoy-image-builder/commit/001378809917a73b795e6c83f7bef789201f1811))


### Bug Fixes

* remove extra "release"  keyword from vsphere template name ([#336](https://github.com/mesosphere/konvoy-image-builder/issues/336)) ([a14f6ef](https://github.com/mesosphere/konvoy-image-builder/commit/a14f6ef6e4e1f2f9306f9138f947c281979b27ab))

### [1.13.2](https://github.com/mesosphere/konvoy-image-builder/compare/v1.13.1...v1.13.2) (2022-05-11)


### Bug Fixes

* README remove old  test status ([67102d1](https://github.com/mesosphere/konvoy-image-builder/commit/67102d10fed6449af281b5b8474d27ff5023b63f))

### [1.13.1](https://github.com/mesosphere/konvoy-image-builder/compare/v1.13.0...v1.13.1) (2022-05-11)


### Bug Fixes

* adds a v1 ([ac6e72f](https://github.com/mesosphere/konvoy-image-builder/commit/ac6e72fb197e73050f56b941a1f850dfe5338f0a))

## [1.13.0](https://github.com/mesosphere/konvoy-image-builder/compare/v1.12.0...v1.13.0) (2022-05-09)


### Features

* **azure:** add azure `--instance-type` ([f5e1940](https://github.com/mesosphere/konvoy-image-builder/commit/f5e1940cfd776c5cab3c660af1c28ac17af681b3))


### Bug Fixes

* **aws:** deprecate `--aws-instance-type` ([e0dcc56](https://github.com/mesosphere/konvoy-image-builder/commit/e0dcc561e0286db15ac480f55e8a3291e6e5f544))
* **azure:** append build name to image sku ([#326](https://github.com/mesosphere/konvoy-image-builder/issues/326)) ([b921f42](https://github.com/mesosphere/konvoy-image-builder/commit/b921f42a9df41a721d3a571a03a2c3c3d961d4ec))
* **azure:** fix rhel 8 build name ([9e8ec95](https://github.com/mesosphere/konvoy-image-builder/commit/9e8ec952b789bb7ceb4c469c5a1b3512402d640c))

## [1.12.0](https://github.com/mesosphere/konvoy-image-builder/compare/v1.11.0...v1.12.0) (2022-04-14)


### Features

* use containerd with flatcar ([#300](https://github.com/mesosphere/konvoy-image-builder/issues/300)) ([b96f8bc](https://github.com/mesosphere/konvoy-image-builder/commit/b96f8bc65fa63cd047fe8d2ae1802005e2fe37c4))


### Bug Fixes

* **flatcar:** fix no update settings ([#308](https://github.com/mesosphere/konvoy-image-builder/issues/308)) ([03a618c](https://github.com/mesosphere/konvoy-image-builder/commit/03a618cf8b4901fbcf66572185c55ea77094cc16))
* use bastion in offline fips ova rhel builds ([#307](https://github.com/mesosphere/konvoy-image-builder/issues/307)) ([8d3e338](https://github.com/mesosphere/konvoy-image-builder/commit/8d3e3387779df6117e65ed98783ae1bc1194a69d))

## [1.11.0](https://github.com/mesosphere/konvoy-image-builder/compare/v1.10.0...v1.11.0) (2022-04-07)


### Features

* **azure:** support flatcar images ([6773d1c](https://github.com/mesosphere/konvoy-image-builder/commit/6773d1cf609eb6f3a6e20ef538d38b67665128b7))
* **azure:** support oracle images ([c11780a](https://github.com/mesosphere/konvoy-image-builder/commit/c11780a1d9fa48089bbb8f35b483a1a9202f2612))
* **azure:** support rhel images ([cdef472](https://github.com/mesosphere/konvoy-image-builder/commit/cdef4724278ce6e7860ca431d699c07cd9d565da))
* **azure:** support sles images ([49a7745](https://github.com/mesosphere/konvoy-image-builder/commit/49a774523ebaab6b7a26a229330f9dea5173b7b3))


### Bug Fixes

* support flatcar 3033.2.0 ([#299](https://github.com/mesosphere/konvoy-image-builder/issues/299)) ([43bdfd2](https://github.com/mesosphere/konvoy-image-builder/commit/43bdfd27298414130c4b3703636377c2c64fd8c7))

## [1.10.0](https://github.com/mesosphere/konvoy-image-builder/compare/v1.9.1...v1.10.0) (2022-03-31)


### Features

* **azure:** support ubuntu images ([91dac7f](https://github.com/mesosphere/konvoy-image-builder/commit/91dac7ffc7edf6251898c96143b11a2406b34f3d))


### Bug Fixes

* cleanup vsphere VM when building vSphere template in dry run ([#283](https://github.com/mesosphere/konvoy-image-builder/issues/283)) ([44b1a94](https://github.com/mesosphere/konvoy-image-builder/commit/44b1a9423b34ab444d095834a4537fafe7ca10ea))
* fixes version lock to set fact ([ebaba83](https://github.com/mesosphere/konvoy-image-builder/commit/ebaba83028e79adf8fb295b26961a18a15e9be50))
* hardcode v3.4.x etcd version ([8d9c8e9](https://github.com/mesosphere/konvoy-image-builder/commit/8d9c8e924906cf55ddbab161b410fe60eee0d804))
* makefile targets for NVIDIA GPU support ([#285](https://github.com/mesosphere/konvoy-image-builder/issues/285)) ([b56c5af](https://github.com/mesosphere/konvoy-image-builder/commit/b56c5afd51bad97844112854521a6aae8d7ff305))
* **packer:** fix spacing typo in packer template ([92fa950](https://github.com/mesosphere/konvoy-image-builder/commit/92fa950a29d8694dfd83e1817b643cc4c23095f0))

### [1.9.1](https://github.com/mesosphere/konvoy-image-builder/compare/v1.9.0...v1.9.1) (2022-03-24)


### Bug Fixes

* ova packer template ([ebcd1da](https://github.com/mesosphere/konvoy-image-builder/commit/ebcd1da234e4fd8d7a13030b4b49b77ee74a093b))

## [1.9.0](https://github.com/mesosphere/konvoy-image-builder/compare/v1.8.0...v1.9.0) (2022-03-24)


### Features

* bump k8s to 1.22.4 ([d36a81d](https://github.com/mesosphere/konvoy-image-builder/commit/d36a81dd2646e72e247ecca1aedf336bd449cb95))
* bump kubernetes to 1.22.8 and use the new automated repos ([809bbd9](https://github.com/mesosphere/konvoy-image-builder/commit/809bbd9baf29df21e44512444da3795a8195cca6))
* support azure ([#230](https://github.com/mesosphere/konvoy-image-builder/issues/230)) ([016481a](https://github.com/mesosphere/konvoy-image-builder/commit/016481af838a878dcbfa7e7f94c5be958e35364d))


### Bug Fixes

* **ansible:** allow rsa public keys ([#271](https://github.com/mesosphere/konvoy-image-builder/issues/271)) ([291e922](https://github.com/mesosphere/konvoy-image-builder/commit/291e9220b843560e7c905b48dd0c1b63ca8a7ab2))
* go-mod tidy ([7ccfaa7](https://github.com/mesosphere/konvoy-image-builder/commit/7ccfaa77ee44e2ef775c8c4f2c52390fdfa57eb8))
* **lint:** don't lint CHANGELOG.md ([b8401b2](https://github.com/mesosphere/konvoy-image-builder/commit/b8401b2b00d1751da70a60789daf87613c611014))
* remove note to add promotion job ([d9cd670](https://github.com/mesosphere/konvoy-image-builder/commit/d9cd6705fe0ef14eeff9bb3d6a29c7bd4d54ca03))

## [1.8.0](https://github.com/mesosphere/konvoy-image-builder/compare/v1.7.0...v1.8.0) (2022-03-17)


### Features

* allow user to run ssh communicator through bastion ([#251](https://github.com/mesosphere/konvoy-image-builder/issues/251)) ([84e9674](https://github.com/mesosphere/konvoy-image-builder/commit/84e967431ac9b1dc8b7563536006c8b15e574562))
* bulild vsphere template in air gapped environment ([#246](https://github.com/mesosphere/konvoy-image-builder/issues/246)) ([5a2c62f](https://github.com/mesosphere/konvoy-image-builder/commit/5a2c62f95a0293a20dda1ebfd78f7c5fcbb4915e))
* create vsphere template image for RedHat 8.4 and 7.9 ([#239](https://github.com/mesosphere/konvoy-image-builder/issues/239)) ([b5e7abe](https://github.com/mesosphere/konvoy-image-builder/commit/b5e7abe50acf824e7244a8fb63440164b8ec03ac))


### Bug Fixes

* **app:** remove unused `gen.go` ([8bf34b3](https://github.com/mesosphere/konvoy-image-builder/commit/8bf34b35eb56e30f6226b3092bed9a5db20fba53))
* **cmd:** add subcommads to `build` and `generate` ([4fb3798](https://github.com/mesosphere/konvoy-image-builder/commit/4fb3798804ca403ae547566046a7052f6dfacdf9))
* **lint:** fix markdown rules ([b052bff](https://github.com/mesosphere/konvoy-image-builder/commit/b052bff48bd215d032c364518b94d54015e0d617))
* **lint:** fix textlint rules ([731e192](https://github.com/mesosphere/konvoy-image-builder/commit/731e192937f5761da0d1fda01d9b8b3f76c2cf9f))
* move goreleaser to where it really is ([82992d5](https://github.com/mesosphere/konvoy-image-builder/commit/82992d53d1c1b5a75baa15f5d14120000e58b706))
* **pkg:** remove unused `config` package ([1c6509a](https://github.com/mesosphere/konvoy-image-builder/commit/1c6509a97fe057b93b2d6414bb6b303df44adaea))
* use crictl to pull images and supports mirrors ([#252](https://github.com/mesosphere/konvoy-image-builder/issues/252)) ([f14f841](https://github.com/mesosphere/konvoy-image-builder/commit/f14f841c5d325d9677349c18f5e717109e661e7f))

## [1.7.0](https://github.com/mesosphere/konvoy-image-builder/compare/v1.6.0...v1.7.0) (2022-02-14)


### Features

* use published os-packages-bundles ([680d56e](https://github.com/mesosphere/konvoy-image-builder/commit/680d56e9035980b47a40fc3a532c443d71db173e))


### Bug Fixes

* create systemd drop-in to disable NetworkManager-cloud-setup service ([2f6011a](https://github.com/mesosphere/konvoy-image-builder/commit/2f6011aeef8770802c5fd5db7ccb18fdda3ae1c2))
* disable nm-cloud-setup only for AWS provider ([9da50ce](https://github.com/mesosphere/konvoy-image-builder/commit/9da50ce65525199efdf33e647f81751484fb1968))
* linting errors in changelog ([4eb2f96](https://github.com/mesosphere/konvoy-image-builder/commit/4eb2f9613953743b4bb007f97ccdd81bc6acee64))
* **release:** run goreleaser on release publish ([f1218a1](https://github.com/mesosphere/konvoy-image-builder/commit/f1218a13167678c7e49ebc71347eb9f4f7f869a9))

## [1.6.0](https://github.com/mesosphere/konvoy-image-builder/compare/v1.5.0...v1.6.0) (2022-02-08)


### Features

* Add "dry run" build mode ([#228](https://github.com/mesosphere/konvoy-image-builder/issues/228)) ([e56fdea](https://github.com/mesosphere/konvoy-image-builder/commit/e56fdea37b217cb4c218ddd366fbe6bb6a203879))
* adds an upload artifacts command to konvoy image builder ([#214](https://github.com/mesosphere/konvoy-image-builder/issues/214)) ([9ed1806](https://github.com/mesosphere/konvoy-image-builder/commit/9ed18066608bf2570ce4ed76b5559d82ade78e93))
* convert centos 7 minimal iso to docker image ([#195](https://github.com/mesosphere/konvoy-image-builder/issues/195)) ([b8ecfc5](https://github.com/mesosphere/konvoy-image-builder/commit/b8ecfc57bf0444471e8882ebf27e8e6df6f981bb))
* create RHEL 8.2 and RHEL 8.4 fips image for air-gapped installations ([#208](https://github.com/mesosphere/konvoy-image-builder/issues/208)) ([51af272](https://github.com/mesosphere/konvoy-image-builder/commit/51af272d1c039c564551dbe7f70218629a426edf))
* gather images dynamically ([3fe415f](https://github.com/mesosphere/konvoy-image-builder/commit/3fe415f0b6fa176c4b9baa0f363303b867f08ff3))
* rhel82 FIPS ([#200](https://github.com/mesosphere/konvoy-image-builder/issues/200)) ([1688a02](https://github.com/mesosphere/konvoy-image-builder/commit/1688a028fc8a350eb04c3bd1355f40c06b90a2f4))


### Bug Fixes

* add testify to go.mod ([91c38d5](https://github.com/mesosphere/konvoy-image-builder/commit/91c38d500238fae2f996e6164bf65e5505986587))
* Allow user to provide a subset of registry configuration fields ([3571d3a](https://github.com/mesosphere/konvoy-image-builder/commit/3571d3ade91131fe9cbd439788500d733a1a1613))
* allows users to set kubernetes version through flag in build command ([04681f1](https://github.com/mesosphere/konvoy-image-builder/commit/04681f120d929103253e8efd02f03ada63311f3a))
* **ansible:** reuse roles for image saving ([e298986](https://github.com/mesosphere/konvoy-image-builder/commit/e298986a6c16e6b2ba82619bab46045346a9f097))
* configure NetworkManager to prevent interfering with interfaces ([#231](https://github.com/mesosphere/konvoy-image-builder/issues/231)) ([36de19f](https://github.com/mesosphere/konvoy-image-builder/commit/36de19f3ec5b6401240d5ee0082ae59b3efacc2c))
* have extra-vars work ([a9b962b](https://github.com/mesosphere/konvoy-image-builder/commit/a9b962ba6071d68e2b45f22b43b68de1a47581ff))
* lint errors ([46a6b19](https://github.com/mesosphere/konvoy-image-builder/commit/46a6b195ca8528b19fa171e21f739d1f5cc8e951))
* **os-packages:** prevent clean error ([cda2e50](https://github.com/mesosphere/konvoy-image-builder/commit/cda2e50d6b4da98d15209168b19791bb3e44cd1a))
* **os-packages:** set defaults for targets ([3bfc439](https://github.com/mesosphere/konvoy-image-builder/commit/3bfc439a2daf17baae37fe364a1d48c5588c574c))
* remove execute bits from playbook ([8a44a81](https://github.com/mesosphere/konvoy-image-builder/commit/8a44a8127ee6911f3976d22ef146de6a46508bf9))
* remove unused 'global' playbook ([a3356c0](https://github.com/mesosphere/konvoy-image-builder/commit/a3356c0680449d4108c809f1d9f2e3b7e3bea24f))
* remove unused 'images' group vars ([31eb405](https://github.com/mesosphere/konvoy-image-builder/commit/31eb4058eb4c9d278bbaecd7f6578722ad4799a1))
* replace broken centos 8 appstream repository with alma linux repository ([#227](https://github.com/mesosphere/konvoy-image-builder/issues/227)) ([ada2ca9](https://github.com/mesosphere/konvoy-image-builder/commit/ada2ca94bfd842526a4af9878a1b67ff80e2afa3))
* set the correct KIB version ami tag ([d92dd74](https://github.com/mesosphere/konvoy-image-builder/commit/d92dd744a92edcd8b3d0aae10a0cba44d78b5dd0))
