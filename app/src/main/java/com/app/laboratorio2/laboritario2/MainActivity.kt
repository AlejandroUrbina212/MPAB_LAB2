package com.app.laboratorio2.laboritario2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.app.laboratorio2.laboritario2.Models.ApplicationExtendedClass

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val showMenuButton = findViewById<Button>(R.id.btnShowMenu)

        showMenuButton.setOnClickListener {
            startActivity(Intent(this, MenuActivity::class.java))
        }

        val showOrderButton = findViewById<Button>(R.id.btnShowOrder)

        showOrderButton.setOnClickListener {
            startActivity(Intent(this, OrderActivity::class.java))
        }

        //Toast.makeText(this, ApplicationExtendedClass.menu.toString(), Toast.LENGTH_LONG).show()
    }
}
