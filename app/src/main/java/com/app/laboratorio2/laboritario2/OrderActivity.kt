package com.app.laboratorio2.laboritario2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import com.app.laboratorio2.laboritario2.Models.ApplicationExtendedClass
import kotlinx.android.synthetic.main.activity_order.*

class OrderActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)


        val orderAdapter =
            ArrayAdapter(this, R.layout.listview_item, ApplicationExtendedClass.myMenuOrderObject.menuOrder)
        val orderListView = findViewById<ListView>(R.id.orderListView)
        orderListView.adapter = orderAdapter

        orderListView.onItemLongClickListener = AdapterView.OnItemLongClickListener { parent, view, position, id ->
            val selectedItem = parent.getItemAtPosition(position) as String
            ApplicationExtendedClass.myMenuOrderObject.del(position) //Deletes product from the order
            // Display the selected item text on Toast
            Toast.makeText(this, "Has eliminado: $selectedItem", Toast.LENGTH_LONG).show()
            orderAdapter.notifyDataSetChanged()
            return@OnItemLongClickListener true
        }


        btnMakeOrder.setOnClickListener {
            if(orderListView.count != 0){ //There are actually elements in the listView
                ApplicationExtendedClass.myMenuOrderObject.done()    //Change state of MenuOrder object
                orderAdapter.notifyDataSetChanged()    //Refresh ListView items
                Toast.makeText(this, "Tu pedido se se ha procesado!", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this, "Tu pedido actual no cuenta con ningún producto", Toast.LENGTH_LONG).show()
            }
        }

        btnCleanOrder.setOnClickListener {
            ApplicationExtendedClass.myMenuOrderObject.clear() //deletes every element in the list
            orderAdapter.notifyDataSetChanged()    //update ListView
            Toast.makeText(this, "Se ha borrado el pedido!", Toast.LENGTH_LONG).show()
        }

        btnBackToMainFromOrder.setOnClickListener {
            this.finish() //finish this activity
        }

    }
}

