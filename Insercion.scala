class Insercion {
  
  def Ordena(myList: Array[Int]) {
      
    
    var aux=0
    var j=0

     
    
    for(i<-1 to myList.length)
    {
      aux = myList(i)
      j=i-1
      while((myList(j) > aux) && (j>=0))
      {
        myList(j+1)=myList(j)
        j=j-1
        
      }
      myList(j+1)=aux
    }
    
   

}
}