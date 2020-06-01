package com.example.designpatterns.notification

import android.util.Log
import com.example.designpatterns.order.Order

class Email : Observer {

    override fun update(order: Order) {
        Log.e("Email Zamówienie:", "${order.orderNumber} zmieniło status na: ${order.orderStatus}")
    }

}