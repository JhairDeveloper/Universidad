/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaunidadi;

import controlador.dao.PersonaDao;
import java.text.SimpleDateFormat;
import java.util.Date;
import modelo.Persona;
import modelo.enums.TipoGenero;

/**
 *
 * @author SONY VAIO
 */
public class PracticaUnidadI {

    /**
     * @param args the command line arguments
     */
    
    // OBJETIVOS: EVALUAR LAS ESTRUCTURA DE DATOS DE TIPO ARREGLO Y LISTAS ENLZADAS
    // RESOLVER HACIENDO ARREGLOS Y LUEGO LISTAS ENLAZADAS
    
    
    // SE QUIERE ALMACENAR LA EDAD, GENERO, NOMBRE DE PERSONAS
    // RECIBIR LA FECHA DEL NACIMIENTO ===> CALCULAR EDAD
    
    // EN UNA TABLA SE DEBERA MOSTRAR LA CLASIFICACION POR JOVEN, NI;O, ADULTO Y TERCERA EDAD
    // EN LA MISMA TABLA SE DEBE ALMACENAR LOS MEDICAMENTOS PARA CADA EDAD ESPECIFICA
    
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Persona p = new Persona("Jhair",TipoGenero.HOMBRE, new Date(2020,10,10));
        System.out.println(p.getFechaNacimiento());
//        System.out.println("FECHAA  " + p.getFechaNacimiento());
//        System.out.println( "edad " + p.getFechaNacimiento().getMonth() + " edad" + p.getEdad());
//        PersonaDao pA = new PersonaDao();
//        pA.setPersona(p);
//        pA.guardar();
//        pA.listar();
    }
    
}
