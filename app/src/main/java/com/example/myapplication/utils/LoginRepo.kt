package com.example.myapplication.utils

interface LoginRepo {
    fun validateLoginDetails(username: String, pass: String): LoginResponse?
}