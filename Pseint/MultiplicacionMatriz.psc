Algoritmo MultiplicacionMatriz
Definir matriz[10, 10]: entero
    InicializarMatriz(matriz)
    DibujarMatriz(matriz)
FinAlgoritmo

Funcion InicializarMatriz(matriz: matriz[10, 10]: entero)
			Para fila = 1 Hasta 10 Hacer
				Para columna = 1 Hasta 10 Hacer
					matriz[fila, columna] = fila * columna
				FinPara
			FinPara
FinFuncion

Funcion DibujarMatriz(matriz: matriz[10, 10]: entero)
			Para fila = 1 Hasta 10 Hacer
				Para columna = 1 Hasta 10 Hacer
					Escribir(matriz[fila, columna], "\t")
				FinPara
				Escribir("\n")
			FinPara
FinFuncion



///////////////////////////////////////////////////////////////////////////////////////


¡Hola! Para crear una matriz de 10x10 en PSeInt que almacene la multiplicación de la fila por la columna, puedes seguir los siguientes pasos:
		
		Crea una función llamada inicializarMatriz que reciba como parámetro la matriz y la inicialice con los valores correspondientes. Para ello, utiliza dos bucles anidados para recorrer la matriz y asignar el valor de fila * columna a cada posición.
			SubProceso inicializarMatriz(matriz:Matriz[1..10,1..10] de Entero)
					Para fila <- 1 Hasta 10 Con Paso 1 Hacer
						Para columna <- 1 Hasta 10 Con Paso 1 Hacer
							matriz[fila,columna] <- fila * columna
						FinPara
					FinPara
FinSubProceso

Crea una función llamada dibujarMatriz que reciba como parámetro la matriz y la dibuje en pantalla. Para ello, utiliza dos bucles anidados para recorrer la matriz y mostrar cada valor en su posición correspondiente.
	SubProceso dibujarMatriz(matriz:Matriz[1..10,1..10] de Entero)
			Para fila <- 1 Hasta 10 Con Paso 1 Hacer
				Para columna <- 1 Hasta 10 Con Paso 1 Hacer
					EscribirSinSaltar(matriz[fila,columna], " ")
				FinPara
				Escribir("")
			FinPara
FinSubProceso

En el algoritmo principal, declara una matriz de 10x10 y llama a las funciones inicializarMatriz y dibujarMatriz para inicializar y mostrar la matriz respectivamente.
		Algoritmo "Matriz 10x10"
		Definir matriz:Matriz[1..10,1..10] de Entero
			
			inicializarMatriz(matriz)
			dibujarMatriz(matriz)
			
FinAlgoritmo