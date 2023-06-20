package com.vmelik.bot.base.mapper

import com.vmelik.bot.base.model.dto.BotConfigParamDto
import com.vmelik.bot.base.model.dto.BotConfigParamRequest
import com.vmelik.bot.base.model.entity.BotConfigParam
import org.mapstruct.Mapper
import org.mapstruct.Mapping

@Mapper(componentModel = "spring")
interface BotConfigParamMapper {

    fun toBotConfigParam(botConfigParamRequest: BotConfigParamRequest): BotConfigParam

    @Mapping(target = "platformCode", source = "platform.code")
    fun toBotConfigParamDto(botConfigParam: BotConfigParam): BotConfigParamDto
}