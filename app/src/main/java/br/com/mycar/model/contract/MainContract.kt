package br.com.mycar.model.contract

import br.com.mycar.model.entity.Place

interface MainContract {
    fun click( place: Place)
}