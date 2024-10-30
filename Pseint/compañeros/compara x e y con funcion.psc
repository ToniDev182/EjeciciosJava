Funcion cadena <- iguales (  num1, num2 ) //funcion
	
	Si num1 = num2Entonces
		
		Escribir num1, "y ",num2, "son iguales"
		
	SiNo
		
		Si num1 > num2 Entonces
			Escribir num1, "es mayor que " ,num2
		SiNo
			Escribir num 2, "es mayor que " ,num1
		Fin Si
		
	Fin Si
	
Fin Funcion

Algoritmo num_iguales 
	
	Escribir "dime dos números para comparalos"
	Leer n1, n2 //se define distinto a como los hemos definido en la funcion
	iguales() //llamamos a la función 
	
FinAlgoritmo
