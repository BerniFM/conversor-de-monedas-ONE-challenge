package calculos;

import moneda.monedas;

import java.util.Scanner;

public class convertirMoneda {

    public static void convertir(String monedaBase, String monedaTarget, consultarMoneda consulta, Scanner lectura){
        double cantidad;
        double cantidadConvertidad;

        monedas moneda = consulta.buscarMoneda(monedaBase, monedaTarget);
        System.out.println("Tasa de conversión del día:\n\n1 " + monedaBase + " = " + moneda.conversion_rate() + " " + monedaTarget);
        System.out.println("\nPor favor, ingrese la cantidad de " + monedaBase + " que desea convertir:");
        cantidad = Double.parseDouble(lectura.nextLine());
        cantidadConvertidad = cantidad * moneda.conversion_rate();
        System.out.println(cantidad + " " + monedaBase + " = " + cantidadConvertidad + " " + moneda.target_code());
    }

    public static void convertirOtraMoneda(consultarMoneda consulta, Scanner lectura){
        System.out.println("Ingrese el codigo de la moneda base:");
        String monedaBase = lectura.nextLine().toUpperCase();
        System.out.println("Ingrese la moneda:");
        String monedaObjetivo = lectura.nextLine().toUpperCase();
        convertir(monedaBase, monedaObjetivo, consulta, lectura);
    }
}
