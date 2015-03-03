#Inserccion

El ordenamiento por inserción técnicamente es la forma mas lógica de ordenar cualquier cosa para un humano, por ejemplo, una baraja de cartas. Requiere O(n²).

Inicialmente se tiene un solo elemento, que obviamente es un conjunto ordenado. Después, cuando hay k elementos ordenados de menor a mayor, se toma el elemento k+1 y se compara con todos los elementos ya ordenados, deteniéndose cuando se encuentra un elemento menor (todos los elementos mayores han sido desplazados una posición a la derecha). En este punto se inserta el elemento k+1 debiendo desplazarse los demás elementos.



##	Pseudocodigo

**for** _j_ = 2 **to** _A.length_
       _Key = A[j]_
       // Insert A[j] into the sorted sequence A[1..j-1].
_i=j-1_
  **while** _i>0_ and_A[i]>key_
          _A[i+1] = A[i]_
          _i = i-1_
        _a[i+1]= key_

##	Costo
costo | N° de Veces
------|-------------
  c1    |   n
  c2    | n-1
  c4    | n-1
  c5    |  ![img](http://www.sciweavers.org/tex2img.php?eq=%5Csum_%7Bj%3D2%7D%5E%7Bn%7D%20t_%7Bj%7D&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0[/img])
  c6    |  ![img](http://www.sciweavers.org/tex2img.php?eq=%5Csum_%7Bj%3D2%7D%5E%7Bn%7D%20t_%7Bj-1%7D&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0[/img])
  c7    | ![img](http://www.sciweavers.org/tex2img.php?eq=%5Csum_%7Bj%3D2%7D%5E%7Bn%7D%20t_%7Bj-1%7D&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0[/img])
  c8    | n-1


##Tiempo de ejecucion
   **T(n)=c1n+c2(n-1)+c4(n-1)+c5 ![img](http://www.sciweavers.org/tex2img.php?eq=%5Csum_%7Bj%3D2%7D%5E%7Bn%7D%20t_%7Bj%7D&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0[/img]) + c6 ![img](http://www.sciweavers.org/tex2img.php?eq=%5Csum_%7Bj%3D2%7D%5E%7Bn%7D%20t_%7Bj-1%7D&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0[/img]) +c7 ![img](http://www.sciweavers.org/tex2img.php?eq=%5Csum_%7Bj%3D2%7D%5E%7Bn%7D%20t_%7Bj-1%7D&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0[/img]) +c8(n-1)**

![img](http://www.sciweavers.org/tex2img.php?eq=T%28n%29%20%3D%20c_%7B1%7Dn%20%2B%20c_%7B2%7D%28n-1%29%20%2B%20c_%7B4%7D%28n-1%29%20%20%2B%20c_%7B5%7D%20%5Cfrac%7Bn%28n%2B1%29%7D%7B2%7D-1%20%7D%20%2B%20c_%7B6%7D%20%5Cfrac%7Bn%28n-1%29%7D%7B2%7D%7D%20%2B%20c_%7B7%7D%20%5Cfrac%7Bn%28n-1%29%7D%7B2%7D%20%7D%20%2B%20c_%7B8%7D%28n-1%29%0A%20&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0[/img])


![img](http://www.sciweavers.org/tex2img.php?eq=T%28n%29%20%3D%20%28%20%5Cfrac%7Bc_%7B5%7D%7D%7B2%7D%20%2B%20%5Cfrac%7Bc_%7B6%7D%7D%7B2%7D%20%2B%20%5Cfrac%7Bc_%7B7%7D%7D%7B2%7D%20%29%20n%5E%7B2%7D%20%2B%20%28%20c_%7B1%7D%20%2B%20c_%7B2%7D%20%2B%20%20c_%7B4%7D%20%2B%20%5Cfrac%7Bc_%7B5%7D%7D%7B2%7D%20-%5Cfrac%7Bc_%7B6%7D%7D%7B2%7D%20-%5Cfrac%7Bc_%7B7%7D%7D%7B2%7D%20%2Bc_%7B8%7D%29n%20-%20%28c_%7B2%7D%2Bc_%7B4%7D%2Bc_%7B5%7D%2Bc_%7B8%7D%29%20%0A%20&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0[/img])

por lo tanto observamos que es de orden cuadrada.
_![img](http://www.sciweavers.org/tex2img.php?eq=%20n%5E%7B2%7D%20&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0[/img])_




