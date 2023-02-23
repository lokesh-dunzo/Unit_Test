package com.example.myapplication.utils

import org.junit.Assert.*
import org.junit.Test

class ValiatorTest{
    @Test
    fun emailValidator_CorrectEmail_ReturnsTrue(){
        assertEquals(Valiator.validateEmail("testname@email.com"),true)
    }

    @Test
    fun emailValidator_WrongEmail_ReturnFalse(){
        assertEquals(Valiator.validateEmail("@email.com"),false)
    }
}