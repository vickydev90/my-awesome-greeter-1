#!/usr/bin/groovy

@Library('npmBuild_nix')
def nodeJS = new com.jenkins.library.NodeJS()

configuration = '/conf/config.json'

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
	   	  nodeJS.npm('install --save-dev typescript')
	   	  nodeJS.npmRun('build')
	        }
	     }	
          }	
    }
}
