package com.example.designpatterns

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.example.designpatterns.notification.Email
import com.example.designpatterns.notification.MobileApp
import com.example.designpatterns.notification.TextMessage
import com.example.designpatterns.order.Order
import com.example.designpatterns.order.OrderStatus

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        doTheStuff()

    }

    fun doTheStuff() {
        val order = Order(110L, OrderStatus.ZAREJESTROWANE)

        val textMessage = TextMessage()
        val email = Email()
        val mobileApp = MobileApp()

        textMessage.updateOrderStatus(order)
        email.updateOrderStatus(order)
        mobileApp.updateOrderStatus(order)
    }
}
