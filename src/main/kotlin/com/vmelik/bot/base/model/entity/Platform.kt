package com.vmelik.bot.base.model.entity

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "platform")
open class Platform {

    @Id
    @GeneratedValue
    @Column(name = "id_platform")
    open lateinit var id: UUID

    @Column(name = "nm_name")
    open lateinit var name: String

    @Column(name = "nm_code")
    open lateinit var code: String

    @Column(name = "vl_description")
    open var description: String? = null
}