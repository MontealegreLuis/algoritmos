#Algoritmo de Combinación (Merge Sort)



El algoritmo opera de la siguiente forma:

- **Divide**: Divide la secuencia de n elementos que se
ordenarán en dos sub-secuencias de n/2 elementos.

-  **Conquista**: Ordena las dos subsecuencias usando el
algoritmo de combinación.

- **Combina**: Combina las dos subsecuencias para
producir un resultado.


**DESCRIPCIÓN**

Este algoritmo consiste basicamente en dividir en partes iguales la lista de numeros y luego mezclarlos comparándolos, dejándolos ordenados.
Si se piensa en este algoritmo recursivamente, podemos imaginar que dividirá la lista hasta tener un elemento en cada lista, luego lo compara con el que está a su lado y según corresponda, lo situa donde corresponde.

En la siguiente figura podemos ver cómo funciona:

![Merge][id3]
[id3]: https://raw.githubusercontent.com/naycont/Stuff/master/grafico_merge.png


**PSEUDOCODIGO**:

![Merge][id]
[id]: https://raw.githubusercontent.com/naycont/Stuff/201b90c9c199efa49114e8069cd0b558c59c4cad/Merge.png 


![Merge][id2]
[id2]: https://raw.githubusercontent.com/naycont/Stuff/master/Merge_Sort.png

**TIempo de Ejecución**

| Código     | TIempo     |
| ------------- | ------------- |
| n1 = q - p+1 | 1 |
| n2 = r - q | 1 |
| let L [1.n1 +1 and R[1..n2 + 1] new arrays| 1 |
| for i = 1 to n1| (n/2)+1 |
| L[i] =A[p+i]| (n/2) |
| for j = 1 to n2| (n/2)+1 |
| R[j] =A[q+j]| (n/2) |
|L[n1+1] = Inf | 1 |
|R[n2+1]= Inf | 1 |
|i = 1 | 1 |
|j = 1 | 1 |
|for k = p to r   | n+1 |
|if([i]<=R[j])     | n |
|A[K]=L[i]     | n |
|i = i + 1   |  |
|else A[k] = R[j]   | n |
|j = j + 1   |  |


Simplificando:

![Merge][id3]
[id3]: http://www.sciweavers.org/upload/Tex2Img_1424112910/render.png

![Merge][id3]
[id4]:http://www.sciweavers.org/upload/Tex2Img_1424113351/render.png



En conclusión:

 **El orden del algoritmo es de O(n)**


