/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Variables;

/**
 *
 * @author Andres gamarra torre
 */
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Final {
    String Hora;
    String Nombre;
    int Trayecto, Transporte, Ruta;
    float Velpro, Rut1=14, Rut2=7, Rut3=12;
    String A1=("Terminal-Centro");
    String A2=("4 Vientos-Terminal");
    String A3=("Mercado-Terminal");
    String T1=("Moto");
    String T2=("Carro");
    String T3=("Transporte Alternativo");
    String R1=("AV. Pedro De Heredia");
    String R2=("AV. Pedro Romero");
    String R3=("AV. Bosque");
    String Tra,Vehiculo,Destino;
    int H;
    float TiR1;
    float TiR2;
    float TiR3;
        
 public void Ingresarnombres(){
 JOptionPane.showMessageDialog(null,"BIENVENIDOS A LA APP");
        Nombre=JOptionPane.showInputDialog("INGRESE SU NOMBRE");
        JOptionPane.showMessageDialog(null,"" +Nombre);
        while(Nombre.isEmpty()){JOptionPane.showMessageDialog(null,"Debe llenar todos los campos");
        Nombre=JOptionPane.showInputDialog("INGRESE SU NOMBRE");}
 
 }
        
    
    
    
    
 public void trayectoaelegir (){
JOptionPane.showMessageDialog(null,"TRAYECTOS PREDEFINIDOS POR LA APP");
        JOptionPane.showMessageDialog(null,"1. Terminal-Centro\n "
                
                + " 2. 4 Vientos-Terminal\n"
                
                + " 3. Mercado-Terminal");
        Tra=JOptionPane.showInputDialog("INGRESE UN TRAYECTO 1-3 ");
        Trayecto=Integer.parseInt(Tra);
        
        while(Trayecto <1 || Trayecto >3 ){JOptionPane.showMessageDialog(null,"INGRESE UN NUMERO DE TRAYECTO VALIDO");
        Tra=JOptionPane.showInputDialog("INGRESE UN TRAYECTO 1-3 ");
        Trayecto=Integer.parseInt(Tra);
        }
        if(Trayecto==1){JOptionPane.showMessageDialog(null,"USTED ELIGIO "+A1);}
        else if(Trayecto==2){JOptionPane.showMessageDialog(null,"USTED ELIGIO "+A2);}
        else if(Trayecto==3){JOptionPane.showMessageDialog(null,"USTED ELIGIO "+A3);}}
 
 public void ingresarhora (){
Hora=JOptionPane.showInputDialog("INGRESE LA HORA ACTUAL ");
        H=Integer.parseInt(Hora);
        while(H<0 || H>23){JOptionPane.showMessageDialog(null,"INGRESE UNA HORA CORRECTA");
        Hora=JOptionPane.showInputDialog("INGRESE LA HORA ACTUAL ");
        H=Integer.parseInt(Hora);
        }
        if(H>4 && H<9){JOptionPane.showMessageDialog(null,"ES HORA PICO");}
        else if(H>=16 && H<=21){JOptionPane.showMessageDialog(null,"ES HORA PICO");}
        else{JOptionPane.showMessageDialog(null,"NO ES HORA PICO");}}
 
 
 public void eligirtrans (){
JOptionPane.showMessageDialog(null,"ELIJA EL MEDIO DE TRANSPORTE A UTILIZAR");
        JOptionPane.showMessageDialog(null,"1. Moto\n"
                + " 2. Carro\n"
                + " 3. Transporte Alternativo");
        
        Vehiculo=JOptionPane.showInputDialog("INGRESE EL MEDIO DE TRANSPORTE A UTILIZAR 1-3 ");
        Transporte=Integer.parseInt(Vehiculo);
        while(Transporte <1 || Transporte >3 ){JOptionPane.showMessageDialog(null,"INGRESE UN NUMERO DE VEHICULO VALIDO");
        Vehiculo=JOptionPane.showInputDialog("INGRESE EL MEDIO DE TRANSPORTE A UTILIZAR 1-3 ");
        Transporte=Integer.parseInt(Vehiculo);
        }
        if(Transporte==1){JOptionPane.showMessageDialog(null,"USTED ELIGIO "+T1);}
        else if(Transporte==2){JOptionPane.showMessageDialog(null,"USTED ELIGIO "+T2);}
        else if(Transporte==3){JOptionPane.showMessageDialog(null,"USTED ELIGIO "+T3);}

}
 
 
 public void eleigrut(){
JOptionPane.showMessageDialog(null,"ELIJA LA RUTA DE SU PREFERENCIA");
        JOptionPane.showMessageDialog(null,"1. AV. PEDRO DE HERERIA \n"
                + ""+" 2. AV. PEDRO ROMERO \n" 
                + " 3. AV. BOSQUE");
        
         Destino=JOptionPane.showInputDialog("INGRESE EL NUMERO DE RUTA ");
         Ruta=Integer.parseInt(Destino);
         while(Ruta <1 || Ruta >3 ){JOptionPane.showMessageDialog(null,"INGRESE UN NUMERO DE RUTA VALIDO");
         Destino=JOptionPane.showInputDialog("INGRESE EL NUMERO DE RUTA ");
         Ruta=Integer.parseInt(Destino);
        }
        if(Ruta==1){JOptionPane.showMessageDialog(null,"USTED ELIGIO "+R1);}
        else if(Ruta==2){JOptionPane.showMessageDialog(null,"USTED ELIGIO "+R2);}
        else if(Ruta==3){JOptionPane.showMessageDialog(null,"USTED ELIGIO "+R3);}
        }



public void velo(){
 String Vel=JOptionPane.showInputDialog("INGRESE LA VELOCIDAD PROMEDIO DEL VEHICULO ");
        Velpro=Integer.parseInt(Vel);
        
        TiR1=(Rut1/Velpro);
        TiR2=(Rut2/Velpro);
        TiR3=(Rut3/Velpro);


}

public void mostrarsug(){
JOptionPane.showMessageDialog(null,"ACONTINUACION SE MOSTRARA LA RUTA MAS RAPIDA SEGUN LA APP");
        if(Trayecto==1 && Transporte==1 && Ruta==1 || H<16 ){JOptionPane.showMessageDialog(null,"LA APP LE RECOMIENDA ELEGIR LA RUTA DE "+R2);
        JOptionPane.showMessageDialog(null,"EL TIEMPO APROXIMADO EN CARRETERA ES DE "+TiR1);}
        else if(Trayecto==2 && Transporte==1 && Ruta==1 || H>8 ){JOptionPane.showMessageDialog(null,"LA APP LE RECOMIENDA ELEGIR LA RUTA DE "+R1);
        JOptionPane.showMessageDialog(null,"EL TIEMPO APROXIMADO EN CARRETERA ES DE "+TiR2);}
        else if(Trayecto==3 && Transporte==1 && Ruta==1 || H>4 ){JOptionPane.showMessageDialog(null,"LA APP LE RECOMIENDA ELEGIR LA RUTA "+R3);
        JOptionPane.showMessageDialog(null,"EL TIEMPO APROXIMADO EN CARRETERA ES DE "+TiR3);}
        else if(Trayecto==1 && Transporte==2 && Ruta==1 || H>15 ){JOptionPane.showMessageDialog(null,"LA APP LE RECOMIENDA ELEGIR LA RUTA DE "+R1);
        JOptionPane.showMessageDialog(null,"EL TIEMPO APROXIMADO EN CARRETERA ES DE "+TiR1);}
        else if(Trayecto==1 && Transporte==3 && Ruta==1 || H>1 ){JOptionPane.showMessageDialog(null,"LA APP LE RECOMIENDA ELEGIR LA RUTA DE "+R2);
        JOptionPane.showMessageDialog(null,"EL TIEMPO APROXIMADO EN CARRETERA ES DE "+TiR1);}
        else if(Trayecto==1 && Transporte==1 && Ruta==2 || H>5 ){JOptionPane.showMessageDialog(null,"USTED ELIGIO LA RUTA MAS RAPIDA SEGUN LA APP");
        JOptionPane.showMessageDialog(null,"EL TIEMPO APROXIMADO EN CARRETERA ES DE "+TiR1);}
        else if(Trayecto==1 && Transporte==1 && Ruta==3 || H>19 ){JOptionPane.showMessageDialog(null,"LA APP LE RECOMIENDA ELEGIR LA RUTA DE "+R2);
        JOptionPane.showMessageDialog(null,"EL TIEMPO APROXIMADO EN CARRETERA ES DE "+TiR1);}
        else if(Trayecto==2 && Transporte==2 && Ruta==1 || H>10 ){JOptionPane.showMessageDialog(null,"LA APP LE RECOMIENDA ELEGIR LA RUTA DE "+R1);
        JOptionPane.showMessageDialog(null,"EL TIEMPO APROXIMADO EN CARRETERA ES DE "+TiR2);}
        else if(Trayecto==2 && Transporte==3 && Ruta==1 || H>21 ){JOptionPane.showMessageDialog(null,"USTED HA ELEGIDO LA RUTA MAS RAPIDA "+R2);
        JOptionPane.showMessageDialog(null,"EL TIEMPO APROXIMADO EN CARRETERA ES DE "+TiR2);}
        else if(Trayecto==2 && Transporte==1 && Ruta==2 || H>2 ){JOptionPane.showMessageDialog(null,"LA APP LE RECOMIENDA ELEGIR LA RUTA DE "+R1);
        JOptionPane.showMessageDialog(null,"EL TIEMPO APROXIMADO EN CARRETERA ES DE "+TiR2);}
        else if(Trayecto==2 && Transporte==1 && Ruta==3 || H>10 ){JOptionPane.showMessageDialog(null,"LA APP LE RECOMIENDA ELEGIR LA RUTA DE "+R2);
        JOptionPane.showMessageDialog(null,"EL TIEMPO APROXIMADO EN CARRETERA ES DE "+TiR2);}
        else if(Trayecto==3 && Transporte==2 && Ruta==1 || H>4 ){JOptionPane.showMessageDialog(null,"LA APP LE RECOMIENDA ELEGIR LA RUTA DE "+R3);
        JOptionPane.showMessageDialog(null,"EL TIEMPO APROXIMADO EN CARRETERA ES DE "+TiR3);}
        else if(Trayecto==3 && Transporte==3 && Ruta==1 || H>20 ){JOptionPane.showMessageDialog(null,"LA APP LE RECOMIENDA ELEGIR LA RUTA DE "+R2);
        JOptionPane.showMessageDialog(null,"EL TIEMPO APROXIMADO EN CARRETERA ES DE "+TiR3);}
        else if(Trayecto==3 && Transporte==1 && Ruta==2 || H>18 ){JOptionPane.showMessageDialog(null,"USTED HA ELEGIDO LA RUTA MAS RAPIDA "+R2);
        JOptionPane.showMessageDialog(null,"EL TIEMPO APROXIMADO EN CARRETERA ES DE "+TiR3);}
        else if(Trayecto==3 && Transporte==1 && Ruta==3 || H>14 ){JOptionPane.showMessageDialog(null,"USTED HA ELEGIDO LA RUTA MAS RAPIDA "+R1);
        JOptionPane.showMessageDialog(null,"EL TIEMPO APROXIMADO EN CARRETERA ES DE "+TiR3);}




}





}
 

 
 
 
 

