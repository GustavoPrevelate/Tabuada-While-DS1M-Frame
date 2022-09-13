package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.tools.Tool;

import br.senai.sp.jandira.model.TabuadaWhileLacos;

import javax.swing.JFrame;

public class FrameTabuada {

	public String titulo;
	public int largura;
	public int altura;
	public void criarTela() {
		
		JFrame tela = new JFrame();
		tela.setTitle("Tabuada");
		tela.setSize(620, 820);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLocationRelativeTo(null);
		tela.setLayout(null);
		tela.setResizable(false);
		
		Container painel = tela.getContentPane();
		
		ImageIcon calculadoraimagem = new ImageIcon(getClass().getResource("calculadora_icon.png"));
		JLabel calculadora = new JLabel(calculadoraimagem);
		calculadora.setBounds(-40, 0, 300, 80);
		painel.add(calculadora);

		
		
		JLabel labelTabuada = new JLabel();
		labelTabuada.setText("Tabuada 1.0");
		labelTabuada.setFont(new Font ("Cooper Black", Font.BOLD,30));
		labelTabuada.setForeground(new Color(255, 0, 0));
		labelTabuada.setBounds(150, 30, 300, 35);
		
		JLabel labelSubTitulo = new JLabel();
		labelSubTitulo.setText("Com a tabuada 1.0 os seus problemas acabaram.");
		labelSubTitulo.setFont(new Font ("Cooper Black", Font.BOLD,20));
		labelSubTitulo.setForeground(new Color(105,105,105));
		labelSubTitulo.setBounds(90, 80, 1200, 25);
		
		JLabel labelSubTitulo2 = new JLabel();
		labelSubTitulo2.setText("Calcule a tabuada que desejar em segundos!");
		labelSubTitulo2.setFont(new Font ("Cooper Black", Font.BOLD,20));
		labelSubTitulo2.setForeground(new Color(105,105,105));
		labelSubTitulo2.setBounds(90, 100, 1200, 25);
		
		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando :");
		labelMultiplicando.setFont(new Font ("Cooper Black", Font.BOLD,20));
		labelMultiplicando.setBounds(162, 150, 600, 25);

		JTextField textFieldMultiplicando = new JTextField();
		textFieldMultiplicando.setBounds(330, 150, 150, 30);
		textFieldMultiplicando.setForeground(Color.BLACK);
		
		JLabel labelMinMultiplicador = new JLabel();
		labelMinMultiplicador.setText("Mínimo Multiplicador :");
		labelMinMultiplicador.setFont(new Font ("Cooper Black", Font.BOLD,20));
		labelMinMultiplicador.setBounds(80, 210, 600, 25);

		JTextField textFieldMinMultiplicador = new JTextField();
		textFieldMinMultiplicador.setBounds(330, 210, 150, 30);
		textFieldMinMultiplicador.setForeground(Color.BLACK);
		
		JLabel labelMaxMultiplicador = new JLabel();
		labelMaxMultiplicador.setText("Máximo Multiplicador :");
		labelMaxMultiplicador.setFont(new Font ("Cooper Black", Font.BOLD,20));
		labelMaxMultiplicador.setBounds(78, 270, 600, 25);

		JTextField textFieldMaxMultiplicador = new JTextField();
		textFieldMaxMultiplicador.setBounds(330, 270, 150, 30);
		textFieldMaxMultiplicador.setForeground(Color.BLACK);
		
		JButton ButtonCalcular = new JButton();
		ButtonCalcular.setText("Calcular");
		ButtonCalcular.setBounds(80, 340, 250, 45);
		ButtonCalcular.setFont(new Font ("Cooper Black", Font.BOLD,18));
		ButtonCalcular.setForeground(new Color(255, 255, 255));
		ButtonCalcular.setBackground(Color.green);
		
		JButton ButtonLimpar = new JButton();
		ButtonLimpar.setText("Limpar");
		ButtonLimpar.setBounds(340, 340, 140, 45);
		ButtonLimpar.setFont(new Font ("Cooper Black", Font.BOLD,18));
		ButtonLimpar.setForeground(new Color(255, 255, 255));
		ButtonLimpar.setBackground(Color.orange);
		
		JLabel labelResultado = new JLabel();
		labelResultado.setText("Resultado:");
		labelResultado.setFont(new Font ("Cooper Black", Font.BOLD,20));
		labelResultado.setBounds(80, 400, 150, 25);
		
		JList<String> lista = new JList<String>();
		JScrollPane scroll = new JScrollPane(lista);
		
		scroll.setBounds( 80, 460, 400, 250 );
		
		lista.setBackground(Color.ORANGE);
		lista.setForeground(Color.white);
		
		textFieldMultiplicando.addKeyListener(new KeyListener() {
			
			@Override
			public void keyReleased(KeyEvent e) {
				textFieldMultiplicando.setText(textFieldMultiplicando.getText().replaceAll( "[^0-9]" , ""));
			if(textFieldMultiplicando.getText().length() > 9) {
						
			JOptionPane.showMessageDialog(null, "Valor excedido","ERRO",JOptionPane.ERROR_MESSAGE);
			textFieldMultiplicando.setText(textFieldMultiplicando.getText().replaceAll( "[0-9]" , ""));

					}
				}

				@Override
				public void keyTyped(KeyEvent e) {
					// TODO Auto-generated method stub

				}

				@Override
				public void keyPressed(KeyEvent e) {
					// TODO Auto-generated method stub

				}

			});
		
		textFieldMinMultiplicador.addKeyListener(new KeyListener() {
			
			@Override
			public void keyReleased(KeyEvent e) {
			textFieldMinMultiplicador.setText(textFieldMinMultiplicador.getText().replaceAll( "[^0-9]" , ""));
			if(textFieldMinMultiplicador.getText().length() > 9) {
						
			JOptionPane.showMessageDialog(null, "Valor excedido","ERRO",JOptionPane.ERROR_MESSAGE);
			textFieldMinMultiplicador.setText(textFieldMinMultiplicador.getText().replaceAll( "[0-9]" , ""));

					}
				}

				@Override
				public void keyTyped(KeyEvent e) {
					// TODO Auto-generated method stub

				}

				@Override
				public void keyPressed(KeyEvent e) {
					// TODO Auto-generated method stub

				}

			});
		
		textFieldMaxMultiplicador.addKeyListener(new KeyListener() {
				
				@Override
				public void keyReleased(KeyEvent e) {
				textFieldMaxMultiplicador.setText(textFieldMaxMultiplicador.getText().replaceAll( "[^0-9]" , ""));
				if(textFieldMaxMultiplicador.getText().length() > 9) {
							
				JOptionPane.showMessageDialog(null, "Valor excedido","ERRO",JOptionPane.ERROR_MESSAGE);
				textFieldMaxMultiplicador.setText(textFieldMaxMultiplicador.getText().replaceAll( "[0-9]" , ""));
	
						}
					}
	
					@Override
					public void keyTyped(KeyEvent e) {
						// TODO Auto-generated method stub
	
					}
	
					@Override
					public void keyPressed(KeyEvent e) {
						// TODO Auto-generated method stub
	
					}
	
				});
		
		ButtonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				TabuadaWhileLacos tabuada = new TabuadaWhileLacos();
				
				if(textFieldMaxMultiplicador.getText().isEmpty() || textFieldMinMultiplicador.getText().isEmpty() || textFieldMultiplicando.getText().isEmpty()) {
					
					JOptionPane.showMessageDialog(null, "Digite um valor no Multiplicando, No Máximo e No Mínimo!","ERRO",JOptionPane.WARNING_MESSAGE);
					
				}else {
				tabuada.multiplicando = Integer.parseInt(textFieldMultiplicando.getText());
				tabuada.minMultiplicador = Integer.parseInt(textFieldMinMultiplicador.getText());
				tabuada.maxMultiplicador = Integer.parseInt(textFieldMaxMultiplicador.getText());
				
				textFieldMultiplicando.setFont(new Font ("poppins", Font.BOLD,28));
				textFieldMinMultiplicador.setFont(new Font ("poppins", Font.BOLD,28));
				textFieldMaxMultiplicador.setFont(new Font ("poppins", Font.BOLD,28));
				}
				
				if (tabuada.maxMultiplicador < tabuada.minMultiplicador) {
					
					JOptionPane.showMessageDialog(null, "Você não pode colocar um multiplicador mínimo maior que o multiplicador máximo", "Erro", JOptionPane.ERROR_MESSAGE);
				
				
				} else {
				
				String[] resultado = tabuada.getTabuada();
				lista.setListData(resultado);
				lista.setFont(new Font ("poppins", Font.BOLD,18));
				
				
				scroll.setVisible(true);
				
				}
				
				
			}
		});
		
		ButtonLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				scroll.setVisible(false);
				
			}
		});
		
		painel.add(labelTabuada);
		painel.add(labelSubTitulo);
		painel.add(labelSubTitulo2);
		painel.add(labelMultiplicando);
		painel.add(textFieldMultiplicando);
		painel.add(labelMinMultiplicador);
		painel.add(textFieldMinMultiplicador);
		painel.add(labelMaxMultiplicador);
		painel.add(textFieldMaxMultiplicador);
		painel.add(ButtonCalcular);
		painel.add(ButtonLimpar);
		painel.add(labelResultado);
		painel.add(scroll);
		
		tela.setVisible(true);

	}
}