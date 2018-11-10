#!/usr/bin/groovy

@Library('npmBuild_nix')
def nodeJS = new com.jenkins.library.NodeJS()

def configuration = "/conf/config.json"

pipeline {
  agent any  
    stages {
  	 stage('Checkout') {  
	     steps {
		checkout scm
	     }
         }
         stage('build') {
              steps {
              script {
	   	  nodeJS.npm('install --save-dev typescript', configuration)
	   	  nodeJS.npmRun('build')
	   	  nodeJS.getVersionFromPackageJSON()
	     }
	     }	
          }	
    }
}
