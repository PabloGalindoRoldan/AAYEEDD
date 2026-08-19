package pabloGalindo.tp01.ejercicio2;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String legajo;

    public Estudiante (String nombre, String apellido, String legajo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }

    //getters

    public String getNombre() {
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public String getLegajo(){
        return legajo;
    }

    @Override
    public String toString(){
      return "Estudiante: " + getNombre() + " " + getApellido() + ", Legajo:" + getLegajo();
    }
}
