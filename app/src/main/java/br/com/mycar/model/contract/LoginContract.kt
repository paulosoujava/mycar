package br.com.mycar.model.contract

interface LoginContract{

    interface View{
     fun showMessage(mesg: String)
    }
    interface Presenter{
        fun validate(email:String, password: String)
    }
}

