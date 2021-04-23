import java.util.Scanner;

class AreaTriangulo{
static scanner teclado=new Scanner(System.in);
public static void main(String [] arg){
//Definir Variable y otros
  System.out.println("Hola mundo");
  int b=0, h=0, area=0;
 //datos de Entrada
 Sistem.out.println("Ingrese la Base");
 b=teclado.nextInt();
 Sistem.out.println("Ingrese la Altura");
 h=teclado.nextInt();
 //proceso
 area=(b*h)/2;
 //Datos de Salida
 System.out.println("Area de un Triangulo es:"+area);
}
}