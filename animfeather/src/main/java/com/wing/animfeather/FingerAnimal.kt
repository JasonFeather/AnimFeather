package com.hcbgame.shoot.glass.widget.animal

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.view.View
import com.hcbgame.shoot.glass.widget.animal.animalF.IAnimal
import com.hcbgame.shoot.glass.widget.animal.animalF.IAnimalObserver

/**
 *姓名：张金齐
 *日期：2019/4/9
 *用途功能：
 */

class FingerAnimal constructor(var view: View) : IAnimal,
    IAnimalObserver {
    override fun update(type: Int) {
        when (type) {
            1 -> parseAnimal()
            2 -> recoveryAnimal()
            3 -> stopAnimal()
        }
    }

    var animationSet: AnimatorSet
    override fun startAnimal() {
        view.visibility = View.VISIBLE
        animationSet!!.start()
    }

    override fun stopAnimal() {
        if (animationSet.isRunning) {
            animationSet.cancel()
            view.visibility = View.GONE
        }

    }

    override fun parseAnimal() {
        if (animationSet.isRunning) {
            animationSet.pause()
        }
    }

    override fun recoveryAnimal() {
        if (animationSet.isPaused) {
            animationSet.resume()
        }
    }

    init {
        var animatorTranslateY = ObjectAnimator.ofFloat(view, "translationY", 0f, 30f, -30f, 0f)
        var animatorScaleX = ObjectAnimator.ofFloat(view, "scaleX", 1f, 1.2f, 0.8f, 1f)
        var animatorScaleY = ObjectAnimator.ofFloat(view, "scaleY", 1f, 1.2f, 0.8f, 1f)
        animatorTranslateY.setDuration((500).toLong())
        animatorScaleX.setDuration((500).toLong())
        animatorScaleY.setDuration((500).toLong())
        animatorTranslateY.repeatCount = -1
        animatorScaleX.repeatCount = -1
        animatorScaleY.repeatCount = -1
        animationSet = AnimatorSet()
        animationSet.playTogether(animatorTranslateY, animatorScaleX, animatorScaleY)
    }

}