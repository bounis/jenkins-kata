pipeline{
    stages{
        stage ('build') {
            steps{
                checkout scm
                echo "hello world"
            }
        }
    }

}