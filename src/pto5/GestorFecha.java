/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pto5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author candeluchi
 */
public class GestorFecha {

    public int edadEnSemana(Date fecha){
       int semanas = 0;
        Calendar fnac = Calendar.getInstance();
        fnac.set(fecha.getYear() + 1900, fecha.getMonth(), fecha.getDay());
        Calendar hoy = Calendar.getInstance();
        
        long diferencia = hoy.getTimeInMillis() - fnac.getTimeInMillis();
        System.out.println(diferencia);
        // (segundo * minuto * hora * dia * semana)
        semanas = (int) ((diferencia) / (1000 * 60 * 60 * 24 * 7));
        return semanas;   
    }
    public void mostrarFechas(LocalDate fecha1, LocalDate fecha2){        
        
        while (fecha1.isBefore(fecha2)){
            System.out.println(fecha1);
            fecha1 = fecha1.plusDays(1);
        }
    }
    
    public void mostrarDomingo(LocalDate fecha1, LocalDate fecha2){        
        
        while (fecha1.isBefore(fecha2)){
            if (fecha1.getDayOfWeek().getValue() == 7){
                System.out.println(fecha1);    
            }
            fecha1 = fecha1.plusDays(1);

        }
    }    
    
    
    public String mostrarFechaEspañol(LocalDate fecha){        
        String resu;

        //Day of week and month in Spanish
        Locale spanishLocale=new Locale("es", "ES");
        resu = fecha.format(DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy",spanishLocale));
        return resu;

    }    

}
