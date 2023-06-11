package com.vmelik.bot.base.controller

import com.vmelik.bot.base.model.dto.CallbackDto

interface CallbackController<T: CallbackDto> {

    fun processCallback(data: T): String
}