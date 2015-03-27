package cut_rod

import scala.Array._
import cut_rod.CutRodUTILS._
import cut_rod.CutRodUTILS.TIPO_DE_EJECUCION_CUT_ROD._

object ExtendedBottomUpCutRod {

    var p = Array(1,5,8,9,10,17,17,20,24,30)
    var s = Array[Int]();
  
    def main(args: Array[String]) {
        var mPipe = 8

		mostrarEjecucionDeUnProgramaMainDeCutRod(EXTENDED_BOTTOM_UP_CUT_ROD, mPipe, p)
        
        print("Cortes: ")
        Imprimir(mPipe)
    }
  
	def extended_Bottom_Up_Cut_Rod(n: Int): Int = {
		var r = Array.ofDim[Int](n+1)
		s = Array.ofDim[Int](n+1)
		r(0) = 0
		for(j<-0 to n-1) {
			var q = Int.MinValue
			for(i<-0 to j)
			    if(q < p(i)+r(j-i)) {
				    q = p(i)+r(j-i)
				    s(j+1) = i+1
			    }
			 	r(j+1) = q
		}
		return r(n) 
	}
  
	def Imprimir(tam: Int){
    	var mTubo = tam
    
    	while(mTubo > 0) {
    		print(s(mTubo)+" ")
    		mTubo = mTubo - s(mTubo)
    	}
	}
}
