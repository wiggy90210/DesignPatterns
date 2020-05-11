package com.example.designpatterns.notification

import android.util.Log
import com.example.designpatterns.order.Order

class TextMessage : Message {

    override fun updateOrderStatus(order: Order) {
        Log.i("SMS Zamówienie:", "${order.orderNumber} zmieniło status na: ${order.orderStatus}")
    }
}