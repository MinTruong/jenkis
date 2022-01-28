def groovy
def nexusUrl="192.168.1.10:9001"
pipeline {
	agent any
// 	tools {
// 		maven "Maven"
// 		jdk "jdk8"
// 	}

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
		
// 		stage('Config_file') {
//             steps {
// 					sh '''
// 					echo ahihihi
// 					#!/bin/bash
// 					cat << EOF>test.json 
// 					{
// 						"insecure-registries" : ["http://192.168.1.10:9001"]
// 					}
// 					EOF
// 					cat test.json
// 					'''
// 			}
// 		}
		

		
// 		stage('Connect_Docker-Nexus') {
//             steps {
// 				script {
// 					// should be use credential 
// 					DOCKER_USERNAME="admin"
// 					DOCKER_PASSWORD="Minh1ww9"
// 					sh "bash ${env.WORKSPACE}/test.sh"
// 					sh "docker login -u ${DOCKER_USERNAME} -p ${DOCKER_PASSWORD} http://${nexusUrl}/repository/docker-minhth12/"
// 				}
// 			}
// 		}
		
// 		stage('Build_Image') {
//             steps {
					
// 				script{
// 					ver=groovy.getVersionApp()
					
// 					sh "bash test.sh"
// 					sh "systemctl status docker.service"
// 					sh "docker build -t pet-${ver} ."
// 				}
// 			}
// 		}
		
// 		stage('Push_Image') {
//             steps {
// 				script{
// 					ver=groovy.getVersionApp()
// 					// should be use credential
// 					sh "docker images"
// 					sh "docker tag pet-${ver} ${nexusUrl}/docker-minhth12/pet-${ver}"
// 					sh "docker push ${nexusUrl}/docker-minhth12/pet-${ver}"
// 					sh "docker images"
// 				}
// 			}
// 		}
		
		stage('Remote_Server_Build') {
            steps {
				script{
					ver=groovy.getVersionApp()
					 withCredentials([sshUserPrivateKey(credentialsId: "server", keyFileVariable: 'keyfile')]) {	
						sh "scp -i ${keyfile} ${env.WORKSPACE}/server.sh root@192.168.1.11:/root" 
					 }
					sh "sshpass -p Minh1ww9 ssh -o StrictHostKeyChecking=no root@192.168.1.11 pwd && hostnamectl"
				   
					// should be use credential
// 					sh "docker images"
// 					sh "docker tag pet-${ver} ${nexusUrl}/docker-minhth12/pet-${ver}"
// 					sh "docker push ${nexusUrl}/docker-minhth12/pet-${ver}"
// 					sh "docker images"
				}
			}
		}
		
    }
}
