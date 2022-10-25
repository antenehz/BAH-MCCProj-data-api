node {
    stage('Checkout') {
        git branch: 'main', url: 'https://github.com/antenehz/BAH-MCCProj-data-api.git'
    }
    
    stage('Pull Latest Changes') {
        'git pull'
    }
    
    stage('Gradle') {
        'gradle clean build bootJar'
    }
    
    stage('User Acceptance Test') {
        def response= input message: 'Is this build good to go?',
        parameters: [choice(choices: 'Yes\nNo',
        description: '', name: 'Pass')]
        if(response=="Yes") {
            stage('Deploy') {
                bat 'gradle build -x test'
            }
        }
    }
}

