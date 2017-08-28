/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author AdityaHarisCandra
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
	
	double jari = 7; //nilai jari

	System.out.println("Jari - jari : "+jari);

	Bola Bundar = new Bola();

	//memanggil melalui objeck

	Bundar.setJariJari(jari);

	Bundar.showDiameter();

	Bundar.showLPe();

	Bundar.showVolume();
	}
    
}
