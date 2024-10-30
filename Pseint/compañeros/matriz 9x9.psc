Funcion inicializa_tablero(Matriz)
    Para i <- 1 hasta 9 Hacer
        Para j <- 1 hasta 9 Hacer
            Matriz[i, j] <- i * j
        FinPara
    FinPara
FinFuncion

Funcion dibuja_tablero(Matriz)
	fila <- ""
    Para i <- 1 hasta 9 Hacer
        Para j <- 1 hasta 9 Hacer
			fila <- Concatenar (fila," ")
			num<-ConvertirATexto(Matriz[i,j])
			fila <- Concatenar(fila,num)
        FinPara
        Escribir fila
		fila <- ""
    FinPara
FinFuncion

Algoritmo tres_en_raya
    Definir M, F, C Como Entero
    Dimension M[9, 9]
    inicializa_tablero(M)
    dibuja_tablero(M)
FinAlgoritmo