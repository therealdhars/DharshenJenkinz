pipeline{
    agent any
    stages{
        stage("Build"){
            
            steps{
                echo "Building"
            }
        }
        
        
             stage("Test"){
            steps{
                echo "Testing"
            }
             }
             
             
             
             stage("Deploy"){
            steps{
                echo "Deploying"
            }
        }
    }
    
    
    post
    {
        
         always
        {
            emailext body: 'Summary', subject: 'Pipeline Status', to: 'dharshen4demo@gmail.com'
        }
    }
}
