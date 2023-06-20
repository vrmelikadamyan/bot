package com.vmelik.bot.base.controller

import com.vmelik.bot.base.model.dto.BotConfigParamDto
import com.vmelik.bot.base.model.dto.BotConfigParamRequest
import java.util.*

interface AdminController {

    fun createConfigParam(request: BotConfigParamRequest): UUID

    fun getConfigParam(code: String): BotConfigParamDto
}