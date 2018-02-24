/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programacion2_examen1;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author KATHERINE
 */
public class Programacion2_Examen1 {
static Scanner sc=new Scanner(System.in);
static ArrayList list=new ArrayList();
static ArrayList<Archivos> archivos=new ArrayList();
static ArrayList<carpeta> Carpeta=new ArrayList();
static ArrayList<archivo_texto> archivostext=new ArrayList();

//static Date fechacreacion;
//static Date fechamodificacion;
static Date fechacreacion=new Date();
static Date fechamodificacion=new Date();
static carpeta carpeta =new carpeta();
static archivo_texto text=new archivo_texto();
//static String comando1="mkdir",comando2="cat";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //------------------NO DEJAR ESPACIOS ESRE COMANDOS-----------------
         carpeta root = new carpeta();
        carpeta actual;
        actual = root;
        
        char resp='s';
        String nuevo;
        
        System.out.println("Ingrese nombre:");
        String nombre=sc.next();
        System.out.println("Ingrese usuario");
        String usuario=sc.next();
        System.out.println("Capacidad de bytes");
        int bytes=sc.nextInt();
        Date fecha1=fechacreacion;
        String opcion1="";
//        
        
////crear capetaRaiz
while(resp=='s'){
        archivos.add(new carpeta("root", bytes, fechacreacion, fechamodificacion, actual));
        for (int i = 0; i < archivos.size(); i++) {
            
        System.out.print(usuario+"/"+archivos.get(i).getNombre()+" ");
       
        nuevo=sc.next();
        String a="mkdir ",b=".txt",c=".exec",d="cd..",e="cd",f="del",g="Is",h="mod",k="exec";
        if(nuevo.contains(a)){
            
             //crear carpeta
            String nombrecarpeta=nuevo.split(a)[1] ;
            Date fecha=new Date();
            archivos.add(new carpeta(nombrecarpeta, 10, fecha, fecha, actual));
            
        }
        if(nuevo.contains(b)){
            //crear archivo de texto
            //no dejar espacios
            String nom=nuevo.split(b)[0];
            String nombretxt=nom.split("cat")[1];
            Date fecha=new Date();;
            System.out.print("ingrese contenido:");
            String contenido=sc.next();
            archivos.add(new archivo_texto(contenido, nombretxt, 10, fecha, fecha, actual));
        }
        if(nuevo.contains(c)){
            //crear ejecutable
            String nom=nuevo.split(c)[0];
            String nombrexec=nom.split("cat")[1];
            Date fecha=new Date();
             System.out.println("Ingrese sistema operativo al que pertenece");
            String sistemop=sc.next();
            System.out.print("ingrese contenido:");
            String contenido=sc.next();
            String cadena="";
            if(contenido.contains("0")){
                for (int j = 0; j < contenido.length(); j++) {
                    if(contenido.charAt(j)!='0'){
                        cadena+=contenido.charAt(j);
                    }
                }
            }
            System.out.println(cadena);
            archivos.add(new ejecutable(cadena, sistemop, nombrexec,10,fecha, fecha, actual));
            
        }
        if(nuevo.contains(h)){
            //modificar
            String mod=nuevo.split(h)[1] ;
            for (int j = 0; j < archivos.size(); j++) {
                if(Carpeta.get(i).getNombre().equals(mod)){
                    Date fechanueva=carpeta.modificar();
                    ((carpeta)Carpeta.get(i)).setFechamodificacion(fechanueva);
//                   
                }
                if(archivostext.get(i).getNombre().equals(mod)){
                    System.out.println("ingrese nuevo contenido de texto");
                    String newtext=sc.next();
                     Date fechanueva=carpeta.modificar();
                     archivostext.get(i).setFechamodificacion(fechanueva);
                     
                }
            
            
        }
        }
        if(nuevo.contains(k)){
            //
            String exec=nuevo.split(k)[1] ;
        }
            if(nuevo.contains(d)){
                
                
            }
            if(nuevo.contains(e)){
                //CD
                String cd=nuevo.split(e)[1] ;
                      
                
                
            }
        
        if(nuevo.contains(f)){
            //eliminar archivo
             String ar=nuevo.split(f)[1] ;
             for (int j = 0; j < archivos.size(); j++) {
                if(archivos.get(i).getNombre().equals(ar))
                    archivos.remove(j);
             }
             
        }
        if(nuevo.contains(g)){
            String cadena="";
            for (int j = 0; j < archivos.size(); j++) {
                cadena+= archivos.get(i)+"\n";
            }
            System.out.println(cadena);
        }
        
        
        
    }
    }
    }
}



        
    
    


