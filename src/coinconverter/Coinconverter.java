/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package coinconverter;

import javax.swing.JOptionPane;

/**
 *
 * @author mireya Peña
 */
public class Coinconverter {

  
    
     private static final  double tasadolar=0.049;
     private static final double tasaeuro=0.047;
     private static final  double tasalibraesterlina=0.041;
     private static final   double tasayenes=6.60;
     private static final   double tasayuanes=0.33;
       
            
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //1 peso equivale a ...
   
        
   menu();
      
                 
       
      
	   
      		
		

	
         
        }
        
    public static void menu(){
         String conversionmenu=JOptionPane.showInputDialog(null,"bienvenido conversor ALURA\n"+"Seleccione conversor:\n"+"1.de peso a  moneda distinta\n"+"2. de moneda distinta a peso\n"+"3.Para temperatura\n"+"4.salir");   

		do {
           
      if(conversionmenu.equals("1")){
        
          conversordepesoamoneda();
          
      }else{
          if(conversionmenu.equals("2")){
          
          conversordemonedaapeso();
         }
         }
              if(conversionmenu.equals("3")){
             conversortemperatura(); 
          } 
                } while (!conversionmenu.equals("4")); //condicion para salir (oculta para el usuario);  
    }    
        
    // String conversionmenu=JOptionPane.showInputDialog("bienvenido conversor ALURA\n"+"Seleccione conversor:\n"+"1.de peso a  moneda distinta\n"+"2. de moneda distinta a peso\n"+"3.Para temperatura\n");   
   
    public static void conversortemperatura() {
        
        double numero;
        double numero1;
       
   
    
       
       String conversion = JOptionPane.showInputDialog(null,"ingrese el tipo de conversion \n 1-Celsius a Farenheit \n 2-Farenheit a Celcius\n 3-menu inicial ");

		if (conversion.equals("1")) {
			 numero = Double.parseDouble((JOptionPane.showInputDialog("Ingrese el valor a convertir")));
                         double farenheit=(numero*9/5)+32;
			JOptionPane.showMessageDialog(null,numero + " grados Celsius es igual a " + farenheit + " grados Farenheit");
		}

                else {
                    if (conversion.equals("2")) {
			 numero1 = Double.parseDouble((JOptionPane.showInputDialog("Ingrese el valor a convertir")));
                         double celcius=(numero1-32)*5/9;
			JOptionPane.showMessageDialog(null,numero1 + " grados Farenheit es igual a " + celcius + " grados Celsius");
		}
                 else {
                    if (conversion.equals("3")) {
			menu();
		}   
                    
                    
                    else {
			JOptionPane.showMessageDialog(null, "ingrese dato valido");
		}
       }
       
       /**/

		
				
    }
    
     }
    
    private static void conversordemonedaapeso() {
     String moneda;
    double valor;
      double resultado=0;  
        
       valor= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor en moneda que desea convertir "));

		moneda = JOptionPane.showInputDialog(null," de que moneda quiere convertir a Pesos-MXN? \n" + "1 Dolar \n" + "2-Euro \n"
				+ "3-libras \n" + "4-Yenes \n" + "5-Yuanes \n"+"6-Salir \n");

             if(moneda.equals("1")|| moneda.equals("2")||moneda.equals("3")|| moneda.equals("4")|| moneda.equals("5")|| moneda.equals("6")){
                 
                 
			switch (moneda) {

			case "1":
				resultado = valor / tasadolar;
				moneda = "Dolar";
				break;
			case "2":
				resultado = valor / tasaeuro;
				moneda = "Euro";
				break;
			case "3":
				resultado = valor / tasalibraesterlina;
				moneda = "libras";
				break;
			case "4":
				resultado = valor /tasayenes;
				moneda = "Yenes";
				break;
			case "5":
				resultado = valor / tasayuanes;
				moneda = "Yuanes";
				break;
                                
                         case "6":
				menu();
				break;       
                                
			}
			JOptionPane.showMessageDialog(null, valor + " de la moneda en pesos es igual a " + resultado + " " + moneda);
		} else {
			JOptionPane.showMessageDialog(null, "error en la seleccion");

		} 
        
        
        
        
        
        
        
       
    } 

    public static void conversordepesoamoneda() {
        
     String moneda;
     double valor;
     double resultado=0;
        
        
       valor= Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el valor en pesos que desea convertir "));

		moneda = JOptionPane.showInputDialog("que moneda quiere convertir a Pesos-MXN? \n" + "1 Dolar \n" + "2-Euro \n"
				+ "3-libras \n" + "4-Yenes \n" + "5-Yuanes \n"+ "6-salir \n");

             if(moneda.equals("1")|| moneda.equals("2")||moneda.equals("3")|| moneda.equals("4")|| moneda.equals("5")|| moneda.equals("6")){
                 
                 
			switch (moneda) {

			case "1":
				resultado = valor * tasadolar;
				moneda = "Dolar";
				break;
			case "2":
				resultado = valor * tasaeuro;
				moneda = "Euro";
				break;
			case "3":
				resultado = valor * tasalibraesterlina;
				moneda = "libras";
				break;
			case "4":
				resultado = valor * tasayenes;
				moneda = "Yenes";
				break;
			case "5":
				resultado = valor * tasayuanes;
				moneda = "Yuanes";
				break;
                         case "6":
				menu();
				break;       
                                
                                
			}
			JOptionPane.showMessageDialog(null, valor + " pesos es igual a " + resultado + " " + moneda);
		} else {
			JOptionPane.showMessageDialog(null, "error en la seleccion");

		}
             }
    
     }
	


        
        
    

