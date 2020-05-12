import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu implements List {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setBackground(Color.BLACK);
		frame.setBounds(100, 100, 585, 458);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		zayav ab = new zayav();
		JButton Create = new JButton("\u0421\u043E\u0437\u0434\u0430\u0442\u044C");
		Create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (list.size() != 0){
				int input =	JOptionPane.showConfirmDialog(null, "Sozdat' novoe zayavlenie?","Vyberite dejstvie...",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (input < 1) 
				ab.main(null);
				
					
			}
			
				else {
					zayav ab = new zayav();
					ab.main(null);
					frame.dispose();
				}
				
			}
		});
		Create.setBounds(114, 180, 338, 25);
		frame.getContentPane().add(Create);
		
		
		
		
		JButton Redact = new JButton("\u0420\u0435\u0434\u0430\u043A\u0442\u0438\u0440\u043E\u0432\u0430\u0442\u044C");
		Redact.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (list.size() != 0 ) {
				Edit ab = new Edit();
				ab.main(null);
				frame.dispose();
			}
				
				else {
					JOptionPane.showMessageDialog(null, "Prezhde chem prosmatrivat' zayavleniya, neobhodimo sozdat' ih");
					zayav ab = new zayav();
					ab.main(null);
					frame.dispose();
				}
			}});
		Redact.setBounds(114, 218, 338, 25);
		frame.getContentPane().add(Redact);
	}}

