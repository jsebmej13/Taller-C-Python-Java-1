import java.util.Scanner;

 public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String cadena;
        Double valor_u,cantidad_u,total1;
        System.out.println("Introduce un nombre de un producto: ");
        cadena = sc.nextLine();
        System.out.println("Introduce el valor del producto ");
        valor_u = sc.nextDouble();
        System.out.println("Introduce la cantidad del producto");
        cantidad_u = sc.nextDouble();
        total1=valor_u*cantidad_u;
      
      

      
        System.out.println("El nombre del producto " + cadena + "El total a pagar" + total1 +"pesos");                                               
    }
}