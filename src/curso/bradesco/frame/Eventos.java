package curso.bradesco.frame;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Eventos extends JFrame {

	public Eventos() {
		super("Meu Layout");
//		JButton botao = new JButton("Botão centralizado");
//		getContentPane().add(botao);
		
		Container c = getContentPane();

		c.add(BorderLayout.NORTH, new JButton("Botão Norte"));
		c.add(BorderLayout.SOUTH, new JButton("Botão Sul"));
		c.add(BorderLayout.CENTER, new JButton("Botão Centro"));
		c.add(BorderLayout.EAST, new JButton("Botão Leste"));
		c.add(BorderLayout.WEST, new JButton("Botão Oeste"));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Eventos();
	}
}
