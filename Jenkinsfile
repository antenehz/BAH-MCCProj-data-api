node {
    stage('Checkout') {
        git branch: 'main', url: 'https://github.com/antenehz/BAH-MCCProj-data-api.git'
    }
    
    stage('Gradle') {
        sh 'gradle clean build bootJar'
    }
    
    stage('User Acceptance Test') {
        def response= input message: 'Is this build good to go?',
        parameters: [choice(choices: 'Yes\nNo',
        description: '', name: 'Pass')]
        if(response=="Yes") {
            stage('Deploy') {
                'gradle build -x test'
            }
        }
    }
}

