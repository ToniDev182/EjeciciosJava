Algoritmo ejercicio02 
	// Definimos las variables que vamos a utilizar 
		Definir radio, altura, areaLateral, volumen Como Real
		
		// pedimos al usuario que ingrese el valor del radio
		
		Escribir "Ingrese el valor del radio del cilindro:"
		Leer radio
		
		// pedimos al usuario que ingrese el valor de la altura 
		
		Escribir "Ingrese el valor de la altura del cilindro:"
		Leer altura
		
		// Verificamos que tanto el radio como la altura son mayores de 0

		
		Si radio > 0 Y altura > 0 Entonces
			
			//si es asi calculamos el area lateral
			
			areaLateral = 2 * 3.1416 * radio * altura
			
			// calcularmos el volumen 
			
			volumen = 3.1416 * radio^2 * altura // para elevar un numero mantemos shift y `
			
			Escribir "El area lateral del cilindro es:", areaLateral
			Escribir "El volumen del cilindro es:", volumen
		Sino
			Escribir "El radio y la altura no pueden ser cero."
		FinSi
		
FinAlgoritmo

