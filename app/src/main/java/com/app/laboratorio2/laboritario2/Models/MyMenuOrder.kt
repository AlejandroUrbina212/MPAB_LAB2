package com.app.laboratorio2.laboritario2.Models

class MyMenuOrder: MenuOrder{
    override val menuOrder: ArrayList<String> = ArrayList()
    override fun clear() {
        menuOrder.clear()
    }

    override fun add(element: String) {
        menuOrder.add(element)
    }

    override fun del(elementIndex: Int) {
        menuOrder.removeAt(elementIndex)
    }

    override fun done() {
        //Do Nothing
    }






}