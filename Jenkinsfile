pipeline {
    agent any 
    stages {
        stage ('Clone Code'){
            steps {
                git branch:'master',
                url:'https://github.com/Gomathi030/mathi.git'
            }
        }
        stage ('Compile Code'){
            steps {
                bat'javac one.java'
            }
        }
        stage ('Run Code'){
            steps {
                bat'java ShoppingApp'
            }
        }
    }
        
}
