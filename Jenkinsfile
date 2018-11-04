#!/usr/bin/groovy

@Library('jenkins-pipeline-library')

def nodeJS = new de.mare.ci.jenkins.NodeJS()

node() {

   stage('Checkout'){

          checkout scm
       }

   stage('build'){
	 
	   nodeJS.npm('install')
      }
}
