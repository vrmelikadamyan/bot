package com.vmelik.bot.base.model.dto

import jakarta.validation.constraints.NotBlank

class BotConfigParamRequest(
) {
    @NotBlank
    lateinit var name: String

    @NotBlank
    lateinit var code: String

    var description: String? = null

    @NotBlank
    lateinit var value: String

    @NotBlank
    lateinit var platformCode: String
}
