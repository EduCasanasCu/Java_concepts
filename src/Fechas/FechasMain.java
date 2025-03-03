package Fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class FechasMain {
    public static void main(String[] args) {

        LocalDate fecha = LocalDate.now(); //yyyy-mm-dd
        System.out.println(fecha);
        LocalDate fechaAumentada = fecha.plusDays(5);
        System.out.println(fechaAumentada);

        LocalTime hora = LocalTime.now();
        System.out.println(hora);

        LocalDateTime fechaHora = LocalDateTime.now();
        System.out.println(fechaHora);

        DateTimeFormatter  formatFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
        String fechaFormateada = fechaHora.format(formatFecha);
        System.out.println(fechaFormateada);

        LocalDateTime fecha2 = LocalDateTime.of(2023,9,12,12, 05);

        if(fecha2.isBefore(fechaHora)){
            System.out.println("La fecha: "+fecha2+" está antes de la fecha " + fechaHora);
        }

    }
}
