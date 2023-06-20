package com.vmelik.bot.vk.controller

import com.vmelik.bot.base.controller.CallbackController
import com.vmelik.bot.base.model.enumerated.BotConfigParamCode
import com.vmelik.bot.base.service.BotConfigParamService
import com.vmelik.bot.vk.model.dto.VkCallbackDto
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/vk/callback")
class VkCallbackControllerImpl(
    private val botConfigParamService: BotConfigParamService
) : CallbackController<VkCallbackDto> {

    @PostMapping("/messages")
    override fun processCallback(@RequestBody data: VkCallbackDto): String? {
        if (data.type == "confirmation") {
            return botConfigParamService.get(BotConfigParamCode.VK_CONFIRMATION_CODE.name).value
        }

        return "ok"
    }
}