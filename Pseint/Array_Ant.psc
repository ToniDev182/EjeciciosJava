// Hacer un programa es pseudocódigo que: 
// a) cree un array unidimensional de 30 elementos de tipo numerico y de nombre "numeros" . 
// b) Cargue el vector con valores positivos negativos y ceros.
// c) contabilice el número de valores positivos, negativos, y ceros almacenados en el proceso de carga.
// d) Muestre en pantalla los resultados obtenidos.

Algoritmo Array_Ant
	Dimension numeros[30] 
	
	Definir P Como Entero
	Definir N como Entero 
	Definir C como Entero 
	
	P=0 
	N=0
	C=0
	
	
	Para i = 1 Hasta 30 Con Paso 1 Hacer
		
		Escribir "Dime el numero "  i " de la lista"
		
		Leer numeros[i]
		
		Si numeros[i] > 0 Entonces
			
			P = P + 1
			
		fin si 
		
			Si numeros[i] < 0 Entonces
			
				N = N + 1
			fin si 
			
		si numeros[i] = 0 entonces
				
				C = C + 1
		
 fin si
	
	  
	Fin Para
	Escribir "Cantidad de números positivos: ", P
	Escribir "Cantidad de números negativos: ", N
	Escribir "Cantidad de ceros: ", C
	
FinAlgoritmo





