package com.vmelik.bot.base.repository

import com.vmelik.bot.base.model.entity.Platform
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface PlatformRepository : JpaRepository<Platform, UUID> {

    fun findByCode(code: String): Platform?
}