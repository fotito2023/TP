package tpe;

public class Main {

	public static void main(String args[]) {
		Servicios servicios = new Servicios("./src/tpe/datasets/Tareas.csv");
        
		System.out.println("La tarea es:" + servicios.servicio1("T4"));
		System.out.println("Lista de tareas criticas:" + servicios.servicio2(false));
        System.out.println("Lista de tareas en el rango:" + servicios.servicio3(30,75));
		
	}
}
