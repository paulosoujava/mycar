package br.com.mycar.utils

import android.content.Context
import android.graphics.Color
import com.kinda.alert.KAlertDialog



object  Utils {

    fun alert(ctx: Context,
              typeAlert:  Int = KAlertDialog.WARNING_TYPE,
              color: String = "#A5DC86",
              title: String,
              text: String,
              isCancelable: Boolean = false){
        val pDialog = KAlertDialog(ctx, typeAlert)
        pDialog.progressHelper.barColor = Color.parseColor(color)
        pDialog.titleText = title
        pDialog.contentText = text
        pDialog.setCancelable(isCancelable)
        pDialog.show()
    }
}