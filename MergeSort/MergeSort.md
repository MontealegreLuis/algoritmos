#Merge sort
El algoritmo consiste en tomar un arreglo con n elementos y dividirlo en dos partes, cada parte será ordenada descendentemente (lo anterior se supone ya esta hecho), posteriormente los dos sub-arreglos son mesclados en un nuevo arreglo para obtener una secuencia ordenada del arreglo original.
##Pseudocodigo
```javascript
1. n1=q-p+1
2. n2=r-q
3. Let L[1..n1+1] and R[1..n2+1] be new array
4. for i=1 to n1
5.    L[i]=A[p+i+1]
6. for j=1 to n2
7.    R[j]=A[q+j]
8. L[n1+1]=INFINITO
9. R[n2+1]=INFINITO
10. i=1
11. j=1
12. for k=p to r
13. if L[i]<=R[j]
14.    A[k] = L[i]
15.    i=i+1
16. else A[k]=R[j]
17.    j=j+1
```
##Tiempo de ejecucion
![algo](http://latex.codecogs.com/png.latex?c_%7B1%7D%281%29)

![algo](http://latex.codecogs.com/png.latex?c_%7B2%7D%281%29)

![algo](http://latex.codecogs.com/png.latex?c_%7B3%7D%281%29)

![algo](http://latex.codecogs.com/gif.latex?c_%7B4%7D%28%28n/2%29&plus;1%29)

![algo](http://latex.codecogs.com/png.latex?c_%7B5%7D%28n/2%29)

![algo](http://latex.codecogs.com/gif.latex?c_%7B6%7D%28%28n/2%29&plus;1%29)

![algo](http://latex.codecogs.com/png.latex?c_%7B7%7D%28n/2%29)

![algo](http://latex.codecogs.com/png.latex?c_%7B8%7D%281%29)

![algo](http://latex.codecogs.com/png.latex?c_%7B9%7D%281%29)

![algo](http://latex.codecogs.com/png.latex?c_%7B10%7D%281%29)

![algo](http://latex.codecogs.com/png.latex?c_%7B11%7D%281%29)

![algo](http://latex.codecogs.com/png.latex?c_%7B12%7D%28n&plus;1%29)

![algo](http://latex.codecogs.com/png.latex?c_%7B13%7D%28n%29) se suman c13 y c16, ya que if y else se ejecutan en conjunto n veces

![algo](http://latex.codecogs.com/png.latex?c_%7B14%7D%28n%29)

![algo](http://latex.codecogs.com/png.latex?c_%7B15%7D%28n%29)se suman c15 y c17, ya que en conjunto se ejecutan n veces
###El peor caso
El tiempo de ejecucion es:

![algo](http://latex.codecogs.com/gif.latex?T%28n%29%3Dc_%7B1%7D&plus;c_%7B2%7D&plus;c_%7B3%7D&plus;c_%7B4%7D%28%28n/2%29&plus;1%29&plus;c_%7B5%7D%28n/2%29&plus;c_%7B6%7D%28%28n/2%29&plus;1%29&plus;c_%7B7%7D%28n/2%29&plus;c_%7B8%7D&plus;c_%7B9%7D&plus;c_%7B10%7D&plus;c_%7B11%7D&plus;c_%7B12%7D%28n&plus;1%29&plus;c_%7B13%7D%28n%29&plus;c_%7B14%7D%28n%29&plus;c_%7B15%7D%28n%29)

![algo](http://latex.codecogs.com/gif.latex?%3D%28c_%7B1%7D&plus;c_%7B2%7D&plus;c_%7B3%7D&plus;c_%7B4%7D&plus;c_%7B6%7D&plus;c_%7B8%7D&plus;c_%7B9%7D&plus;c_%7B10%7D&plus;c_%7B11%7D&plus;c_%7B12%7D%29&plus;%28%5Cfrac%7Bc_%7B4%7D%7D%7B2%7D&plus;%5Cfrac%7Bc_%7B5%7D%7D%7B2%7D&plus;%5Cfrac%7Bc_%7B6%7D%7D%7B2%7D&plus;%5Cfrac%7Bc_%7B7%7D%7D%7B2%7D&plus;c_%7B12%7D&plus;c_%7B13%7D&plus;c_%7B14%7D&plus;c_%7B15%7D%29n)

Orden de crecimiento:![algo](http://latex.codecogs.com/png.latex?O%28n%29)