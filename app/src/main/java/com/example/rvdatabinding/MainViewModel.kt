package com.example.rvdatabinding

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel :ViewModel() {

    val data: List<User> = listOf(User("data")
        ,User("nee"),
        User("nij"),
        User("mbf"),
        User("yogita")
        )
    val items: LiveData<List<User>> =
        MutableLiveData<List<User>>().apply { value = data}
}
