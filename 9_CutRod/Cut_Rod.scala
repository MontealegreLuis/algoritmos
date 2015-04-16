import scala.math;

object Cut_Rod{

	def CutRod(p: Array[Int], n: Int):Int ={
	    if(n==0)
		return 0
	    var q = -99999	
	    for(i<-1 to n) {
		q = math.max(q, p(i-1) + CutRod(p, n-i))
	    }
		return q	
	}

	def main(args: Array[String]){
             val A = Array(1,9,15,4,3,0,7,14)
    	     println(CutRod(A,4))
        }
	
}
