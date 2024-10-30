Funcion dime_primo(num) 
	mientras candidatos>0 Hacer  // hacemos un bucle encontrar que el numero sea divisible por si mismo y por uno
		si num % candidatos = 0 entonces 
			divisores = divisores +1 
		FinSi
		candidatos = candidatos - 1 // Rompemos el bucle 
	FinMientras
	
	si divisores = 2 Entonces // si solo tienes 2 divisores sera primo (es decir por uno y por el mismo)
		Escribir  " es primo"
		sino
			Escribir "no es primo" 
		fin si 
FinFuncion

Algoritmo ejercicio01 
	Definir num, candidatos, divisores como entero;
	num = 0 // 
	candidatos = 0 //numero para probar si es divisor 
	divisores = 0 // contador de Divisores
	Escribir "Dime el Numero" // Pedimos al usuario el numero 
	Leer num
	Candidatos = num 
	Dime_primo(num)
FinAlgoritmo
