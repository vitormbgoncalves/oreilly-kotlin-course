package com.github.vitormbgoncalves.advanced.classes

/**
 * Nested Classes in Kotlin
 *
 * @author Vitor Goncalves
 * @since 13.04.2021, ter, 18:34
 */

class DirectoryExplorer(val user: String) {

    inner class PermissionCheck() {
        fun validatePermission() {
            if (user != "Vitor") {
                println("it's not him!")
            } else {
                println("it's him!")
            }
        }
    }

    fun listFolder(folder: String, user: String) {
        val permissionCheck = PermissionCheck()
        permissionCheck.validatePermission()
    }
}

fun main(args: Array<String>) {

    val directoryExplorer = com.github.vitormbgoncalves.advanced.classes.DirectoryExplorer("Vitor")

    directoryExplorer.PermissionCheck().validatePermission()
}