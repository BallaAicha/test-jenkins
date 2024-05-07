pipeline {
    agent any
    tools{
        maven 'maven383'
    }
    stages {
        stage('Get maven version') {
            steps {
                sh 'mvn --version'
            }
        }
    }
}