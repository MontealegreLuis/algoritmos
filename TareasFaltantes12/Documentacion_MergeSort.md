## MERGESORT ##

Este algoritmo también es llamado de intercalación o combinación, debido que combina(intercala) dos estructuras previamente ordenadas.

####Descripcion####
Fue desarrollado en 1945 por John Von Neumann. Conceptualmente, ordenamiento por mezcla funciona de la siguiente manera:

- Si la longitud de la lista es 0 ó 1, entonces ya está ordenada. en otro caso:
- Dividir la lista desordenada en dos sublistas de aproximadamente la mitad del tamaño.
- Ordenar cada sublista recursivamente aplicando el ordenamiento por mezcla.
- Mezclar las dos sublistas en una sola lista ordenada

#### Algoritmo ####
No.	ALGORITMO  COSTO 


1.  n1 = q - p + 1 ------------------------------------->1
2. 	n2 = r - q	1 ---------------------------------------->1
3. 	sean L[1...n1+1] y R[1...n2+1] 2 arreglos---->1
4. 	for i=1 hasta n1	----------------------------------->n/2 + 1
5. 	L[i] = A[p+i-1]--------------------------------------->n/2
6. 	for j=1 hasta n2------------------------------------>n/2 + 1
7. 	R[j] = A[q+j]----------------------------------------->n/2
8. 	L[n1+1] = infinito---------------------------------->1
9. 	R[n2+1] = infinito---------------------------------->1
10. i=1---------------------------------------------------->1
11. j=1---------------------------------------------------->1
12. for k=p hasta r--------------------------------------n+1
13. if(L[i] <= R[j]---------------------------------------->n
14. A[k] = L[i]-------------------------------------------->n
15. i = i+1------------------------------------------------>n
16. else A[k] = R[j]-------------------------------------->-	
17. j = j+1	----------------------------------------------->-	

####Analisis####
El tiempo de ejecución es la suma de los tiempos de cada línea ejecutada. Si una línea toma ci para ejecutarse y se ejecuta n veces su tiempo total de ejecución es
cn
![](http://www.sciweavers.org/upload/Tex2Img_1428817852/render.png)

Reduciendo terminos
![](http://www.sciweavers.org/upload/Tex2Img_1428819955/render.png)

En donde tenemos que el ordenamientomerge sort es de complejidad 
0(n log n)



	
