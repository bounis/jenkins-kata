pipeline{
    agent any
    stages{
        stage ('build') {
            steps{
                checkout scm
                echo "hello world"
            }
        }
    }

}