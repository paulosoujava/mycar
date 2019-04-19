package br.com.mycar.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.mycar.R
import br.com.mycar.model.contract.LoginContract
import br.com.mycar.model.logic.LoginPresenter

class LoginActivity : AppCompatActivity(), LoginContract.View {

    val presenter = LoginPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    override fun showMessage(mesg: String) {

    }
}
