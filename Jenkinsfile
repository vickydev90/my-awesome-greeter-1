#!/usr/bin/groovy

#@Library('my-build-library')
@Library('jenkins-pipeline-library')

def nodeJS = new de.mare.ci.jenkins.NodeJS()

node() {

   stage('Checkout'){

          checkout scm
       }
   stage('build'){
	  nodeJS.nvm('install')
      }
}
