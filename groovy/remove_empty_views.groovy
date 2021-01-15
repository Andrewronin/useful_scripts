// Clean all empty views in Jenkins

def jen = Jenkins.getInstance();    
def views = jen.getViews()

Jenkins.instance.views.each { view ->
  if (!view.items.name) {
    println "EMPTY view = ${view}"
    // jen.deleteView(view)
  }
}
return