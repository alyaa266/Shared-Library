#!/usr/bin/env groovy

def call(){ 
	withSonarQubeEnv(credentialsId: 'sonarqube',installationName: 'sq' ) { 
	
		sh"./gradlew sonarqube   -Dsonar.projectKey=App-spring  -Dsonar.host.url=http://http://127.0.0.1:9000 "
	 
	}
}
