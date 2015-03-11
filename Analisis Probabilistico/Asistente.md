#Contratando un asistente
Se necesita contratar un asistente. Una agencia enviara enviara un candidato cada dia.
Si despues de entrvistarlo, si esta mejor calificado que el anterior seracontratado.
##Codigo
```javascript
HireAssistant(n)
best = 0
for i = 1 to n
    interview candidate i
    if candidate i is better than candidate best
        best = i
        hire candidate
```
###Analisis probabilistico
Sea X el numero de veces que contrataremos

![algo](http://latex.codecogs.com/png.latex?E%5BX%5D%3D%5Csum_%7Bi%3D1%7D%5E%7Bn%7D%5Cleft%20%28%20XPr%5Cleft%20%5C%7B%20X%3Dx%20%5Cright%20%5C%7D%20%5Cright%20%29)

![algo](http://latex.codecogs.com/png.latex?X_%7Bi%7D%20%3D%20I%7Bcandidate.%20i.%20is.%20hired%7D)

![algo](http://latex.codecogs.com/png.latex?X_%7Bi%7D%20%3D%20I%5Cleft%20%5C%7B%201.%20if.%20is.%20hired%2C%200.%20if.%20is.%20not.%20hired%20%5Cright%20%5C%7D)

![algo](http://latex.codecogs.com/png.latex?X%20%3D%20X_%7B1%7D%20&plus;%20X_%7B2%7D%20&plus;%20...%20&plus;%20X_%7Bn%7D)

![algo](http://latex.codecogs.com/png.latex?E%5BX_%7Bi%7D%5D%3D%20Pr%5Cleft%20%5C%7B%20i.%20is.%20hired%20%5Cright%20%5C%7D)

![algo](http://latex.codecogs.com/png.latex?E%5BX_%7Bi%7D%5D%3D%20%5Cfrac%7B1%7D%7Bi%7D)

Ahora podemos calcular E[X]

![algo](http://latex.codecogs.com/png.latex?E%5BX%5D%3DE%5Cleft%20%5B%20%5Csum_%7Bi%3D1%7D%5E%7Bn%7D%28X_%7Bi%7D%29%20%5Cright%20%5D)

![algo](http://latex.codecogs.com/png.latex?%3D%5Csum_%7Bi%3D1%7D%5E%7Bn%7D%28E%5BX_%7Bi%7D%5D%29)

![algo](http://latex.codecogs.com/png.latex?%3D%5Csum_%7Bi%3D1%7D%5E%7Bn%7D%5Cleft%20%28%20%5Cfrac%7B1%7D%7Bi%7D%20%5Cright%20%29)

![algo](http://latex.codecogs.com/png.latex?%3D%5Cln%20n%20&plus;%20O%281%29)