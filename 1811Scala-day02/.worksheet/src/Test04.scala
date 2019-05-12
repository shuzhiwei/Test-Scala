/**
4.用to和reduce实现阶乘函数
比如算1~10 的阶乘结果

**/
object Test04 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(86); val res$0 = 

	1 to 10 reduce{(a,b)=>a*b};System.out.println("""res0: Int = """ + $show(res$0))}
}
