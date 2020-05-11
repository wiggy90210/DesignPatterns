package com.example.designpatterns.notification

import com.example.designpatterns.order.Order

interface Message { // SOLID

    fun updateOrderStatus(order: Order)
}