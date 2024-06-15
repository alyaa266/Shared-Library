#!/usr/bin/env groovy

def call(){ 
	withSonarQubeEnv(sq)
  {
     Sh "./gradlew sonarqube"
  }
}
