/**
知识点:
1 scala的异常处理机制通java, 不同之处: catch的异常捕获是通过case来匹配的
2 scala的match机制类似于java的switch case
3 scala的switch语句是由返回值的, 可以接
4 scala的Any相当于java的Object. 如果一个语句有多个分支返回, 但是返回值不同, 则类型就是Any
如果分支返回值都一致, 则返回分支返回值类型
**/
object Demo06 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  try{
  	//throw new NullPointerException
  	throw new RuntimeException
  }catch{
  	case t:NullPointerException=>{
  		//--处理异常的逻辑
  		println("null error")
  	}
  	case t:Exception=>{
  		println("other error")
  	}
  }finally{
  		println("end")
  }                                               //> other error
                                                  //| end
                                                  
  val s1 = "hello"                                //> s1  : String = hello
  val r1 = s1 match{
  	case "hello" =>{
  		println("1")
  		
  	}
  	case "world"=>{
  		println("2")
  		2
  	}
  }                                               //> 1
                                                  //| r1  : AnyVal = ()
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
                                                  
}