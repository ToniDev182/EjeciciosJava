Algoritmo Maximo_valor
	
	Dimension array[20]//creo una lista 20 numeros (array es una lista )
	
	C=0 // creo un contador
	
	Repetir
		
		C=C+1 //Pasa al siguente numero del contador 
		
		Escribir "Dime el numero "  C " de la lista"
		
		leer array[C]// Como sumamos uno el algoritmo nos da la siguiente posicion en la lista 
		
	Hasta Que C>=20 
	
	Pos=1 //Posicion del mayor.
	aux= array[1] // Asi obtengo el valor que este guardado en la posición 1 del array
	
	Para C <- 1 Hasta 20 Con Paso 1  Hacer // Otra forma de hacer bucle, dice donde empieza donde acaba y de cuanto en cuanto avanza.
		
		
		Si array[C]>aux Entonces // Utilizamos "Aux" como un espacio donde guardar el numero mayor y array C el numero que estamos recorriendo
			
			Aux=array[C] // Guardar en el auxilar el valor del mayor.
 			Pos=C       // Pocion en la que esta el mayor numero. 
			
		Fin Si
	
	Fin Para
	
	Escribir Aux " Valor del mayor numero"
	Escribir Pos " Posicion del mayor numero"

	
	FinAlgoritmo
