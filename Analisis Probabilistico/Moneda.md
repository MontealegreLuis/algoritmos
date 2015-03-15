#Lanzando una moneda

##Codigo
```javascript
Lanzar(n)
an = 0
sn = 0
for i = 0 to n
    LanzarMoneda m
    if m = a then an = an + 1
    else sn = sh + 1
```
###Analisis probabilistico
Espacio de pruebas S = {a, s}

Pr{a} = Pr{s} = 1/2

Definamos un indicador de variable aleatoria Xa asociado con que la moneda caiga aguila, que es el evento a.

![algo](http://latex.codecogs.com/png.latex?X_%7Ba%7D%3D%20I%5Cleft%20%5C%7B%20a%20%5Cright%20%5C%7D%3D%5Cleft%20%5C%7B%201.%20if.%20a.%20occurs%2C%200.%20if.%20a.%20does.%20not.%20occurs%20%5Cright%20%5C%7D)

El numero esperado de aguilas al lanzar una moneda es el valor eserado del indcador Xa

![algo](http://latex.codecogs.com/png.latex?E%5BX_%7Ba%7D%5D%3DE%5BI%5Cleft%20%5C%7B%20a%20%5Cright%20%5C%7D%5D)

![algo](http://latex.codecogs.com/png.latex?%3D1*Pr%5Cleft%20%5C%7B%20a%20%5Cright%20%5C%7D&plus;0*Pr%5Cleft%20%5C%7B%20s%20%5Cright%20%5C%7D)

![algo](http://latex.codecogs.com/png.latex?%3D1*Pr%5Cleft%20%5C%28%20%5Cfrac%7B1%7D%7B2%7D%20%5Cright%20%5C%29&plus;0*Pr%5Cleft%20%5C%28%20%5Cfrac%7B1%7D%7B2%7D%20%5Cright%20%5C%29)

![algo](http://latex.codecogs.com/png.latex?%3D%5Cfrac%7B1%7D%7B2%7D)

Sea X el numero variable de aguilas que aparecen despues de n lanzamientos.
Queremos calcular el numero esperado de aguilas.

![algo](http://latex.codecogs.com/png.latex?E%5BX%5D%3DE%5Cleft%20%5B%20%5Csum_%7Bi%3D1%7D%5E%7Bn%7D%28X_%7Bi%7D%29%20%5Cright%20%5D)

![algo](http://latex.codecogs.com/png.latex?%3D%5Csum_%7Bi%3D1%7D%5E%7Bn%7D%28E%5BX_%7Bi%7D%5D%29)

![algo](http://latex.codecogs.com/png.latex?%3D%5Csum_%7Bi%3D1%7D%5E%7Bn%7D%5Cleft%20%28%20%5Cfrac%7B1%7D%7B2%7D%20%5Cright%20%29)

![algo](http://latex.codecogs.com/png.latex?%3D%5Cfrac%7Bn%7D%7B2%7D)