package libros;

import java.util.List;
import java.util.Scanner;

public class Biblioteca {

    private String nombreLibro;
    private int codigo;
    private int NumeroEstante;
    private int precio;

    public Biblioteca() {
    }

    public Biblioteca(String nombreLibro, int codigo, int NumeroEstante, int precio) {
        this.nombreLibro = nombreLibro;
        this.codigo = codigo;
        this.NumeroEstante = NumeroEstante;
        this.precio = precio;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public void setNombreLibro(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumeroEstante() {
        return NumeroEstante;
    }

    public void setNumeroEstante(int NumeroEstante) {
        this.NumeroEstante = NumeroEstante;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void cargarEstante(List<Biblioteca> libro) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del arreglo: ");
        int tamanio = sc.nextInt();

        for (int i = 0; i < tamanio; i++) {
            Scanner tc = new Scanner(System.in);
            System.out.println("Ingrese el codigo del libro: ");
            int codigoLibro = tc.nextInt();

            System.out.println("Ingrese el nombre del libro: ");
            String nombreLib = tc.next();

            System.out.println("Ingrese el numero de estante: ");
            int numEstante = tc.nextInt();

            System.out.println("Ingrese el precio del libro: ");
            int precios = tc.nextInt();

            Biblioteca ejemplar = new Biblioteca(nombreLib, codigoLibro, numEstante, precios);
            libro.add(ejemplar);
        }
    }

    public List<Biblioteca> eliminarLibro(List<Biblioteca> libro, int codigo) {
        for (int i = 0; i < libro.size(); i++) {
            if (libro.get(i).getCodigo() == codigo) {
                libro.remove(i);
            }

        }
        return libro;
    }

    public List<Biblioteca> MostrarLibro(List<Biblioteca> libro) {
        return libro;
    }

    public List<Biblioteca> Encontrar(List<Biblioteca> libro, int codigo) {
        for (int i = 0; i < libro.size(); i++) {
            boolean Encontrado = true;
            if (libro.get(i).getCodigo() == codigo) {
                Encontrado = true;
                System.out.println("Encontrado: " + Encontrado);

            } else {

                System.out.println(Encontrado);
            }

        }
        return libro;

    }

    public Biblioteca mostrarMayorPrecio(List<Biblioteca> libro) {
        Biblioteca mayor = libro.get(0);
        for (int i = 0; i < libro.size(); i++) {
            if (libro.get(i).getPrecio() > mayor.getPrecio()) {
                mayor = libro.get(i);
            }

        }
        return mayor;

    }

    public List<Biblioteca> ordenarLibros(List<Biblioteca> libro) {
        boolean intercambio = false;
        Object temp;

        for (int i = 0; i < libro.size(); i++) {
            intercambio = false;
            for (int j = libro.size() - 1; j > i; j--) {
                if (libro.get(j).getNombreLibro().compareTo(libro.get(j - 1).getNombreLibro()) < 0) {
                    temp = libro.get(j);
                    libro.set(j, libro.get(-1));
                    libro.set(j - 1, (Biblioteca) temp);
                    intercambio = true;
                }
            }
            if (!intercambio) {
                break;
            }

        }
        return libro;

    }
}
