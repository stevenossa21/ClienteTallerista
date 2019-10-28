package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class PanelFinal extends JPanel {

	/**
	 * Create the panel.
	 */
	public PanelFinal(String av, int cor, int mal, int ptj) {
		setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("/view/imgs/"+av+".png")));
		lblNewLabel_1.setBounds(505, 67, 150, 150);
		add(lblNewLabel_1);
		
		JLabel lblCorrectasnum = new JLabel("Correctas : "+cor);
		lblCorrectasnum.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
		lblCorrectasnum.setForeground(new Color(50, 205, 50));
		lblCorrectasnum.setBounds(37, 31, 191, 38);
		add(lblCorrectasnum);
		
		JLabel lblIncorrectasnum = new JLabel("Incorrectas : "+mal);
		lblIncorrectasnum.setForeground(new Color(255, 0, 0));
		lblIncorrectasnum.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
		lblIncorrectasnum.setBounds(37, 109, 180, 38);
		add(lblIncorrectasnum);
		
		JLabel lblPuntajenum = new JLabel("Puntaje: "+ptj);
		lblPuntajenum.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblPuntajenum.setForeground(new Color(255, 140, 0));
		lblPuntajenum.setBounds(56, 195, 150, 22);
		add(lblPuntajenum);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(PanelFinal.class.getResource("/view/imgs/plata.png")));
		label.setBounds(268, 67, 150, 150);
		add(label);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(-1721, 5, 3892, 2160);
		lblNewLabel.setIcon(new ImageIcon(PanelFinal.class.getResource("/view/imgs/fondoT.jpg")));
		add(lblNewLabel);

	}
}
