object Test02 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(35); 

	val r1 = 10 to 20;System.out.println("""r1  : scala.collection.immutable.Range.Inclusive = """ + $show(r1 ));$skip(25); 
	val r2 = Range(10,20,2);System.out.println("""r2  : scala.collection.immutable.Range = """ + $show(r2 ));$skip(27); 
	
	val a1 = Array(3,2,4,1);System.out.println("""a1  : Array[Int] = """ + $show(a1 ));$skip(43); 
	val a2 = scala.util.Sorting.quickSort(a1);System.out.println("""a2  : Unit = """ + $show(a2 ));$skip(4); val res$0 = 
	a1;System.out.println("""res0: Array[Int] = """ + $show(res$0))}
}
