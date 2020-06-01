package com.example.designpatterns.notification

import android.util.Log
import com.example.designpatterns.order.Order

class MobileApp : Observer {

    override fun update(order: Order) {
        Log.e("MoblieApp Zamówienie:", "${order.orderNumber} zmieniło status na: ${order.orderStatus}")
    }

}