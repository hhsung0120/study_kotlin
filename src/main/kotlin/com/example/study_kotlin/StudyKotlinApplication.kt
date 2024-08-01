package com.example.study_kotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.sql.DriverManager.println

@SpringBootApplication
class StudyKotlinApplication

fun main(args: Array<String>) {
    runApplication<StudyKotlinApplication>(*args)
}
