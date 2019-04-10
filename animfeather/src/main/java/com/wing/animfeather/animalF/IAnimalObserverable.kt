package com.hcbgame.shoot.glass.widget.animal.animalF

/**
 *姓名：张金齐
 *日期：2019/4/9
 *用途功能：
 */

interface IAnimalObserverable {
    /*增加观察者*/
    fun add(observer: IAnimalObserver)

    /*删除观察者*/
    fun del(observer: IAnimalObserver)

    /*删除观察者*/
    fun delAll()

    /*通知所有的观察者*/
    fun notifyObservers(type:Int)

    /*自身的操作*/
    fun operation(type:Int)
}