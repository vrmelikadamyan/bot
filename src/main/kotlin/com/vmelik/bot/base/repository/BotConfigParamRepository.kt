package com.vmelik.bot.base.repository

import com.vmelik.bot.base.model.entity.BotConfigParam
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface BotConfigParamRepository : JpaRepository<BotConfigParam, UUID> {

    fun findByCode(code: String): BotConfigParam?
}