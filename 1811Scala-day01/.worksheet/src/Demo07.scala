import util.control.Breaks._
/**
知识点
1 scala的break关键字生效的前提需要导包
2 scala也是通过import导包, ._表示导指定包下的所有类
**/
object Demo07 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(161); 
  println("Welcome to the Scala worksheet");$skip(123); 
  //--把循环写在breakable()里, 此时的break是跳出循环的效果
  breakable(
  for(i<-1 to 10){
  	if(i>8){
  		break
  	}
  	println(i)
  }
  );$skip(121); 
  
  //--把循环写在breakable()外, 此时的break是continue的效果
  for(i<-1 to 10){
  breakable(
  	if(i == 8) break else println(i)
  )}
  }
}
