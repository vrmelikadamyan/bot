package com.vmelik.bot.vk.model.dto

import com.vmelik.bot.base.model.dto.CallbackDto
import org.json.JSONObject

class VkCallbackDto(
    var type: String,
    var data: JSONObject?
) : CallbackDto()