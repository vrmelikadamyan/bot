package com.vmelik.bot.base.controller.impl

import com.vmelik.bot.base.controller.AdminController
import com.vmelik.bot.base.model.dto.BotConfigParamDto
import com.vmelik.bot.base.model.dto.BotConfigParamRequest
import com.vmelik.bot.base.service.BotConfigParamService
import jakarta.validation.Valid
import jakarta.validation.constraints.NotBlank
import org.springframework.web.bind.annotation.*
import java.util.*

@RequestMapping("/admin")
@RestController
class AdminControllerImpl(
    private val botConfigParamService: BotConfigParamService
) : AdminController {

    @PostMapping("/config/params")
    override fun createConfigParam(@Valid @RequestBody request: BotConfigParamRequest): UUID {
        return botConfigParamService.create(request)
    }

    @GetMapping("/config/params/{code}")
    override fun getConfigParam(@NotBlank @PathVariable code: String): BotConfigParamDto {
        return botConfigParamService.get(code)
    }
}