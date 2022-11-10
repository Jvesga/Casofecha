package ejecutable;

import modelo.Fecha;

public class main 
{
  public static void main(String[] args) 
  {
    Fecha f1 = new Fecha();
    f1.setDia(2);
    f1.setMes(10);
    f1.setAnio(1970);

    Fecha f2 = new Fecha();
    f2.setDia(3);
    f2.setMes(10);
    f2.setAnio(1970);

    System.out.println("Dia =" + f1.getDia());
    System.out.println("Mes =" + f1.getMes());
    System.out.println("Año =" + f1.getAnio());
    System.out.println(f1);
    System.out.println("Dia =" + f2.getDia());
    System.out.println("Mes =" + f2.getMes());
    System.out.println("Año =" + f2.getAnio());
    System.out.println(f2);
    if (f1.equals(f2)==true ) {
    System.out.println("Las fechas son iguales");
    }
    else
    {
        System.out.print("Las fechas son distintas");
        
    } 

  }  

}
