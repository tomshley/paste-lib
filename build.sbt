lazy val pasteGroupName = "paste"
lazy val resourcesProjectName = Seq(pasteGroupName, "resources").mkString("-")

lazy val pasteLibOrgName = "tomshley.brands.global.tware.tech.product.paste"

lazy val resourcesProject = publishableProject(resourcesProjectName, Some(file(".")))
  .enablePlugins(ProjectTemplatePlugin, ProjectsHelperPlugin, ProjectStructurePlugin, LibUnmanagedProjectPlugin)
  .settings(
    name := resourcesProjectName,
    organization := pasteLibOrgName,
    Test / unmanagedResourceDirectories += baseDirectory.value / "src",
    Compile / unmanagedResourceDirectories += baseDirectory.value / "src"
  )
