Funcion coordenadas
	
	Escribir "dame las coordenadas del primer punto" //pedimos el primer punto
	Leer x1 //leemos la primera coordenada
	Leer z1//llemos la segunda coordenada
	Escribir "dame las coordenadas del segundo puntno" //pedimos el segundo punto
	Leer x2// leemos la primera coordenada
	Leer z2// leemos la segunda coordenada
	
	A<- z2 - z1 
	B<- z1 * (x2-x1)-x1 * (z2-z1) 
	C<- (-A * x1) -(B * z1)
	Escribir A,"x+",B,"y+ ",C,"=0"

Fin Funcion

Funcion pendiente
	
	Escribir "dame las primeras coordenadas" //pedimos el primer punto
	Leer x
	Escribir "dame las segundas coordenadas" //pedimos el segundo punto
	Leer z
	Escribir "dime la pendiente"
	Leer m
	
	b <- z - (m * x)
	Escribir "y= ",m,"x + ",b
	
Fin Funcion

Algoritmo prog_principal
	
	
	
	Escribir "Quieres  calcular algo? Si (1), No (2)"
	Leer L //elegir 
	
	Repetir
		Escribir "como quieres hacer la ecuacion de la recta, mediante las coordenadas (3) o mediante la pendiente (4)"
		Leer M
		Si M = 1 Entonces
			coordenadas()
		SiNo
			pendiente()
		Fin Si
	Hasta Que L = 4
	
	
	
FinAlgoritmo
