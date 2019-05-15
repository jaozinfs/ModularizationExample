package com.joao.commom.data.core.extensions

import android.app.Activity
import android.app.AlertDialog
import android.content.DialogInterface
import androidx.fragment.app.Fragment
import com.joao.libraries.commom.R

//Create loading progress dialog

inline fun Activity.createLoadingDialog(): AlertDialog {
    val loadingView = this.layoutInflater.inflate(R.layout.layout_dialog_progress_loading, null)

    val progress_dialog = AlertDialog.Builder(this)
        .setCancelable(false)
        .setView(loadingView)
        .create()

    progress_dialog.window!!.setBackgroundDrawableResource(android.R.color.transparent)
    progress_dialog.window!!.setLayout(8, 8)

    return progress_dialog
}


inline fun Fragment.createLoadingDialog(): AlertDialog {
    val loadingView = this.layoutInflater.inflate(R.layout.layout_dialog_progress_loading, null)

    val progress_dialog = AlertDialog.Builder(activity)
        .setCancelable(false)
        .setView(loadingView)
        .create()

    progress_dialog.window!!.setBackgroundDrawableResource(android.R.color.transparent)
    progress_dialog.window!!.setLayout(8, 8)

    return progress_dialog
}

//Show aler with message and listener
fun Activity.showAlertMessage(message: Int) {

    AlertDialog.Builder(this)
        .setMessage(message)
        .setPositiveButton(android.R.string.ok, DialogInterface.OnClickListener { dialog, _ ->
            dialog.dismiss()
        })
        .show()
}

//Show aler with message and listener
fun Fragment.showAlertMessage( message: Int) {

    AlertDialog.Builder(activity)
        .setMessage(message)
        .setPositiveButton(android.R.string.ok, DialogInterface.OnClickListener { dialog, _ ->
            dialog.dismiss()
        })
        .show()
}
