package com.example.shoestore.model

import android.os.Parcel
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Shoe(var name: String?, var size: String?, var company: String?, var describtion: String?) :
    Parcelable {

}
