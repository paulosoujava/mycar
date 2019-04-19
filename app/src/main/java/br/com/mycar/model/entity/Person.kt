package br.com.mycar.model.entity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Person (
    val name: String,
    val email: String,
    val password: String,
    val telephone: String
):Parcelable