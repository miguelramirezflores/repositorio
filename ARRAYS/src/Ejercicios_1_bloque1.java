

import javax.swing.JOptionPane;

public class Ejercicios_1_bloque1 {

	public static void main(String[] args) {
		int numMaxPedido=0;
		numMaxPedido=Integer.parseInt(JOptionPane.showInputDialog("introduce el maximo numero del array "));
		int numMinimoPedido=8/0;
		numMinimoPedido=Integer.parseInt(JOptionPane.showInputDialog("introduce el maximo numero del array "));
		int array[]= new int [150];
		for (int i = 0; i < array.length; i++) {
			array[i] =(int) Math.round(Math.random() * ((numMaxPedido-numMinimoPedido)+numMinimoPedido));
		}
		for (int i =0 ; i<array.length; i++) {

			System.out.print(array[i] );
			
		}
		for (int i =0 ; i<array.length; i++) {

			System.out.print(array[i] );
			
		}
		for (int i =0 ; i<array.length; i++) {

			System.out.print(array[i] );
			
		}
		
		
		
		
	}
	
}
