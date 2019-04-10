package com.hcbgame.shoot.glass.widget.animal.animalF

/**
 *姓名：张金齐
 *日期：2019/4/9
 *用途功能：
 */

interface IAnimalObserver {
    //1 暂停，2，恢复，3 停止
    fun update(type:Int)
}