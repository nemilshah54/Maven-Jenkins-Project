pipeline {
    agent any

    stages {
        
         
        stage('Clean') {
            steps {
                bat "mvn clean" 
            }
        }
      
        
        stage('Compile') {
            steps {
                bat "mvn compile" 
            }
        }
        
         stage('Test') {
            steps {
                bat "mvn test" 
            }
        }
        
         stage('Package') {
            steps {
                bat "mvn package" 
            }
        }
        
           stage('Deploy') {
            steps {
                bat "mvn deploy" 
            }
        }
        
        
    }
}
