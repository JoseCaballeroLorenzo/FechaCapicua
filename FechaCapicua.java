package UT3.Actividad_4;

import java.util.Scanner;

public class FechaCapicua {

    public static int darLaVuelta(int num){
        String numero = "" +num;
        StringBuilder resultado = new StringBuilder();
        int pos = numero.length() -1;
        do{
            resultado.append(numero.charAt(pos));
            pos --;
        }while (pos>=0);
        return Integer.parseInt(resultado.toString());
    }

    public static boolean esCapciua(int num){
        int numalreves = darLaVuelta(num);
        return num == numalreves;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fecha;

        System.out.print("Introduzca fecha: ");
        fecha = sc.next();
        String[] newFecha= fecha.split("/");

        String fecha2 = newFecha[0]+ newFecha[1]+newFecha[2];


        if(esCapciua(Integer.parseInt(fecha2))){
            System.out.print("La fecha "+ fecha+", es capicua ");
        }else{
            System.out.println("La fecha "+ fecha+", no es capicua ");
        }
    }
}