#Merge sort 


El algoritmo de ordenamiento por mezcla (merge sort en inglés) es un algoritmo de ordenamiento externo estable basado en la técnica divide y vencerás. Es de complejidad O(n log n).
###Descripcion
Fue desarrollado en 1945 por John Von Neumann .

Conceptualmente, el ordenamiento por mezcla funciona de la siguiente manera:

Si la longitud de la lista es 0 ó 1, entonces ya está ordenada. En otro caso:
Dividir la lista desordenada en dos sublistas de aproximadamente la mitad del tamaño.
Ordenar cada sublista recursivamente aplicando el ordenamiento por mezcla.
Mezclar las dos sublistas en una sola lista ordenada.
El ordenamiento por mezcla incorpora dos ideas principales para mejorar su tiempo de ejecución:

Una lista pequeña necesitará menos pasos para ordenarse que una lista grande.
Se necesitan menos pasos para construir una lista ordenada a partir de dos listas también ordenadas, que a partir de dos listas desordenadas. Por ejemplo, sólo será necesario entrelazar cada lista una vez que están ordenadas.
####Algoritmo

| #| Pseudocodigo | Costo |
| ---------- | ---------- | ---------- |
| 1   | n<sub>1</sub> = q - p + 1  | 1   |
| 2   | n<sub>2</sub> = r - q   | 1   |
| 3   | Sean L[1...n<sub>1</sub>+1] y R[1...n<sub>2</sub>+1] 2 arreglos | 1   |
| 4   | for i=1 hasta n<sub>1</sub>   | n/2 + 1  |
| 5   | L[i] = A[p+i-1]   | n/2   |
| 6   | for j=1 hasta n<sub>2</sub>   | n/2 + 1  |
| 7   | R[j] = A[q+j]   | n/2  |
| 8   | L[n<sub>1</sub>+1] = infinito   | 1   |
| 9   | R[n<sub>2</sub>+1] = infinito | 1   |
| 10   | i=1   | 1   |
| 11   | j=1   | 1   |
| 12   | for k=p hasta r   | n+1   |
| 13   | if(L[i] <= R[j]   | n  |
| 14  | A[k] = L[i]   | n  |
| 15  | i = i+1   | n   |
| 16  | else A[k] = R[j]  | -   |
| 17  | j = j+1 | -   |
    
### Orden ###

**Tiempo de ejecución**
![GitHub Logo](http://www.sciweavers.org/upload/Tex2Img_1422415589/render.png) 

![GitHub Logo](http://www.sciweavers.org/upload/Tex2Img_1422415764/render.png) 

![GitHub Logo](http://www.sciweavers.org/upload/Tex2Img_1422415854/render.png) 

