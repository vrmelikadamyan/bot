package com.vmelik.bot.base.model.entity

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "bot_config_param")
open class BotConfigParam {

    @Id
    @GeneratedValue
    @Column(name = "id_bot_config_param")
    open lateinit var id: UUID

    @Column(name = "nm_name")
    open lateinit var name: String

    @Column(name = "nm_code")
    open lateinit var code: String

    @Column(name = "vl_description")
    open var description: String? = null

    @Column(name = "vl_value")
    open lateinit var value: String

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
        name = "id_platform",
        nullable = false
    )
    open lateinit var platform: Platform
}