object Test02 {

	val r1 = 10 to 20                         //> r1  : scala.collection.immutable.Range.Inclusive = Range(10, 11, 12, 13, 14, 
                                                  //| 15, 16, 17, 18, 19, 20)
	val r2 = Range(10,20,2)                   //> r2  : scala.collection.immutable.Range = Range(10, 12, 14, 16, 18)
	
	val a1 = Array(3,2,4,1)                   //> a1  : Array[Int] = Array(3, 2, 4, 1)
	val a2 = scala.util.Sorting.quickSort(a1) //> a2  : Unit = ()
	a1                                        //> res0: Array[Int] = Array(1, 2, 3, 4)
}