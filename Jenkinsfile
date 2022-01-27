def groovy
pipeline {
	agent any
// 	tools {
// 		maven "Maven"
// 		jdk "jdk8"
// 	}
	
// 	stages {
// 		stage('Load file groovy') {
// 			steps {
//   				script {
//     				groovy = load "code.groovy"
//        				}
// 				}
// 		}
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
		stage('Example') {
            steps {
            	withCredentials([usernamePassword(credentialsId: 'root', usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]) {
				  // available as an env variable, but will be masked if you try to print it out any which way
				  // note: single quotes prevent Groovy interpolation; expansion is by Bourne Shell, which is what you want
				  sh 'echo $PASSWORD'
				  // also available as a Groovy variable
				  echo USERNAME
				  // or inside double quotes for string interpolation
				  echo "username is $USERNAME"
				}
				
				withCredentials([sshUserPrivateKey(credentialsId: "ssh-key", keyFileVariable: 'keyfile')]) {
					
					sh 'cat $keyfile' 
			   }
				
// 				script {
// 					check_ver = groovy.getVersionApp()
// 					echo check_ver
// 				}
            }
        }
    
// 		stage('Push_Jar_To_Nexus'){
//             steps{
//                 nexusPublisher nexusInstanceId: 'Nexus', nexusRepositoryId: 'MinhTH12-pipeline', packages: [[$class: 'MavenPackage', mavenAssetList: [[classifier: '', extension: '', filePath: '/var/lib/jenkins/workspace/my-pipeline/target/spring-petclinic-2.6.0-SNAPSHOT.jar']], mavenCoordinate: [artifactId: 'spring-petclinic', groupId: 'org.springframework.samples', packaging: 'jar', version: '2.6.0']]]
//             }
//         }
    }
}
