// Archivo de compilación de nivel superior donde puedes agregar configuraciones comunes a todos los subproyectos/módulos.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.kotlin.android) apply false
    id("org.jetbrains.dokka") version "2.0.0"
}

subprojects {
    apply(plugin = "org.jetbrains.dokka")
}
