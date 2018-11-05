#!/usr/bin/groovy

@Library('npmBuild_nix')
def nodeJS = new com.jenkins.library.NodeJS()
def config = "conf/config.json"

pipeline
{
  agent { any }
   
    stages {
  	 stage('Checkout'){
	     steps{
		checkout scm
	     }
         }
         stage('build') {
              steps {
	   	nodeJS.npm('install --save-dev typescript')
	   	nodeJS.npmRun('build')
	     }	
          }	
    }
}
