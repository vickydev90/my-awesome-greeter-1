#!/usr/bin/groovy

@Library('npmBuild_nix')
def nodeJS = new com.jenkins.library.NodeJS()
def config = "$WORKSPACE/conf/config.json"

node() {

   stage('Checkout'){

          checkout scm
       }

   stage('build'){
	 
	   nodeJS.npm('install --save-dev typescript', config)
	   nodeJS.npmRun('build')
      }
}
