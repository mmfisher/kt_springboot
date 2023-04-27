package cn.yu.kt.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

/**
 *
 *
 * @Author : Ning Yu
 * @create 2023/4/27 10:30
 */

@RestController
class WelcomeController {

    @GetMapping("/index")
    fun index() : String{
       return "Hello, Kotlin for Spring Boot!!"
    }
}