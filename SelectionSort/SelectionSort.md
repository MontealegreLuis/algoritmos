#Selection sort
El algoritmo consiste en tomar un arreglo con n elementos, buscar el elemento mas pequeño e intercambiarlo con el primero, posteriormente se busca el segundo elemento mas pequeño y se intercambia con el segundo, de esta forma se procede con el resto hasta ordenar todo el arreglo.
##Codigo
```javascript
1 for(i <- 0 to arr.length - 1)
  {
2    pos = i
3    for(j <- i + 1 to arr.length - 1)
     {
4      if(arr(j) < arr(pos))
       {
5         pos = j
       }
     }
6    aux = arr(i)
7    arr(i) = arr(pos)
8    arr(pos) = aux
  }
```
###Tiempo de ejecucion

![algo](http://latex.codecogs.com/gif.latex?c_%7B1%7D%28n%29)

![algo](http://latex.codecogs.com/gif.latex?c_%7B2%7D%28n-1%29)

![algo](http://latex.codecogs.com/gif.latex?c_%7B3%7D%5Csum_%7Bj%3D2%7D%5E%7Bn%7D%28t_%7Bj%7D%29)

![algo](http://latex.codecogs.com/gif.latex?c_%7B4%7D%5Csum_%7Bj%3D2%7D%5E%7Bn%7D%28t_%7Bj%7D-1%29)

![algo](http://latex.codecogs.com/gif.latex?c_%7B5%7D%5Csum_%7Bj%3D2%7D%5E%7Bn%7D%28t_%7Bj%7D-1%29)

![algo](http://latex.codecogs.com/gif.latex?c_%7B6%7D%28n-1%29)

![algo](http://latex.codecogs.com/gif.latex?c_%7B7%7D%28n-1%29)

![algo](http://latex.codecogs.com/gif.latex?c_%7B8%7D%28n-1%29)

![algo](http://latex.codecogs.com/gif.latex?T%28n%29%3Dc_%7B1%7D%28n%29&plus;c_%7B2%7D%28n-1%29&plus;c_%7B3%7D%5Csum_%7Bj%3D2%7D%5E%7Bn%7D%28t_%7Bj%7D%29&plus;c%7B4%7D%5Csum_%7Bj%3D2%7D%5E%7Bn%7D%28t_%7Bj%7D-1%29&plus;c_%7B5%7D%5Csum_%7Bj%3D2%7D%5E%7Bn%7D%28t_%7Bj%7D%29&plus;c_%7B6%7D%28n-1%29&plus;c_%7B7%7D%28n-1%29&plus;c_%7B8%7D%28n-1%29%29)

###El peor caso
Cuando ![algo](http://latex.codecogs.com/gif.latex?t_%7Bj%7D%20%3D%20j%2C%20para%20j%20%3D%202%2C3%2C...%2Cn)

![algo](http://latex.codecogs.com/gif.latex?T%28n%29%3Dc_%7B1%7D%28n%29&plus;c_%7B2%7D%28n-1%29&plus;c_%7B3%7D%28%5Cfrac%7Bn%28n&plus;1%29%7D%7B2%7D-1%29&plus;c_%7B4%7D%28%5Cfrac%7Bn%28n-1%29%7D%7B2%7D%29&plus;c_%7B5%7D%28%5Cfrac%7Bn%28n-1%29%7D%7B2%7D%29&plus;c_%7B6%7D%28n-1%29&plus;c_%7B7%7D%28n-1%29&plus;c_%7B8%7D%28n-1%29)

![algo](http://latex.codecogs.com/gif.latex?%3D%28%5Cfrac%7Bc_%7B3%7D%7D%7B2%7D&plus;%5Cfrac%7Bc_%7B4%7D%7D%7B2%7D&plus;%5Cfrac%7Bc_%7B5%7D%7D%7B2%7D%29n%5E%7B2%7D&plus;%28c_%7B1%7D&plus;c_%7B2%7D&plus;c_%7B6%7D&plus;c_%7B7%7D&plus;c_%7B8%7D&plus;%5Cfrac%7Bc_%7B3%7D%7D%7B2%7D-%5Cfrac%7Bc_%7B4%7D%7D%7B2%7D-%5Cfrac%7Bc_%7B5%7D%7D%7B2%7D%29n-%28c_%7B2%7D&plus;c_%7B3%7D&plus;c_%7B6%7D&plus;c_%7B7%7D&plus;c_%7B8%7D%29)

![algo](http://latex.codecogs.com/gif.latex?%3Dan%5E%7B2%7D&plus;bn&plus;c)

Orden de crecimiento: ![algo](http://latex.codecogs.com/gif.latex?O%28n%5E%7B2%7D%29)