package com.vmelik.bot.vk.controller

import com.vmelik.bot.base.controller.CallbackController
import com.vmelik.bot.vk.model.dto.VkCallbackDto
import org.springframework.web.bind.annotation.PostMapping

interface VkCallbackController : CallbackController<VkCallbackDto> {

    fun addConfirmationCode(code: String)
}