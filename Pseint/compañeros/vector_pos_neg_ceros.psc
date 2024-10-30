Algoritmo vector_uni
	
	definir num Como Entero //tipo de datos en el vector
	dimension num[30] //dimensión del vector
	
	//variables
	positivos <- 0
	negativos <- 0
	ceros <- 0
	
	
	Para i<-1 Hasta 30 Hacer
		Escribir "Introduce un número entero" //pedir los valores 
		leer num[i] //almacenar los valores 
		
		//contar los valores 
		Si num[i] > 0 Entonces //si el número es positivo
			positivos = positivos + 1 //incrementar la variable positivos
		Fin Si
		
		Si num[i] < 0 Entonces //si el número es negativo
			negativos = negativos + 1 //incrementar la variable negativos
		Fin Si
		
		Si num[i] = 0 Entonces //si el número es 0
			ceros = ceros + 1 //incrementar la variable ceros
		Fin Si
		
		num[1] <- valor
	Fin Para
	
	//mostrar por pantalla los resultados 
	Escribir "cantidad de números positivos: ", positivos //mostrar cuantos números positivos hay 
	Escribir "cantidad de números negativos: ", negativos //mostrar cuantos números negativos hay 
	Escribir "cantidad de ceros : ", ceros //mostrar cuantos ceros hay 
	
	
FinAlgoritmo











