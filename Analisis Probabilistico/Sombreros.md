#Los sombreros
Supose N men thow their hts into a closet and later extrac them blindy, one hat per man. What is the probability that one of the men will wind up with their own hat?
##Codigo
```javascript
RecogerSombrero(n)
i = 0
while sombrero i no sea de hombre i and n > 0
    hombre i toma sombrero i
    if sombrero i es de hombre i then
        return true
    else
    n = n - 1;
    i = i + 1
```
###Analisis probabilistico
Espacio de pruebas S = {s, n}

Pr{s} = 1/n   Pr{n} = (n-1)/n

Definamos un indicador de variable aleatoria Xs asociado con que el sosombrero es suyo, que es el evento s.

![algo](http://latex.codecogs.com/png.latex?X_%7BesSuyo%7D%20%3D%20I%5Cleft%20%5C%7B%20s%20%5Cright%20%5C%7D%3D%20%5Cleft%20%5C%7B%201%20if%20s%2C%200%20if%20n%20%5Cright%20%5C%7D)

La probabilidad de que el sombrero sea suyo es el valor del indicador Xs.

![algo](http://latex.codecogs.com/png.latex?E%5BX_%7Bs%7D%5D%20%3D%20E%5BI%5Cleft%20%5C%7B%20s%20%5Cright%20%5C%7D%5D)

![algo](http://latex.codecogs.com/png.latex?%3D1*Pr%5Cleft%20%5C%7B%20s%20%5Cright%20%5C%7D&plus;0*Pr%5Cleft%20%5C%7B%20n%20%5Cright%20%5C%7D)

![algo](http://latex.codecogs.com/png.latex?%3D%201*%5Cleft%20%28%20%5Cfrac%7B1%7D%7Bn%7D%20%5Cright%20%29&plus;0*%5Cleft%20%28%20%5Cfrac%7Bn-1%7D%7Bn%7D%20%5Cright%20%29)

![algo](http://latex.codecogs.com/png.latex?%3D%20%5Cfrac%7B1%7D%7Bn%7D)

Sea X la probavilidad de que elsombrero se asuyo despues de n entregas.
Queremos calcular laprobabilidad de que el sombrero sea suyo.

![algo](http://latex.codecogs.com/png.latex?E%5BX%5D%3DE%5Cleft%20%5B%20%5Csum_%7Bi%3D1%7D%5E%7Bn%7D%28X_%7Bi%7D%29%20%5Cright%20%5D)

![algo](http://latex.codecogs.com/png.latex?%3D%5Csum_%7Bi%3D1%7D%5E%7Bn%7D%28E%5BX_%7Bi%7D%5D%29)

![algo](http://latex.codecogs.com/png.latex?%3D%5Csum_%7Bi%3D1%7D%5E%7Bn%7D%5Cleft%20%28%20%5Cfrac%7B1%7D%7Bn-i&plus;1%7D%20%5Cright%20%29)

![algo](http://latex.codecogs.com/png.latex?%3D%20%5Cfrac%7B1%7D%7Bn-i-1%7D)