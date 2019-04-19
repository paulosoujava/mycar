package br.com.mycar.model.logic

import br.com.mycar.model.contract.LoginContract

class LoginPresenter( val view: LoginContract.View): LoginContract.Presenter{

    override fun validate(email: String, password: String) {

    }
}