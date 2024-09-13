package com.example.dependencyinjectionstart.example1

import javax.inject.Inject

class Activity {

    private val component = DaggerNewComponent.create()

    @Inject
    lateinit var keyboard: Keyboard
    @Inject
    lateinit var monitor: Monitor

    val mouse: Mouse = component.getMouse()

    init {
        component.inject(this)
    }
}