package principal;

import calculos.consultarMoneda;
import calculos.convertirMoneda;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        consultarMoneda consulta = new consultarMoneda();


        int opcion = 0;
        while (opcion != 8){
            System.out.println("---------------------------------------------------\n\n" +
                    "¡Bienvenidos al Challenge - Conversor de Monedas!\n\n" +
                    "Seleccione una opción para realizar la conversión:\n" +
                    "1. [USD] Dólar a [ARS] Peso Argentino\n" +
                    "2. [ARS] Peso Argentino a [USD] Dólar\n" +
                    "3. [USD] Dólar a [BRL] Real Brasileño\n" +
                    "4. [BRL] Real Brasileño a [USD] Dólar\n" +
                    "5. [USD] Dólar a [COP] Peso Colombiano\n" +
                    "6. [COP] Peso Colombiano a [USD] Dólar\n" +
                    "7. Convertir otra moneda\n" +
                    "8. Salir\n\n" +
                    "Por favor, ingrese el número de la conversión que desea realizar: ");

            opcion = lectura.nextInt();
            lectura.nextLine();

            switch (opcion) {
                case 1:
                    convertirMoneda.convertir("USD" , "ARS", consulta, lectura);
                    break;
                case 2:
                    convertirMoneda.convertir("ARS" , "USD" , consulta, lectura);
                    break;
                case 3:
                    convertirMoneda.convertir("USD" , "BRL" , consulta, lectura);
                    break;
                case 4:
                    convertirMoneda.convertir("BRL" , "USD" , consulta, lectura);
                    break;
                case 5:
                    convertirMoneda.convertir("USD" , "COP" , consulta, lectura);
                    break;
                case 6:
                    convertirMoneda.convertir("COP" , "USD" , consulta, lectura);
                    break;
                case 7:
                    convertirMoneda.convertirOtraMoneda(consulta, lectura);
                    break;
                case 8:
                    System.out.println("saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;

            }
        }
    }
}
