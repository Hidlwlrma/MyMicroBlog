package com.example.mymicroblog.logic.network

import com.example.mymicroblog.logic.model.LeftFragmentService
import com.example.mymicroblog.logic.model.ServiceCreator
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlin.coroutines.resume
import kotlin.coroutines.resumeWithException
import kotlin.coroutines.suspendCoroutine

object MyMicroBlogNetwork {

    private val leftFragmentService = ServiceCreator.create<LeftFragmentService>()
    suspend fun requestLFItems() = leftFragmentService.requestLFItems().await()
    private suspend fun <T> Call<T>.await(): T {
        return suspendCoroutine { continuation ->
            enqueue(object : Callback<T> {
                override fun onResponse(call: Call<T>, response: Response<T>) {
                    val body = response.body()
                    if (body != null) continuation.resume(body)
                    else continuation.resumeWithException(
                        RuntimeException("response body is null"))
                }
                override fun onFailure(call: Call<T>, t: Throwable) {
                    continuation.resumeWithException(t)
                } })
        } }
}