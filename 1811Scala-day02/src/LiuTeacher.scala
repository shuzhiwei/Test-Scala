
/**
 * 1 继承用extends
 * 2 混入特质用with
 * 3 scala单继承,多混入
 * 4 scala要求无论是继承还是混入, 类中必须有且仅有一个extends关键字
 */
class LiuTeacher extends Teacher with Dance with Drive with Serializable{
  def makeNote: String = {
    ???
  }

  def teach(a: Int, b: Int): Int = {
    ???
  }
  
  override def sayword():String={
    "word"
  }

  def BaLei(): Unit = {
    ???
  }

  def Floor(): String = {
    ???
  }

  def start(): Unit = {
    ???
  }

  def stop(): Int = {
    ???
  }
  
}