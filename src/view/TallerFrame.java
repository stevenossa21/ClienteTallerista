package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EmptyBorder;

import control.PreguntaControl;
import control.RespuestaControl;
import persistence.PreguntaRespuesta;
import persistence.Respuesta;

import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;

public class TallerFrame extends JFrame {

	private JPanel contentPane;
	private RespuestaControl rc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException ex) {
					ex.printStackTrace();
				}
				try {
					TallerFrame frame = new TallerFrame();
					frame.setResizable(false);
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TallerFrame() {
		try {

			rc = new RespuestaControl();

		} catch (RemoteException e1) {
			e1.printStackTrace();
		} catch (NotBoundException e1) {
			e1.printStackTrace();
		}
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 450);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(154, 205, 50));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(-50, 0, 812, 505);
		contentPane.add(panel);
		panel.setLayout(null);

		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon(TallerFrame.class.getResource("/view/imgs/av3.png")));
		btnNewButton.setBounds(539, 141, 145, 149);
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setSelectedIcon(new ImageIcon(TallerFrame.class.getResource("/view/imgs/av1.png")));

		btnNewButton_1.setIcon(new ImageIcon(TallerFrame.class.getResource("/view/imgs/av1.png")));
		btnNewButton_1.setBounds(100, 141, 145, 149);
		panel.add(btnNewButton_1);

		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setIcon(new ImageIcon(TallerFrame.class.getResource("/view/imgs/av2.png")));
		btnNewButton_3.setBounds(325, 141, 145, 149);
		panel.add(btnNewButton_3);

		JLabel lblBienvenido = new JLabel("\u00A1 Bienvenido !");
		lblBienvenido.setBackground(new Color(0, 100, 0));
		lblBienvenido.setFont(new Font("Trebuchet MS", Font.PLAIN, 38));
		lblBienvenido.setForeground(new Color(218, 165, 32));
		lblBienvenido.setBounds(293, 11, 254, 45);
		panel.add(lblBienvenido);

		JLabel lblSeleccionaTuvatar = new JLabel("Selecciona Tu \u00C1vatar");
		lblSeleccionaTuvatar.setFont(new Font("Calisto MT", Font.BOLD, 29));
		lblSeleccionaTuvatar.setForeground(new Color(255, 165, 0));
		lblSeleccionaTuvatar.setBounds(273, 67, 288, 36);
		panel.add(lblSeleccionaTuvatar);

		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setForeground(new Color(47, 79, 79));
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("/view/imgs/fondo.jpg")));
		lblNewLabel.setBounds(0, 0, 843, 424);
		panel.add(lblNewLabel);

		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(226, 204, 89, 23);
		panel.add(btnNewButton_2);

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("monstrillo blue");

				PanelPregunta pp = new PanelPregunta("av1", metodo());
				setContentPane(pp);
				pp.setSize(720, 400);
				repaint();
			}
		});

		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("monstrillo pink");

				PanelPregunta pp = new PanelPregunta("av2", metodo());
				setContentPane(pp);
				pp.setSize(720, 400);
				repaint();
			}
		});

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("monstrillo red");

				PanelPregunta pp = new PanelPregunta("av3", metodo());
				setContentPane(pp);
				pp.setSize(720, 400);
				repaint();
			}
		});

	}

	public ObjetoPregunta[] metodo() {

		ObjetoPregunta[] obj = new ObjetoPregunta[6];
		obj[0] = new ObjetoPregunta("¿cual es el principal causante del cambio climatico?", "cambio del clima", "contaminacion del mar", "calentamiento global", "cambio del tiempo", "calentamiento global",4);
		obj[1] = new ObjetoPregunta("¿Que dispositivo contamina mas?", "PC de escritorio", "Smartphone", "Televisor", "Portatil", "PC de escritorio",3);
		obj[2] = new ObjetoPregunta("¿Qué sucedería si no se logra detener el cambio climático?", "Aumenta la temperatura", "Habra escasez de agua", "Destruccion de bosques",
				"todas las anteriores", "todas las anteriores",3);

		int index = 3;

		List<PreguntaRespuesta> l = rc.searchRespuesta();
		// System.out.println(l);
		int cant = l.size();
		cant = cant / 4;
		int cont = 1;
		String pp = "";
		String aa = "";
		String bb = "";
		String cc = "";
		String dd = "";
		String vv = "";
		int vrr = 0;

		for (PreguntaRespuesta r : l) {

			if (cont <= 4) {

				switch (cont) {
				case 1:
					pp = r.getPregunta();
					aa = r.getRespuesta();
					vrr = r.getValor();
					if (r.getCorrect() == 1) {
						vv = r.getRespuesta();
					}

					break;
				case 2:

					bb = r.getRespuesta();
					if (r.getCorrect() == 1) {
						vv = r.getRespuesta();
					}

					break;
				case 3:
					cc = r.getRespuesta();
					if (r.getCorrect() == 1) {
						vv = r.getRespuesta();
					}

					break;
				case 4:
					dd = r.getRespuesta();
					if (r.getCorrect() == 1) {
						vv = r.getRespuesta();
					}

					break;

				default:
					break;
				}

			}

			if (cont == 4) {

				obj[index] = new ObjetoPregunta(pp, aa, bb, cc, dd, vv,vrr);
				index ++;
				cont = 0;
			}

			cont++;

			System.out.println(r.getId() + " " + r.getPregunta() + " " + r.getRespuesta() + " " + r.getCorrect());

		}

		return obj;

	}
}
