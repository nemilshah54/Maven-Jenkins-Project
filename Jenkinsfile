pipeline {
    agent any

    stages {
        
      
        
        stage('Compile') {
            steps {
                at "mvn compile" 
            }
        }
        
         stage('Test') {
            steps {
                bat "mvn test" 
            }
        }
    }
}
