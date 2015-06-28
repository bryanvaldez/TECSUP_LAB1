/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tecsup.spring;

import com.tecsup.spring.model.Instrumento;
import com.tecsup.spring.model.Musico;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author alumno
 */
public class Aplicacion {
    public static void main(String[] args) {
        ApplicationContext cntx = new ClassPathXmlApplicationContext("app.xml");
        Aplicacion.ejemplo6(cntx);
             
    }
    public static void ejemplo1(ApplicationContext cntx){
        Musico musico = (Musico) cntx.getBean("musico");
        musico.who();
    }  
    public static void ejemplo2(ApplicationContext cntx){
        Musico musico = (Musico) cntx.getBean("bob");
        musico.who();  
        System.out.println(musico.getCanciones());
    }
    public static void ejemplo3(ApplicationContext cntx){
        Musico musico = (Musico) cntx.getBean("felix");
        musico.who();  
        System.out.println(musico.getCanciones());
        musico.getInstrumento().sonido();
    } 
    public static void ejemplo4(ApplicationContext cntx){
        Musico musico = (Musico) cntx.getBean("roberto");
        musico.who();  
        System.out.println(musico.getCanciones());
    } 
    public static void ejemplo5(ApplicationContext cntx){
        Musico musico = (Musico) cntx.getBean("musico2");
        musico.who();  
        musico.getInstrumento().sonido();
    } 
    public static void ejemplo6(ApplicationContext cntx){
        Musico musico = (Musico) cntx.getBean("musico3");
        musico.who();  
        musico.getInstrumento().sonido();
    } 
    public static void ejemplo7(ApplicationContext cntx){
        Musico musico = (Musico) cntx.getBean("musico4");
        musico.who();  
        List<Instrumento> list = musico.getInstrumentos();
        
    }
    
    
    public static void mensaje(){
        System.out.println("Segundo cambio proyecto");
    }
}
