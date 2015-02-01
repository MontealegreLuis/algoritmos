#Algoritmo Merge Sort
##Descripción
Es un método de ordenamiento por mezcla, la idea general es que: Dados dos conjuntos ordenados, A y B, si los mezclamos entre ambos, tomando los valores de ellos en orden, entonces nos va quedar el conjunto ordenado C, con los elementos de A y B.

Este ordenamiento incorpora dos ideas principales para mejorar su tiempo de ejecución:

1.Una lista pequeña necesitará menos pasos para ordenarse que una lista grande.

2.Se necesitan menos pasos para construir una lista ordenada a partir de dos listas también ordenadas, que a partir de dos listas desordenadas. Por ejemplo, sólo será necesario entrelazar cada lista una vez que están ordenadas.

##ejemplo:


![Ejemplo](https://lh6.googleusercontent.com/-Ai_M4E1NZ_w/VMgte8fEDFI/AAAAAAAAAJI/OSnSkNn8cvc/w300-h180-no/Merge-sort-example-300px.gif)


##Pseudocódigo

    Proceso merge(A, p, q, r)
        n1 <- q - (p + 1)
        n2 <- r - q
        let L[1...n1 + 1] and R[1...n2 + 1]
        Para i <- 1 Hasta n1 ConPaso 1 Hacer
            L[i] <- A[i]
        FinPara
        Para j <- 1 Hasta n2 ConPaso 1 Hacer
            R[j] <- A[q + j]
        FinPara
        L[n1 + 1] <- infinito
        R[n2 + 1] <- infinito
        i <- 1
        j <- 1
        Para k <- p Hasta r ConPaso 1 Hacer
            Si L[i] <= R[j] Entonces
                A[k] <- L[i]
                i <- i + 1
            SiNo
                A[k] <- R[j]
                j <- j + 1
            FinSi
        FinPara
    FinProceso

##Desarrollo

###Tabla

![Tabla](https://lh3.googleusercontent.com/-vr2ZiHCbX2E/VMhBvWdo1iI/AAAAAAAAAK0/B_pIYpyC430/w838-h418-no/Tabla.JPG)

![Imagen1](https://lh3.googleusercontent.com/-q60H071QRWs/VMhBuMrLONI/AAAAAAAAAK8/cKP2SL_2P18/w1044-h45-no/Imagen1.JPG)

![Imagen2](https://lh3.googleusercontent.com/-y7L6WbimYsg/VMhBuSPPvqI/AAAAAAAAALE/sR-4Yg-kXOc/w1008-h57-no/Imagen2.JPG)

![Imagen3](https://lh6.googleusercontent.com/-PDkdNkpMM40/VMhBurZPl6I/AAAAAAAAALM/EA-G0hCV1sU/w160-h44-no/Imagen4.JPG)

###Por lo tanto el algoritmo es de O(n)
