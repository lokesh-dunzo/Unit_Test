package com.example.myapplication.utils

import com.google.common.truth.Truth
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito

class LoginRepoTest {
    @Mock
    lateinit var repoInstance : LoginRepo

    @Before
    fun init(){
        repoInstance = Mockito.mock(LoginRepo::class.java)
    }

    @Test
    fun valiation_isSuccess(){
        runBlocking {
            Mockito.`when`(repoInstance.validateLoginDetails("test@test.com","123")).thenReturn(
                LoginResponse()
            )
        }
        runBlocking {
            Truth.assertThat(repoInstance.validateLoginDetails("test@test.com","123"))
             .isEqualTo(LoginResponse())
        }
    }


    @Test
    fun valiation_isFail(){
        runBlocking {
            Mockito.`when`(repoInstance.validateLoginDetails("test@test.com","123")).thenReturn(
                null
            )
        }

        runBlocking {
            Truth.assertThat(repoInstance.validateLoginDetails("test@test.con","123")).isEqualTo(null)
        }
    }
}