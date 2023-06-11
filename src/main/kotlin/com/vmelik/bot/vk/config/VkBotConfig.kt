package com.vmelik.bot.vk.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class VkBotConfig {

    @Bean
    fun vkBotProperties(): VkBotProperties {
        // TODO загружать данные из БД
        val vkBotProperties = VkBotProperties()
        vkBotProperties.name = "testBot"
        vkBotProperties.confirmationCode = "82e562af"

        return vkBotProperties
    }
}