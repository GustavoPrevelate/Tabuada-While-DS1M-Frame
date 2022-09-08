package br.senai.sp.jandira;

import java.util.Scanner;

import br.senai.sp.jandira.gui.FrameTabuada;
import br.senai.sp.jandira.model.TabuadaWhileLacos;

public class AppTabuada {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		TabuadaWhileLacos usuario = new TabuadaWhileLacos(); 
	
//		System.out.println("insira o multiplicando:");
//		usuario.multiplicando = leitor.nextInt();
//		
//		System.out.println("insira o mínimo multiplicador:");
//		usuario.mínMultiplicador = leitor.nextInt();
//		
//		System.out.println("insira o máximo multiplicador:");
//		usuario.máxMultiplicador= leitor.nextInt();
//		
//		usuario.getTabuada();
//		usuario.getResultado();
		
		FrameTabuada tela = new FrameTabuada();
		tela.altura = 2000;
		tela.largura = 2000;
		tela.criarTela();
		
		
	}

}