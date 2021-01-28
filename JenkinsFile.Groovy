node {
    stage('checkout'){
        
        sh 'svn checkout https://github.com/CharlesPikachu/Games/trunk/Game7'
        
    }
    stage('rename'){
        
        sh 'cd Game7'
        
        sh 'mv Game7/Game7.py Game7/Dino_DevOps.py'
        
        sh 'mv Game7 Dino_DevOps'
        
    }
    stage('zip'){
            zip zipFile: 'DevOpsGame.zip', dir: pwd()+'/Dino_DevOps'
        }
}