package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.*;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JFrame;

public class FrameTabuada {

	public String titulo;
	public int largura;
	public int altura;
	public void criarTela() {
		
		JFrame tela = new JFrame();
		tela.setTitle("Tabuada");
		tela.setSize(720, 720);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLocationRelativeTo(null);
		tela.setLayout(null);
		
		Container painel = tela.getContentPane();
		
		JLabel labelTabuada = new JLabel();
		labelTabuada.setText("Tabuada 1.0");
		labelTabuada.setFont(new Font ("Cooper Black", Font.BOLD,30));
		labelTabuada.setForeground(new Color(255, 0, 0));
		labelTabuada.setBounds(40, 30, 300, 35);
		
		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando:");
		labelMultiplicando.setFont(new Font ("Cooper Black", Font.BOLD,20));
		labelMultiplicando.setBounds(150, 90, 600, 25);

		JTextField textFieldMultiplicando = new JTextField();
		textFieldMultiplicando.setBounds(300, 90, 150, 30);
		textFieldMultiplicando.setForeground(Color.BLACK);
		
		JLabel labelMinMultiplicador = new JLabel();
		labelMinMultiplicador.setText("Mínimo Multiplicador:");
		labelMinMultiplicador.setFont(new Font ("Cooper Black", Font.BOLD,20));
		labelMinMultiplicador.setBounds(80, 150, 600, 25);

		JTextField textFieldMinMultiplicador = new JTextField();
		textFieldMinMultiplicador.setBounds(300, 150, 150, 30);
		textFieldMinMultiplicador.setForeground(Color.BLACK);
		
		JLabel labelMaxMultiplicador = new JLabel();
		labelMaxMultiplicador.setText("Máximo Multiplicador:");
		labelMaxMultiplicador.setFont(new Font ("Cooper Black", Font.BOLD,20));
		labelMaxMultiplicador.setBounds(78, 210, 600, 25);

		JTextField textFieldMaxMultiplicador = new JTextField();
		textFieldMaxMultiplicador.setBounds(300, 210, 150, 30);
		textFieldMaxMultiplicador.setForeground(Color.BLACK);
		
		JButton ButtonCalcular = new JButton();
		ButtonCalcular.setText("Calcular");
		ButtonCalcular.setBounds(80, 280, 220, 45);
		ButtonCalcular.setFont(new Font ("Cooper Black", Font.BOLD,18));
		ButtonCalcular.setForeground(new Color(0, 0, 0));
		
		JButton ButtonLimpar = new JButton();
		ButtonLimpar.setText("Limpar");
		ButtonLimpar.setBounds(310, 280, 140, 45);
		ButtonLimpar.setFont(new Font ("Cooper Black", Font.BOLD,18));
		ButtonLimpar.setForeground(new Color(0, 0, 0));
		
		JLabel labelResultado = new JLabel();
		labelResultado.setText("Resultado:");
		labelResultado.setFont(new Font ("Cooper Black", Font.BOLD,20));
		labelResultado.setBounds(80, 340, 150, 25);
		
		
		painel.add(labelTabuada);
		painel.add(labelMultiplicando);
		painel.add(textFieldMultiplicando);
		painel.add(labelMinMultiplicador);
		painel.add(textFieldMinMultiplicador);
		painel.add(labelMaxMultiplicador);
		painel.add(textFieldMaxMultiplicador);
		painel.add(ButtonCalcular);
		painel.add(ButtonLimpar);
		painel.add(labelResultado);
		
		tela.setVisible(true);

	}
}