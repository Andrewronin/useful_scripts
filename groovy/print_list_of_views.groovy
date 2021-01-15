// Print full list of views in Jenkins

Jenkins.instance.views.each { 
  view ->
  println "${view.name}"
  view.items.each {
    item ->
    println "\t- ${item.name}"
  }
}

return