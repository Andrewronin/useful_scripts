// Remove old builds in Jenkins

import jenkins.model.Jenkins
import hudson.model.Job

MAX_BUILDS = 50

for (job in Jenkins.instance.items) {
  if (job instanceof org.jenkinsci.plugins.workflow.job.WorkflowJob || job instanceof hudson.model.FreeStyleProject)) {
    def recent = job.builds.limit(MAX_BUILDS)
  
    for (build in job.builds) {
      if (!recent.contains(build)) {
        println "Preparing to delete: " + build
        build.delete()
      }
    }
  } else {
  	println job
  }
}
println 'OK'