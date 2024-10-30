Algoritmo nums
	Escribir "Este algoritmo analiza la cantidad de números que le pidas para saber si son pares/impares y positivos/negativos"
	Escribir "Dime cuantos números quieres analizar" 
	C <- 0 
	Leer C
	
	Repetir //seguir pidiendo números hasta que el contador llegue a 0
		Escribir "Ingresa un número" 
		NUM <- 0
		Leer NUM
		
		Si NUM % 2 == 0 Entonces //para saber si el número es par o impar
			Escribir "El número es par"
		SiNo 
			Escribir "El número es impar"
		FinSi
		
		Si NUM > 0 Entonces //para saber si el número es positivo o negativo
			Escribir "El número es positivo"
		SiNo 
			Escribir "El número es negativo"
		FinSi
		
		C = C - 1 //restarle 1 al contador cada vez que se haga el bucle para llegar a 0 y parar
		
	Hasta Que C = 0 //si el contador llega a 0 paramos el bucle y no pedimos más números
	
FinAlgoritmo
