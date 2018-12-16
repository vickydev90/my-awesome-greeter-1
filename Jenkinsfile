#!/usr/bin/groovy

@Library('npmBuild_nix')
@Library('workflow_gt')
//@Library('gitflowEnablers_multi')

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
     stage('init') {
         steps {
           script {
         	 def branchName = 'feature/test'
			 BranchRule rule = new BranchRule(branchName)
             def result = rule.getGitWorkFlow()

             echo "result: ${result}"   
         	}
         }

      }
     stage('build') {
         steps {
           script {
	   	     nodeJS.npm('install --save-dev typescript')
	   	     nodeJS.npmRun('build', 'release', 'integration', configuration)
	   	     nodeJS.publishNexus('release', 'integration', configuration)
	     }
	     } 	
          }
    }
 }