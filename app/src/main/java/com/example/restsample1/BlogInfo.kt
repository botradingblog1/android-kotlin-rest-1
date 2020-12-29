package com.example.restsample1

import kotlinx.serialization.*
import kotlinx.serialization.json.*

@Serializable
data class BlogInfo(val title: String, val description: String)