#!/usr/bin/env groovy

def call(){ 
	withSonarQubeEnv(credentialsId: 'sonarqube',installationName: 'sq' ) { 
	
		sh"./gradlew sonarqube   -Dsonar.projectKey=App-spring  -Dsonar.host.url=http://localhost:9000 "
	 
	}
}
