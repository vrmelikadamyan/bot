package com.vmelik.bot.base.config

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan("com.vmelik.bot.vk")
@ConditionalOnProperty(name = ["platform"], havingValue = "vk")
class VkScanConfiguration {
}