
pipeline {
	agent any
	tools {
		maven "Maven"
		jdk "jdk8"
	}
	stages {
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
            	withCredentials([usernamePassword(credentialsId:'Nexus', passwordVariable: 'password', usernameVariable: 'username')]){
					echo "credentialsId = $credentialsId"
					echo "pass = $passwordVariable"
					echo "user = $username"
				}
            }
        }
    
// 		stage('Push_Jar_To_Nexus'){
//             steps{
//                 nexusPublisher nexusInstanceId: 'Nexus', nexusRepositoryId: 'MinhTH12-pipeline', packages: [[$class: 'MavenPackage', mavenAssetList: [[classifier: '', extension: '', filePath: '/var/lib/jenkins/workspace/my-pipeline/target/spring-petclinic-2.6.0-SNAPSHOT.jar']], mavenCoordinate: [artifactId: 'spring-petclinic', groupId: 'org.springframework.samples', packaging: 'jar', version: '2.6.0']]]
//             }
//         }
    }
}
