job('node js example'){
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
        shell('npm install')
    }
}