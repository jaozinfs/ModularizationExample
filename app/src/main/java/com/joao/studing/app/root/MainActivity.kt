package com.joao.studing.app.root

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.joao.studing.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        startActivity(Intent("com.modularization.login.open").setPackage(packageName))
    }
}
