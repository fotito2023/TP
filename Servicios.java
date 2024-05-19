package tpe;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import tpe.utils.CSVReader;
import tpe.utils.Tarea;
//import java.util.Iterator;

/**
 * NO modificar la interfaz de esta clase ni sus métodos públicos.
 * Sólo se podrá adaptar el nombre de la clase "Tarea" según sus decisiones
 * de implementación.
 */
public class Servicios {

    private LinkedList<Tarea>tareas;
    private HashMap<String,Tarea>id;
    private TreeSet<Tarea>prioridad;
    //private LinkedList<Procesador>procesadores;

	/*
     * Expresar la complejidad temporal del constructor.
     */
        //O(n) recorre cada linea que es a su vez es un arreglo de Strings
	public Servicios(String pathTareas){
       
          CSVReader reader = new CSVReader();
	      this.tareas=reader.readTasks(pathTareas);
          this.id=reader.readTasks1(pathTareas);
          this.prioridad=reader.readTasks2(pathTareas);
          //this.procesadores=reader.readProcessors(pathProcesadores);
        }
	/*
     * Expresar la complejidad temporal del servicio 1.
     */ 
        //O(1) constante no recorre, devuelve la tarea de la clave pasada por parametro
	public Tarea servicio1(String ID) {	
            return id.get(ID);
        }
    
    /*
     * Expresar la complejidad temporal del servicio 2.
     */
        //O(n) recorre una sola vez todos los elemntos de la lista
	public List<Tarea> servicio2(boolean Critica) {
            LinkedList<Tarea>resultado=new LinkedList<>();
            for(Tarea Tarea:tareas){
                if(Tarea.getCritica()==Critica){
                    resultado.add(Tarea);
                }
            }
        return resultado;    
        }
    /*
     * Expresar la complejidad temporal del servicio 3.
     */
        //El arbol esta ordenado en forma ascendente por prioridad, por lo que buscar entre un rango de valores es mas rapido.
	public List<Tarea> servicio3(int prioridadInferior, int prioridadSuperior) {
            LinkedList<Tarea>resultado=new LinkedList<>();
			//Iterator <Tarea> iterador=prioridad.iterator();
            //Tarea t=iterador.next();
            //Integer pri=t.getPrioridad();

			//while(iterador.hasNext()){
                //if(pri>prioridadInferior && pri<prioridadSuperior){
                 //   resultado.add(t);
              // }
			//}
            for(Tarea tarea:prioridad){
               if(tarea.getPrioridad()>prioridadInferior && tarea.getPrioridad()<prioridadSuperior){
               resultado.add(tarea);
               }
            }
        return resultado;
        }
}
