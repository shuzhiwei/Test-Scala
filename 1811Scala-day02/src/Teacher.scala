
/**
 * 1 scala通过abstract关键字来定义一个抽象类
 * 2 抽象类中可以定义抽象方法
 * 
 */
abstract class Teacher {
  //--抽象方法的特点: 没有方法体{}
  def makeNote:String
  def teach(a:Int,b:Int):Int
  
  //--普通方法
  def sayword():String={"hello"}
}