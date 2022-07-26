package com.example.shoestore.model

import android.os.Parcel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Sharedviewmodel : ViewModel() {


  private val _shoelist = MutableLiveData<MutableList<Shoe>>(mutableListOf())
 val shoelist : MutableLiveData<MutableList<Shoe>> get() = _shoelist
    val shoe = MutableLiveData<Shoe>()


  fun addshoe(newshoe:Shoe) {

      _shoelist.value?.add(newshoe)

  }

}