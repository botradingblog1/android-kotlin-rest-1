package com.example.restsample1

sealed class HttpResult<out R> {
    data class Success<out T>(val data: T) : HttpResult<T>()
    data class Error(val exception: Exception) : HttpResult<Nothing>()
}