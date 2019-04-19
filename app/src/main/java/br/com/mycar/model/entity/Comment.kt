package br.com.mycar.model.entity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class Comment(
    val user: User,
    val comment: String,
    val createAt: String,
    val vote: Int
):Parcelable