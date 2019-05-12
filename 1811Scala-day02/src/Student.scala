
/**
 * 1 scala的类的声明和使用同java, 都是通过class关键字来定义
 * 2 可以拥有成员变量和方法
 * 3 通过new关键字来创建对象
 * 4 可以通过private或protected来修饰, 默认是public
 * 5 scala类的主构造器在类上声明
 * 6 scala主构造器只能由一个, 但可以由多个辅助构造器
 * 7 scala的继承通java, 也是单继承
 * 8 scala重写父类方法时, 如果是一个普通方法, 需要加override关键字; 如果是一个抽象方法, 则重写不需要加override
 * 
 */
class Student(v1:String,v2:Int) extends Person{
   private var name=v1
   private var age=v2
   
   override def eat()={
     println("eat food")
   }
   
   //定义一个辅助构造器, 必须调用同类其他构造器
   def this(v1:String)={
     //--调用本类的主构造器
     this(v1,0)
   }
   
   //--再定义两个辅助构造器
   def this()={
     this("",0)
   }
   
   def this(v2:Int)={
     this("",v2)
   }
   
   
   
   def setName(name:String)={
     this.name=name
   }
   def getName()={
     this.name
   }
}

/**
 * 1 为一个类class添加静态成员的方式: 在同一个文件下, 写一个同名的object
 * 2 object和class同名且在同一个文件下, 此时会产生一个绑定关系
 * 3 object是class的伴生对象
 * 4 class是object的伴生类
 * 5 如果要运行main方法, main方法必须写在object里
 */
object Student{
  //此时, eat()方法便成为了静态方法
  def eat()={
     println("eat food")
  }
  
  def main(args: Array[String]): Unit = {
    val a1=Array(1,2,3)
    a1.foreach(println)
  }
}









