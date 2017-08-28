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

public class Bola{

	private double jariJari;
	public void setJariJari(double jari){

		this.jariJari = jari;
	}
	//diameter

	public void showDiameter(){
		double Diameter = this.jariJari*2;

		System.out.println("Diameter = "+Diameter);
	}

	//LuasPermukaan

	public void showLPe(){
		double LPe = Math.PI*this.jariJari*jariJari;

		System.out.println("Luas Permukaan = "+LPe); 
	}

	//Volume

	public void showVolume(){
		double Volume = 4*Math.PI*this.jariJari*this.jariJari*this.jariJari/3;

		System.out.println("Volume Bola = "+Volume);
	}
}