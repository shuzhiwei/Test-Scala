/**
8.编写函数计算x的n次方,其中n是整数，要考虑等n是0，正偶数，正奇数，负数这几种情况。
比如当x=2时，此函数要算出 2^4，2^3，2^0，2^(-1)对应的值

mi(x:Int，n：Int）：Double={    }

mi(2,10)=1024
mi(2,-1)=0.5

要求用递归函数编写

**/
object Test08 {
	 def mi(x:Double,n:Int):Double={
    if(n == 0) return 1
    else if (n > 0 && n%2 == 0) mi(x,n/2) * mi(x,n/2)
    else if(n>0 && n%2 == 1) x * mi(x,n-1)
    else 1/mi(x,-n)
	}                                         //> mi: (x: Double, n: Int)Double
	
	mi(2,10)                                  //> res0: Double = 1024.0
	
}