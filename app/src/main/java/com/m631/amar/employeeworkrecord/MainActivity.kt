package com.m631.amar.employeeworkrecord

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun login(view: View){

    }

    fun register(view:View){
        val intent = Intent(this,RegisterActivity::class.java)
        startActivity(intent)
    }
}
