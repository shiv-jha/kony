node {
   
   stage('checkout') { // for display purposes
    checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'e8dd67e1-4d97-486a-88ec-1635a62b2b1e', url: 'https://github.com/shiv-jha/kony.git']]])
   }
   stage('print') {
     echo 'hello'
   }
   
    stages {
        stage('build') {
            steps {
                sh 'python --version'
            }
        }
    }
  
}
