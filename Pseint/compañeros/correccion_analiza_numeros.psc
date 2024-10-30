Algoritmo correccion_analiza_numeros
	Escribir "Dime cuantos números voy a calcular"
	Leer M
	
	Mientras M > 0 Hacer
		Escribir "dime el numero a calcular"
		Leer num
		Si num % 2 == 0 Entonces
			Si num >= 0 Entonces
				Escribir "el numero " ,num, " es par y positivo"
			Fin Si
		Fin Si
		M = M - 1
	Fin Mientras
FinAlgoritmo
//si el numero no es par no dice si es negativo o positivo