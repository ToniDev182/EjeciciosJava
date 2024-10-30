Algoritmo Coordenadas_Puntos_Pendiente
	Escribir "Seleccione una opción:"
    Escribir "1. Calcular la ecuación de una recta a partir de la pendiente y un punto."
    Escribir "2. Calcular la ecuación de una recta a partir de dos puntos."
    Escribir "Ingrese el número de la opción deseada:"
    Leer opcion
	si opcion = 1 Entonces
		
		Escribir "ingresa las coordenadas (X1, i1) " 
		Escribir "X1"
		leer X1 
		Escribir "i1" 
		leer i1 
		
		Escribir "ingresa las coordenadas (X2, i2)" 
		Escribir "X2"
		leer X2 
		Escribir "i2" 
		leer i2
		//calcula los valores 
		A <- i2 - i1
		
		B <- i1 * (X2 - x1) - X1 * (i2 - i1)
		
		C <- -A * X1 - B * i1
		
		// Muestra la ecuación de la recta
		
		Escribir   A, "X + ", B "+ i", C "= 0"
		
	SiNo si opcion = 2 Entonces
			
			// Lee la pendiente (m) y las coordenadas del punto (x1, y1)
			Escribir "Ingresa la pendiente (m) de la recta:"
			Leer m
			
			Escribir "Ingresa las coordenadas del punto en la recta:"
			Escribir "X:"
			Leer X
			Escribir "i1:"
			Leer i1
			
			b = i- m*X
			
			A <- i2 - i1
			
			C <- -A * X1 - B * i1
			// Muestra la ecuación de la recta
			Escribir "La ecuación de la recta es:" A, "X + ", B "+ i", C "= 0"
			
			
		Sino
			Escribir "Opción no válida. Por favor, seleccione 1 o 2."
		Fin Si
	Fin Si

FinAlgoritmo





		