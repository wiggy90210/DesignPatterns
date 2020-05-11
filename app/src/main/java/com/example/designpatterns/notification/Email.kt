package com.example.designpatterns.notification

import android.util.Log
import com.example.designpatterns.order.Order

class Email : Message {

    override fun updateOrderStatus(order: Order) {
        Log.i("Email Zamówienie:", "${order.orderNumber} zmieniło status na: ${order.orderStatus}")
    }
}