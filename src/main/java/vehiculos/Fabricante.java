package vehiculos;

import java.util.ArrayList;

public class Fabricante {
    private Pais pais;
    private String nombre;
    public int fabricados;
    public static ArrayList<Fabricante> fabricantes;

    public Fabricante(String nombre, Pais pais ){
        this.pais = pais;
        this.nombre = nombre;
        Fabricante.fabricantes.add(this);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
    public Pais getPais() {
        return pais;
    }

    public static Fabricante fabricaMayorVentas(){
        Fabricante mas = Fabricante.fabricantes.get(0);
        for(int i = 0; i < Fabricante.fabricantes.size(); i++){
            if (Fabricante.fabricantes.get(i + 1).fabricados > Fabricante.fabricantes.get(i).fabricados){
                mas = Fabricante.fabricantes.get(i + 1);
            }
        }
        return mas;
    }
}
