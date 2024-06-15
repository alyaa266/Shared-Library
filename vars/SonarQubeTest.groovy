#!/usr/bin/env groovy

def call(){ 
	withSonarQubeEnv(credentialsId: 'sonarqube',installationName: 'sq' ) { 
	
		sh"./gradlew sonarqube   -Dsonar.projectKey=App-spring  -Dsonar.host.url=http://localhost:9000  -Dsonar.login=1f2363ea04394f148c6c26ee56c6b2bb4950464a"
	 
	}
}
