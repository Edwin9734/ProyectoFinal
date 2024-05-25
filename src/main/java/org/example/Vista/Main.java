package org.example.Vista;


import org.example.Modelo.Contacto;
import org.example.Servicio.Agenda;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        // Agregar contactos
        agenda.agregarContacto("Maria", 12345, "Maria@example.com", LocalDate.of(2000, 4, 1));
        agenda.agregarContacto("Bety", 35354, "bety@example.com", LocalDate.of(2001, 5, 10));
        agenda.agregarContacto("Pedro", 456123, "checo@example.com", LocalDate.of(2004, 4, 2));
        // Añadir más contactos según sea necesario...

        // Mostrar contactos
        System.out.println("Contactos en la agenda:");
        agenda.mostrarContactos();

        // Buscar un contacto
        System.out.println("\nBuscando el contacto de Entrada:");
        Contacto contacto = agenda.buscarContacto("Bety");
        if (contacto != null) {
            System.out.println("Nombre: " + contacto.getNombre() +
                    ", Teléfono: " + contacto.getTelefono() +
                    ", Correo: " + contacto.getCorreoElectronico() +
                    ", Fecha de Nacimiento: " + contacto.getFechaNacimiento());
        } else {
            System.out.println("Contacto no encontrado.");
        }

        // Eliminar un contacto
        System.out.println("\nEliminando el contacto de Daniela y Hector.");
        agenda.eliminarContacto("Maria");
        agenda.eliminarContacto("Bety");

        // Mostrar contactos después de la eliminación
        System.out.println("Contactos en la agenda después de eliminar a Daniela y Hector:");
        agenda.mostrarContactos();
    }
}