package com.example.designpatterns.notification

import android.util.Log
import com.example.designpatterns.order.Order

class MobileApp : Message {

    override fun updateOrderStatus(order: Order) {
        Log.i("MoblieApp Zamówienie:", "${order.orderNumber} zmieniło status na: ${order.orderStatus}")
    }
}