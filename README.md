# animFeather


#### 动画整体处理控件，方便整体做暂停，恢复，停止操作


---

# How to Use:

#### Step One: Add `MusicFrame` to your project

```java
 dependencies {
 	        implementation 'com.github.JasonFeather:AnimFeather:1.0.1'
 	}

```

1. Via XML:
简单调用

```java
         var view = findViewById<Button>(R.id.bt)
         //创建被监听类
         subjectAnimal = SubjectAnimal()
         //创建动画对象
         fingerAnimal = FingerAnimal(view)
         fingerAnimal!!.startAnimal()
         //注册动画
         subjectAnimal!!.add(fingerAnimal!!)


```

---

#### 使用:

```java
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
```



