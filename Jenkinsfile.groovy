pipeline{
    agent any
    parameters{
        string(name: "releaseVersion", description: "Which version?")
        string(name: "developmentVersion", description: "Which version?")
    }
    stages{
        stage ('build') {
            steps{
                checkout scm
                sh"mvn release:clean release:prepare release:perform -DreleaseVersion=${params.releaseVersion}" +
                        " -DdevelopmentVersion=${params.developmentVersion} -Dtag=${params.releaseVersion}"
            }
        }
    }

}