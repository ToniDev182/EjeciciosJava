Algoritmo array
	
	definir num Como Entero //definir tipo de dato
	dimension num[20] //que tamaño va a tener
	
	definir maximo, valor Como Real 
	maximo <- num[1]
	
	definir posicion Como Entero
	posicion <- 1
	
	Para i<-1 Hasta 20 Hacer
		Escribir "introduce un numero real"
		leer valor
		
		num[1] <- valor
	Fin Para
	
	Para i<-2 Hasta 20 Hacer
		Si num[i] > maximo Entonces
			maximo <- num[1]
			posicion <- i
		Fin Si
	Fin Para
	
	
	Escribir "el valor maximo es: ",maximo, " y su posicion es: ", posicion
	
	
FinAlgoritmo
