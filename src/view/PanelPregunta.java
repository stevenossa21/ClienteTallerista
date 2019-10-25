package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import javax.swing.AbstractButton;

import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Enumeration;

import javax.swing.ButtonGroup;

public class PanelPregunta extends JPanel {
	
	private final ButtonGroup buttonGroup = new ButtonGroup();
	public int ig = 0;
	int puntajeGlobal = 0;
	int corr = 0;
	int mall = 0;
	
	

	/**
	 * Create the panel.
	 */
	public PanelPregunta(String av, ObjetoPregunta[] obj) {
		setLayout(null);
		

		
		
		
		JLabel lblOpcion = new JLabel(obj[ig].getPregunta());
		System.out.println(obj[ig].getPregunta());
		lblOpcion.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 15));
		lblOpcion.setForeground(Color.GREEN);
		lblOpcion.setBounds(32, 67, 461, 28);
		add(lblOpcion);
		
		JRadioButton rdbtnOpcionA = new JRadioButton(obj[ig].getOpcionA());
		buttonGroup.add(rdbtnOpcionA);
		rdbtnOpcionA.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		rdbtnOpcionA.setBackground(new Color(72, 61, 139));
		rdbtnOpcionA.setForeground(Color.ORANGE);
		rdbtnOpcionA.setBounds(71, 167, 461, 28);
		add(rdbtnOpcionA);
		
		JRadioButton rdbtnOpcionB = new JRadioButton(obj[ig].getOpcionB());
		buttonGroup.add(rdbtnOpcionB);
		rdbtnOpcionB.setForeground(Color.ORANGE);
		rdbtnOpcionB.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		rdbtnOpcionB.setBackground(new Color(72, 61, 139));
		rdbtnOpcionB.setBounds(71, 224, 461, 28);
		add(rdbtnOpcionB);
		
		JRadioButton rdbtnOpcionC = new JRadioButton(obj[ig].getOpcionC());
		buttonGroup.add(rdbtnOpcionC);
		rdbtnOpcionC.setForeground(Color.ORANGE);
		rdbtnOpcionC.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		rdbtnOpcionC.setBackground(new Color(72, 61, 139));
		rdbtnOpcionC.setBounds(71, 279, 461, 28);
		add(rdbtnOpcionC);
		
		JRadioButton rdbtnOpcionD = new JRadioButton(obj[ig].getOpcionD());
		buttonGroup.add(rdbtnOpcionD);
		rdbtnOpcionD.setForeground(Color.ORANGE);
		rdbtnOpcionD.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		rdbtnOpcionD.setBackground(new Color(72, 61, 139));
		rdbtnOpcionD.setBounds(71, 341, 461, 28);
		add(rdbtnOpcionD);
		
		JLabel lblValor = new JLabel((obj[ig].getValor())+"");
		lblValor.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 18));
		lblValor.setForeground(Color.GREEN);
		lblValor.setBounds(605, 285, 36, 24);
		add(lblValor);
				
				JLabel lblValorr = new JLabel("Valor");
				lblValorr.setFont(new Font("Segoe UI Historic", Font.BOLD | Font.ITALIC, 18));
				lblValorr.setForeground(Color.ORANGE);
				lblValorr.setBounds(595, 251, 56, 28);
				add(lblValorr);
		
	
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\UCEVA\\OCTAVO SEMESTRE\\Telematicos\\PROYECTO-RMI\\ClienteTallerista\\src\\view\\imgs\\"+av+".png"));
		lblNewLabel.setBounds(557, 49, 139, 165);
		add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(getClass().getResource("/view/imgs/fondo.jpg")));
		label.setBounds(-26, -20, 774, 458);
		
		
				
				JButton btnSiguiente = new JButton("Siguiente");
				btnSiguiente.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						System.out.println("cruk");
						String select = getSelectedButtonText(buttonGroup);
						
						if(select.equals(obj[ig].getCorrecta())) {
							
							JOptionPane.showMessageDialog(null, "RESPUESTA CORRECTA!", "Good", JOptionPane.INFORMATION_MESSAGE);
							puntajeGlobal = puntajeGlobal+obj[ig].getValor();
							corr++;
							ig++;
							if(ig < obj.length) {
							lblOpcion.setText(obj[ig].getPregunta());
							rdbtnOpcionA.setText(obj[ig].getOpcionA());
							rdbtnOpcionB.setText(obj[ig].getOpcionB());
							rdbtnOpcionC.setText(obj[ig].getOpcionC());
							rdbtnOpcionD.setText(obj[ig].getOpcionD());
							lblValor.setText((obj[ig].getValor())+"");}
							
							else {
								remove(lblOpcion);
								remove(rdbtnOpcionA);
								remove(rdbtnOpcionB);
								remove(rdbtnOpcionC);
								remove(rdbtnOpcionD);
								remove(btnSiguiente); 
								remove(label);
								remove(lblNewLabel);
								remove(lblValor);
								remove(lblValorr);
								////Fin
								
								
								
								
								PanelFinal pf = new PanelFinal(av, corr, mall, puntajeGlobal);
								pf.setSize(getSize());
								
								add(pf);
								revalidate();
								repaint();
								
							}
						}else {
							JOptionPane.showMessageDialog(null, "RESPUESTA INCCORRECTA", "Bad", JOptionPane.ERROR_MESSAGE);
							mall++;
							ig++;
							if(ig < obj.length) {
							lblOpcion.setText(obj[ig].getPregunta());
							rdbtnOpcionA.setText(obj[ig].getOpcionA());
							rdbtnOpcionB.setText(obj[ig].getOpcionB());
							rdbtnOpcionC.setText(obj[ig].getOpcionC());
							rdbtnOpcionD.setText(obj[ig].getOpcionD());
							lblValor.setText((obj[ig].getValor())+"");}else {
								
								remove(lblOpcion);
								remove(rdbtnOpcionA);
								remove(rdbtnOpcionB);
								remove(rdbtnOpcionC);
								remove(rdbtnOpcionD);
								remove(btnSiguiente);
								remove(label);
								remove(lblNewLabel);
								remove(lblValor);
								remove(lblValorr);
								////Fin
								
								
						
								PanelFinal pf = new PanelFinal(av, corr, mall, puntajeGlobal);
								pf.setSize(getSize());
								
								add(pf);
								revalidate();
								repaint();
													}
						}
					}
				});
				
	
				
				btnSiguiente.setFont(new Font("Tahoma", Font.PLAIN, 18));
				btnSiguiente.setBackground(new Color(0, 128, 0));
				btnSiguiente.setForeground(new Color(0, 0, 255));
				btnSiguiente.setBounds(558, 344, 123, 23);
				add(btnSiguiente);
		
				
		
		add(label);
		
		
				
		
		
	}
	
	public String getSelectedButtonText(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }

        return null;
    }
}
