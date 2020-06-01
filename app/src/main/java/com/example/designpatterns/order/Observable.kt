package com.example.designpatterns.order

import com.example.designpatterns.notification.Observer

interface Observable {

    fun registerObserver(observer: Observer)
    fun unregisterObserver(observer: Observer)
    fun notifyObservers()
}