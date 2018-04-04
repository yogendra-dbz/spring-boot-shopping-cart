#!/usr/bin/env groovy

node {
	
    parameters {
        stringParam(defaultValue: 1.0.0, description: '', name: 'ReleaseVersion')
    }
	
    stage('configure Java') {
      tool name: 'jdk8', type: 'jdk'
    }
    stage('configure Maven') {
     tool name: 'maven', type: 'maven'
    }
    stage('checkout') {
        checkout scm
    }

    stage('check java') {
        sh "java -version"
    }
     stage('check maven') {
     	def mvnHome = tool 'maven'
  	env.PATH = "${mvnHome}/bin:${env.PATH}"
    }

    stage('clean') {
        sh "chmod +x mvnw"
        sh "mvn clean"
    }

    stage('install tools') {
        sh "mvn com.github.eirslett:frontend-maven-plugin:install-node-and-yarn -DnodeVersion=v6.11.1 -DyarnVersion=v0.27.5"
    }

   stage('backend tests') {
        try {
            sh "mvn test"
        } catch(err) {
            throw err
        } finally {
            junit '**/target/surefire-reports/TEST-*.xml'
        }
    }

    stage('package') {
		 sh "mvn package -DskipTests docker:build -DpushImage  -DdockerImageTags=${params.ReleaseVersion}"
		 archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
	}
    
  }
