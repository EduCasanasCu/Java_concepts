package Lists.ejerGenerarContratos;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class GeneradorContratos {

    public void crearContrato(String contratoFileName){

        String contrato = cargarContrato(contratoFileName);

        contrato = llenarInfo(contrato, "[COMPANY_NAME]", "Ingrese el nombre de la empresa: ");
        contrato = llenarInfo(contrato, "[CURRENT_DATE]", "Ingrese la fecha del contrato: ");
        contrato = llenarInfo(contrato, "[EMPLOYEE_NAME]", "Ingrese el nombre del empleado: ");
        contrato = llenarInfo(contrato, "[CITY]", "Ingrese la ciudad: ");
        contrato = llenarInfo(contrato, "[job title]", "Ingrese la posicion del empleado: ");
        contrato = llenarInfo(contrato, "[PRICE]", "Ingrese el salario del empleado: ");

        //System.out.println(contrato);
        guardarContrato(contrato);
    }

    private void guardarContrato(String contrato) {

        try{
            Path ruta = Paths.get("src/Lists/ejerGenerarContratos/Contrato_final.txt");
            Files.writeString(ruta, contrato, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
        }
        catch (Exception e){
            System.out.println(e);
        }


    }

    private String llenarInfo(String contrato, String etiqueta, String pregunta) {
        Scanner ingreso = new Scanner(System.in);

        System.out.println(pregunta);

        String ingresoDatos = ingreso.nextLine();

        return contrato.replace(etiqueta,ingresoDatos);
    }


    public String cargarContrato(String fileName){
        StringBuilder content = new StringBuilder();

        try{
            Path ruta = Paths.get(fileName);
            List<String> lineas = Files.readAllLines(ruta);

            for (String linea : lineas) {
                content.append(linea.concat("\n"));
            }
        }
        catch (Exception e){
            System.out.printf("Error: %s%n", e.getMessage());
        }

        return content.toString();
    }
}
