package com.example.myapplication

import com.example.myapplication.utils.Helper
import org.junit.Test
import org.junit.Assert.*
import org.junit.runner.RunWith
import org.junit.runners.Parameterized


@RunWith(value = Parameterized::class)
class ParameteraziedExample(val input:String , val expectedValue : Boolean) {

    @Test
    fun test(){
        val helper = Helper()
        val result = helper.isPalindrome(input)
        assertEquals(result,expectedValue)
    }

    companion object {
        @JvmStatic
        @Parameterized.Parameters
        fun data(): List<Array<Any>>{
            return listOf(
                arrayOf("hello",false),
                arrayOf("level",true),
                arrayOf("a",true),
                arrayOf("",true)
            )
        }
    }
}