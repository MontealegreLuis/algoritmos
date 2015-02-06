import scala.collection.mutable

class MergeSort {

    def sort(numbers: List[Int]): List[Int] = {
        val n = numbers.size
        if(n <= 1) return numbers

        val (lowerHalf, upperHalf) = numbers splitAt n/2
        merge( sort(lowerHalf), sort(upperHalf))
    }

    private def merge(left: List[Int], right: List[Int]): List[Int] = {
        var i = 0 // izquierda de la list
        var j = 0 // Derecha de la listalist
        val values = mutable.ListBuffer[Int]() // resultado

        while(i < left.size || j < right.size) {
            val leftValue = if(i < left.size) left(i) else Int.MaxValue
            val rightValue = if(j < right.size) right(j) else Int.MaxValue

            if(leftValue < rightValue){
                i += 1
                values += leftValue
            } else {
                j += 1
                values += rightValue
            }
        }

        values.toList
    }
}
