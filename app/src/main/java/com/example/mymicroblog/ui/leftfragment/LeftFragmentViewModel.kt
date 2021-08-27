package com.example.mymicroblog.ui.leftfragment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.mymicroblog.logic.model.LeftFragmentItem

class LeftFragmentViewModel : ViewModel() {

    private val requestLiveData = MutableLiveData<String>()

    val leftFragmentItemList = ArrayList<LeftFragmentItem>()

    val
}