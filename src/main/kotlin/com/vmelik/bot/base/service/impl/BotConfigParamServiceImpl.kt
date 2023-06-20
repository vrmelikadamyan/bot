package com.vmelik.bot.base.service.impl

import com.vmelik.bot.base.exception.EntityNotFoundException
import com.vmelik.bot.base.mapper.BotConfigParamMapper
import com.vmelik.bot.base.model.dto.BotConfigParamDto
import com.vmelik.bot.base.model.dto.BotConfigParamRequest
import com.vmelik.bot.base.model.entity.BotConfigParam
import com.vmelik.bot.base.model.entity.Platform
import com.vmelik.bot.base.repository.BotConfigParamRepository
import com.vmelik.bot.base.repository.PlatformRepository
import com.vmelik.bot.base.service.BotConfigParamService
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.util.*

@Service
class BotConfigParamServiceImpl(
    private val botConfigParamRepository: BotConfigParamRepository,
    private val platformRepository: PlatformRepository,

    private val botConfigParamMapper: BotConfigParamMapper
) : BotConfigParamService {

    @Transactional
    override fun create(request: BotConfigParamRequest): UUID {
        // TODO бросать исключение если параметр с таким кодом уже существует
        val platform: Platform = platformRepository.findByCode(request.platformCode)
            ?: throw EntityNotFoundException("Param with code ${request.code} not found")

        val param = botConfigParamMapper.toBotConfigParam(request)
        param.platform = platform

        return botConfigParamRepository.save(param).id
    }

    override fun get(code: String): BotConfigParamDto {
        val param: BotConfigParam = botConfigParamRepository.findByCode(code)
            ?: throw EntityNotFoundException("Param with code $code not found")

        return botConfigParamMapper.toBotConfigParamDto(param)
    }
}