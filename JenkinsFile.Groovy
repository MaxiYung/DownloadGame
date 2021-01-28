node {
    stage('checkout'){
        scm {
            svn('https://github.com/CharlesPikachu/Games/trunk/Game7')
        }
    }
}