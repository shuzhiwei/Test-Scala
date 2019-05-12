/**
8.编写函数计算x的n次方,其中n是整数，要考虑等n是0，正偶数，正奇数，负数这几种情况。
比如当x=2时，此函数要算出 2^4，2^3，2^0，2^(-1)对应的值

mi(x:Int，n：Int）：Double={    }

mi(2,10)=1024
mi(2,-1)=0.5

要求用递归函数编写

**/
object Test08 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(356); 
	 def mi(x:Double,n:Int):Double={
    if(n == 0) return 1
    else if (n > 0 && n%2 == 0) mi(x,n/2) * mi(x,n/2)
    else if(n>0 && n%2 == 1) x * mi(x,n-1)
    else 1/mi(x,-n)
	};System.out.println("""mi: (x: Double, n: Int)Double""");$skip(12); val res$0 = 
	
	mi(2,10);System.out.println("""res0: Double = """ + $show(res$0))}
	
}
