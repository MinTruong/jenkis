def groovy
def nexusUrl="192.168.1.10:9001"
pipeline {
	agent any
// 	tools {
// 		maven "Maven"
// 		jdk "jdk8"
// 	}
	
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

	
	
	
// 	stages {
// 		stage('Load file groovy') {
// 			steps {
//   				script {
//     				groovy = load "code.groovy"
//        				}
// 				}
// 		}

		
// 		stage('Connect_Docker-Nexus') {
//             steps {
// 				script {
// 					// should be use credential 
// 					DOCKER_USERNAME="admin"
// 					DOCKER_PASSWORD="Minh1ww9"
// 					sh "bash ${env.WORKSPACE}/build_image.sh"
// 					sh "docker login -u ${DOCKER_USERNAME} -p ${DOCKER_PASSWORD} http://${nexusUrl}/repository/docker-minhth12/"
// 				}
// 			}
// 		}
		
// 		stage('Build_Image') {
//             steps {
					
// 				script{
// 					ver=groovy.getVersionApp()
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
		
// 		stage('Remote_Server_Build') {
//             steps {
// 				script{
// 					ver=groovy.getVersionApp()
// 					 withCredentials([sshUserPrivateKey(credentialsId: "server", keyFileVariable: 'keyfile')]) {	
// 						sh "scp -i ${keyfile} ${env.WORKSPACE}/server.sh root@192.168.1.11:/root" 
// 					 }
// 					sh "sshpass -p Minh1ww9 ssh -o StrictHostKeyChecking=no root@192.168.1.11 bash ./server.sh"  
// 				}
// 			}
// 		}
		
		stage('Check_Health') {
            steps {
					sh "curl -I 192.168.1.11:8080"
			}
		}
    }
}
