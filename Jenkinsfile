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
        
           stage ('Artifactory configuration') {

            steps {

                rtServer (

                    id: "ARTIFACTORY_SERVER",

                    url: SERVER_URL,

                    credentialsId: CREDENTIALS

                )



                rtMavenDeployer (

                    id: "MAVEN_DEPLOYER",

                    serverId: "ARTIFACTORY_SERVER",

                    releaseRepo: "libs-release-local",

                    snapshotRepo: "libs-snapshot-local"

                )



                rtMavenResolver (

                    id: "MAVEN_RESOLVER",

                    serverId: "ARTIFACTORY_SERVER",

                    releaseRepo: "libs-release",

                    snapshotRepo: "libs-snapshot"

                )

            }

        }
    }
}
