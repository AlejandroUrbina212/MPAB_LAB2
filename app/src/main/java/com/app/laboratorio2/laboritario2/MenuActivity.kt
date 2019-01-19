package com.app.laboratorio2.laboritario2

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.app.laboratorio2.laboritario2.Models.ApplicationExtendedClass

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val menuAdapter = ArrayAdapter(this,R.layout.listview_item, ApplicationExtendedClass.menu)

        val menuListView = findViewById<ListView>(R.id.menuListView)
        menuListView.adapter = menuAdapter

        menuListView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            // value of item that is clicked
            val itemValue = menuListView.getItemAtPosition(position) as String

            // Toast the values
            Toast.makeText(this, "Seleccionaste: $itemValue, se ha añadido a tu pedido", Toast.LENGTH_SHORT).show()
            ApplicationExtendedClass.myMenuOrderObject.add(itemValue) //add the value to the menuOrder Array
        }

        val backToMainButton = findViewById<Button>(R.id.btnBackToMain)
        backToMainButton.setOnClickListener {
            this.finish() //finishes activity
        }


    }
}
