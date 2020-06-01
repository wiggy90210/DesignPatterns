package com.example.designpatterns.order

import com.example.designpatterns.notification.Observer

data class Order(var orderNumber: Long, var orderStatus: OrderStatus, val registeredObservers: MutableSet<Observer> = mutableSetOf())
    : Observable{
    override fun registerObserver(observer: Observer) {
        registeredObservers.add(observer)
    }

    override fun unregisterObserver(observer: Observer) {
        registeredObservers.remove(observer)
    }

    override fun notifyObservers() {
        registeredObservers.forEach { it.update(this) }
    }

    fun changeOrderStatus(orderStatus : OrderStatus) {
        this.orderStatus = orderStatus
        notifyObservers()
    }
}