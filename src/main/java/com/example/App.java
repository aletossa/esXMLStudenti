package com.example;
import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception 
    {
        System.out.println("------------");
        ArrayList<Studente> studenti =new ArrayList<>();
        Studente s1=new Studente(1,"ciccio","bimbo","2022, 11, 16",75);
        Studente s2=new Studente(2,"ciccio","bimbo","2022, 11, 16",80);
        Studente s3=new Studente(3,"ciccio","bimbo","2022, 11, 16",65);
        Studente s4=new Studente(4,"ciccio","bimbo","2022, 11, 16",85);
        
        XmlMapper xmlMapper = new XmlMapper();
        studenti.add(s1);
        studenti.add(s2);
        studenti.add(s3);
        studenti.add(s4);
        
        // Serializzazione     
        xmlMapper.writeValue(new File("test.xml"), studenti);
        String myXml = xmlMapper.writeValueAsString(studenti);
        System.out.println("Oggetto serializzato:" + myXml);
        
        // Deserializzazione        
        /*Studente s2 = xmlMapper.readValue(myXml, Studente.class);
        System.out.println("Oggetto deserializzato da stringa:" + s2.getNome());

        Studente s3 = xmlMapper.readValue(new File("test.xml"), Studente.class);
        System.out.println("Oggetto deserializzato da file: " + s3.getNome());
        */

    }


}
