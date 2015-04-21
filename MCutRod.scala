import scala.math;
+
+object MCutRod{
+
+	def MCR(p: Array[Int], n: Int):Int ={
+	   val r = new Array[Int](n+1)
+	   for( i <- 0 to n) {
+               r(i) = -99999
+	   }
+    	   return MCR_Aux(p,n,r)
+	}
+	
+	def MCR_Aux(p: Array[Int], n: Int, r:Array[Int]):Int ={
+	 var q=0
+	  if(r(n) >= 0)
+      		return r(n)
+    	  if(n == 0)
+              q = 0
+          else{
+              q = -99999
+      	      for(i<-0 to n-1) {
+                 q = math.max(q, p(i) + MCR_Aux(p, n-i-1, r))
+              }
+           }
+
+    	   r(n) = q
+    	   return q
+	}
+	
+
+
+	def main(args: Array[String]){
+             val A = Array(1,9,15,4,3,0,7,14)
+    	     println(MCR(A,4)) //ganancia tubo de 4
+        }
+	
+}