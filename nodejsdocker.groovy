job('nodejs docker example'){
    scm{
        git('https://github.com/adaksritiman24/first-jenkins-demo.git'){ node ->
            node / gitConfigName('adaksritiman24')
            node / gitConfigEmail('adaksritiman24@gmail.com')
        }
    }

    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs')
    }

    steps{
        dockerBuildAndPublish {
            repositoryName('sritiman24/docker-nodejs-demo')
            tag('${GIT_REVISION,length=9}')
            registryCredentials('docker-hub')
            forcePull(false)
            forceTag(false)
            createFingerprints(false)
            skipDecorate()
        }
    }
}