
pipeline {
    agent any

    tools {
      
        maven "Maven 3.9.3"
    }

    stages {
        stage('Build') {
            steps {
                
                git 'https://github.com/therealdhars/DharshenJenkinz.git'

                
                sh "mvn -Dmaven.test.failure.ignore=true clean package"


            }

            post {
            
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
    }
}
