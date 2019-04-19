package br.com.mycar.model.entity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Adm(
    val person: Person,
    val cpf: String,
    val place: Place

):Parcelable

@Parcelize
class Place(
    val namePlace: String,
    val phone: String,
    val email: String,
    val openAt: String,
    val closeAt: String,
    val dayOpenAt: String,
    val dayCloseAt: String,
    val paymentForm: String,
    val description: String,
    val urlPhoto: String,
    val country: Country,
    val hasService: Boolean = false,
    val services: MutableList<String>? = null,
    val comments: MutableList<Comment>? = null
):Parcelable

@Parcelize
class Country(
    val city: String,
    val state: String
):Parcelable