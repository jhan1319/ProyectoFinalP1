package Visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Lista_Figura_User extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Lista_Figura_User dialog = new Lista_Figura_User();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Lista_Figura_User() {
		setUndecorated(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);/////CENTRADO

		{
			JPanel panel = new JPanel();
			panel.setBounds(0, 0, 450, 40);
			contentPanel.add(panel);
			panel.setLayout(null);
			{
				JLabel label = new JLabel("");
				label.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						dispose();
					}
				});
				label.setIcon(new ImageIcon("C:\\Users\\Wendily\\Desktop\\Proyecto P1 ;3\\icons\\cancelbutton_83661.png"));
				label.setBounds(408, 11, 32, 29);
				panel.add(label);
			}
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 235, 450, 65);
			contentPanel.add(buttonPane);
			buttonPane.setLayout(null);
			{
				JButton button = new JButton("");
				button.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				button.setContentAreaFilled(false);
				button.setIcon(new ImageIcon("C:\\Users\\Wendily\\Desktop\\Proyecto P1 ;3\\icons\\canceltheapplication_cancelar_2901.png"));
				button.setBounds(387, 11, 53, 50);
				buttonPane.add(button);
			}
		}
	}

}
