public class MetodosEstaticos{
    public static void main(String [] args){
        int resultado = sumaNumeros(20, 70);
        System.out.println(resultado);
        resultado = sumaNumeros(30, 40, 60);
        System.out.println(resultado);
    }

    public static int sumaNumeros(int num1, int num2){
        return num1 + num2;
    }

    public static int sumaNumeros(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }
}