package edu.iti;

def build(imageName, imageTag){
    sh "docker build -t ${imageName}:${imageTag} ."
}

def login(dockerUsername, dockerPassword){
    sh "docker login -u ${dockerUsername} -p ${dockerPassword}"    
}

def push(imageName, imageTag){
    sh "docker push ${imageName}:${imageTag}"
}