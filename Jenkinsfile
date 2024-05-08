pipeline {
    agent any
    tools{
        maven 'maven383'
    }
    stages {
        stage('Unit  Tests') {
            steps {
                echo 'Running Unit Tests'
                sh 'mvn --version'
                sh 'mvn test'


            }
        }
        stage('Build') {
            steps {
                echo 'Building the application'
                sh 'mvn clean package -DskipTests=true'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying the application'
                sh 'mvn deploy'
            }
        }



    }
}