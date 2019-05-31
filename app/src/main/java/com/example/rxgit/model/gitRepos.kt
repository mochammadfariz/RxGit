package com.example.rxgit.model

import com.google.gson.annotations.SerializedName

data class gitRepos (
    val full_name : String?,
    val description : String?,
    val language : String?,
    @SerializedName("stargazers_count") val stars : String?)