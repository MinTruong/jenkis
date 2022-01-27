// def groovy
pipeline {
	agent any
	tools {
		maven "Maven"
		jdk "jdk8"
	}

	stages {
		stage('Load file groovy') {
			steps {
  				script {
    				groovy = load "code.groovy"
       				}
				}
		}
// 		stage('Pull_Code_Github') {
// 		    steps {
// 			// Get some code from a GitHub repository
// 			git branch: 'main', url: 'https://github.com/MinTruong/maven.git'
// 		    }
// 		}
// 		stage('Build_Jar'){
//             steps {
//                 sh 'mvn clean install'
//             }
//         }
// 		stage('SendJarToSever') {
// 		    steps {
// 				sh 'scp '
// 		    }
// 		}
//         stage('Example') {
//             steps {
//                 echo "Running ${env.BUILD_ID} on ${env.JENKINS_URL}"
// 				echo "BUILD_NUMBER is ${env.BUILD_NUMBER}"
// 				echo "BUILD_TAG is ${env.BUILD_TAG} "
// 				echo "EXECUTOR_NUMBER is ${env.EXECUTOR_NUMBER} "
// 				echo "JAVA_HOME is ${env.JAVA_HOME} "
// 				echo "JOB_NAME is ${env.JOB_NAME} "
// 				echo "NODE_NAME is ${env.NODE_NAME} "
// 				echo "WORKSPACE is ${env.WORKSPACE} "
//             }
//         }
// 		stage('Pull_Jar_From_Neuxs') {
//             steps {
// 				script{
// 					groupId="org.springframework.samples"
// 					artifactId="spring-petclinic"
// 					sh "curl -L -X GET 'http://192.168.1.10:8081/service/rest/v1/search/assets/download?sort=version&repository=MinhTH12-pipeline&maven.groupId=$groupId&maven.artifactId=$artifactId&maven.extension=jar' -H 'accept: application/json' --output ${env.WORKSPACE}/out.jar"
// 				}
// 			}
// 		}
		
		stage('Pull_Jar_From_Neuxs') {
            steps {
				script{
					sh"
						#!/bin/bash
						cat << EOF >test.json
						{
						  "insecure-registries" : ["http://192.168.1.10:9001"]
						}
						EOF
						cat test.json
					"
				}
			}
		}
		
// 		stage('Version') {
//             steps {
// 				script {
// 					check_ver = groovy.getVersionApp()
// 					echo check_ver
// 				}
// 			}
// 		}
    }
}
