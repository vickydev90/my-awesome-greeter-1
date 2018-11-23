#!/usr/bin/groovy

@Library('npmBuild_nix')
@Library('workflow_gt')

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
     stage ('Init') {
    	steps {
        	script {
            	echo "Checking git workflow"
            	String gitWorkFlow = gitWorkFlowTypeByBranchRule()
            	echo "gitWorkFlow: ${gitWorkFlow}"
        }
    }
}
     stage('build') {
         steps {
           script {
	   	  //nodeJS.npm('install --save-dev typescript', configuration)
	   	  //nodeJS.npmRun('build', 'release', 'integration', configuration)
	   	  // nodeJS.publishNexus('release', 'integration', configuration)
	     }
	     }	
          }
	
    }
}
