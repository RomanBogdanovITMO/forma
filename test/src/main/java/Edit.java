import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Edit extends JFrame implements List {

	private JPanel contentPane;
	private JTextField e2;
	private JTextField e3;
	private JTextField e4;
	private JTextField e5;
	private JTextField e6;
	private JTextField e7;
	private JTextField e9;
	private JTextField e11;
	private JTextField e12;
	private JTextField e13;
	private JTextField e14;
	private JTextField e15;
	private JTextField e16;
	private JTextField e17;
	private JTextField e18;
	private JTextField e19;
	private JTextField e21;
	private JTextField e23;
	private JTextField e24;
	private JTextField e26;
	private JTextField e27;
	private JTextField e29;
	private JTextField e31;
	private JTextField e30;
	private JTextField e1;
	private JTextField e8;
	private JTextField e10;
	private JTextField e22;
	private JTextField e25;
	private JTextField e28;
	private JTextField e32;
	private JTextField e20;
	private JTextField e33;
	private JTextField e34;
	private JTextField e35;
	private JTextField e36;
	private JTextField e37;
	private JTextField e38;
	private JTextField e39;
	private JTextField e40;
	private JTextField e41;
	private JTextField e42;
	private JTextField e43;
	private JTextField e44;
	private JTextField e45;
	private JTextField e46;
	private JTextField e47;
	private JTextField e48;
	private JTextField e49;
	private JTextField e50;
	private JTextField e52;
	private JTextField e54;
	private JTextField e56;
	private JTextField e57;
	private JTextField e58;
	private JTextField e59;
	private JTextField e51;
	private JTextField e53;
	private JTextField e55;
	private JTextField e60;
	private JTextField e61;
	private JTextField e62;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Edit frame = new Edit();
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
	public Edit() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1445, 877);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel(list.size()+ "");
		lblNewLabel.setBounds(101, 13, 14, 16);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("\u041F\u0430\u0440\u0430\u043C\u0435\u0442\u0440\u0430 \u0437\u0430\u043F\u0440\u0430\u0448\u0438\u0432\u0430\u0435\u043C\u043E\u0433\u043E \u043A\u0440\u0435\u0434\u0438\u0442\u0430");
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setBounds(12, 42, 279, 16);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u0412\u0430\u043B\u044E\u0442\u0430 \u041A\u0440\u0435\u0434\u0438\u0442\u0430");
		label_1.setBounds(12, 71, 103, 16);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u0421\u0443\u043C\u043C\u0430 \u041A\u0440\u0435\u0434\u0438\u0442\u0430\u0446\u0438\u0444\u0440\u0430\u043C\u0438");
		label_2.setBounds(225, 71, 156, 16);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("\u0421\u0440\u043E\u043A \u041A\u0440\u0435\u0434\u0438\u0442\u0430 (\u043C\u0435\u0441.)");
		label_3.setBounds(513, 68, 127, 16);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("1. \u041B\u0438\u0447\u043D\u0430\u044F \u0438\u043D\u0444\u043E\u0440\u043C\u0430\u0446\u0438\u044F");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_4.setBounds(12, 98, 186, 16);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("\u0424\u0430\u043C\u0438\u043B\u0438\u044F");
		label_5.setBounds(12, 127, 59, 16);
		contentPane.add(label_5);
		
		JLabel label_6 = new JLabel("\u0418\u043C\u044F");
		label_6.setBounds(12, 152, 56, 16);
		contentPane.add(label_6);
		
		JLabel label_7 = new JLabel("\u041E\u0442\u0447\u0435\u0441\u0442\u0432\u043E");
		label_7.setBounds(169, 152, 56, 16);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("\u0412\u043E\u0437\u0440\u0430\u0441\u0442");
		label_8.setForeground(Color.RED);
		label_8.setBounds(12, 181, 68, 16);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("\u041F\u043E\u043B");
		label_9.setForeground(Color.RED);
		label_9.setBounds(235, 181, 56, 16);
		contentPane.add(label_9);
		
		JLabel label_10 = new JLabel("\u041C\u0435\u0441\u0442\u043E \u0440\u043E\u0436\u0434\u0435\u043D\u0438\u044F");
		label_10.setBounds(445, 181, 103, 16);
		contentPane.add(label_10);
		
		JLabel label_11 = new JLabel("(\u0441\u0442\u0440\u0430\u043D\u0430, \u0433\u043E\u0440\u043E\u0434/\u043F\u043E\u0441./\u0434\u0435\u0440.)");
		label_11.setBounds(445, 197, 150, 16);
		contentPane.add(label_11);
		
		JLabel label_12 = new JLabel("\u041F\u0430\u0441\u043F\u043E\u0440\u0442");
		label_12.setBounds(12, 239, 56, 16);
		contentPane.add(label_12);
		
		JLabel label_13 = new JLabel("\u0433\u0440\u0430\u0436\u0434\u0430\u043D\u0438\u043D\u0430 \u0420\u0424");
		label_13.setBounds(12, 256, 103, 16);
		contentPane.add(label_13);
		
		JLabel label_14 = new JLabel("\u0413\u0440\u0430\u0436\u0434\u0430\u043D\u0441\u0442\u0432\u043E");
		label_14.setBounds(12, 210, 78, 16);
		contentPane.add(label_14);
		
		JLabel label_15 = new JLabel("\u0441\u0435\u0440\u0438\u044F");
		label_15.setBounds(118, 239, 56, 16);
		contentPane.add(label_15);
		
		JLabel label_16 = new JLabel("\u043D\u043E\u043C\u0435\u0440");
		label_16.setBounds(284, 239, 56, 16);
		contentPane.add(label_16);
		
		JLabel label_17 = new JLabel("\u0434\u0430\u0442\u0430 \u0432\u044B\u0434\u0430\u0447\u0438");
		label_17.setBounds(450, 239, 78, 16);
		contentPane.add(label_17);
		
		JLabel label_18 = new JLabel("\u043A\u0435\u043C \u0432\u044B\u0434\u0430\u043D");
		label_18.setBounds(657, 239, 68, 16);
		contentPane.add(label_18);
		
		JLabel label_19 = new JLabel("\u0410\u0434\u0440\u0435\u0441 \u043F\u043E\u0441\u0442\u043E\u044F\u043D\u043D\u043E\u0439 \u0440\u0435\u0433\u0438\u0441\u0442\u0440\u0430\u0446\u0438\u0438");
		label_19.setBounds(12, 285, 191, 35);
		contentPane.add(label_19);
		
		JLabel label_20 = new JLabel("\u0438\u043D\u0434\u0435\u043A\u0441");
		label_20.setBounds(12, 273, 56, 16);
		contentPane.add(label_20);
		
		JLabel label_21 = new JLabel("\u043E\u0431\u043B\u0430\u0441\u0442\u044C, \u0440\u0430\u0439\u043E\u043D, \u0433\u043E\u0440\u043E\u0434/\u0434\u0435\u0440./\u043F\u043E\u0441.");
		label_21.setBounds(218, 294, 218, 16);
		contentPane.add(label_21);
		
		JLabel label_22 = new JLabel("\u0443\u043B./\u043C\u043A\u0440.");
		label_22.setBounds(12, 320, 56, 16);
		contentPane.add(label_22);
		
		JLabel fdfdf = new JLabel("\u0434\u043E\u043C");
		fdfdf.setBounds(293, 320, 27, 16);
		contentPane.add(fdfdf);
		
		JLabel label_24 = new JLabel("\u043A\u043E\u0440\u043F./\u0441\u0442\u0440.");
		label_24.setBounds(401, 320, 59, 16);
		contentPane.add(label_24);
		
		JLabel label_25 = new JLabel("\u0410\u0434\u0440\u0435\u0441 \u0440\u0435\u0433\u0438\u0441\u0442\u0440\u0430\u0446\u0438\u0438 \u0441\u043E\u0432\u043F\u0430\u0434\u0430\u0435\u0442 \u0441 \u0430\u0434\u0440\u0435\u0441\u043E\u043C \u0444\u0430\u043A\u0442. \u043F\u0440\u043E\u0436\u0438\u0432\u0430\u043D\u0438\u044F?");
		label_25.setBounds(12, 342, 376, 16);
		contentPane.add(label_25);
		
		JLabel label_26 = new JLabel("\u0421\u043A\u043E\u043B\u044C\u043A\u043E \u043B\u0435\u0442 \u0432\u044B \u043F\u0440\u043E\u0436\u0438\u0432\u0430\u0435\u0442\u0435 \u043F\u043E \u043F\u043E\u0441\u043B. \u0430\u0434\u0440\u0435\u0441\u0443?");
		label_26.setForeground(Color.RED);
		label_26.setBounds(12, 371, 279, 16);
		contentPane.add(label_26);
		
		JLabel label_27 = new JLabel("\u041D\u0430\u043B\u0438\u0447\u0438\u0435 \u043F\u043E\u043B\u0438\u0441\u0430 \u0441\u0442\u0440\u0430\u0445\u043E\u0432\u0430\u043D\u0438\u044F");
		label_27.setForeground(Color.RED);
		label_27.setBounds(12, 400, 186, 16);
		contentPane.add(label_27);
		
		JLabel label_28 = new JLabel("\u0422\u0435\u043B\u0435\u0444\u043E\u043D \u0434\u043E\u043C\u0430\u0448\u043D\u0438\u0439");
		label_28.setBounds(12, 427, 127, 16);
		contentPane.add(label_28);
		
		JLabel label_29 = new JLabel("\u0422\u0435\u043B\u0435\u0444\u043E\u043D \u043C\u043E\u0431\u0438\u043B\u044C\u043D\u044B\u0439");
		label_29.setBounds(261, 427, 127, 16);
		contentPane.add(label_29);
		
		JLabel label_30 = new JLabel("\u0421\u0435\u043C\u0435\u0439\u043D\u043E\u0435 \u043F\u043E\u043B\u043E\u0436\u0435\u043D\u0438\u0435");
		label_30.setBounds(12, 453, 134, 16);
		contentPane.add(label_30);
		
		JLabel label_31 = new JLabel("\u041A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E \u0434\u0435\u0442\u0435\u0439");
		label_31.setBounds(12, 482, 113, 16);
		contentPane.add(label_31);
		
		JLabel label_32 = new JLabel("\u0418\u0437 \u043D\u0438\u0445 \u043D\u0435\u0441\u043E\u0432\u0435\u0440\u0448\u0435\u043D\u043D\u043E\u043B\u0435\u0442\u043D\u0438\u0445");
		label_32.setBounds(303, 482, 173, 16);
		contentPane.add(label_32);
		
		JLabel label_33 = new JLabel("2. \u0421\u0412\u0415\u0414\u0415\u041D\u0418\u042F \u041E \u0417\u0410\u041D\u042F\u0422\u041E\u0421\u0422\u0418");
		label_33.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_33.setBounds(12, 515, 218, 16);
		contentPane.add(label_33);
		
		JLabel label_34 = new JLabel("\u0421\u0432\u0435\u0434\u0435\u043D\u0438\u044F \u043E \u0437\u0430\u043D\u044F\u0442\u043E\u0441\u0442\u0438 \u0432 \u043D\u0430\u0441\u0442\u043E\u044F\u0449\u0435\u0435 \u0432\u0440\u0435\u043C\u044F (\u043E\u0441\u043D. \u043C\u0435\u0441\u0442\u043E \u0440\u0430\u0431\u043E\u0442\u044B)");
		label_34.setBounds(12, 544, 376, 16);
		contentPane.add(label_34);
		
		JLabel label_35 = new JLabel("\u041F\u0440\u043E\u0444\u0435\u0441\u0441\u0438\u044F");
		label_35.setForeground(Color.RED);
		label_35.setBounds(12, 573, 78, 16);
		contentPane.add(label_35);
		
		JLabel label_36 = new JLabel("\u0421\u0440\u043E\u043A \u0440\u0430\u0431\u043E\u0442\u044B \u043D\u0430 \u0434\u0430\u043D\u043D\u043E\u043C \u043F\u0440\u0435\u0434\u043F\u0440\u0438\u044F\u0442\u0438\u0438");
		label_36.setBounds(12, 602, 228, 16);
		contentPane.add(label_36);
		
		JLabel label_37 = new JLabel("\u0410\u0434\u0440\u0435\u0441 \u043F\u0440\u0435\u0434\u043F\u0440\u0438\u044F\u0442\u0438\u044F");
		label_37.setBounds(372, 586, 129, 16);
		contentPane.add(label_37);
		
		JLabel label_38 = new JLabel("\u0421\u0444\u0435\u0440\u0430 \u0434\u0435\u044F\u0442\u0435\u043B\u044C\u043D\u043E\u0441\u0442\u0438 ");
		label_38.setForeground(Color.RED);
		label_38.setBounds(12, 631, 134, 16);
		contentPane.add(label_38);
		
		JLabel label_39 = new JLabel("\u0432\u0430\u0448\u0435\u0433\u043E \u043F\u0440\u0435\u0434\u043F\u0440\u0438\u044F\u0442\u0438\u044F");
		label_39.setForeground(Color.RED);
		label_39.setBounds(12, 648, 127, 16);
		contentPane.add(label_39);
		
		JLabel label_40 = new JLabel("\u0417\u0430\u044F\u0432\u043B\u0435\u043D\u0438\u0435 \u2116:");
		label_40.setBounds(12, 13, 92, 16);
		contentPane.add(label_40);
		
		JLabel label_23 = new JLabel("\u0414\u043E\u0445\u043E\u0434 \u043F\u043E \u043E\u0441\u043D\u043E\u0432\u043D\u043E\u043C\u0443 \u043C\u0435\u0441\u0442\u0443 \u0440\u0430\u0431\u043E\u0442\u044B (\u043F\u043E\u0441\u043B\u0435\u0443\u043F\u043B\u0430\u0442\u044B \u043D\u0430\u043B\u043E\u0433\u043E\u0432)");
		label_23.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_23.setBounds(899, 645, 309, 16);
		contentPane.add(label_23);
		
		JLabel label_41 = new JLabel("5. \u0418\u041D\u0424\u041E\u0420\u041C\u0410\u0426\u0418\u042F \u041E \u0414\u041E\u0425\u041E\u0414\u0410\u0425 \u0418 \u0420\u0410\u0421\u0425\u041E\u0414\u0410\u0425");
		label_41.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_41.setBounds(899, 616, 335, 16);
		contentPane.add(label_41);
		
		JLabel label_42 = new JLabel("\u0414\u043E\u0445\u043E\u0434 \u043E\u0442 \u0440\u0430\u0431\u043E\u0442\u044B \u043F\u043E \u0441\u043E\u0432\u043C\u0435\u0441\u0442\u0438\u0442\u0435\u043B\u044C\u0441\u0442\u0432\u0443");
		label_42.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_42.setBounds(899, 660, 212, 16);
		contentPane.add(label_42);
		
		JLabel label_43 = new JLabel("\u041F\u043E\u043B\u0443\u0447\u0430\u0435\u043C\u044B\u0435 \u0430\u043B\u0438\u043C\u0435\u043D\u0442\u044B \u0438 \u043F\u043E\u0441\u043E\u0431\u0438\u044F \u043D\u0430 \u0434\u0435\u0442\u0435\u0439");
		label_43.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_43.setBounds(899, 675, 218, 16);
		contentPane.add(label_43);
		
		JLabel label_44 = new JLabel("\u0414\u043E\u0445\u043E\u0434\u044B \u0432 \u0432\u0438\u0434\u0435 \u0430\u0440\u0435\u043D\u0434\u043D\u043E\u0439 \u043F\u043B\u0430\u0442\u044B");
		label_44.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_44.setBounds(899, 690, 173, 16);
		contentPane.add(label_44);
		
		JLabel label_45 = new JLabel("\u0418\u0441\u0442\u043E\u0447\u043D\u0438\u043A\u0438 ");
		label_45.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_45.setBounds(899, 750, 162, 16);
		contentPane.add(label_45);
		
		JLabel label_46 = new JLabel("\u041F\u0440\u043E\u0446\u0435\u043D\u0442\u044B \u043F\u043E \u0434\u0435\u043F\u043E\u0437\u0438\u0442\u0430\u043C, \u0434\u0438\u0432\u0438\u0434\u0435\u043D\u0442\u044B \u043F\u043E \u0446\u0435\u043D\u043D\u044B\u043C \u0431\u0443\u043C\u0430\u0433\u0430\u043C");
		label_46.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_46.setBounds(899, 705, 288, 16);
		contentPane.add(label_46);
		
		JLabel label_47 = new JLabel("\u0420\u0435\u0433\u0443\u043B\u044F\u0440\u043D\u0430\u044F \u043C\u0430\u0442\u0435\u0440\u0438\u0430\u043B\u044C\u043D\u0430\u044F \u043F\u043E\u043C\u043E\u0449\u044C");
		label_47.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_47.setBounds(899, 720, 184, 16);
		contentPane.add(label_47);
		
		JLabel label_48 = new JLabel("\u0418\u043D\u044B\u0435 \u0434\u043E\u0445\u043E\u0434\u044B");
		label_48.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_48.setBounds(899, 735, 78, 16);
		contentPane.add(label_48);
		
		JLabel label_49 = new JLabel("\u041E\u0431\u0449\u0438\u0435 \u0440\u0430\u0441\u0445\u043E\u0434\u044B, \u0432 \u0442\u043E\u043C \u0447\u0438\u0441\u043B\u0435:");
		label_49.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_49.setBounds(899, 453, 268, 16);
		contentPane.add(label_49);
		
		JLabel label_50 = new JLabel("\u0423\u043F\u043B\u0430\u0447\u0438\u0432\u0430\u0435\u043C\u044B\u0435 \u0430\u043B\u0438\u043C\u0435\u043D\u0442\u044B");
		label_50.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_50.setBounds(899, 468, 268, 16);
		contentPane.add(label_50);
		
		JLabel label_51 = new JLabel("\u041C\u0438\u043D\u0438\u043C\u0430\u043B\u044C\u043D\u044B\u0435 \u0441\u0440\u0435\u0434\u0441\u0442\u0432\u0430 \u043D\u0430 \u0441\u043E\u0434\u0435\u0440\u0436\u0430\u043D\u0438\u0435 \u0438\u0436\u0434\u0438\u0432\u0435\u043D\u0446\u0435\u0432");
		label_51.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_51.setBounds(899, 483, 268, 16);
		contentPane.add(label_51);
		
		JLabel label_52 = new JLabel("\u041E\u0431\u044F\u0437\u0430\u0442\u0435\u043B\u044C\u043D\u044B\u0435 \u043F\u043B\u0430\u0442\u0435\u0436\u0438 \u043F\u043E\u043A\u0440\u0435\u0434\u0438\u0442\u0430\u043C \u0438 \u0441\u0442\u0440\u0430\u0445\u043E\u0432\u043A\u0435");
		label_52.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_52.setBounds(899, 498, 268, 16);
		contentPane.add(label_52);
		
		JLabel label_53 = new JLabel("\u041F\u043B\u0430\u0442\u0430 \u0437\u0430 \u043E\u0431\u0440\u0430\u0437\u043E\u0432\u0430\u043D\u0438\u0435");
		label_53.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_53.setBounds(899, 558, 268, 16);
		contentPane.add(label_53);
		
		JLabel label_54 = new JLabel("\u0410\u0440\u0435\u043D\u0434\u0430 \u0436\u0438\u043B\u044C\u044F");
		label_54.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_54.setBounds(899, 513, 268, 16);
		contentPane.add(label_54);
		
		JLabel label_55 = new JLabel("\u041A\u043E\u043C\u043C\u0443\u043D\u0430\u043B\u044C\u043D\u044B\u0435 \u0443\u0441\u043B\u0443\u0433\u0438");
		label_55.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_55.setBounds(899, 528, 268, 16);
		contentPane.add(label_55);
		
		JLabel label_56 = new JLabel("\u0421\u043E\u0434\u0435\u0440\u0436\u0430\u043D\u0438\u0435 \u0430\u0432\u0442\u043E\u043C\u043E\u0431\u0438\u043B\u044F");
		label_56.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_56.setBounds(899, 543, 268, 16);
		contentPane.add(label_56);
		
		JLabel label_57 = new JLabel("\u0434\u0440\u0443\u0433\u0438\u0445 \u0434\u043E\u0445\u043E\u0434\u043E\u0432");
		label_57.setBounds(899, 765, 103, 16);
		contentPane.add(label_57);
		
		JLabel label_58 = new JLabel("\u0414\u043E\u043F\u043E\u043B\u043D\u0438\u0442\u0435\u043B\u044C\u043D\u044B\u0435 \u0440\u0430\u0441\u0445\u043E\u0434\u044B");
		label_58.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_58.setBounds(899, 572, 268, 16);
		contentPane.add(label_58);
		
		JLabel label_59 = new JLabel("\u041E\u0431\u044F\u0437\u0430\u0442\u0435\u043B\u044C\u043D\u044B\u0435 \u043D\u0430\u043B\u043E\u0433\u043E\u0432\u044B\u0435 \u043F\u043B\u0430\u0442\u0435\u0436\u0438");
		label_59.setFont(new Font("Tahoma", Font.PLAIN, 11));
		label_59.setBounds(899, 587, 268, 16);
		contentPane.add(label_59);
		
		JLabel label_60 = new JLabel("\u0418\u043C\u0435\u0435\u0442\u0435 \u043B\u0438 \u0432\u044B \u043F\u043B\u0430\u0441\u0442\u0438\u043A\u043E\u0432\u0443\u044E \u043A\u0430\u0440\u0442\u0443?");
		label_60.setForeground(Color.BLACK);
		label_60.setBounds(899, 387, 208, 16);
		contentPane.add(label_60);
		
		JLabel label_61 = new JLabel("3. \u0418\u041D\u0424\u041E\u0420\u041C\u0410\u0426\u0426\u0418\u042F \u041E\u0411 \u0418\u041C\u0423\u0429\u0415\u0421\u0422\u0412\u0415");
		label_61.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_61.setBounds(899, 65, 265, 16);
		contentPane.add(label_61);
		
		JLabel label_62 = new JLabel("\u041A\u0412\u0410\u0420\u0422\u0418\u0420\u0410");
		label_62.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_62.setBounds(899, 81, 67, 16);
		contentPane.add(label_62);
		
		JLabel label_63 = new JLabel("\u0418\u043C\u0435\u0435\u0442\u0435 \u043B\u0438 \u0432\u044B \u043A\u0432\u0430\u0440\u0442\u0438\u0440\u0443 \u0432 \u0441\u043E\u0431\u0441\u0442\u0432\u0435\u043D\u043D\u043E\u0441\u0442\u0438?");
		label_63.setForeground(Color.RED);
		label_63.setBounds(899, 94, 245, 16);
		contentPane.add(label_63);
		
		JLabel label_64 = new JLabel("\u0410\u0434\u0440\u0435\u0441 \u043A\u0432\u0430\u0440\u0442\u0438\u0440\u044B, \u043D\u0430\u0445\u043E\u0434\u044F\u0449\u0435\u0439\u0441\u044F \u0432 \u0441\u043E\u0431\u0441\u0442\u0432\u0435\u043D\u043D\u043E\u0441\u0442\u0438");
		label_64.setBounds(899, 120, 283, 16);
		contentPane.add(label_64);
		
		JLabel label_65 = new JLabel("\u0417\u0410\u0413\u041E\u0420\u041E\u0414\u041D\u042B\u0419 \u0414\u041E\u041C, \u041A\u041E\u0422\u0422\u0415\u0414\u0416, \u0416\u0418\u041B\u041E\u0419 \u0414\u041E\u041C");
		label_65.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_65.setBounds(899, 149, 290, 16);
		contentPane.add(label_65);
		
		JLabel label_66 = new JLabel("\u0418\u043C\u0435\u0435\u0442\u0435 \u043B\u0438 \u0432\u044B \u0437\u0430\u0433\u043E\u0440\u043E\u0434\u043D\u044B\u0439 \u0434\u043E\u043C \u0432 \u0441\u043E\u0431\u0441\u0442\u0432\u0435\u043D\u043D\u043E\u0441\u0442\u0438?");
		label_66.setBounds(899, 171, 290, 16);
		contentPane.add(label_66);
		
		JLabel label_67 = new JLabel("\u0410\u0434\u0440\u0435\u0441 \u0434\u043E\u043C\u0430, \u043D\u0430\u0445\u043E\u0434\u044F\u0449\u0435\u0433\u043E\u0441\u044F \u0432 \u0441\u043E\u0431\u0441\u0442\u0432\u0435\u043D\u043D\u043E\u0441\u0442\u0438");
		label_67.setBounds(899, 193, 265, 16);
		contentPane.add(label_67);
		
		JLabel label_68 = new JLabel("\u0410\u0412\u0422\u041E\u041C\u041E\u0411\u0418\u041B\u042C");
		label_68.setBounds(899, 215, 84, 16);
		contentPane.add(label_68);
		
		JLabel label_69 = new JLabel("\u0418\u043C\u0435\u0435\u0442\u0435 \u043B\u0438 \u0432\u044B \u0430\u0432\u0442\u043E\u043C\u043E\u0431\u0438\u043B\u044C \u0432 \u0441\u043E\u0431\u0441\u0442\u0432\u0435\u043D\u043D\u043E\u0441\u0442\u0438?");
		label_69.setBounds(899, 236, 290, 16);
		contentPane.add(label_69);
		
		JLabel label_70 = new JLabel("\u041C\u0430\u0440\u043A\u0430 \u0430\u0432\u0442\u043E\u043C\u043E\u0431\u0438\u043B\u044F");
		label_70.setBounds(899, 265, 111, 16);
		contentPane.add(label_70);
		
		JLabel label_71 = new JLabel("\u0413\u043E\u0434 \u0432\u044B\u043F\u0443\u0441\u043A\u0430");
		label_71.setBounds(1188, 269, 79, 16);
		contentPane.add(label_71);
		
		JLabel label_72 = new JLabel("\u041C\u043E\u0434\u0435\u043B\u044C \u0430\u0432\u0442\u043E\u043C\u043E\u0431\u0438\u043B\u044F");
		label_72.setBounds(899, 297, 119, 16);
		contentPane.add(label_72);
		
		JLabel label_73 = new JLabel("\u0420\u0435\u0433. \u0437\u043D\u0430\u043A");
		label_73.setBounds(1188, 301, 56, 16);
		contentPane.add(label_73);
		
		JLabel label_74 = new JLabel("4. \u0418\u041D\u0424\u041E\u0420\u041C\u0410\u0426\u0418\u042F \u041E \u0424\u0418\u041D\u0410\u041D\u0421\u041E\u0412\u041E\u041C \u0421\u041E\u0421\u0422\u041E\u042F\u041D\u0418\u0418");
		label_74.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_74.setBounds(899, 326, 364, 16);
		contentPane.add(label_74);
		
		JLabel label_75 = new JLabel("\u0418\u043C\u0435\u0435\u0442\u0441\u044F \u043B\u0438 \u0443 \u0432\u0430\u0441 \u0431\u0430\u043D\u043A\u043E\u0432\u0441\u043A\u0438\u0439 \u0441\u0447\u0451\u0442?");
		label_75.setForeground(Color.RED);
		label_75.setBounds(899, 355, 208, 16);
		contentPane.add(label_75);
		
		JLabel label_76 = new JLabel("\u0418\u043C\u0435\u0435\u0442\u0435 \u043B\u0438 \u0432\u044B \u043A\u0440\u0435\u0434\u0438\u0442\u043D\u044B\u0439 \u043B\u0438\u043C\u0438\u0442 \u043F\u043E \u043A\u0430\u0440\u0442\u0435?");
		label_76.setBounds(899, 416, 253, 16);
		contentPane.add(label_76);
		int i = list.size();
		
		e1 = new JTextField(list.getRu(i-1));
		e1.setColumns(10);
		e1.setBounds(109, 68, 116, 22);
		contentPane.add(e1);
		
		e2 = new JTextField(list.getSumKred(i-1));
		e2.setColumns(10);
		e2.setBounds(385, 68, 116, 22);
		contentPane.add(e2);
		
		e3 = new JTextField(list.getSrokKred(i-1));
		e3.setColumns(10);
		e3.setBounds(652, 65, 199, 22);
		contentPane.add(e3);
		
		e4 = new JTextField(list.getSurnam(i-1));
		e4.setColumns(10);
		e4.setBackground(Color.WHITE);
		e4.setBounds(85, 124, 434, 22);
		contentPane.add(e4);
		
		e5 = new JTextField(list.getNam(i-1));
		e5.setColumns(10);
		e5.setBounds(41, 149, 116, 22);
		contentPane.add(e5);
		
		e6 = new JTextField(list.getSecondNam(i-1));
		e6.setColumns(10);
		e6.setBounds(225, 149, 211, 22);
		contentPane.add(e6);
		
		e7 = new JTextField(list.getBirthDat(i-1));
		e7.setColumns(10);
		e7.setBounds(108, 178, 116, 22);
		contentPane.add(e7);
		
		e8 = new JTextField(list.getpol(i-1));
		e8.setColumns(10);
		e8.setBounds(272, 178, 116, 22);
		contentPane.add(e8);
		
		e9 = new JTextField(list.getb(i-1));
		e9.setHorizontalAlignment(SwingConstants.LEFT);
		e9.setColumns(10);
		e9.setBounds(607, 178, 244, 35);
		contentPane.add(e9);
		
		e10 = new JTextField(list.getgrazh(i-1));
		e10.setColumns(10);
		e10.setBounds(102, 210, 116, 22);
		contentPane.add(e10);
		
		e11 = new JTextField(list.getSerNu(i-1));
		e11.setColumns(10);
		e11.setBounds(156, 236, 116, 22);
		contentPane.add(e11);
		
		e12 = new JTextField(list.getNu(i-1));
		e12.setColumns(10);
		e12.setBounds(322, 236, 116, 22);
		contentPane.add(e12);
		
		e13 = new JTextField(list.getPassDat(i-1));
		e13.setColumns(10);
		e13.setBounds(529, 236, 116, 22);
		contentPane.add(e13);
		
		e14 = new JTextField(list.getOrg(i-1));
		e14.setColumns(10);
		e14.setBounds(724, 236, 127, 22);
		contentPane.add(e14);
		
		e15 = new JTextField(list.getInd(i-1));
		e15.setColumns(10);
		e15.setBounds(116, 270, 116, 22);
		contentPane.add(e15);
		
		e16 = new JTextField(list.getCit(i-1));
		e16.setColumns(10);
		e16.setBounds(439, 291, 412, 22);
		contentPane.add(e16);
		
		e17 = new JTextField(list.getStree(i-1));
		e17.setColumns(10);
		e17.setBounds(116, 317, 116, 22);
		contentPane.add(e17);
		
		e18 = new JTextField(list.getHous(i-1));
		e18.setColumns(10);
		e18.setBounds(323, 317, 56, 22);
		contentPane.add(e18);
		
		e19 = new JTextField(list.getCor(i-1));
		e19.setColumns(10);
		e19.setBounds(461, 317, 58, 22);
		contentPane.add(e19);
		
		e20 = new JTextField(list.getadrsov(i-1));
		e20.setColumns(10);
		e20.setBounds(385, 339, 116, 22);
		contentPane.add(e20);
		
		e21 = new JTextField(list.getYea(i-1));
		e21.setColumns(10);
		e21.setBounds(284, 371, 116, 22);
		contentPane.add(e21);
		
		e22 = new JTextField(list.getstrahpol(i-1));
		e22.setColumns(10);
		e22.setBounds(210, 397, 116, 22);
		contentPane.add(e22);
		
		e23 = new JTextField(list.getPhon(i-1));
		e23.setColumns(10);
		e23.setBounds(130, 424, 116, 22);
		contentPane.add(e23);
		
		e24 = new JTextField(list.getMobil(i-1));
		e24.setColumns(10);
		e24.setBounds(388, 424, 116, 22);
		contentPane.add(e24);
		
		e25 = new JTextField(list.getsempol(i-1));
		e25.setColumns(10);
		e25.setBounds(140, 450, 116, 22);
		contentPane.add(e25);
		
		e26 = new JTextField(list.getChildre(i-1));
		e26.setColumns(10);
		e26.setBounds(141, 479, 116, 22);
		contentPane.add(e26);
		
		e27 = new JTextField(list.getn18(i-1));
		e27.setColumns(10);
		e27.setBounds(490, 479, 116, 22);
		contentPane.add(e27);
		
		e28 = new JTextField(list.getrabota(i-1));
		e28.setColumns(10);
		e28.setBounds(400, 541, 116, 22);
		contentPane.add(e28);
		
		e29 = new JTextField(list.getPro(i-1));
		e29.setColumns(10);
		e29.setBounds(108, 570, 252, 22);
		contentPane.add(e29);
		
		e30 = new JTextField(list.getAdrrab(i-1));
		e30.setColumns(10);
		e30.setBounds(490, 583, 327, 22);
		contentPane.add(e30);
		
		e31 = new JTextField(list.getSrokRa(i-1));
		e31.setColumns(10);
		e31.setBounds(244, 599, 116, 22);
		contentPane.add(e31);
		
		e32 = new JTextField(list.getkukuha(i-1));
		e32.setColumns(10);
		e32.setBounds(156, 645, 392, 22);
		contentPane.add(e32);
		
		e33 = new JTextField(list.gett1(i-1));
		e33.setFont(new Font("Tahoma", Font.PLAIN, 10));
		e33.setColumns(10);
		e33.setBounds(1207, 647, 116, 11);
		contentPane.add(e33);
		
		e34 = new JTextField(list.gett2(i-1));
		e34.setFont(new Font("Tahoma", Font.PLAIN, 10));
		e34.setColumns(10);
		e34.setBounds(1207, 662, 116, 11);
		contentPane.add(e34);
		
		e35 = new JTextField(list.gett3(i-1));
		e35.setFont(new Font("Tahoma", Font.PLAIN, 10));
		e35.setColumns(10);
		e35.setBounds(1207, 677, 116, 11);
		contentPane.add(e35);
		
		e36 = new JTextField(list.gett4(i-1));
		e36.setFont(new Font("Tahoma", Font.PLAIN, 10));
		e36.setColumns(10);
		e36.setBounds(1207, 692, 116, 11);
		contentPane.add(e36);
		
		e37 = new JTextField(list.gett5(i-1));
		e37.setFont(new Font("Tahoma", Font.PLAIN, 10));
		e37.setColumns(10);
		e37.setBounds(1206, 707, 116, 11);
		contentPane.add(e37);
		
		e38 = new JTextField(list.gett6(i-1));
		e38.setFont(new Font("Tahoma", Font.PLAIN, 10));
		e38.setColumns(10);
		e38.setBounds(1206, 722, 116, 11);
		contentPane.add(e38);
		
		e39 = new JTextField(list.gett7(i-1));
		e39.setFont(new Font("Tahoma", Font.PLAIN, 10));
		e39.setColumns(10);
		e39.setBounds(1207, 737, 116, 11);
		contentPane.add(e39);
		
		e40 = new JTextField(list.gett8(i-1));
		e40.setFont(new Font("Tahoma", Font.PLAIN, 11));
		e40.setColumns(10);
		e40.setBounds(998, 750, 325, 35);
		contentPane.add(e40);
		
		e41 = new JTextField(list.gett9(i-1));
		e41.setFont(new Font("Tahoma", Font.PLAIN, 10));
		e41.setColumns(10);
		e41.setBounds(1178, 455, 127, 11);
		contentPane.add(e41);
		
		e42 = new JTextField(list.gett10(i-1));
		e42.setFont(new Font("Tahoma", Font.PLAIN, 10));
		e42.setColumns(10);
		e42.setBounds(1178, 470, 127, 11);
		contentPane.add(e42);
		
		e43 = new JTextField(list.gett11(i-1));
		e43.setFont(new Font("Tahoma", Font.PLAIN, 10));
		e43.setColumns(10);
		e43.setBounds(1178, 485, 127, 11);
		contentPane.add(e43);
		
		e44 = new JTextField(list.gett12(i-1));
		e44.setFont(new Font("Tahoma", Font.PLAIN, 10));
		e44.setColumns(10);
		e44.setBounds(1178, 500, 127, 11);
		contentPane.add(e44);
		
		e45 = new JTextField(list.gett13(i-1));
		e45.setFont(new Font("Tahoma", Font.PLAIN, 10));
		e45.setColumns(10);
		e45.setBounds(1178, 515, 127, 11);
		contentPane.add(e45);
		
		e46 = new JTextField(list.gett14(i-1));
		e46.setFont(new Font("Tahoma", Font.PLAIN, 10));
		e46.setColumns(10);
		e46.setBounds(1178, 530, 127, 11);
		contentPane.add(e46);
		
		e47 = new JTextField(list.gett15(i-1));
		e47.setFont(new Font("Tahoma", Font.PLAIN, 10));
		e47.setColumns(10);
		e47.setBounds(1178, 548, 127, 11);
		contentPane.add(e47);
		
		e48 = new JTextField(list.gett16(i-1));
		e48.setFont(new Font("Tahoma", Font.PLAIN, 10));
		e48.setColumns(10);
		e48.setBounds(1178, 563, 127, 11);
		contentPane.add(e48);
		
		e49 = new JTextField(list.gett17(i-1));
		e49.setFont(new Font("Tahoma", Font.PLAIN, 10));
		e49.setColumns(10);
		e49.setBounds(1178, 578, 127, 11);
		contentPane.add(e49);
		
		e50 = new JTextField(list.gett18(i-1));
		e50.setFont(new Font("Tahoma", Font.PLAIN, 10));
		e50.setColumns(10);
		e50.setBounds(1178, 593, 127, 11);
		contentPane.add(e50);
		
		e51 = new JTextField(list.getKv(i-1));
		e51.setColumns(10);
		e51.setBounds(1194, 92, 195, 22);
		contentPane.add(e51);
		
		e52 = new JTextField(list.gett19(i-1));
		e52.setColumns(10);
		e52.setBounds(1194, 120, 195, 22);
		contentPane.add(e52);
		
		e53 = new JTextField(list.getDom(i-1));
		e53.setColumns(10);
		e53.setBounds(1194, 168, 195, 22);
		contentPane.add(e53);
		
		e54 = new JTextField(list.gett20(i-1));
		e54.setColumns(10);
		e54.setBounds(1194, 190, 195, 22);
		contentPane.add(e54);
		
		e55 = new JTextField(list.getAvto(i-1));
		e55.setColumns(10);
		e55.setBounds(1194, 236, 232, 22);
		contentPane.add(e55);
		
		e56 = new JTextField(list.gett21(i-1));
		e56.setColumns(10);
		e56.setBounds(1034, 265, 142, 22);
		contentPane.add(e56);
		
		e57 = new JTextField(list.gett22(i-1));
		e57.setColumns(10);
		e57.setBounds(1034, 294, 142, 22);
		contentPane.add(e57);
		
		e58 = new JTextField(list.gett23(i-1));
		e58.setColumns(10);
		e58.setBounds(1279, 266, 147, 22);
		contentPane.add(e58);
		
		e59 = new JTextField(list.gett24(i-1));
		e59.setColumns(10);
		e59.setBounds(1279, 298, 147, 22);
		contentPane.add(e59);
		
		e60 = new JTextField(list.getBank(i-1));
		e60.setColumns(10);
		e60.setBounds(1164, 352, 262, 22);
		contentPane.add(e60);
		
		e61 = new JTextField(list.getCard(i-1));
		e61.setColumns(10);
		e61.setBounds(1164, 384, 262, 22);
		contentPane.add(e61);
		
		e62 = new JTextField(list.getLimit(i-1));
		e62.setColumns(10);
		e62.setBounds(1164, 413, 262, 22);
		contentPane.add(e62);
		
		JButton btnNewButton = new JButton("\u0421\u043E\u0445\u0440\u0430\u043D\u0438\u0442\u044C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				Menu ab = new Menu();
				ab.main(null);
			}
		});
		btnNewButton.setBounds(720, 794, 97, 25);
		contentPane.add(btnNewButton);
		
		
		
		
		
		
	   
	}
}
