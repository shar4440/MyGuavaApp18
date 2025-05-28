pipeline{

  agent any

  tools{
    maven 'Maven'
  }

  stages{
    stage('Checkouts'){
      steps{
        git branch:'master',url : 'https://github.com/shar4440/MyGuavaApp18.git'
      }
    }

    stage('Build'){
      steps{
        sh 'mvn clean package'
      }
    }

    stage('test'){
      steps{
        sh 'mvn test'
      }
    }

    stage('run'){
      steps{
        sh 'mvn exec:java -Dexec.mainClass="com.example.App"'
      }
    }
  }

  post{
    success{
      echo "yes"
    }

    failure{
      echo "noooooo" 
    }
  }
}
