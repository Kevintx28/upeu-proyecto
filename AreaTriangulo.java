import java.util.Scanner;

class AreaTriangulo{
static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
      //Definir Variable y otros
    
      System.out.println("Hola mundo");
      int b;
      int h;
      int area=0;
      //datos de Entrada
      System.out.println("Ingrese la Base");
      b=input.nextInt();
      
      System.out.println("Ingrese la Altura");
      h=input.nextInt();
      
      //proceso
      area=(b*h)/2;
      //Datos de Salida
      System.out.println("Area de un Triangulo es:"+area);
    }



}