package com.wing.animalsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.hcbgame.shoot.glass.widget.animal.FingerAnimal
import com.hcbgame.shoot.glass.widget.animal.SubjectAnimal

class MainActivity : AppCompatActivity() {
    var subjectAnimal: SubjectAnimal? = null;
    var fingerAnimal: FingerAnimal? = null;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var view = findViewById<Button>(R.id.bt)
        subjectAnimal = SubjectAnimal()
        fingerAnimal = FingerAnimal(view)
        fingerAnimal!!.startAnimal()
        subjectAnimal!!.add(fingerAnimal!!)
    }

    override fun onStop() {
        super.onStop()
        subjectAnimal!!.operation(1)   //暂停所有执行的动画
    }

    override fun onDestroy() {
        super.onDestroy()
        subjectAnimal!!.operation(3) //删除所有的动画
        subjectAnimal!!.del(fingerAnimal!!)

    }

    override fun onRestart() {
        super.onRestart()
        subjectAnimal!!.operation(2)  //恢复所有的动画
    }
}
