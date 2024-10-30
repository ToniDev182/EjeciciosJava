Algoritmo Coordenadas_puntos
	// Escribir un programa de pseudocodigo que escriba la ecuacion de una recta Ax+B+c=0, leyendo las coordenadas de dos puntos (x1,y1) y (x2,y2) Sabiendo que A = y2 - y1, B=y1 * (x2-x1) - x1 * (y2-y1) 
	// pedimos las coordenadas"
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
	
	

FinAlgoritmo

 


