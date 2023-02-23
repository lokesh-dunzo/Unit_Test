package com.example.myapplication.utils

class Helper {

    fun isPalindrome(s : String):Boolean{
        var i = 0
        var j = s.length-1
        while(i<j){
            if(s[i] != s[j])return false;
            i++
            j--
        }
        return true;
    }
}