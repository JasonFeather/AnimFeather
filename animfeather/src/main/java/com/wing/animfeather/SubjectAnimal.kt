package com.hcbgame.shoot.glass.widget.animal

import com.hcbgame.shoot.glass.widget.animal.animalF.AsAnimalSub

/**
 *姓名：张金齐
 *日期：2019/4/9
 *用途功能：
 */

class SubjectAnimal : AsAnimalSub() {
    override fun operation(type: Int) {
        notifyObservers(type)
    }

}