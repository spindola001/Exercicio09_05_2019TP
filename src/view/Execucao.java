package view;

import model.Quadrado;
import model.Circulo;

public class Execucao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quadrado quad = new Quadrado();
		Circulo circ = new Circulo();
		
		quad.setLado(10);
		System.out.println(quad.area());
		
		circ.setRaio(10);
		System.out.println(circ.area());
		
	}

}
