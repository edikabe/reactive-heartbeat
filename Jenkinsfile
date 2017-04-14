pipeline {
  agent {
    docker {
      image 'maven:3.5.0-jdk-8'
      args '-v /Users/jug/.m2:/root/.m2'
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
        archiveArtifacts 'target/*.jar'
      }
    }
  }
}