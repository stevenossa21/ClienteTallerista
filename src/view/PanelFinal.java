package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelFinal extends JPanel {

	String Oro = "oro.png";
	String Plata = "plata.png";
	String Bronce = "bronce.png";
	String ruta = "";

	public PanelFinal(String av, int cor, int mal, int ptj, int cont) {

		if (cor < cont / 2) {
			ruta = Bronce;
		}

		if (cor == cont / 2) {
			ruta = Plata;
		}

		if (cor > cont / 2) {
			ruta = Oro;
		}

		setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(getClass().getResource("/view/imgs/" + av + ".png")));
		lblNewLabel_1.setBounds(505, 67, 150, 150);
		add(lblNewLabel_1);

		JLabel lblCorrectasnum = new JLabel("Correctas : " + cor);
		lblCorrectasnum.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
		lblCorrectasnum.setForeground(new Color(50, 205, 50));
		lblCorrectasnum.setBounds(37, 31, 191, 38);
		add(lblCorrectasnum);

		JLabel lblIncorrectasnum = new JLabel("Incorrectas : " + mal);
		lblIncorrectasnum.setForeground(new Color(255, 0, 0));
		lblIncorrectasnum.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 25));
		lblIncorrectasnum.setBounds(37, 109, 180, 38);
		add(lblIncorrectasnum);

		JLabel lblPuntajenum = new JLabel("Puntaje: " + ptj);
		lblPuntajenum.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblPuntajenum.setForeground(new Color(255, 140, 0));
		lblPuntajenum.setBounds(56, 195, 150, 22);
		add(lblPuntajenum);

		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(PanelFinal.class.getResource("/view/imgs/"+ruta)));
		label.setBounds(268, 67, 150, 150);
		add(label);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBackground(Color.BLUE);
		btnSalir.setFont(new Font("Snap ITC", Font.PLAIN, 17));
		btnSalir.setBounds(518, 345, 89, 23);
		add(btnSalir);
		
		JButton btnReintentar = new JButton("Reintentar");
		btnReintentar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				TallerFrame tf = new TallerFrame();
				tf.setSize(720, 450);
				tf.setResizable(false);
				tf.setLocationRelativeTo(null);
				
				setVisible(false);
				tf.setVisible(true);

				
				tf.repaint();
				
			}
		});
		btnReintentar.setFont(new Font("Snap ITC", Font.PLAIN, 17));
		btnReintentar.setBackground(Color.BLUE);
		btnReintentar.setBounds(346, 345, 149, 23);
		add(btnReintentar);

		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(-1721, 5, 3892, 2160);
		lblNewLabel.setIcon(new ImageIcon(PanelFinal.class.getResource("/view/imgs/fondoT.jpg")));
		add(lblNewLabel);

	}
}
