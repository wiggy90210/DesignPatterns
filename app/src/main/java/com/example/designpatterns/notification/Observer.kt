package com.example.designpatterns.notification

import com.example.designpatterns.order.Order

interface Observer {

    fun update(order: Order)
}