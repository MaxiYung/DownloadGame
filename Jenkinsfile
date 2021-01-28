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
        
    stage('uploadGame'){
        sh 'git clone https://github.com/MaxiYung/DinoGame.git'
        sh 'mv DevOpsGame.zip DinoGame/'
        sh 'cd DinoGame/; pwd; git checkout -b UploadedByJenkins; git add DevOpsGame.zip; git commit -m "Added DinoGame!";     git push --set-upstream origin UploadedByJenkins'
        
    }
    
    
    stage('notify'){
    emailext (
        to: 'maxiyung@gmail.com',
        subject: "Test DevOps",
        body: "https://github.com/MaxiYung/DinoGame/tree/UploadedByJenkins"
    )
    }
    
}
    