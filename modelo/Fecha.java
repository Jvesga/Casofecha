package modelo;

public class Fecha
{
 private int dia;
 private int mes;
 private int anio;

    public void setDia(int dia) {
        this.dia = dia;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getAnio() {
        return anio;
    }

    //Metodo sobreescrito de la clase object
    public String toString() {
        return dia + "/" + mes + "/" + anio;
    }

    public boolean equals(Object object) {
        Fecha otra = (Fecha)object;
        return (dia==otra.dia) && (mes==otra.mes) && (anio==otra.anio);
    }
} 