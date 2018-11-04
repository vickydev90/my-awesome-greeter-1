#!/usr/bin/groovy

@Library('jenkins-pipeline-library')

def nodeJS = new de.mare.ci.jenkins.NodeJS()
def config = "conf/config.json" 
node() {

   stage('Checkout'){

          checkout scm
       }

   stage('build'){
	 
	   nodeJS.npm('install --save-dev typescript')
	   nodeJS.npmRun('build', config)
      }
}
