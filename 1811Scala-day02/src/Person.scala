

class Person {
  //--函数定义在类的内部, 则此函数是类的成员函数
  def eat()={
     println("eat food")
     
     //--定义在函数内的函数称为本地函数
     //--本地函数不能通过对象来调用
     def cook()={
       println("cook")
     }
  }
  
  def sleep()={
    
  }
  
}