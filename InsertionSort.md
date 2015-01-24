## Insertion sort ##

### Descripción ###

Es un algoritmo usado como una baraja, en el que cada que encuentra una posición a la que puede cambiar, intercambia y sigue avanzando entre las posiciones, hasta terminar de recorrer todo el arreglo y encontrarlo ordenado.


###Pseudocodigo ###

    
    1. Para j = 2 hasta Longitud de A
    2.  key = A[j]
    3.  i = j - 1
    4.  Mientras i > 0 y A[i] > key
    5.   A[i + 1] = A[i]
    6.   i = i - 1
    7.  A[i + 1] = key
    
### Orden ###

**Tiempo de ejecución**

Ci con i para linea del código, n el número de veces a ejecutarse

Ecuación general:

![Ecuacion general](http://www.sciweavers.org/tex2img.php?eq=c_1n%20%20%2B%20c_2%5Cbig%28n%20-%201%5Cbig%29%20%20%2B%20c_3%5Cbig%28n%20-%201%5Cbig%29%20%2B%20c_4%5Csum_%7Bj%3D2%7D%5E%7Bn%7D%20t_%7Bj%7D%0A%20%2B%20c_5%5Csum_%7Bj%3D2%7D%5E%7Bn%7D%20%5Cbig%28t_%7Bj%7D%20-%201%5Cbig%29%20%2B%20c_6%5Csum_%7Bj%3D2%7D%5E%7Bn%7D%20%5Cbig%28t_%7Bj%7D%20-%201%5Cbig%29%20%2B%20c_7%5Cbig%28n%20-%201%5Cbig%29&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)

**Mejor caso: Arreglo ordenado**

    Con tj = 1 

![Ecuacion mejor caso](http://www.sciweavers.org/tex2img.php?eq=%0Ac_1n%20%2B%20c_2%5Cbig%28n%20-%201%5Cbig%29%20%2B%20c_3%5Cbig%28n%20-%201%5Cbig%29%20%2B%20c_4%5Cbig%28n%20-%201%5Cbig%29%20%2B%20c_7%5Cbig%28n%20-%201%5Cbig%29%20&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)

**Peor caso: Arreglo inversamente ordenado**

    Con tj = j para j=2,....,n 

![Ecuacion peor caso](http://www.sciweavers.org/tex2img.php?eq=%5Cbig%28%20%5Cfrac%7Bc_4%20%2B%20c_5%20%2B%20c_6%7D%7B2%7D%5Cbig%29n%5E%7B2%7D%20%20%2B%20%5Cbig%28c_1%20%2B%20c_2%20%2B%20c_3%20%2B%20%5Cbig%28%20%5Cfrac%7Bc_4%20-%20c_5%20-%20c_6%7D%7B2%7D%5Cbig%29%20%2B%20c_7%5Cbig%29n%20%20-%20%5Cbig%28c_2%20%2B%20c_3%20%2B%20c_4%20%2B%20c_7%5Cbig%29&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)

**Orden del algoritmo:**

![Orden](http://www.sciweavers.org/tex2img.php?eq=O%5Cbig%28n%5E%7B2%7D%5Cbig%29&bc=White&fc=Black&im=jpg&fs=12&ff=arev&edit=0)
