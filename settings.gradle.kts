pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            // Look for POMs and artifacts, such as JARs, here
            url = uri("https://cardinalcommerceprod.jfrog.io/artifactory/android")
            // Look for artifacts here if not found at the above location
            credentials {
                // Be sure to add these non-sensitive credentials in order to retrieve dependencies from
                // the private repository.
                username = ("paypal_sgerritz")
                password = ("AKCp8jQ8tAahqpT5JjZ4FRP2mW7GMoFZ674kGqHmupTesKeAY2G8NcmPKLuTxTGkKjDLRzDUQ")
            }
        }
    }

}



rootProject.name = "Paypal"
include(":app")
 