package tpe.utils;

public class Tarea implements Comparable<Tarea>{
    private String id;
    private String nombre;
    private int tiempo;
    private boolean critica;
    private int prioridad;
    
    public Tarea(String id,String nombre,int tiempo,boolean critica,int prioridad){
        this.id=id;
        this.nombre=nombre;
        this.tiempo=tiempo;
        this.critica=critica;
        this.prioridad=prioridad;
    }
    public String getid(){
        return this.id;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getTiempo(){
        return this.tiempo;
    }
    public boolean getCritica(){
        return this.critica;
    }
    public int getPrioridad(){
        return this.prioridad;
    }
    public String toString(){
        return "\n tare:" + id +"," + nombre + "," + tiempo + "," + critica + "," + prioridad;
    }
    @Override
    public int compareTo(Tarea t) {
       return prioridad-t.prioridad;
    }
}
