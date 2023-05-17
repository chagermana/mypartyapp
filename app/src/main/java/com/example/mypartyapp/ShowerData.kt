package com.example.mypartyapp

data class ShowerData(
    val title: String,
    val logo: Int,
    val desc: String,
    var isExpandable: Boolean = false
)
