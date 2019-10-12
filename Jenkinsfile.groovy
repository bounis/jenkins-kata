pipeline{
    agent any
    parameters{
        string(name: "release_version", description: "Which version?")
        string(name: "development_version", description: "Which version?")
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