/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pto5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author candeluchi
 */
public class pto5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        
        
        //Calculo de semanas desde fecha de nacimiento

        // TODO code application logic here
        GestorFecha gf = new GestorFecha();
        
        //Date fecha = new Date();
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        //fecha = sdf.parse("2018-03-01");
        //System.out.println(gf.edadEnSemana(fecha));
        
        //obtener dias entre fechas
        //LocalDate fecha2 = LocalDate.now();
        //LocalDate fecha1 = LocalDate.parse("29-03-2018", DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        //gf.mostrarFechas(fecha1, fecha2);

        //obtener domingos
        //LocalDate fecha2 = LocalDate.now();
        //LocalDate fecha1 = LocalDate.parse("10-03-2018", DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        //gf.mostrarDomingo(fecha1, fecha2);
        
        //mostrar fecha en español
        LocalDate fecha1 = LocalDate.parse("10-03-2018", DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println(gf.mostrarFechaEspañol(fecha1));    
    }
    
}
