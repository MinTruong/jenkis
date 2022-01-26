
pipeline {
	agent any
	tools {
		maven "Maven"
		jdk "jdk8"
	}
	stages {
        stage('Pull_Code_Github') {
            steps {
                // Get some code from a GitHub repository
                git branch: 'main', url: 'https://github.com/MinTruong/maven.git'
            }
        }
// 		stage('Build_Jar'){
//             steps {
//                 sh 'mvn clean install'
//             }
//         }
// 		stage('Push_Jar_To_Nexus'){
//             steps{
//                 nexusPublisher nexusInstanceId: 'Nexus', nexusRepositoryId: 'MinhTH12-pipeline', packages: [[$class: 'MavenPackage', mavenAssetList: [[classifier: '', extension: '', filePath: '/var/lib/jenkins/workspace/my-pipeline/target/spring-petclinic-2.6.0-SNAPSHOT.jar']], mavenCoordinate: [artifactId: 'spring-petclinic', groupId: 'org.springframework.samples', packaging: 'jar', version: '2.6.0']]]
//             }
        }
    }
}
