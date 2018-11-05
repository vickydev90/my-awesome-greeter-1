#!/usr/bin/groovy

@Library('npmBuild_nix')


node() {

   stage('Checkout'){

          checkout scm
       }

   stage('build'){
	 
	   nodeJS.npm('install --save-dev typescript')
	   nodeJS.npmRun('build')
      }
}
