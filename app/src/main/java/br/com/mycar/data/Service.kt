package br.com.mycar.data

import br.com.mycar.model.entity.Country
import br.com.mycar.model.entity.Place

object Service {
    fun getPlaces()=listOf( getPlace(), getPlace(), getPlace(), getPlace() )

    private fun getPlace()=
        Place(
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            Country("", ""),
            true
        )
}