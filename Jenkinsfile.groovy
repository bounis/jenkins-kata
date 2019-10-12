pipeline{
    agent any
    parameters{
        string(name: "release_version")
        string(name: "development_version")
    }
    stages{
        stage ('build') {
            steps{
                checkout scm
                echo "hello world"
            }
        }
    }

}