// Set how old the jobs to list should be (in days)

def numDaysBack = 15
def cutOfDate = System.currentTimeMillis() - 1000L * 60 * 60 * 24 * numDaysBack

for (job in Jenkins.instance.getAllItems(Job.class)) {
  build = job.getLastBuild()
  if (build != null && build.getTimeInMillis() < cutOfDate) {
    println job.getFullName()
    // job.delete()
  }
}
println 'OK'