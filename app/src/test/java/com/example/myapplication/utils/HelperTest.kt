package com.example.myapplication.utils

import org.junit.After
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class HelperTest {
    lateinit var helper : Helper
    @Before
    fun setUp(){
        helper = Helper()
        println("Before every test case")
    }
    @After
    fun setDown(){
        println("After every test case")
    }
    @Test
    fun isPalindrome() {
        //arrage
        //Acy
        val result = helper.isPalindrome("level")
        //Assert
        assertEquals(true,result)
    }

    @Test
    fun isPalindrome_inputString_level_expectedTrue() {
        //arrage
        //Acy
        val result = helper.isPalindrome("a")
        //Assert
        assertEquals(true,result)
    }
}