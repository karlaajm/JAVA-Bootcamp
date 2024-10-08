package clases;
import java.util.Date;
import java.lang.Math;

public class Cajero {
    public static String retirarDinero(double dinero) {
        return (dinero > 8000) ? "Estás tratando de retirar mucho dinero, el límite es $8000" : ("Retiraste exitosamente la cantidad de: " + dinero);
    }

    public static String pagarFactura(double facturaTotal, double facturaUsuario){
        Date fechaActual = new Date();
        if(facturaUsuario < facturaTotal){
            return ("El día de " + fechaActual + " pagaste " + facturaUsuario + " aún te hacen falta " + (facturaTotal - facturaUsuario));
        } else if(facturaUsuario == facturaTotal) {
            return ("Gracias por tu pago completo el día de " + fechaActual);
        } else {
            return ("Gracias por tu pago el día de " + fechaActual + ", tu cambio es de " + ((facturaUsuario - facturaTotal) * -1));
        }
    }

    public static boolean cambiarBilletes(int cambiarDinero, int tiposBilletes) {
        if(cambiarDinero % tiposBilletes == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static String totalDeBilletesYMonedas(int montoDesignado) {
        int Billetes[] = {500, 200, 100, 50, 20};
        int Monedas[] = {10, 5, 2, 1};
        String msg = "";

        /*
         * for(int i = 0; i < Billetes.length; i++){
            int resto = montoDesignado % Billetes[i];
            int montoRestado = montoDesignado - resto;
            int cantidadBilletes[] = montoRestado / Billetes[i]; 
        }
         */
        
        int resto = montoDesignado;
        for(int i = 0; i < Billetes.length; i++){
            int cociente = (int)Math.floor(resto / Billetes[i]);
            if(cociente > 0) {
                msg = msg + " " + cociente + " billetes de " + Billetes[i] + ", ";
                resto = resto - (cociente * Billetes[i]);
            }
        }

        for(int i = 0; i < Monedas.length; i++){
            int cociente = (int)Math.floor(resto / Monedas[i]);
            if(cociente > 0) {
                msg = msg + " " + cociente + " monedas de " + Monedas[i] + ", ";
                resto = resto - (cociente * Monedas[i]);
            }
        }
        return (msg);
    }
}
