pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()

            jcenter() // Eğer kullanılıyorsa, JCenter kapanmış olabilir, bu nedenle bu adresi kaldırabilir veya yerine başka bir depo ekleyebilirsiniz.


        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "AksamPazarrıı"
include(":app")
 