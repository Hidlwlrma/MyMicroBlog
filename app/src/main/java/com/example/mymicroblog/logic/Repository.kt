package com.example.mymicroblog.logic

import androidx.lifecycle.liveData
import com.example.mymicroblog.logic.model.LeftFragmentItem
import com.example.mymicroblog.logic.network.MyMicroBlogNetwork
import kotlinx.coroutines.Dispatchers

object Repository {

    fun requestItem() = liveData(Dispatchers.IO) {
        val result = try {
            val leftFragmentResponse = MyMicroBlogNetwork.requestLFItems()
            Result.success(leftFragmentResponse.statuses)
        } catch (e: Exception) {
            Result.failure(e)
        }
        emit(result)
    }
}