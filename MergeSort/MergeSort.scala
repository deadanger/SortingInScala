object MergeSort {

    def main(args:Array[String]): Unit = {

	    def mergeSort(array: Array[Int]): Array[Int] = {
		
		    if(array.length <= 1) 
			    array
            else{
		        var midIndex:Int = array.length / 2
			    val left:Array[Int] = mergeSort(array.slice(0, midIndex))
                val right:Array[Int] = mergeSort(array.slice(midIndex, array.length))
                mergeArray(left,right)
			}
		}
		

		def mergeArray(left: Array[Int], right: Array[Int]): Array[Int] = {
		      if (left.isEmpty)
			       right
			  else if (right.isEmpty)
			       left
			  else if (left.head < right.head)
                   Array(left.head) ++ mergeArray(left.tail, right)
			  else 
			       Array(right.head) ++ mergeArray(left, right.tail)
		}

	println(mergeSort(args.map(_.toInt)).mkString(" "))
	}

}