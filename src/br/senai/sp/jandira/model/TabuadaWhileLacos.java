package br.senai.sp.jandira.model;

public class TabuadaWhileLacos {
	
	public int multiplicando, mínMultiplicador, máxMultiplicador;
	public String[] resultados;
	
	public void getTabuada() {
		
		int tamanho = máxMultiplicador - mínMultiplicador + 1;
		
		resultados = new String[tamanho];
		int contadorinicial = 0;
		int contadorminimo = mínMultiplicador;
		while(contadorminimo <= máxMultiplicador) {
			
			resultados[contadorinicial] = multiplicando + " X " + contadorminimo + " = " + multiplicando * contadorinicial; 
			contadorinicial++;
			contadorminimo++;
			
		}
		
	}
	
	public void getResultado() {
		
		int contador1 = 0;
		int contador2 = mínMultiplicador;
		while(contador2 <= máxMultiplicador) {
			
			System.out.println(resultados[contador1]);
			
			++contador2;
			++contador1;
		}
		
		
	}
	

}