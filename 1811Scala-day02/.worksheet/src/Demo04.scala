/**
学习scala的递归函数
**/
object Demo04 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(80); 
  println("Welcome to the Scala worksheet");$skip(258); 
  
  //--2 3 5 8 13 21
  //--写一个递归函数, 判断第n项数字是多少
  //--scala写递归函数时, 必须显式声明函数的返回值类型, 不能用自动推断
  //--写递归, 掌握两要素
  //--①函数关系 f(n)=f(n-1)+f(n-2)
  //--②结束条件 f(0)=2 f(1)=3
  def f1(n:Int):Int={
  	if(n==0) return 2
  	if(n==1) return 3
  	else f1(n-1)+f1(n-2)
  };System.out.println("""f1: (n: Int)Int""");$skip(11); val res$0 = 
  
  f1(4);System.out.println("""res0: Int = """ + $show(res$0));$skip(165); 
  
  //2 3 4 9 16 81
  // ①函数关系 f(n)=f(n-2)^2
  // ②结束条件 f(0)=2 f(1)=3
  def f2(a:Int):Int={
  	if(a==0)  return 2
  	if(a==1)  return 3
  	else f2(a-2)*f2(a-2)
  };System.out.println("""f2: (a: Int)Int""");$skip(11); val res$1 = 
  
  f2(5);System.out.println("""res1: Int = """ + $show(res$1))}
  
  
  //2 3 4 9 8 27 16 81
  // ①函数关系 n是偶数项 f(n)=f(n-2)*2 n是奇数项 f(n)=f(n-2)*3
  //
  
  
  
  
  
  
  
  
  
  
  
  
}
