Algoritmo nums
	Escribir "Este algoritmo analiza la cantidad de n�meros que le pidas para saber si son pares/impares y positivos/negativos"
	Escribir "Dime cuantos n�meros quieres analizar" 
	C <- 0 
	Leer C
	
	Repetir //seguir pidiendo n�meros hasta que el contador llegue a 0
		Escribir "Ingresa un n�mero" 
		NUM <- 0
		Leer NUM
		
		Si NUM % 2 == 0 Entonces //para saber si el n�mero es par o impar
			Escribir "El n�mero es par"
		SiNo 
			Escribir "El n�mero es impar"
		FinSi
		
		Si NUM > 0 Entonces //para saber si el n�mero es positivo o negativo
			Escribir "El n�mero es positivo"
		SiNo 
			Escribir "El n�mero es negativo"
		FinSi
		
		C = C - 1 //restarle 1 al contador cada vez que se haga el bucle para llegar a 0 y parar
		
	Hasta Que C = 0 //si el contador llega a 0 paramos el bucle y no pedimos m�s n�meros
	
FinAlgoritmo
