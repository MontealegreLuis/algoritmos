#Algortimo de Seleccion

###Descripcion

El método de selección directa es un algoritmo relativamente sencillo y uno de los más fáciles de recordar e implementar.

Se basa en realizar varias pasadas, intentando encontrar en cada una de ellas el elemento que según el criterio de ordenación es mínimo y colocándolo posteriormente en su sitio.

###Pseudocodigo
~~~~
1   for i = 1 to n ConPaso 1 Hacer
2      indice = i
3       menor = A[i]
4      for j = (i + 1) to n ConPaso 1 Hacer
5           if menor > A[j] Entonces
6               menor = A[j]
7               indice = j
8            FinSi
9        FinPara
10        if indice <> i Entonces
11            auxiliar <- A[indice]
12            A[indice] <- A[i]
13            A[i] <- auxiliar
14        FinSi
15    FinPara

~~~~

###Desarrollo

![img](http://www.sciweavers.org/tex2img.php?eq=%0ACosto%20%20%7C%20%20Tiempo%0A%0AC_%7B1%7D%20%3D%20n%0A%0AC_%7B2%7D%20%3D%20n-1%0A%0AC_%7B3%7D%20%3D%20n-1%0A%0A&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0[/img])


![img](http://www.sciweavers.org/tex2img.php?eq=%0AC_%7B4%7D%20%3D%20%5Csum_%7Bj%3Di%2B1%7D%5E%7Bn-1%7D%20j%0A%0AC_%7B5%7D%20%3D%20%5Csum_%7Bj%3Di%2B1%7D%5E%7Bn-1%7D%20j-1%0A%0AC_%7B6%7D%20%3D%20%5Csum_%7Bj%3Di%2B1%7D%5E%7Bn-1%7D%20j-1%0A%0AC_%7B7%7D%20%3D%20%5Csum_%7Bj%3Di%2B1%7D%5E%7Bn-1%7D%20j-1&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0[/img])


![img](http://www.sciweavers.org/tex2img.php?eq=%0AC_%7B8%7D%20%3D%20n-1%0A%0AC_%7B9%7D%20%3D%20n-1%0A%0AC_%7B10%7D%20%3D%20n-1%0A%0AC_%7B11%7D%20%3D%20n-1%0A&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0[/img])


![img](http://www.sciweavers.org/tex2img.php?eq=T%28n%29%20%3D%20C_%7B1%7Dn%2BC_%7B2%7D%28n-1%7D%2BC_%7B3%7D%28n-1%7D%2BC_%7B4%7D%5Csum_%7Bj%3Di%2B1%3D1%7D%5E%7Bn-1%7D%20j%2B%20C_%7B5%7D%5Csum_%7Bj%3Di%2B1%3D1%7D%5E%7Bn-1%7D%28j-1%29%2BC_%7B6%7D%5Csum_%7Bj%3Di%2B1%3D1%7D%5E%7Bn-1%7D%28j-1%29%2BC_%7B7%7D%5Csum_%7Bj%3Di%2B1%3D1%7D%5E%7Bn-1%7D%20j-1%20%2B%20C_%7B8%7D%28n-1%29%20%2B%20%20C_%7B9%7D%28n-1%29%20%2B%20%20C_%7B10%7D%28n-1%29%20C_%7B11%7D%28n-1%29&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0[/img])


![img](http://www.sciweavers.org/tex2img.php?eq=T%28n%29%20%3D%20C_%7B1%7Dn%2BC_%7B2%7Dn-C_%7B2%7D%2BC_%7B3%7Dn-C_%7B3%7D%2BC_%7B4%7D%28%5Cfrac%7Bn%28n%2B1%29%7D%7B2%7D-1%29%2BC_%7B5%7D%28%5Cfrac%7Bn%28n-1%29%7D%7B2%7D%29%2BC_%7B6%7D%28%5Cfrac%7Bn%28n-1%29%7D%7B2%7D%29%2BC_%7B7%7D%28%5Cfrac%7Bn%28n-1%29%7D%7B2%7D%29%2BC_%7B8%7Dn-C_%7B8%7D%2BC_%7B9%7Dn-C_%7B9%7D%2BC_%7B10%7Dn-C_%7B10%7D%2BC_%7B11%7Dn-C_%7B11%7D&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0[/img])

![img](http://www.sciweavers.org/tex2img.php?eq=T%28n%29%20%3D%20C_%7B1%7Dn%2BC_%7B2%7Dn-C_%7B2%7D%2BC_%7B3%7Dn-C_%7B3%7D%2BC_%7B4%7D%28%5Cfrac%7Bn%5E%7B2%7D%2Bn%7D%7B2%7D-1%29%2BC_%7B5%7D%28%5Cfrac%7Bn%5E%7B2%7D-n%7D%7B2%7D%29%2BC_%7B6%7D%28%5Cfrac%7Bn%5E%7B2%7D-n%7D%7B2%7D%29%2BC_%7B7%7D%28%5Cfrac%7Bn%5E%7B2%7D-n%7D%7B2%7D%29%2BC_%7B8%7Dn-C_%7B8%7D%2BC_%7B9%7Dn-C_%7B9%7D%2BC_%7B10%7Dn-C_%7B10%7D%2BC_%7B11%7Dn-C_%7B11%7D%20%20&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0[/img])


![Funcion4](https://lh3.googleusercontent.com/-QesN_aPc-00/VM_LcD0HqGI/AAAAAAAAAN4/J3jDz9UOO1Q/w822-h43-no/Funcion4.JPG)

![Funcion5](https://lh4.googleusercontent.com/-I149Ojv5EKQ/VM_LcQ8-lDI/AAAAAAAAAOA/sKC-RroAtqY/w717-h38-no/Funcion5.JPG)

![img](http://www.sciweavers.org/tex2img.php?eq=T%28n%29%20%3D%20an%5E%7B2%7D%20%2B%20bn%20-%20c%20&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0[/img])

####El orden del Algoritmo es O(![img](http://www.sciweavers.org/tex2img.php?eq=n%5E%7B2%7D%20&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0[/img]))

**Autor: **_Rene Almeida Lopez_