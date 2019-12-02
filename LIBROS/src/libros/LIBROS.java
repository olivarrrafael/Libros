
package libros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LIBROS {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        Biblioteca ejemplar = new Biblioteca();
        ArrayList<Biblioteca>listaLibros = new ArrayList<>();
        ejemplar.cargarEstante(listaLibros);
        ejemplar.ordenarLibros(listaLibros); 
//        System.out.println("Ingrese codigo de libro a eliminar: ");
//        int codLibro =tc.nextInt();
       // ejemplar.eliminarLibro(listaLibros, codLibro);
       
        List<Biblioteca> mostrar = ejemplar.MostrarLibro(listaLibros);
        
        for (int i = 0; i < mostrar.size(); i++) {
            Biblioteca get = mostrar.get(i);
            System.out.println("Codigo de libro: "+ get.getCodigo()+ " \nN° de estante: "+ get.getNumeroEstante()+ " \nNombre del libro: "+ get.getNombreLibro());
            
        }
        
//        System.out.println("Ingrese el codigo del libro que desea buscar: ");
//        int cod =tc.nextInt();
        
        //ejemplar.Encontrar(mostrar,cod);
        
        Object objMay = new Object();
        objMay = ejemplar.mostrarMayorPrecio(mostrar).getPrecio();
        System.out.println("\n Libro con mayor precio: "+ objMay);
        
        
    }
    
    
}
