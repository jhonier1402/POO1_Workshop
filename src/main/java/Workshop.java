import java.util.List;

public class Workshop {
    public static void main(String[] args) {

    }

    // Método que suma dos números enteros
    public int sumarDosNumeros(int a, int b) {
        // TODO: Implementar el método para retornar la suma de dos números enteros.
        // Ejemplo: Si a = 3 y b = 5, el resultado debería ser 8.
        return a+b;
    }

    // Método que encuentra el mayor de tres números enteros
    public int mayorDeTresNumeros(int a, int b, int c) {
        // TODO: Implementar el método para retornar el mayor de los tres números enteros.
        // Ejemplo: Si a = 3, b = 7, y c = 5, el resultado debería ser 7.
        if (a>b && a>c)
            return a;
        if (b>c && b>a)
            return b;
        else
            return c;
    }

    // Método que retorna la tabla de multiplicar de un número
    public int[] tablaMultiplicar(int numero, int limite) {
        int[] resultado = new int[limite];
        llenarTabla(resultado, numero, 0);
        return resultado;
    }
    private void llenarTabla(int[] arreglo, int numero, int indice) {
        if (indice < arreglo.length) {
            arreglo[indice] = numero * (indice + 1);
            llenarTabla(arreglo, numero, indice + 1);
        }
    }
    private void imprimirArreglo(int[] arreglo, int indice) {
        if (indice < arreglo.length) {
            System.out.println(arreglo[indice]);
            imprimirArreglo (arreglo, indice + 1);
        }
    }
    // Método que calcula el factorial de un número entero
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Método que verifica si un número es primo
    public boolean esPrimo(int numero) {
        if (numero <= 1) return false;
        return esPrimoRec(numero, 2);
    }
    private boolean esPrimoRec(int numero, int divisor) {
        if (divisor >= numero) {
            return true; // No se encontró ningún divisor
        }
        if (numero % divisor == 0) {
            return false; // Encontró un divisor exacto
        }
        return esPrimoRec(numero, divisor + 1);
    }

    // Método que genera una serie de Fibonacci
    public int[] serieFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Illegal Argument Exception");
        }
        int[] serie = new int[n];
        if (n > 0) {
            serie[0] = 0;
        }
        if (n > 1) {
            serie[1] = 1;
            llenarFibonacci(serie, 2);
        }
        return serie;
    }
    private void llenarFibonacci(int[] serie, int index) {
        if (index >= serie.length) {
            return;
        }

        serie[index] = serie[index - 1] + serie[index - 2];
        llenarFibonacci(serie, index + 1);
    }

    // Método que suma todos los elementos de un arreglo
    public int sumaElementos(int[] arreglo) {
        // TODO: Implementar el método para sumar todos los elementos de un arreglo.
        return sumaRecursiva(arreglo, 0);  // Llamada recursiva con el índice inicial 0
    }
    private int sumaRecursiva(int[] arreglo, int index) {
        if (index >= arreglo.length) {
            return 0;  // Caso base: si hemos llegado al final del arreglo, la suma es 0
        }
        // Sumar el valor en el índice actual con la llamada recursiva al siguiente índice
        return arreglo[index] + sumaRecursiva(arreglo, index + 1);
    }

    // Método que calcula el promedio de los elementos de un arreglo
    public double promedioElementos(int[] arreglo) {
        return promedioRecursivo(arreglo, 0, 0);  // Inicia la recursión con índice 0 y acumulador 0
    }
    private double promedioRecursivo(int[] arreglo, int index, int suma) {
        if (index >= arreglo.length) {
            return arreglo.length > 0 ? (double) suma / arreglo.length : 0.0;  // Evita división por cero
        }
        // Llamada recursiva, sumando el valor actual y pasando al siguiente índice
        return promedioRecursivo(arreglo, index + 1, suma + arreglo[index]);
    }

    // Método que encuentra el elemento mayor en un arreglo
    public int encontrarElementoMayor(int[] arreglo) {
        return encontrarMayorRecursivo(arreglo, 0, arreglo[0]);  // Inicia con el primer elemento como el mayor
    }
    private int encontrarMayorRecursivo(int[] arreglo, int index, int mayor) {
        if (index >= arreglo.length) {
            return mayor;  // Caso base: hemos recorrido todo el arreglo, retornar el mayor encontrado
        }
        // Compara el elemento actual con el mayor acumulado
        int nuevoMayor = arreglo[index] > mayor ? arreglo[index] : mayor;
        // Llamada recursiva al siguiente índice
        return encontrarMayorRecursivo(arreglo, index + 1, nuevoMayor);
    }

    // Método que encuentra el elemento menor en un arreglo
    public int encontrarElementoMenor(int[] arreglo) {
        return encontrarMenorRecursivo(arreglo, 0, arreglo[0]);  // Inicia con el primer elemento como el mayor
    }
    private int encontrarMenorRecursivo(int[] arreglo, int index, int menor) {
        if (index >= arreglo.length) {
            return menor;  // Caso base: hemos recorrido todo el arreglo, retornar el mayor encontrado
        }
        // Compara el elemento actual con el mayor acumulado
        int nuevoMenor = arreglo[index] < menor ? arreglo[index] : menor;
        // Llamada recursiva al siguiente índice
        return encontrarMenorRecursivo(arreglo, index + 1, nuevoMenor);
    }

    // Método que busca un elemento en un arreglo
    public boolean buscarElemento(int[] arreglo, int elemento) {
        return buscarElementoRec(arreglo, elemento, 0);
    }
    private boolean buscarElementoRec(int[] arreglo, int elemento, int indice) {
        if (indice >= arreglo.length) {
            return false;
        }
        if (arreglo[indice] == elemento) {
            return true;
        }
        return buscarElementoRec(arreglo, elemento, indice + 1);
    }

    // Método que invierte un arreglo
    public int[] invertirArreglo(int[] arreglo) {
        int[] resultado = new int[arreglo.length];
        invertirRecursivo(arreglo, resultado, 0);
        return resultado;
    }
    private void invertirRecursivo(int[] original, int[] invertido, int indice) {
        if (indice >= original.length) {
            return;
        }
        invertido[original.length - 1 - indice] = original[indice];
        invertirRecursivo(original, invertido, indice + 1);
    }

    // Método que ordena un arreglo en orden ascendente
    public int[] ordenarArreglo(int[] arreglo) {
        int[] copia = arreglo.clone(); // Para no modificar el arreglo original
        ordenarRecursivo(copia, copia.length);
        return copia;
    }
    private void ordenarRecursivo(int[] arreglo, int n) {
        if (n == 1) {
            return;
        }
        burbujaUnaPasada(arreglo, 0, n);
        ordenarRecursivo(arreglo, n - 1);
    }
    private void burbujaUnaPasada(int[] arreglo, int i, int n) {
        if (i >= n - 1) {
            return;
        }
        if (arreglo[i] > arreglo[i + 1]) {
            int temp = arreglo[i];
            arreglo[i] = arreglo[i + 1];
            arreglo[i + 1] = temp;
        }
        burbujaUnaPasada(arreglo, i + 1, n);
    }

    // Método que elimina los duplicados de un arreglo
    public int[] eliminarDuplicados(int[] arreglo) {
        return java.util.stream.IntStream.of(arreglo)
                .distinct()
                .toArray();
    }

    // Método que combina dos arreglos en uno solo
    public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
        int[] combinado = new int[arreglo1.length + arreglo2.length];
        System.arraycopy(arreglo1, 0, combinado, 0, arreglo1.length);
        System.arraycopy(arreglo2, 0, combinado, arreglo1.length, arreglo2.length);
        return combinado;
    }

    // Método que rota un arreglo n posiciones
    public int[] rotarArreglo(int[] arreglo, int posiciones) {
            int n = arreglo.length;
            if (n <= 1 || posiciones % n == 0) return arreglo.clone();

            // Convertimos la rotación a izquierda para trabajar internamente
            posiciones = posiciones % n;
            if (posiciones > 0) {
                // Rotar a la derecha equivale a rotar a la izquierda (n - posiciones)
                posiciones = n - posiciones;
            } else {
                // Rota a la izquierda directamente
                posiciones = -posiciones;
            }
            int[] rotado = new int[n];
            System.arraycopy(arreglo, posiciones, rotado, 0, n - posiciones);
            System.arraycopy(arreglo, 0, rotado, n - posiciones, posiciones);

            return rotado;

    }
    // Método que cuenta los caracteres en una cadena
    public int contarCaracteres(String cadena) {
        return cadena.length();
    }


    // Método que invierte una cadena
    public String invertirCadena(String cadena) {
        StringBuilder sb = new StringBuilder(cadena);
        return sb.reverse().toString();
    }

    // Método que verifica si una cadena es un palíndromo
    public boolean esPalindromo(String cadena) {
        if (cadena == null) return false;
        String limpia = cadena.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String invertida = new StringBuilder(limpia).reverse().toString();
        return limpia.equals(invertida);
    }

    // Método que cuenta el número de palabras en una cadena
    public int contarPalabras(String cadena) {
        if (cadena == null || cadena.trim().isEmpty()) {
            return 0;
        }
        String[] palabras = cadena.trim().split("\\s+");
        return palabras.length;
    }

    // Método que convierte una cadena a mayúsculas
    public String convertirAMayusculas(String cadena) {
        if (cadena == null) return "";
        return cadena.toUpperCase();
    }

    // Método que convierte una cadena a minúsculas
    public String convertirAMinusculas(String cadena) {
        if (cadena == null) return "";
        return cadena.toLowerCase();
    }

    // Método que reemplaza una subcadena en una cadena por otra subcadena
    public String reemplazarSubcadena(String cadena, String antiguaSubcadena, String nuevaSubcadena) {
        // TODO: Implementar el método para reemplazar una subcadena en una cadena por otra subcadena.
        // Ejemplo: Si cadena = "Hello Java", antiguaSubcadena = "Java", y nuevaSubcadena = "world", el resultado debería ser "Hello world".
        return "";
    }

    // Método que busca una subcadena en una cadena y retorna su índice
    public int buscarSubcadena(String cadena, String subcadena) {
        // TODO: Implementar el método para buscar una subcadena en una cadena y retornar su índice.
        // Ejemplo: Si cadena = "Hello world" y subcadena = "world", el resultado debería ser 6.
        return -1;
    }

    // Método que valida un correo electrónico
        public boolean validarCorreoElectronico(String correo) {
            if (correo == null) {
                return false;
            }
            String patron = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
            return correo.matches(patron);
        }

    // Método que calcula el promedio de una lista de números

    public double promedioLista(List<Integer> lista) {
        // TODO: Implementar el método para calcular el promedio de una lista de números.
        // Ejemplo: Si lista = [1, 2, 3, 4, 5], el resultado debería ser 3.0.
        return 0.0;
    }

    // Método que convierte un número en su representación binaria
    public String convertirABinario(int numero) {
        // TODO: Implementar el método para convertir un número en su representación binaria.
        // Ejemplo: Si numero = 10, el resultado debería ser "1010".
        return Integer.toBinaryString(numero);
    }


    // Método que convierte un número en su representación hexadecimal
    public String convertirAHexadecimal(int numero) {
        // TODO: Implementar el método para convertir un número en su representación hexadecimal.
        // Ejemplo: Si numero = 255, el resultado debería ser "FF".
        return Integer.toHexString(numero).toUpperCase();
    }

    // Método para el juego de piedra, papel, tijera, lagarto, Spock
    public String jugarPiedraPapelTijeraLagartoSpock(String eleccionUsuario) {
        String[] opciones = {"Piedra", "Papel", "Tijera", "Lagarto", "Spock"};

        // Validar entrada (por simplicidad, sin for)
        if (!eleccionUsuario.equals("Piedra") &&
                !eleccionUsuario.equals("Papel") &&
                !eleccionUsuario.equals("Tijera") &&
                !eleccionUsuario.equals("Lagarto") &&
                !eleccionUsuario.equals("Spock")) {
            return "Elección inválida";
        }

        // Elección aleatoria para la computadora
        double r = Math.random();
        String computadora = "Piedra";
        if (r < 0.2) computadora = "Piedra";
        else if (r < 0.4) computadora = "Papel";
        else if (r < 0.6) computadora = "Tijera";
        else if (r < 0.8) computadora = "Lagarto";
        else computadora = "Spock";

        // Empate
        if (eleccionUsuario.equals(computadora)) {
            return "Empate";
        }

        // Lógica de victoria del usuario
        boolean gana =
                (eleccionUsuario.equals("Piedra") && (computadora.equals("Tijera") || computadora.equals("Lagarto")))
                        || (eleccionUsuario.equals("Papel") && (computadora.equals("Piedra") || computadora.equals("Spock")))
                        || (eleccionUsuario.equals("Tijera") && (computadora.equals("Papel") || computadora.equals("Lagarto")))
                        || (eleccionUsuario.equals("Lagarto") && (computadora.equals("Spock") || computadora.equals("Papel")))
                        || (eleccionUsuario.equals("Spock") && (computadora.equals("Tijera") || computadora.equals("Piedra")));

        return gana ? "Ganaste" : "Perdiste";
    }

    public String pptls2(String game[]) {
        String p1 = game[0];
        String p2 = game[1];

        // Empate
        if (p1.equals(p2)) {
            return "Empate";
        }

        // Verificar si gana el jugador 1
        boolean ganaJugador1 =
                (p1.equals("R") && (p2.equals("S") || p2.equals("L"))) // Rock crushes Scissors/Lizard
                        || (p1.equals("P") && (p2.equals("R") || p2.equals("V"))) // Paper covers Rock / disproves Spock
                        || (p1.equals("S") && (p2.equals("P") || p2.equals("L"))) // Scissors cuts Paper / decapitates Lizard
                        || (p1.equals("L") && (p2.equals("P") || p2.equals("V"))) // Lizard eats Paper / poisons Spock
                        || (p1.equals("V") && (p2.equals("R") || p2.equals("S"))); // Spock vaporizes Rock / smashes Scissors

        return ganaJugador1 ? "Player 1" : "Player 2";
    }

    public double areaCirculo(double radio) {
        return Math.PI * radio;
    }

    public String zoodiac(int day, int month) {
        if (month < 1 || month > 12) {
            return "Invalid Date";
        }

        if ((month == 2 && day > 28) ||
                (month == 4 && day > 30) ||
                (month == 6 && day > 30) ||
                (month == 9 && day > 30) ||
                (month == 11 && day > 30) ||
                (day < 1 || day > 31)) {
            return "Invalid Date";
        }

        if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            return "Acuario";
        } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            return "Piscis";
        } else if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            return "Aries";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            return "Tauro";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            return "Geminis";
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            return "Cancer";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            return "Leo";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            return "Virgo";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            return "Libra";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            return "Escorpio";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            return "Sagitario";
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            return "Capricornio";
        }

        return "Invalid Date";
    }
}