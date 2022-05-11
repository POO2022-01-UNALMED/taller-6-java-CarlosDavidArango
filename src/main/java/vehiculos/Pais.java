package vehiculos;

import java.util.ArrayList;

public class Pais {

    private String nombre;
    public static ArrayList<Pais> paises = new ArrayList<Pais>();
    private int numeroCreados;

    public Pais(String nombre){
        this.nombre = nombre;
        if (!Pais.paises.contains(this)) {
            Pais.paises.add(this);
        }
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroCreados() {
        return numeroCreados;
    }
    public void setNumeroCreados() {
        this.numeroCreados = numeroCreados +1;
    }

    public static Pais paisMasVendedor(){
        Pais mas = Pais.paises.get(0);
        for(int i = 1; i < Pais.paises.size(); i++){
            if (Pais.paises.get(i).numeroCreados > Pais.paises.get(i - 1).numeroCreados){
                mas = Pais.paises.get(i);
            }
        }
        return mas;
    }
}
