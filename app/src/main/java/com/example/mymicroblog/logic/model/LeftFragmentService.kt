package com.example.mymicroblog.logic.model

import com.example.mymicroblog.MyMicroBlogApplication
import retrofit2.http.GET
import retrofit2.Call

interface LeftFragmentService {

    @GET("2/statuses/home_timeline.json?access_token=${MyMicroBlogApplication.TOKEN}&count=10&feature=2")
    fun requestLFItems (): Call<LeftFragmentResponse>
}