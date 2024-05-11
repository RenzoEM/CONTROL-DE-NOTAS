
package Datos;

import Entidad.Matricula;
import Entidad.Nota;
import Entidad.Usuario;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Lecturatxt {
    public List<Matricula> leerEst() {
        List<Matricula> listaEst = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("estudiante.txt"))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                int celular = Integer.parseInt(datos[1]);
                int edad = Integer.parseInt(datos[2]);
                int dni = Integer.parseInt(datos[4]);
                Matricula estu = new Matricula(datos[0], celular, edad, datos[3], dni);
                listaEst.add(estu);
            }
        } catch (IOException e) {
            System.out.println("Error al intentar leer el archivo " + "estudiante.txt");
        }

        return listaEst;
    }

   public List<Nota> leerNota() {
    List<Nota> listaNotaTemp = new ArrayList<>();

    try (BufferedReader reader = new BufferedReader(new FileReader("notas.txt"))) {
        String linea;
        while ((linea = reader.readLine()) != null) {
            String[] datos = linea.split(",");
            int dni = Integer.parseInt (datos[0]);
            int calif= Integer.parseInt (datos[2]);
            Nota nota = new Nota(dni, datos[1], calif, datos[3]);
            listaNotaTemp.add(nota);
        }
    } catch (IOException e) {
        System.out.println("Error al intentar leer el archivo " + "notas.txt");
    }

    return listaNotaTemp;
}
   /*public List<Usuario> leerUsuarios(){
       List<Usuario> listaUsuarios = new ArrayList<>();

    try (BufferedReader reader = new BufferedReader(new FileReader("usuario.txt"))) {
        String linea;
        while ((linea = reader.readLine()) != null) {
            String[] datos = linea.split(",");
            
            Usuario usuario = new Usuario(datos[0], datos[1], datos[2]);
            listaUsuarios.add(usuario);
        }
    } catch (IOException e) {
        System.out.println("Error al intentar leer el archivo " + "usuario.txt");
    }

    return listaUsuarios;
   }*/



}
