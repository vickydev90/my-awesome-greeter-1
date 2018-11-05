#!/usr/bin/groovy

@Library('npmBuild_nix')

def nodeJS = new var.NodeJS()

node() {

   stage('Checkout'){

          checkout scm
       }

   stage('build'){
	 
	   nodeJS.npm('install --save-dev typescript')
	   nodeJS.npmRun('build')
      }
}
