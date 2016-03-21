folder('code-samples') {
  displayName 'Code Samples'
  
  workflowJob('code-samples/chapter-4') {
    displayName 'Chapter 4'
    
    definition {
      cpsScm {
        scm {
          git 'https://github.com/dockerhp/code-samples.git'
        }
        scriptPath 'Chapter 4/Jenkinsfile'
      }    
    }
  }
}
