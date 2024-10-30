
Funcion inicializa_tablero(Matriz)
// Damos valor al tablero "Y" 
Para i <- 1 Hasta 3 Con Paso 1 Hacer //Leer linea vertical
	para j <- 1 hasta 3 con paso 1 hacer // leer horizontal 
	Matriz[i,j]	<- " " 
	Fin Para
	fin para 
FinFuncion

Funcion dibujo_tablero(Matriz) // hacemos la funcion para dibujar el tablero
	
	Definir fila como cadena // En esta parte tratamos de agrupar cara fila y cada columna 
	Para i<-1 Hasta 3 Hacer
		Para j<-1 Hasta 3 Hacer
			fila<- Concatenar(fila,"||") // usamos esta linea para dar espacio entre cada simbolo "y" 
			fila<- Concatenar(fila,(Matriz[i,j])) // Coge el simbolo "||" y añade despues el simbolo que hay en la matriz 
		FinPara
		fila<- Concatenar(fila,"||") // para terminar de acortar el tablero
		Escribir fila 
		fila<-""
	FinPara
	
FinFuncion

funcion check<-introduce_valor(matriz,i,j,jugador) 
	Escribir jugador
	// Esta funcion determina si un espacio esta ocupado por la ficha de algun jugador 
	si matriz[i,j]=" " Entonces
		matriz[i,j]=jugador
		
		check<-Verdadero // Dice que si el tablero tiene una Y entonces cualquier jugador puede poner una ficha 
	SiNo
		check<-Falso
	FinSi
FinFuncion

funcion nuevoJugador<-cambia_jugador(jugador) // Esta funcion determina el Turno del jugador 
	// para terminar de acortar el tablero
	Si jugador <> "O" entonces   // con este == estamos comparando y con <- o =estamos definiendo 
		nuevoJugador <- "O"
		
	SiNo 
		nuevoJugador <-"X"
		
	Fin Si
FinFuncion

Funcion victoria<-verificar_victoria(Matriz, jugador)
	Si Matriz[1, 1] = jugador Y Matriz[2, 2] = jugador Y Matriz[3, 3] = jugador Entonces
		victoria = Verdadero
	Fin si
	Si Matriz[1, 3] = jugador Y Matriz[2, 2] = jugador Y Matriz[3, 1] = jugador Entonces
		Victoria=Verdadero
	fin si
	Para i <- 1 Hasta 3 Hacer
		Si Matriz[i, 1] = jugador Y Matriz[i, 2] = jugador Y Matriz[i, 3] = jugador Entonces
			victoria = Verdadero
		Fin Si
	Fin Para
	Para j <- 1 Hasta 3 Hacer
		Si Matriz[1, j] = jugador Y Matriz[2, j] = jugador Y Matriz[3, j] = jugador Entonces
			victoria = Verdadero
		
		Fin Si
	Fin Para
FinFuncion


funcion empate <- verificar_empate(num_t)
	escribir num_t
	si num_t = 9 Entonces
		empate = verdadero 
	FinSi
FinFuncion




Algoritmo tresenraya
	Definir fila,col Como Entero // creamos filas y columnas
	Definir M,jugador Como Caracter //
	Dimension M[3,3] // tablero
	Turno <- 1
	inicializa_tablero(M) 
	dibujo_tablero(M)
	jugador <- "X" 
	fin_juego <- Falso
	Mientras fin_juego=Falso
		Escribir "Dime la fila y la columna"
		Leer fila
		Leer col
		si introduce_valor(M,fila,col,jugador) = Verdadero
			si verificar_victoria(M,jugador)= Verdadero
				Escribir "jugador " jugador " Gana"
				fin_juego = Verdadero 
			FinSi
			si verificar_empate(Turno) 
				Escribir " los jugadores han empatado "
				fin_juego = Verdadero 
				
			FinSi
			jugador<-cambia_jugador(jugador)
			dibujo_tablero(M)
			Turno <- Turno + 1
		FinSi
	FinMientras
Fin Algoritmo

	

