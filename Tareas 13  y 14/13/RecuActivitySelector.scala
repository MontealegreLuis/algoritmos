//TAREA 13
//RAYEN ARI RAMOS ROCHA

import scala.collection.immutable.Set;

class RecuActivitySelector{
	def RecursiveActivitySelector(S: Array[Int], f: Array[Int], k: Int, n: Int):Set[String] = {
		var m = k + 1
		while((m <= n)&&(S(m)<=f(k))){
			m = m + 1
                        }
		
		if(m <= n){
			var AS = "A" + m
			var a = Set(AS)
			return a ++  RecursiveActivitySelector(S,f,m,n)
		}
		else
			return Set.empty 
		
		
	}
}