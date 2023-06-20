package com.vmelik.bot.base.model.dto

import java.util.*

class BotConfigParamDto {
    lateinit var id: UUID

    lateinit var name: String

    lateinit var code: String

    var description: String? = null

    lateinit var value: String

    lateinit var platformCode: String
}