node {
    stage('Checkout') {
        git url: 'https://github.com/antenehz/BAH-MCCProj-data-api.git'
    }
    
    stage('Pull Latest Changes') {
        'git pull'
    }
    
    stage('Gradle Build') {
        'gradle clean build'
    }
}
