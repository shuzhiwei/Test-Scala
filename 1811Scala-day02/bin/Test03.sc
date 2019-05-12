/**
3.如何用reduce得到数组中的最大元素?
Array(1,2,3,4,5)
要求不能出现max函数

**/
object Test03 {

	val arr = Array(1,2,3,4,5)                //> arr  : Array[Int] = Array(1, 2, 3, 4, 5)

	arr.max                                   //> res0: Int = 5
	
	print(arr.reduce((a,b)=>if(a>b)a else b))
}