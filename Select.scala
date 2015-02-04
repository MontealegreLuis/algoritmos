class Select {
  
  def Ordena(array: Array[Int]) {
    
     
    for(i<-0 until  array.length-1)
    {
      var min=i
      for(j<-i+1 until array.length)
      {
         if(array(j)<array(min))
           min=j         
      }
      if(min!=i)
      {
        var aux=array(i)
        array(i)=array(min)
        array(min)=aux
      }
    }
  }
    
  
}