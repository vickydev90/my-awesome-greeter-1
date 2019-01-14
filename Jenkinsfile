#!/usr/bin/groovy

@Library('npmBuild_nix')
@Library('workflow_gt')
//@Library('gitflowEnablers_multi')

def nodeJS = new com.jenkins.library.NodeJS()

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
         	 echo "Checking git workflow"
             String gitWorkFlow = gitWorkFlowTypeByBranchRule()
             echo "gitWorkFlow: ${gitWorkFlow}"
             env.branch = gitWorkFlow  
         	}
         }

      }
     stage('build') {
         steps {
           script {
             runTask()
	   	     //nodeJS.npm('install --save-dev typescript')
	   	     //nodeJS.npmRun('build', env.branch)
	   	     //nodeJS.publishNexus(env.branch)
	     }
	     } 	
          }
    }
 }