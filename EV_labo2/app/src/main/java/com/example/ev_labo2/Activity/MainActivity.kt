package com.example.ev_labo2.Activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.ev_labo2.Fragments.BlankFragment
import com.example.ev_labo2.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        
            var fragmento = BlankFragment.newInstance("h", "h")
            supportFragmentManager.beginTransaction().add(R.id.frag,fragmento).commit()
            Log.d("hola","No funciona")




    }


}
