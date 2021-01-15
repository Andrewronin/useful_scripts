// Clean all empty jobs in Jenkins

for (job in Jenkins.instance.getAllItems(Job.class)) {
  build = job.getLastBuild()
  if ( build == null ) {
    println job.getFullName()
    // job.delete()
  }
}
println 'OK'