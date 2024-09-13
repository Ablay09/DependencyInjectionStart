package com.example.dependencyinjectionstart.example1

class Component {

    private fun getComputer(): Computer {
        val monitor = Monitor()
        val computerTower = ComputerTower(
            storage = Storage(),
            memory = Memory(),
            processor = Processor()
        )
        val keyboard = Keyboard()
        val mouse = Mouse()
        return Computer(monitor, computerTower, keyboard, mouse)
    }

    fun inject(activity: Activity) {
//        activity.keyboard = Keyboard()
    }

}