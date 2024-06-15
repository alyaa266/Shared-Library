#!/usr/bin/env groovy

def call(){ 
	withSonarQubeEnv(installationName: 'sq' ) { 
	
		sh"./gradlew sonarqube"
	 
	}

}
