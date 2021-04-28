import java.util.Scanner;

class AreaTriangulo{
static Scanner input = new Scanner(System.in);
    public static void main(String[] args){//metodo principal
      //Definir Variable y otros
    
      System.out.println("Hola mundo");
      int b;//definir variable base
      int h;//definir variable altura
      int area=0;
      //datos de Entrada
      System.out.println("Ingrese la Base");
      b=input.nextInt();//capturar dados del usuario para base
      
      System.out.println("Ingrese la Altura");
      h=input.nextInt();//capturar datos del usuario para altura
      
      //proceso
      area=(b*h)/2;
      //Datos de Salida
      System.out.println("Area de un Triangulo es:"+area);
    }


}