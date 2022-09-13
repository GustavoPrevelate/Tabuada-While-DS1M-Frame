package br.senai.sp.jandira.model;

public class TabuadaWhileLacos {
	
	public int multiplicando, minMultiplicador, maxMultiplicador;
	public String[] resultados;
	
	public String[] getTabuada() {
		
		int tamanho = maxMultiplicador - minMultiplicador + 1;
		
		resultados = new String[tamanho];
		int contadorinicial = 0;
		int contadorminimo = minMultiplicador;
		while(contadorminimo <= maxMultiplicador) {
			
			resultados[contadorinicial] = multiplicando + " X " + contadorminimo + " = " + multiplicando * contadorminimo; 
			contadorinicial++;
			contadorminimo++;
			
		} return resultados;
		
	}
	
	public void getResultado() {
		
		int contador1 = 0;
		int contador2 = minMultiplicador;
		while(contador2 <= maxMultiplicador) {
			
			System.out.println(resultados[contador1]);
			
			++contador2;
			++contador1;
		}
		
		
	}
	

}