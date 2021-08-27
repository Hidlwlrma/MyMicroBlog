package com.example.mymicroblog.logic.model

import com.google.gson.annotations.SerializedName

data class LeftFragmentResponse(
    @SerializedName("statuses")
    val statuses: List<LeftFragmentItem>
    )

data class LeftFragmentItem(
    @SerializedName("pic_urls")
    val thumbnailsList: List<String>,
    @SerializedName("user")
    val user: User
    )


data class User(
    @SerializedName("name")
    val name: String,
    @SerializedName("created_at")
    val publishTime: String,
    @SerializedName("avatar_hd")
    val avatarSource: String
    )
