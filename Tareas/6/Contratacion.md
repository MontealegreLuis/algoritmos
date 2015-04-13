## CONTRATACIÓN##

###Descripción
Supongamos que necesitas contratar a un nuevo
asistente de oficina y decides contratar una agencia que te envía un
candidato cada día , además después de entrevistar a cada
persona sólo la contratarás si el solicitantes está
mejor calificado que el asistente actual.

####Pseudocódigo####

    Hire-ASSISTANT(n)
    best =0
    for i= 1 to n
       interview candidate i
       if candidate i is better than candidate best
          best =i
          hire candidate i

####Analisis###
La entrevista tiene un costo bajo= ci, mientras
que contratar =caro= ch

-  Si m es el número de personas contratadas, el costo total asociado con este algoritmo es
   **O(cin + chm)**


-  Siempre se entrevistan a **n** candidatos y siempre pagamos el costo asociado cin de las entrevistas.


-  Debemos concentrarnos en analizar chm, el costo de contratar ya que este siempre varia.

El peor de los casos


- Contratamos a cada candidato que entrevistamos, esta situación ocurre si los candidatos vienen en estricto
orden incrementando su calidad.

**Por lo tanto contratamos n veces, con un costo total de O(chn)**]