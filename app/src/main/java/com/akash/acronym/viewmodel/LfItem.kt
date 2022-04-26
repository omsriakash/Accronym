package com.akash.acronym.viewmodel

data class LfItem(
    val freq: Int,
    val lf: String,
    val since: Int,
    val vars: List<VarItem>
)