package ejecutable;

import modelo.Fecha;

public class test {
    public static void main(String[] args) {
        Fecha f = new Fecha(0, 0, 0);
        f.setDia(2);
        f.setMes(10);
        f.setYear(1800);
        f.addDias(180);

    System.out.println("Día: " + f.getDia());
    System.out.println("Mes: " + f.getMes());
    System.out.println("Year: " + f.getYear());
    System.out.println(f.toString());

    Fecha f2 = new Fecha(0, 0, 0);
        f2.setDia(2);
        f2.setMes(11);
        f2.setYear(1980);

    System.out.println("Día: " + f2.getDia());
    System.out.println("Mes: " + f2.getMes());
    System.out.println("Year: " + f2.getYear());
    System.out.println(f2.toString());

    if(f.equals(f2)){
    System.out.println("Las fechas son iguales");
    }
    else{
        System.out.println("Las fechas son diferentes");
    }
    }
}



