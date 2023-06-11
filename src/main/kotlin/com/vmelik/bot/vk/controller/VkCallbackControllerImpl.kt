package com.vmelik.bot.vk.controller

import com.vmelik.bot.vk.config.VkBotProperties
import com.vmelik.bot.vk.model.dto.VkCallbackDto
import jakarta.validation.constraints.NotBlank
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/vk/callback")
class VkCallbackControllerImpl(
    val vkBotProperties: VkBotProperties
) : VkCallbackController {

    @PostMapping("/code")
    override fun addConfirmationCode(@RequestBody @NotBlank code: String) {
        vkBotProperties.confirmationCode = code
    }

    @PostMapping("/messages")
    override fun processCallback(@RequestBody data: VkCallbackDto): String {
        if (data.type == "confirmation") {
            return vkBotProperties.confirmationCode
        }

        return "ok"
    }
}