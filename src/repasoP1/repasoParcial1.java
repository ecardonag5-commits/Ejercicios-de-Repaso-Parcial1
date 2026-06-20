package repasoP1;

import java.util.Scanner;

public class repasoParcial1 {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		int opcion;

		do {
			mostrarMenu();
			opcion = leerEnteroSeguro("Seleccione una opción: ");

			switch (opcion) {
			case 1:
				ejercicio1();
				break;
			case 2:
				ejercicio2();
				break;
			case 3:
				ejercicio3();
				break;
			case 4:
				ejercicio4();
				break;
			case 5:
				ejercicio5();
				break;
			case 6:
				ejercicio6();
				break;
			case 7:
				ejercicio7();
				break;
			case 8:
				ejercicio8();
				break;
			case 9:
				ejercicio9();
				break;
			case 10:
				ejercicio10();
				break;
			case 11:
				ejercicio11();
				break;
			case 12:
				ejercicio12();
				break;
			case 13:
				ejercicio13();
				break;
			case 14:
				ejercicio14();
				break;
			case 15:
				ejercicio15();
				break;
			case 16:
				ejercicio16();
				break;
			case 17:
				ejercicio17();
				break;
			case 18:
				ejercicio18();
				break;
			case 19:
				ejercicio19();
				break;
			case 20:
				ejercicio20();
				break;
			case 0:
				System.out.println("Saliendo del programa...");
				break;
			default:
				System.out.println("Opción inválida.");
			}

			if (opcion != 0) {
				pausar();
			}

		} while (opcion != 0);

		entrada.close();
	}

	// =========================
	// MENÚ
	// =========================
	static void mostrarMenu() {
		System.out.println("\n===== MENÚ REPASO PARCIAL 1 =====");
		System.out.println("1. Suma de divisibles entre 4 (1..n)");
		System.out.println("2. Factorial de n");
		System.out.println("3. Contar positivos/negativos/ceros");
		System.out.println("4. Promedio de pares (1..n)");
		System.out.println("5. Suma de dígitos de n");
		System.out.println("6. Múltiplo de 7 o 11");
		System.out.println("7. Divisible entre 3 y no entre 2 (1..n)");
		System.out.println("8. Clasificar hora (0-23)");
		System.out.println("9. Romano (1-5) con switch");
		System.out.println("10. Operación (1-3) con switch");
		System.out.println("11. Mayor, menor y diferencia absoluta");
		System.out.println("12. Tabla de división (1..10)");
		System.out.println("13. Cantidad de dígitos pares");
		System.out.println("14. Número triangular");
		System.out.println("15. Promedio de negativos (de n números)");
		System.out.println("16. Primeros n múltiplos de 6");
		System.out.println("17. Potencia de 2");
		System.out.println("18. Número invertido");
		System.out.println("19. Suma 1..n es par o impar");
		System.out.println("20. Celsius a Fahrenheit");
		System.out.println("0. Salir");
	}

	// =========================
	// LECTURAS SEGURAS (try-catch)
	// =========================
	static int leerEnteroSeguro(String mensaje) {
		while (true) {
			try {
				System.out.print(mensaje);
				String texto = entrada.nextLine();
				return Integer.parseInt(texto.trim());
			} catch (Exception e) {
				System.out.println("Entrada inválida. Ingrese un número entero válido.");
			}
		}
	}

	static double leerDoubleSeguro(String mensaje) {
		while (true) {
			try {
				System.out.print(mensaje);
				String texto = entrada.nextLine();
				return Double.parseDouble(texto.trim());
			} catch (Exception e) {
				System.out.println("Entrada inválida. Ingrese un número válido.");
			}
		}
	}

	static void pausar() {
		System.out.print("\nPresione Enter para volver al menú...");
		entrada.nextLine();
	}

	// =========================
	// EJERCICIOS (1 método por ejercicio)
	// =========================

	// 1) Suma de números divisibles entre 4 desde 1 hasta n
	static void ejercicio1() {

		System.out.println("\n--- EJERCICIO 1: Suma de divisibles entre 4 ---");

		int n = leerEnteroSeguro("Ingrese un número n: ");

		int suma = 0;

		for (int i = 1; i <= n; i++) {

			if (i % 4 == 0) {
				suma += i;
			}

		}

		System.out.println("La suma de los números divisibles entre 4 desde 1 hasta " + n + " es: " + suma);
	}

	// 2) Factorial de n
	static void ejercicio2() {

		System.out.println("\n--- EJERCICIO 2: Factorial de n ---");

		int n = leerEnteroSeguro("Ingrese un número n: ");

		if (n < 0) {
			System.out.println("El factorial no está definido para números negativos.");
			return;
		}

		long factorial = 1;

		for (int i = 1; i <= n; i++) {
			factorial *= i;
		}

		System.out.println("El factorial de " + n + " es: " + factorial);
	}

	// 3) Contar positivos/negativos/ceros de n números
	static void ejercicio3() {

		System.out.println("\n--- EJERCICIO 3: Contar positivos, negativos y ceros ---");

		int n = leerEnteroSeguro("¿Cuántos números desea ingresar?: ");

		int positivos = 0;
		int negativos = 0;
		int ceros = 0;

		for (int i = 1; i <= n; i++) {

			int numero = leerEnteroSeguro("Ingrese número " + i + ": ");

			if (numero > 0) {
				positivos++;
			} else if (numero < 0) {
				negativos++;
			} else {
				ceros++;
			}

		}

		System.out.println("Cantidad de positivos: " + positivos);
		System.out.println("Cantidad de negativos: " + negativos);
		System.out.println("Cantidad de ceros: " + ceros);
	}

	// 4) Promedio de números pares entre 1 y n
	static void ejercicio4() {

		System.out.println("\n--- EJERCICIO 4: Promedio de números pares ---");

		int n = leerEnteroSeguro("Ingrese un número n: ");

		int suma = 0;
		int contador = 0;

		for (int i = 1; i <= n; i++) {

			if (i % 2 == 0) {
				suma += i;
				contador++;
			}

		}

		if (contador == 0) {
			System.out.println("No hay números pares entre 1 y " + n);
		} else {
			double promedio = (double) suma / contador;
			System.out.println("El promedio de los números pares entre 1 y " + n + " es: " + promedio);
		}
	}

	// 5) Suma de dígitos de n
	static void ejercicio5() {

		System.out.println("\n--- EJERCICIO 5: Suma de dígitos ---");

		int n = leerEnteroSeguro("Ingrese un número: ");

		int numero = Math.abs(n);
		int suma = 0;

		while (numero > 0) {

			int digito = numero % 10;
			suma += digito;
			numero = numero / 10;

		}

		System.out.println("La suma de los dígitos de " + n + " es: " + suma);
	}

	// 6) Múltiplo de 7 o de 11
	static void ejercicio6() {

		System.out.println("\n--- EJERCICIO 6: Múltiplo de 7 o de 11 ---");

		int n = leerEnteroSeguro("Ingrese un número: ");

		if (n % 7 == 0 || n % 11 == 0) {
			System.out.println(n + " es múltiplo de 7 o de 11.");
		} else {
			System.out.println(n + " NO es múltiplo de 7 ni de 11.");
		}

	}

	// 7) Números 1..n divisibles entre 3 pero no entre 2
	static void ejercicio7() {

		System.out.println("\n--- EJERCICIO 7: Divisibles entre 3 pero no entre 2 ---");

		int n = leerEnteroSeguro("Ingrese un número n: ");

		System.out.println("Números que cumplen la condición:");

		for (int i = 1; i <= n; i++) {

			if (i % 3 == 0 && i % 2 != 0) {
				System.out.println(i);
			}

		}

	}

	// 8) Clasificar hora 0-23: Mañana/Tarde/Noche
	static void ejercicio8() {

		System.out.println("\n--- EJERCICIO 8: Clasificación de hora ---");

		int hora = leerEnteroSeguro("Ingrese una hora (0 - 23): ");

		if (hora < 0 || hora > 23) {
			System.out.println("Hora inválida.");
		} else if (hora >= 6 && hora <= 11) {
			System.out.println("Mañana");
		} else if (hora >= 12 && hora <= 17) {
			System.out.println("Tarde");
		} else {
			System.out.println("Noche");
		}

	}

	// 9) Convertir 1-5 a romano con switch
	static void ejercicio9() {

		System.out.println("\n--- EJERCICIO 9: Número romano (1-5) ---");

		int numero = leerEnteroSeguro("Ingrese un número del 1 al 5: ");

		switch (numero) {

		case 1:
			System.out.println("Número romano: I");
			break;

		case 2:
			System.out.println("Número romano: II");
			break;

		case 3:
			System.out.println("Número romano: III");
			break;

		case 4:
			System.out.println("Número romano: IV");
			break;

		case 5:
			System.out.println("Número romano: V");
			break;

		default:
			System.out.println("Número fuera del rango (1-5).");

		}

	}

	// 10) Opción 1-3 + dos números: sumar/restar/multiplicar (switch)
	static void ejercicio10() {

		System.out.println("\n--- EJERCICIO 10: Operaciones con switch ---");

		int opcion = leerEnteroSeguro("Seleccione operación (1=Suma, 2=Resta, 3=Multiplicación): ");

		double num1 = leerDoubleSeguro("Ingrese el primer número: ");
		double num2 = leerDoubleSeguro("Ingrese el segundo número: ");

		switch (opcion) {

		case 1:
			System.out.println("Resultado: " + (num1 + num2));
			break;

		case 2:
			System.out.println("Resultado: " + (num1 - num2));
			break;

		case 3:
			System.out.println("Resultado: " + (num1 * num2));
			break;

		default:
			System.out.println("Opción inválida.");

		}

	}

	// 11) Mayor, menor y diferencia absoluta
	static void ejercicio11() {

		System.out.println("\n--- EJERCICIO 11: Mayor, menor y diferencia ---");

		double a = leerDoubleSeguro("Ingrese el primer número: ");
		double b = leerDoubleSeguro("Ingrese el segundo número: ");

		double mayor;
		double menor;

		if (a > b) {
			mayor = a;
			menor = b;
		} else {
			mayor = b;
			menor = a;
		}

		double diferencia = Math.abs(a - b);

		System.out.println("Mayor: " + mayor);
		System.out.println("Menor: " + menor);
		System.out.println("Diferencia absoluta: " + diferencia);
	}

	// 12) Tabla de división 1..10
	static void ejercicio12() {

		System.out.println("\n--- EJERCICIO 12: Tabla de división ---");

		double n = leerDoubleSeguro("Ingrese un número: ");

		for (int i = 1; i <= 10; i++) {

			double resultado = n / i;

			System.out.println(n + " / " + i + " = " + resultado);
		}

	}

	// 13) Cantidad de dígitos pares en n
	static void ejercicio13() {

		System.out.println("\n--- EJERCICIO 13: Cantidad de dígitos pares ---");

		int n = leerEnteroSeguro("Ingrese un número: ");

		int numero = Math.abs(n);
		int contador = 0;

		while (numero > 0) {

			int digito = numero % 10;

			if (digito % 2 == 0) {
				contador++;
			}

			numero = numero / 10;
		}

		System.out.println("Cantidad de dígitos pares: " + contador);
	}

	// 14) Determinar si n es triangular
	static void ejercicio14() {

		System.out.println("\n--- EJERCICIO 14: Número triangular ---");

		int n = leerEnteroSeguro("Ingrese un número: ");

		int suma = 0;
		int i = 1;

		while (suma < n) {
			suma += i;
			i++;
		}

		if (suma == n) {
			System.out.println(n + " es un número triangular.");
		} else {
			System.out.println(n + " NO es un número triangular.");
		}

	}

	// 15) Promedio de negativos de n números
	static void ejercicio15() {

		System.out.println("\n--- EJERCICIO 15: Promedio de números negativos ---");

		int n = leerEnteroSeguro("¿Cuántos números ingresará?: ");

		double sumaNegativos = 0;
		int contadorNegativos = 0;

		for (int i = 1; i <= n; i++) {

			double numero = leerDoubleSeguro("Ingrese número " + i + ": ");

			if (numero < 0) {
				sumaNegativos += numero;
				contadorNegativos++;
			}

		}

		if (contadorNegativos == 0) {
			System.out.println("No hay negativos");
		} else {

			double promedio = sumaNegativos / contadorNegativos;

			System.out.println("Promedio de los números negativos: " + promedio);
		}

	}

	// 16) Primeros n múltiplos de 6
	static void ejercicio16() {

		System.out.println("\n--- EJERCICIO 16: Primeros múltiplos de 6 ---");

		int n = leerEnteroSeguro("¿Cuántos múltiplos desea mostrar?: ");

		for (int i = 1; i <= n; i++) {

			int multiplo = 6 * i;

			System.out.println(multiplo);

		}

	}

	// 17) Determinar si n es potencia de 2
	static void ejercicio17() {

		System.out.println("\n--- EJERCICIO 17: Potencia de 2 ---");

		int n = leerEnteroSeguro("Ingrese un número: ");

		if (n <= 0) {
			System.out.println("El número debe ser positivo.");
			return;
		}

		int numero = n;

		while (numero % 2 == 0) {
			numero = numero / 2;
		}

		if (numero == 1) {
			System.out.println(n + " es potencia de 2.");
		} else {
			System.out.println(n + " NO es potencia de 2.");
		}

	}

	// 18) Número invertido
	static void ejercicio18() {

		System.out.println("\n--- EJERCICIO 18: Número invertido ---");

		int n = leerEnteroSeguro("Ingrese un número: ");

		int numero = Math.abs(n);
		int invertido = 0;

		while (numero > 0) {

			int digito = numero % 10;

			invertido = invertido * 10 + digito;

			numero = numero / 10;

		}

		System.out.println("Número invertido: " + invertido);

	}

	// 19) Suma 1..n es par o impar
	static void ejercicio19() {

		System.out.println("\n--- EJERCICIO 19: Suma de 1 a n ---");

		int n = leerEnteroSeguro("Ingrese un número n: ");

		int suma = 0;

		for (int i = 1; i <= n; i++) {
			suma += i;
		}

		System.out.println("La suma es: " + suma);

		if (suma % 2 == 0) {
			System.out.println("La suma es PAR.");
		} else {
			System.out.println("La suma es IMPAR.");
		}

	}

	// 20) Celsius a Fahrenheit
	static void ejercicio20() {

		System.out.println("\n--- EJERCICIO 20: Celsius a Fahrenheit ---");

		double celsius = leerDoubleSeguro("Ingrese temperatura en Celsius: ");

		double fahrenheit = (celsius * 9 / 5) + 32;

		System.out.println("Temperatura en Fahrenheit: " + fahrenheit);

	}
}