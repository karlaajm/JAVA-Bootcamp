import clases.Cajero;

public class Aplicacion {
    public static void main(String[] args){
        //Primera clase estática
        double valorDinero = 7660;
        String valor = Cajero.retirarDinero(valorDinero);
        System.out.println(valor);

        //Segunda clase estática
        double deuda = 18990;
        double montoPagado = 15990;
        String mensaje = Cajero.pagarFactura(deuda, montoPagado);
        System.out.println(mensaje);

        //Tercera clase estática Ejemplo 1
        int dineroParaCambiar0 = 2000;
        int tiposBilletes0 = 50;
        boolean cambioRealizado = Cajero.cambiarBilletes(dineroParaCambiar0, tiposBilletes0);
        System.out.println(cambioRealizado);

        //Tercera clase estática Ejemplo 2
        int dineroParaCambiar1 = 2010;
        int tiposBilletes1 = 50;
        boolean cambioRealizado1 = Cajero.cambiarBilletes(dineroParaCambiar1, tiposBilletes1);
        System.out.println(cambioRealizado1);

        int totalDeBilletes = 1999;
        String mensaje2 = Cajero.totalDeBilletesYMonedas(totalDeBilletes);
        System.out.println(mensaje2);
    }
}

