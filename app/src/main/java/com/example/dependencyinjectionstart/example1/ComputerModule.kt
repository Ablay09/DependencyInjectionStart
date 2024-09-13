package com.example.dependencyinjectionstart.example1

import dagger.Module
import dagger.Provides

@Module
class  ComputerModule {
    @Provides
    fun provideKeyboard(): Keyboard = Keyboard()

    @Provides
    fun provideMemory(): Memory = Memory()

    @Provides
    fun provideMonitor(): Monitor = Monitor()

    @Provides
    fun provideMouse(): Mouse = Mouse()

    @Provides
    fun provideProcessor(): Processor = Processor()

    @Provides
    fun provideStorage(): Storage = Storage()

    @Provides
    fun provideComputerTower(
        storage: Storage,
        memory: Memory,
        processor: Processor
    ): ComputerTower = ComputerTower(
        storage = storage,
        memory = memory,
        processor = processor
    )

    @Provides
    fun provideComputer(
        monitor: Monitor,
        computerTower: ComputerTower,
        keyboard: Keyboard,
        mouse: Mouse
    ): Computer = Computer(
        monitor = monitor,
        computerTower = computerTower,
        keyboard = keyboard,
        mouse = mouse
    )
}