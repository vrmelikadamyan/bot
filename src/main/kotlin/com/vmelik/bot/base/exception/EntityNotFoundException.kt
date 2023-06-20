package com.vmelik.bot.base.exception

import kotlin.reflect.KClass

class EntityNotFoundException(
    msg: String
) : RuntimeException(msg) {

    constructor(
        entityId: String,
        entityClass: KClass<*>
    ) : this("Entity '${entityClass.simpleName}' with id '$entityId' not found")
}