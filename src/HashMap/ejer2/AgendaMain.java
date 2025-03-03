package HashMap.ejer2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
    Agenda de contactos:
    Desarrolla una aplicacion de agenda de contactos en la que los usuarios puedan agregar nombres
    y numeros de telefono. Implementa funciones para agregar, buscar y eliminar contactos
    utilizando un HASHMAP donde los nombres son las claves y los numeros son los valores.
 */
public class AgendaMain {
    public static void main(String[] args) {

        Map<String,DatosPersona> listaContactos = new HashMap<>();

        Scanner ingreso = new Scanner(System.in);

        for(int i=0; i<2; i++){
            System.out.println("Ingrese el nombre: ");
            String name = ingreso.nextLine();

            System.out.println("Ingrese el numero de telefono: ");
            String tel = ingreso.nextLine();

            System.out.println("Ingrese el dni: ");
            String dni = ingreso.nextLine();

            System.out.println("Ingrese el correo electronico: ");
            String email = ingreso.nextLine();

            DatosPersona infoPersona = new DatosPersona();

            infoPersona.setName(name);
            infoPersona.setEmail(email);
            infoPersona.setTelephone(tel);

            listaContactos.put(dni,infoPersona);
        }

        System.out.println("Ingrese el dni a consultar: ");
        String dniConsultar = ingreso.nextLine();

        DatosPersona personaConsultada = listaContactos.get(dniConsultar);
        System.out.println(personaConsultada.resumen());
    }
}
