package com.example.study_kotlin.demo.controller

import lombok.extern.slf4j.Slf4j
import org.slf4j.helpers.Reporter.info
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@Slf4j
@RestController
class DemoController {

    @GetMapping("/test")
    fun test(): String {
        info("gd")
        error("gd")
        return "test"
    }

}