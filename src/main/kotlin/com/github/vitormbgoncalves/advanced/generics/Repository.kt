package com.github.vitormbgoncalves.advanced.generics

/**
 * Generic Constraints in Kotlin
 *
 * @author Vitor Goncalves
 * @since 15.04.2021, qui, 16:36
 */
open class Entity(val id: Int)

class Repository<T: Entity> {
    fun save(entity: T) {
        if (entity.id != 0) {
            // ...
        }
    }
}


fun main(args: Array<String>) {

    val repo = Repository<CustomerEntity>()
}

class CustomerEntity: Entity(12) {

}