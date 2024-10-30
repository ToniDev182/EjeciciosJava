Algoritmo sumar_par_impar //que hace el programa
	Escribir "Este algoritmo calcula la suma de los 20 primeros numeros pares y los 20 primeros impares"
	//creamos las variables 
	SUMPAR<-0//almacena la suma de los pares
	SUMIMPAR<-0//almacena la suma de los impares
	C<-40 //contador
	Mientras C>=0 Hacer 
		Si C % 2 == 0 Entonces  //compruebo si el numeros es par
			SUMPAR = SUMPAR+C
		SiNo
			SUMIMPAR = SUMIMPAR+C
		FinSi
		C=C-1 //para pasar al siguiente numero
	FinMientras
	Escribir "El resultado es: suma pares = " ,SUMPAR, " suma impares = ",SUMIMPAR
FinAlgoritmo
