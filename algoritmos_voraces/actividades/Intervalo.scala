class Intervalo(var s: Int,var f: Int, var nombre: String) {
  
   def getS(): Int = {
     return s
   }
   
   def getF(): Int = {
     return f
   }
  
   def getNombre(): String = {
     return nombre
   }
   
   def returnIntervalo: String = {
     return nombre+": ["+s+","+f+")"
   }
}