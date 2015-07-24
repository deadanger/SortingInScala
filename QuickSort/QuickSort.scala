object QuickSort{

	def main(argString: Array[String]): Unit = {
	
		var args: Array[Int] = argString.map(_.toInt)
	
		def quicksort(leftBound: Int, rightBound: Int): Unit = {
		
			println("In test: " + args.mkString(" "))

			if(rightBound - leftBound > 0){
				var left = leftBound
				var right = rightBound
				val pivot = args(leftBound)
	
				while(!hasCrossOver(left, right)){
					if(args(left) <= pivot){left = left + 1}
					if(args(right)>= pivot){right = right - 1}

					if(!hasCrossOver(left, right)){
						swap(left, right)

					}
				}
				
				swap(leftBound, right)
				quicksort(leftBound, right - 1)
				quicksort(right + 1, rightBound)
			}
			
		}
		
		def hasCrossOver(left: Int, right: Int) = left > right
		
		def swap(xIndex: Int, yIndex: Int){
			val temp = args(xIndex)
			args(xIndex) = args(yIndex)
			args(yIndex) = temp
		}
		
		quicksort(0, args.length -1)
		
		println(args.mkString(" "))

	}
}
