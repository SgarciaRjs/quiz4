/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quiz4;

/**
 *
 * @author Casa
 */
public class Quiz4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenido al programa que muestra la infromacion del top 10 de spotify!!");
		
		Cancion CancionesTop10[]=new Cancion[10];
		
		  // Inicializar 10 canciones
		CancionesTop10[0] = new Cancion(1, "Song 1", "Artist 1", 3.5, 2022);
		CancionesTop10[1] = new Cancion(2, "Song 2", "Artist 2", 4.2, 2021);
		CancionesTop10[2] = new Cancion(3, "Song 3", "Artist 3", 3.8, 2020);
		CancionesTop10[3] = new Cancion(4, "Song 4", "Artist 4", 5.1, 2023);
		CancionesTop10[4] = new Cancion(5, "Song 5", "Artist 5", 4.5, 2022);
		CancionesTop10[5] = new Cancion(6, "Song 6", "Artist 6", 3.0, 2021);
		CancionesTop10[6] = new Cancion(7, "Song 7", "Artist 7", 4.8, 2020);
		CancionesTop10[7] = new Cancion(8, "Song 8", "Artist 8", 3.9, 2023);
		CancionesTop10[8] = new Cancion(9, "Song 9", "Artist 9", 4.0, 2022);
		CancionesTop10[9] = new Cancion(10, "Song 10", "Artist 10", 3.7, 2021);
        
        
		  // Canciones anteriores al año actual
        System.out.println("\nCanciones anteriores al anno actual:");
        int annoActual = 2023;
        for (Cancion cancion : CancionesTop10) {
            if (cancion != null && cancion.getAnnoCreacion() < annoActual) {
                cancion.mostrarInformacion();
            }
        }
		
        
     // Canciones del año actual
        System.out.println("\nCanciones del anno actual:");
        for (Cancion cancion : CancionesTop10) {
            if (cancion != null && cancion.getAnnoCreacion() == annoActual) {
                cancion.mostrarInformacion();
            }
        }
        
        
     // Canciones posteriores al año actual
        System.out.println("\nCanciones posteriores al anno actual:");
        for (Cancion cancion : CancionesTop10) {
            if (cancion != null && cancion.getAnnoCreacion() > annoActual) {
                cancion.mostrarInformacion();
            }
        }

        
        // Canción de mayor duración
        System.out.println("\nCancion de mayor duracion:");
        Cancion cancionMayorDuracion = encontrarCancionMayorDuracion(CancionesTop10);
        if (cancionMayorDuracion != null) {
            cancionMayorDuracion.mostrarInformacion();
        }

        
        
        // Autor de la canción que está en la primera posición
        System.out.println("\nAutor de la cancion en la primera posicion:");
        if (CancionesTop10[0] != null) {
            System.out.println(CancionesTop10[0].getAutor());
        }
        
        
        
        // Mostrar todas las canciones
        System.out.println("\nTodas las canciones:");
        for (Cancion cancion : CancionesTop10) {
            if (cancion != null) {
                cancion.mostrarInformacion();
            }
        }
        
        
    }

	
      
      
    // Método para encontrar la canción de mayor duración
    private static Cancion encontrarCancionMayorDuracion(Cancion[] canciones) {
        Cancion mayorDuracion = null;
        double duracionMaxima = 0;

        for (Cancion cancion : canciones) {
            if (cancion != null && cancion.getDuracion() > duracionMaxima) {
                mayorDuracion = cancion;
                duracionMaxima = cancion.getDuracion();
            }
        }

        return mayorDuracion;
    }

    private static class Cancion {

        public Cancion() {
        }

        private Cancion(int i, String song_1, String artist_1, double d, int i0) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void mostrarInformacion() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private int getAnnoCreacion() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private boolean getAutor() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private double getDuracion() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
    
}
