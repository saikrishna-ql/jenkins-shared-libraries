def call(String url, String branch, String credentialsId = '') {
    if (credentialsId?.trim()) {
        git branch: branch, url: url, credentialsId: credentialsId
    } else {
        git branch: branch, url: url
    }
}

