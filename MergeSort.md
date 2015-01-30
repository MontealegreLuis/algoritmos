#*Merge Sort*
##Descripcion del algortimo
Esta basado en la técnica de “divide y venceras “. Primero toma el arreglo original de datos, lo divide en dos partes del mismo tamaño cada una, y lo sigue dividiendo hasta que solo quede un elemento. Cada una de las divisiones se ordena de manera separada y luego se unen para formar el arreglo ya ordenado. Este algoritmo divide inicialmente la lista hasta su mínimo valor y luego ordena el arreglo.

##Algortimo
*Inicio

Merge(A,p,q,r)

											Costos

	1. n1=q-p+1									1
	2. n2r-p									1
	3. let L[i... n1+1] and R[1... n2+1]		1
	4. for i=1 to n2							(n/2)+1
		5. L[i] =A[p+i]							(n/2)
	6. for j=1 to n2							(n/2)+1
		7. R[j] =A[q+j]							(n/2)
	8. L[n1+1]=Inf								1
	9. R[n2+1]=Inf								1
	10. i=1										1
	11. j=1										1
	12. for k=p to r							n+1
		13. if([i]<=R[j])						n
		14. A[K]=L[i]							n
		15. i=i+1
		16. else A[k]=R[j]						n
		17. j=j+1 
		
*Fin
##Tiempo de ejecucion
Analizando el algortimo podemos ver que la condicion if puede tomar solo uno u otro valor, asi que podemos tomar las instrucciones 14-15 como una sola, lo mismo pasaría con las instrucciones 16-17 asi obtenemos la suma de los tiempos de cada linea.

![Form](http://latex.codecogs.com/gif.latex?T%28n%29%3Dc_%7B1%7D&plus;c_%7B2%7D&plus;c_%7B3%7D&plus;c_%7B4%7D%28%5Cfrac%7Bn%7D%7B2%7D&plus;1%29&plus;c_%7B5%7D%28%5Cfrac%7Bn%7D%7B2%7D%29&plus;c_%7B6%28%5Cfrac%7Bn%7D%7B2%7D&plus;1%29&plus;c_%7B7%7D%28%5Cfrac%7Bn%7D%7B2%7D%29%20%5C%5C&plus;c_%7B8%7D&plus;c_%7B9%7D&plus;c_%7B10%7D&plus;c_%7B11%7D&plus;c_%7B12%7D%28n&plus;1%29&plus;c_%7B13%7D%28n%29&plus;c_%7B14%7D%28n%29&plus;c_%7B15%7D%28n%29)

![Form](http://latex.codecogs.com/gif.latex?%3D%28c_%7B1%7D&plus;c_%7B2%7D&plus;c_%7B3%7D&plus;c_%7B4%7D&plus;c_%7B6%7D&plus;c_%7B8%7D&plus;c_%7B9%7D&plus;c_%7B10%7D&plus;c_%7B11%7D&plus;c_%7B12%7D%29&plus;%20%5C%5C%28%5Cfrac%7Bc_%7B4%7D%7D%7B2%7D&plus;%5Cfrac%7Bc_%7B5%7D%7D%7B2%7D&plus;%5Cfrac%7Bc_%7B6%7D%7D%7B2%7D&plus;%5Cfrac%7Bc_%7B7%7D%7D%7B2%7D&plus;c_%7B12%7D&plus;c_%7B13%7D&plus;c_%7B14%7D&plus;c_%7B15%7D%29n)

Simplificado los terminos tenemos:
![Form](http://latex.codecogs.com/gif.latex?6n&plus;10)

por lo tanto el orden del algoritmo es de O(n)