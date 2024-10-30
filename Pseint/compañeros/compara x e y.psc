Algoritmo x_e_y
	Escribir "Este algoritmo compara dos números ingresados por teclado y dice si son iguales o no y cual es mayor que el otro"
	Escribir "Dime un número"
	Leer X
	Escribir "Dime otro número"
	Leer Z
	Si X == Z Entonces
		Escribir "El primer y el segundo número son iguales"
	SiNo
		Escribir "El primer y el segundo número no son iguales"
		Si X > Z Entonces
			Escribir "El primer número es mayor que el segundo"
		SiNo
			Escribir "El segundo número es mayor que el primero"
		Fin Si
	Fin Si
FinAlgoritmo
