package com.example.designpatterns.notification

import android.util.Log
import com.example.designpatterns.order.Order

class TextMessage : Observer {

    override fun update(order: Order) {
        Log.e("SMS Zamówienie:", "${order.orderNumber} zmieniło status na: ${order.orderStatus}")
    }

}