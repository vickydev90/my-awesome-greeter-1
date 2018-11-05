#!/usr/bin/groovy

@Library('npmBuild_nix')
def nodeJS = new com.jenkins.library.NodeJS()
def config = "conf/config.json"

node() {

   stage('Checkout'){

          checkout scm
       }

   stage('build'){
          steps {
	   def workspace = ${WORKSPACE}
           echo  "Workspace is ${workspace}"
	   nodeJS.npm('install --save-dev typescript', workspace)
	   nodeJS.npmRun('build')
}
      }
}
