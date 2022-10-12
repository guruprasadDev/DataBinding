package com.guruthedev.databinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LearningDataBindingAdapterViewModel:ViewModel() {
     val user = MutableLiveData<UserInfo>()

    init {
        user.value = UserInfo("Guru Reddy","https://ca.slack-edge.com/T02TLUWLZ-U040DBX2XUG-0a35a4f5f560-192")
    }
}