package com.hcbgame.shoot.glass.widget.animal.animalF

import java.util.*


/**
 *姓名：张金齐
 *日期：2019/4/9
 *用途功能：
 */

abstract  class AsAnimalSub: IAnimalObserverable {
    private val vector = Vector<IAnimalObserver>()
    override fun add(observer: IAnimalObserver) {
        vector.add(observer)
    }

    override fun del(observer: IAnimalObserver) {
        vector.remove(observer)
    }

    override fun delAll() {
        vector.removeAllElements()
    }

    override fun notifyObservers(type:Int) {
        val enumo = vector.elements()
        while (enumo.hasMoreElements()) {
            enumo.nextElement().update(type)
        }
    }
}