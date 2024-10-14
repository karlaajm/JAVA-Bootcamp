//Adivina Número (Actividad Práctica)
package clases;

public class AdivinaNumero {
    public static String compararNumeros(int numero, int aleatorio){ 
        if(numero < aleatorio) return "Intenta con un número más grande.";
        if(numero > aleatorio) return "Intenta con un número más pequeño.";
        return "¡Has conseguido adivinar el número!";
    }
}