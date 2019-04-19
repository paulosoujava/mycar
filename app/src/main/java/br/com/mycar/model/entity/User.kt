package br.com.mycar.model.entity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class User (
    val person: Person,
    val cars: MutableList<Car>? = null
):Parcelable

@Parcelize
class Car(
    val model: String,
    val year: Int,
    val plate: String,
    val type: Int
):Parcelable

