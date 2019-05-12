
/**
 * 1 通过case关键字来修饰class, 变成样例类
 * 2 样例类必须显式的声明一个主构造器
 * 3 样例类默认会构造一个空的辅助构造器
 * 4 样例类默认混入序列化特质Serializable
 * 5 样例类不需要new就可以创建对象
 */
case class Item(v1:String,v2:Double) {
  var title=v1
  var price=v2
}