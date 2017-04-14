pipeline {
  agent {
    docker {
      image 'maven:3.5.0-jdk-8'
    }
    
  }
  stages {
    stage('Init') {
      steps {
        sh '''echo PATH=${PATH}
echo M2_HOME=${M2_HOME}
mvn clean'''
      }
    }
    stage('Build') {
      steps {
        sh 'mvn install '
      }
    }
  }
}