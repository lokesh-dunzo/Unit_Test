package com.example.myapplication.utils

import com.google.common.truth.Truth
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import kotlinx.coroutines.runBlocking
import okhttp3.mockwebserver.MockResponse
import okhttp3.mockwebserver.MockWebServer
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import kotlin.math.asin

class LoginAPIServiceTest {

    @Mock
    lateinit var mockWebServer : MockWebServer

    @Mock
    lateinit var apiService: LoginApiService
    lateinit var gson : Gson

    @Before
    fun init(){
        gson = GsonBuilder().create()
        mockWebServer = MockWebServer()
        apiService = Retrofit.Builder()
            .baseUrl(mockWebServer.url("/"))
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
            .create(LoginApiService::class.java)
    }

    @After
    fun decustruct(){
        mockWebServer.shutdown()
    }

    @Test
    fun validateUserData_return_success(){
        runBlocking {
            val mockResponse = MockResponse()

            mockWebServer.enqueue(
                mockResponse.setBody("{ }")
            )

            val response = apiService.validateUserData("","")
            val request = mockWebServer.takeRequest()

            Truth.assertThat(request.path).isEqualTo(LoginApiService.VALIDATE_USER_PATH)

            Truth.assertThat(response).isNotNull()
        }
    }
}