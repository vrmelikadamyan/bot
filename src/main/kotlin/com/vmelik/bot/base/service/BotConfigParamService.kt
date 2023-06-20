package com.vmelik.bot.base.service

import com.vmelik.bot.base.model.dto.BotConfigParamDto
import com.vmelik.bot.base.model.dto.BotConfigParamRequest
import java.util.*

interface BotConfigParamService {

    fun create(request: BotConfigParamRequest): UUID

    fun get(code: String): BotConfigParamDto
}