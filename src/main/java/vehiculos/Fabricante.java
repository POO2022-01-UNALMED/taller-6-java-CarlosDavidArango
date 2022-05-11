package vehiculos;

import java.util.ArrayList;

public class Fabricante {
    private Pais pais;
    private String nombre;
    private int fabricados;
    public static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();

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

    public int getFabricados() {
        return fabricados;
    }
    public void setFabricados() {
        this.fabricados = fabricados +1;
    }

    public static Fabricante fabricaMayorVentas(){
        Fabricante mas = Fabricante.fabricantes.get(0);
        for(int i = 0; i < Fabricante.fabricantes.size(); i++){
            if (Fabricante.fabricantes.get(i).fabricados > Fabricante.fabricantes.get( i-1 ).fabricados){
                mas = Fabricante.fabricantes.get(i);
            }
        }
        return mas;
    }
}
