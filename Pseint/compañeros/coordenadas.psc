Algoritmo ecuacion
	Escribir "dame las coordenadas del primer punto" //pedimos el primer punto
	Leer x1 //leemos la primera coordenada
	Leer z1//llemos la segunda coordenada
	Escribir "dame las coordenadas del segundo puntno" //pedimos el segundo punto
	Leer x2// leemos la primera coordenada
	Leer z2// leemos la segunda coordenada
	
	A<- z2 - z1 
	B<- z1 * (x2-x1)-x1 * (z2-z1) 
	C<- (-A * x1) -(B * z1)

	Escribir A // resultado de A
	Escribir B // resultado de B
	Escribir C // resultado de C

FinAlgoritmo
