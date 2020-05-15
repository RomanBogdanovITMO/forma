import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class zayav implements List {
    private JFrame frame;
    private String pol;
    private String Ru;
    private String grazh;
    private String strahpol;
    private String adrsov;
    private String sempol;
    private String kukuha;
    private String rabota;
    private String kv;
    private String dom;
    private String avto;
    private String bank;
    private String card;
    private String lm;
    private JTextField SumKr;
    private JTextField SrokKr;
    private JTextField Surname;
    private JTextField Name;
    private JTextField SecondName;
    private JTextField BirthDate;
    private JTextField BirthPlace;
    private JTextField SerNum;
    private JTextField Num;
    private JTextField PassDate;
    private JTextField Organ;
    private JTextField Index;
    private JTextField City;
    private JTextField Street;
    private JTextField House;
    private JTextField Corp;
    private JTextField Year;
    private JTextField Phone;
    private JTextField Mobile;
    private JTextField Children;
    private JTextField ne18;
    private JTextField Prof;
    private JTextField SrokRab;
    private JTextField AdressRab;
    private JTextField t1;
    private JTextField t2;
    private JTextField t3;
    private JTextField t4;
    private JTextField t5;
    private JTextField t6;
    private JTextField t8;
    private JTextField t7;
    private JTextField t9;
    private JTextField t10;
    private JTextField t11;
    private JTextField t12;
    private JTextField t13;
    private JTextField t14;
    private JTextField t16;
    private JTextField t15;
    private JTextField t18;
    private JTextField t17;
    private JTextField t19;
    private JTextField t20;
    private JTextField t21;
    private JTextField t22;
    private JTextField t23;
    private JTextField t24;
    public Double q = 0.0;


    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    zayav window = new zayav();
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
    public zayav() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {

        frame = new JFrame();
        frame.setTitle("\u0417\u0430\u044F\u0432\u043B\u0435\u043D\u0438\u0435");
        frame.setBounds(100, 100, 1503, 766);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel label = new JLabel("\u0417\u0410\u042F\u0412\u041B\u0415\u041D\u0418\u0415-\u0410\u041D\u041A\u0415\u0422\u0410");
        label.setFont(new Font("Tahoma", Font.PLAIN, 26));
        label.setBounds(350, 13, 255, 53);
        frame.getContentPane().add(label);

        JLabel label_1 = new JLabel("\u043D\u0430 \u043F\u043E\u043B\u0443\u0447\u0435\u043D\u0438\u0435 \u043D\u0435\u0446\u0435\u043B\u0435\u0432\u043E\u0433\u043E \u043A\u0440\u0435\u0434\u0438\u0442\u0430");
        label_1.setFont(new Font("Tahoma", Font.PLAIN, 19));
        label_1.setBounds(324, 51, 310, 23);
        frame.getContentPane().add(label_1);

        JLabel label_2 = new JLabel("\u041F\u0430\u0440\u0430\u043C\u0435\u0442\u0440\u0430 \u0437\u0430\u043F\u0440\u0430\u0448\u0438\u0432\u0430\u0435\u043C\u043E\u0433\u043E \u043A\u0440\u0435\u0434\u0438\u0442\u0430");
        label_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        label_2.setBounds(12, 75, 279, 16);
        frame.getContentPane().add(label_2);

        JLabel label_3 = new JLabel("\u0412\u0430\u043B\u044E\u0442\u0430 \u041A\u0440\u0435\u0434\u0438\u0442\u0430");
        label_3.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_3.setBounds(12, 104, 103, 16);
        frame.getContentPane().add(label_3);

        JLabel label_4 = new JLabel("\u0421\u0443\u043C\u043C\u0430 \u041A\u0440\u0435\u0434\u0438\u0442\u0430 (\u0446\u0438\u0444\u0440\u0430\u043C\u0438)");
        label_4.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_4.setBounds(218, 109, 156, 11);
        frame.getContentPane().add(label_4);

        SumKr = new JTextField();
        SumKr.setFont(new Font("Dialog", Font.PLAIN, 10));
        SumKr.setBounds(365, 101, 116, 22);
        frame.getContentPane().add(SumKr);
        SumKr.setColumns(10);


        JLabel label_5 = new JLabel("\u0421\u0440\u043E\u043A \u041A\u0440\u0435\u0434\u0438\u0442\u0430 (\u043C\u0435\u0441.)");
        label_5.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_5.setBounds(493, 104, 103, 16);
        frame.getContentPane().add(label_5);

        SrokKr = new JTextField();
        SrokKr.setFont(new Font("Dialog", Font.PLAIN, 10));
        SrokKr.setBounds(594, 101, 92, 22);
        frame.getContentPane().add(SrokKr);
        SrokKr.setColumns(10);

        JLabel label_6 = new JLabel("1. \u041B\u0438\u0447\u043D\u0430\u044F \u0438\u043D\u0444\u043E\u0440\u043C\u0430\u0446\u0438\u044F");
        label_6.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        label_6.setBounds(12, 131, 186, 16);
        frame.getContentPane().add(label_6);

        JCheckBox Rub = new JCheckBox("\u0420\u0443\u0431\u043B\u0438 \u0420\u0424");
        Rub.setFont(new Font("Dialog", Font.PLAIN, 10));
        Rub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if (Rub.isSelected()) {
                    Ru = "Rubli RF";

                } else {
                    Ru = null;

                }
            }
        });
        Rub.setBounds(111, 100, 92, 25);
        frame.getContentPane().add(Rub);

        JLabel label_7 = new JLabel("\u0424\u0430\u043C\u0438\u043B\u0438\u044F (\u0435\u0441\u043B\u0438 \u0440\u0430\u043D\u0435\u0435 \u0438\u043C\u0435\u043B\u0438 \u0434\u0440\u0443\u0433\u0438\u0435 \u0444\u0430\u043C\u0438\u043B\u0438\u044E,");
        label_7.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_7.setBounds(12, 146, 255, 16);
        frame.getContentPane().add(label_7);

        JLabel label_8 = new JLabel("\u0438\u043C\u044F, \u043E\u0442\u0447\u0435\u0441\u0442\u0432\u043E, \u0443\u043A\u0430\u0436\u0438\u0442\u0435 \u0438\u0445, \u043A\u043E\u0433\u0434\u0430 \u043C\u0435\u043D\u044F\u043B\u0438 \u0438\u0445 \u0438 \u043F\u043E \u043A\u0430\u043A\u043E\u0439 \u043F\u0440\u0438\u0447\u0438\u043D\u0435)");
        label_8.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_8.setBounds(12, 159, 469, 16);
        frame.getContentPane().add(label_8);

        Surname = new JTextField();
        Surname.setFont(new Font("Dialog", Font.PLAIN, 10));
        Surname.setBackground(SystemColor.text);
        Surname.setBounds(350, 156, 211, 22);
        frame.getContentPane().add(Surname);
        Surname.setColumns(10);

        JLabel lblNewLabel = new JLabel("\u0418\u043C\u044F");
        lblNewLabel.setFont(new Font("Dialog", Font.PLAIN, 10));
        lblNewLabel.setBounds(12, 185, 56, 16);
        frame.getContentPane().add(lblNewLabel);

        Name = new JTextField();
        Name.setFont(new Font("Dialog", Font.PLAIN, 10));
        Name.setBounds(41, 182, 116, 22);
        frame.getContentPane().add(Name);
        Name.setColumns(10);

        JLabel label_9 = new JLabel("\u041E\u0442\u0447\u0435\u0441\u0442\u0432\u043E");
        label_9.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_9.setBounds(169, 185, 56, 16);
        frame.getContentPane().add(label_9);

        SecondName = new JTextField();
        SecondName.setFont(new Font("Dialog", Font.PLAIN, 10));
        SecondName.setBounds(225, 182, 211, 22);
        frame.getContentPane().add(SecondName);
        SecondName.setColumns(10);

        JLabel label_10 = new JLabel("\u0412\u043E\u0437\u0440\u0430\u0441\u0442");
        label_10.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_10.setForeground(new Color(255, 0, 0));
        label_10.setBounds(12, 214, 68, 16);
        frame.getContentPane().add(label_10);

        BirthDate = new JTextField();
        BirthDate.setFont(new Font("Dialog", Font.PLAIN, 10));
        BirthDate.setBounds(69, 211, 116, 22);
        frame.getContentPane().add(BirthDate);
        BirthDate.setColumns(10);

        JLabel lblNewLabel_1 = new JLabel("\u041F\u043E\u043B");
        lblNewLabel_1.setFont(new Font("Dialog", Font.PLAIN, 10));
        lblNewLabel_1.setForeground(new Color(255, 0, 0));
        lblNewLabel_1.setBounds(235, 214, 56, 16);
        frame.getContentPane().add(lblNewLabel_1);

        JCheckBox female = new JCheckBox("\u0416\u0435\u043D\u0441\u043A\u0438\u0439");
        female.setFont(new Font("Dialog", Font.PLAIN, 10));
        JCheckBox male = new JCheckBox("\u041C\u0443\u0436\u0441\u043A\u043E\u0439");
        male.setFont(new Font("Dialog", Font.PLAIN, 10));
        male.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (male.isSelected()) {
                    female.setEnabled(false);

                } else {
                    female.setEnabled(true);
                }
                if (male.isSelected()) {
                    pol = "Muzhskoj";

                } else {

                    pol = "";
                }

            }
        });

        male.setForeground(new Color(255, 0, 0));
        male.setBounds(261, 210, 86, 25);
        frame.getContentPane().add(male);

        female.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {

                if
                (female.isSelected()) {
                    male.setEnabled(false);

                } else {
                    male.setEnabled(true);
                }
                if (female.isSelected()) {
                    pol = "ZHenskij";

                } else {

                    pol = "";
                }

            }
        });
        female.setForeground(new Color(255, 0, 0));
        female.setBounds(351, 210, 86, 25);
        frame.getContentPane().add(female);


        JLabel label_11 = new JLabel("\u041C\u0435\u0441\u0442\u043E \u0440\u043E\u0436\u0434\u0435\u043D\u0438\u044F");
        label_11.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_11.setBounds(445, 214, 103, 16);
        frame.getContentPane().add(label_11);

        JLabel label_12 = new JLabel("(\u0441\u0442\u0440\u0430\u043D\u0430, \u0433\u043E\u0440\u043E\u0434/\u043F\u043E\u0441./\u0434\u0435\u0440.)");
        label_12.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_12.setBounds(445, 230, 150, 16);
        frame.getContentPane().add(label_12);

        BirthPlace = new JTextField();
        BirthPlace.setFont(new Font("Dialog", Font.PLAIN, 10));
        BirthPlace.setHorizontalAlignment(SwingConstants.LEFT);
        BirthPlace.setBounds(579, 230, 69, 16);
        frame.getContentPane().add(BirthPlace);
        BirthPlace.setColumns(10);

        JLabel lblNewLabel_2 = new JLabel("\u041F\u0430\u0441\u043F\u043E\u0440\u0442");
        lblNewLabel_2.setFont(new Font("Dialog", Font.PLAIN, 10));
        lblNewLabel_2.setBounds(12, 272, 56, 16);
        frame.getContentPane().add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("\u0433\u0440\u0430\u0436\u0434\u0430\u043D\u0438\u043D\u0430 \u0420\u0424");
        lblNewLabel_3.setFont(new Font("Dialog", Font.PLAIN, 10));
        lblNewLabel_3.setBounds(12, 289, 92, 16);
        frame.getContentPane().add(lblNewLabel_3);

        JLabel lblNewLabel_4 = new JLabel("\u0413\u0440\u0430\u0436\u0434\u0430\u043D\u0441\u0442\u0432\u043E");
        lblNewLabel_4.setFont(new Font("Dialog", Font.PLAIN, 10));
        lblNewLabel_4.setBounds(12, 243, 78, 16);
        frame.getContentPane().add(lblNewLabel_4);

        JCheckBox Rus = new JCheckBox("\u0420\u043E\u0441\u0441\u0438\u0439\u0441\u043A\u043E\u0435");
        Rus.setFont(new Font("Dialog", Font.PLAIN, 10));
        JCheckBox Other = new JCheckBox("\u0418\u043D\u043E\u0435");
        Other.setFont(new Font("Dialog", Font.PLAIN, 10));
        Other.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Other.isSelected()) {
                    Rus.setEnabled(false);

                } else {
                    Rus.setEnabled(true);
                }
                if (Other.isSelected()) {
                    grazh = "Inoe";

                } else {

                    grazh = "";
                }

            }
        });


        Other.setBounds(207, 239, 117, 25);
        frame.getContentPane().add(Other);
        Rus.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                if (Rus.isSelected()) {
                    Other.setEnabled(false);

                } else {
                    Other.setEnabled(true);
                }
                if (Rus.isSelected()) {
                    grazh = "Rossijskoe";

                } else {

                    grazh = "";
                }

            }
        });
        Rus.setBounds(108, 239, 95, 25);
        frame.getContentPane().add(Rus);


        JLabel seriya = new JLabel("\u0441\u0435\u0440\u0438\u044F");
        seriya.setFont(new Font("Dialog", Font.PLAIN, 10));
        seriya.setBounds(69, 269, 56, 16);
        frame.getContentPane().add(seriya);

        SerNum = new JTextField();
        SerNum.setFont(new Font("Dialog", Font.PLAIN, 10));
        SerNum.setBounds(107, 266, 78, 22);
        frame.getContentPane().add(SerNum);
        SerNum.setColumns(10);

        JLabel lblNewLabel_5 = new JLabel("\u043D\u043E\u043C\u0435\u0440");
        lblNewLabel_5.setFont(new Font("Dialog", Font.PLAIN, 10));
        lblNewLabel_5.setBounds(197, 269, 56, 16);
        frame.getContentPane().add(lblNewLabel_5);

        Num = new JTextField();
        Num.setFont(new Font("Dialog", Font.PLAIN, 10));
        Num.setBounds(235, 266, 86, 22);
        frame.getContentPane().add(Num);
        Num.setColumns(10);

        JLabel label_13 = new JLabel("\u0434\u0430\u0442\u0430 \u0432\u044B\u0434\u0430\u0447\u0438");
        label_13.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_13.setBounds(337, 272, 78, 16);
        frame.getContentPane().add(label_13);

        PassDate = new JTextField();
        PassDate.setFont(new Font("Dialog", Font.PLAIN, 10));
        PassDate.setBounds(412, 269, 86, 22);
        frame.getContentPane().add(PassDate);
        PassDate.setColumns(10);

        JLabel label_14 = new JLabel("\u043A\u0435\u043C \u0432\u044B\u0434\u0430\u043D");
        label_14.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_14.setBounds(507, 272, 68, 16);
        frame.getContentPane().add(label_14);

        Organ = new JTextField();
        Organ.setFont(new Font("Dialog", Font.PLAIN, 10));
        Organ.setBounds(562, 269, 86, 22);
        frame.getContentPane().add(Organ);
        Organ.setColumns(10);

        JLabel label_15 = new JLabel("\u0410\u0434\u0440\u0435\u0441 \u043F\u043E\u0441\u0442\u043E\u044F\u043D\u043D\u043E\u0439 \u0440\u0435\u0433\u0438\u0441\u0442\u0440\u0430\u0446\u0438\u0438");
        label_15.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_15.setBounds(12, 318, 191, 35);
        frame.getContentPane().add(label_15);

        JLabel label_16 = new JLabel("\u0438\u043D\u0434\u0435\u043A\u0441");
        label_16.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_16.setBounds(218, 304, 56, 16);
        frame.getContentPane().add(label_16);

        JLabel label_17 = new JLabel("\u043E\u0431\u043B\u0430\u0441\u0442\u044C, \u0440\u0430\u0439\u043E\u043D, \u0433\u043E\u0440\u043E\u0434/\u0434\u0435\u0440./\u043F\u043E\u0441.");
        label_17.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_17.setBounds(218, 327, 162, 16);
        frame.getContentPane().add(label_17);

        Index = new JTextField();
        Index.setFont(new Font("Dialog", Font.PLAIN, 10));
        Index.setBounds(322, 301, 116, 22);
        frame.getContentPane().add(Index);
        Index.setColumns(10);

        City = new JTextField();
        City.setFont(new Font("Dialog", Font.PLAIN, 10));
        City.setBounds(383, 327, 173, 16);
        frame.getContentPane().add(City);
        City.setColumns(10);

        JLabel lblNewLabel_6 = new JLabel("\u0443\u043B./\u043C\u043A\u0440.");
        lblNewLabel_6.setFont(new Font("Dialog", Font.PLAIN, 10));
        lblNewLabel_6.setBounds(218, 350, 56, 16);
        frame.getContentPane().add(lblNewLabel_6);

        Street = new JTextField();
        Street.setFont(new Font("Dialog", Font.PLAIN, 10));
        Street.setBounds(322, 347, 116, 22);
        frame.getContentPane().add(Street);
        Street.setColumns(10);

        JLabel label_18 = new JLabel("\u0434\u043E\u043C");
        label_18.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_18.setBounds(450, 350, 56, 16);
        frame.getContentPane().add(label_18);

        House = new JTextField();
        House.setFont(new Font("Dialog", Font.PLAIN, 10));
        House.setBounds(492, 347, 56, 22);
        frame.getContentPane().add(House);
        House.setColumns(10);

        JLabel label_19 = new JLabel("\u043A\u043E\u0440\u043F./\u0441\u0442\u0440.");
        label_19.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_19.setBounds(562, 353, 59, 16);
        frame.getContentPane().add(label_19);

        Corp = new JTextField();
        Corp.setFont(new Font("Dialog", Font.PLAIN, 10));
        Corp.setBounds(619, 350, 58, 22);
        frame.getContentPane().add(Corp);
        Corp.setColumns(10);

        JLabel lblNewLabel_7 = new JLabel("\u0410\u0434\u0440\u0435\u0441 \u0440\u0435\u0433\u0438\u0441\u0442\u0440\u0430\u0446\u0438\u0438 \u0441\u043E\u0432\u043F\u0430\u0434\u0430\u0435\u0442 \u0441 \u0430\u0434\u0440\u0435\u0441\u043E\u043C \u0444\u0430\u043A\u0442. \u043F\u0440\u043E\u0436\u0438\u0432\u0430\u043D\u0438\u044F?");
        lblNewLabel_7.setFont(new Font("Dialog", Font.PLAIN, 10));
        lblNewLabel_7.setBounds(12, 375, 376, 16);
        frame.getContentPane().add(lblNewLabel_7);

        JCheckBox Sovpad = new JCheckBox("\u0421\u043E\u0432\u043F\u0430\u0434\u0430\u0435\u0442");
        Sovpad.setFont(new Font("Dialog", Font.PLAIN, 10));
        JCheckBox NeSovpad = new JCheckBox("\u041D\u0435 \u0441\u043E\u0432\u043F\u0430\u0434\u0430\u0435\u0442");
        NeSovpad.setFont(new Font("Dialog", Font.PLAIN, 10));
        NeSovpad.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (NeSovpad.isSelected()) {
                    Sovpad.setEnabled(false);

                } else {
                    Sovpad.setEnabled(true);
                }
                if (NeSovpad.isSelected()) {
                    adrsov = "Ne sovpadaet";

                } else {

                    adrsov = "";
                }


            }
        });
        NeSovpad.setBounds(484, 371, 113, 25);
        frame.getContentPane().add(NeSovpad);
        Sovpad.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Sovpad.isSelected()) {
                    NeSovpad.setEnabled(false);

                } else {
                    NeSovpad.setEnabled(true);
                }
                if (Sovpad.isSelected()) {
                    adrsov = "sovpadaet";

                } else {

                    adrsov = "";
                }

            }
        });
        Sovpad.setBounds(388, 371, 92, 25);
        frame.getContentPane().add(Sovpad);


        JLabel label_20 = new JLabel("\u0421\u043A\u043E\u043B\u044C\u043A\u043E \u043B\u0435\u0442 \u0432\u044B \u043F\u0440\u043E\u0436\u0438\u0432\u0430\u0435\u0442\u0435 \u043F\u043E \u043F\u043E\u0441\u043B. \u0430\u0434\u0440\u0435\u0441\u0443?");
        label_20.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_20.setForeground(new Color(255, 0, 0));
        label_20.setBounds(12, 404, 279, 16);
        frame.getContentPane().add(label_20);

        Year = new JTextField();
        Year.setFont(new Font("Dialog", Font.PLAIN, 10));
        Year.setBounds(322, 404, 116, 22);
        frame.getContentPane().add(Year);
        Year.setColumns(10);

        JLabel label_21 = new JLabel("\u041D\u0430\u043B\u0438\u0447\u0438\u0435 \u043F\u043E\u043B\u0438\u0441\u0430 \u0441\u0442\u0440\u0430\u0445\u043E\u0432\u0430\u043D\u0438\u044F");
        label_21.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_21.setForeground(new Color(255, 0, 0));
        label_21.setBounds(12, 433, 173, 16);
        frame.getContentPane().add(label_21);

        JCheckBox Yes = new JCheckBox("\u0418\u043C\u0435\u044E");
        Yes.setFont(new Font("Dialog", Font.PLAIN, 10));
        JCheckBox No = new JCheckBox("\u041D\u0435 \u0438\u043C\u0435\u044E");
        No.setFont(new Font("Dialog", Font.PLAIN, 10));
        No.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (No.isSelected()) {
                    Yes.setEnabled(false);

                } else {
                    Yes.setEnabled(true);
                }
                if (No.isSelected()) {
                    strahpol = "Ne imeyu";

                } else {

                    strahpol = "";
                }


            }
        });

        No.setBounds(261, 429, 113, 25);
        frame.getContentPane().add(No);

        Yes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Yes.isSelected()) {
                    No.setEnabled(false);

                } else {
                    No.setEnabled(true);
                }
                if (Yes.isSelected()) {
                    strahpol = "imeyu";

                } else {

                    strahpol = "";
                }

            }
        });
        Yes.setBounds(189, 429, 68, 25);
        frame.getContentPane().add(Yes);


        JLabel label_22 = new JLabel("\u0422\u0435\u043B\u0435\u0444\u043E\u043D \u0434\u043E\u043C\u0430\u0448\u043D\u0438\u0439");
        label_22.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_22.setBounds(12, 460, 127, 16);
        frame.getContentPane().add(label_22);

        Phone = new JTextField();
        Phone.setFont(new Font("Dialog", Font.PLAIN, 10));
        Phone.setBounds(130, 457, 116, 22);
        frame.getContentPane().add(Phone);
        Phone.setColumns(10);

        JLabel label_23 = new JLabel("\u0422\u0435\u043B\u0435\u0444\u043E\u043D \u043C\u043E\u0431\u0438\u043B\u044C\u043D\u044B\u0439");
        label_23.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_23.setBounds(261, 460, 127, 16);
        frame.getContentPane().add(label_23);

        Mobile = new JTextField();
        Mobile.setFont(new Font("Dialog", Font.PLAIN, 10));
        Mobile.setBounds(388, 457, 116, 22);
        frame.getContentPane().add(Mobile);
        Mobile.setColumns(10);


        JLabel label_24 = new JLabel("\u0421\u0435\u043C\u0435\u0439\u043D\u043E\u0435 \u043F\u043E\u043B\u043E\u0436\u0435\u043D\u0438\u0435");
        label_24.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_24.setBounds(12, 486, 134, 16);


        JCheckBox VBrake = new JCheckBox("\u0441\u043E\u0441\u0442\u043E\u044E \u0432 \u0431\u0440\u0430\u043A\u0435");
        VBrake.setFont(new Font("Dialog", Font.PLAIN, 10));
        JCheckBox V2Brak = new JCheckBox("\u0441\u043E\u0441\u0442\u043E\u044E \u0432 \u043F\u043E\u0432\u0442\u043E\u0440\u043D\u043E\u043C \u0431\u0440\u0430\u043A\u0435");
        V2Brak.setFont(new Font("Dialog", Font.PLAIN, 10));
        JCheckBox Vdova = new JCheckBox("\u0432\u0434\u043E\u0432\u0430/\u0432\u0434\u043E\u0432\u0435\u0446");
        Vdova.setFont(new Font("Dialog", Font.PLAIN, 10));
        JCheckBox Razvod = new JCheckBox("\u0440\u0430\u0437\u0432\u0435\u0434\u0435\u043D(\u043D\u0430)");
        Razvod.setFont(new Font("Dialog", Font.PLAIN, 10));
        JCheckBox NeVBrake = new JCheckBox("\u043D\u0435 \u0441\u043E\u0441\u0442\u043E\u044E \u0432 \u0431\u0440\u0430\u043A\u0435");
        NeVBrake.setFont(new Font("Dialog", Font.PLAIN, 10));

        NeVBrake.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (NeVBrake.isSelected()) {
                    VBrake.setEnabled(false);
                    V2Brak.setEnabled(false);
                    Vdova.setEnabled(false);
                    Razvod.setEnabled(false);

                } else {
                    VBrake.setEnabled(true);
                    V2Brak.setEnabled(true);
                    Vdova.setEnabled(true);
                    Razvod.setEnabled(true);
                }

                if (NeVBrake.isSelected()) {
                    sempol = "Ne sostoyu v brake";

                } else {

                    sempol = "";
                }

            }
        });


        Razvod.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Razvod.isSelected()) {
                    VBrake.setEnabled(false);
                    V2Brak.setEnabled(false);
                    Vdova.setEnabled(false);
                    NeVBrake.setEnabled(false);

                } else {
                    VBrake.setEnabled(true);
                    V2Brak.setEnabled(true);
                    Vdova.setEnabled(true);
                    NeVBrake.setEnabled(true);
                }

                if (Razvod.isSelected()) {
                    sempol = "Razveden(na)";

                } else {

                    sempol = "";
                }

            }
        });


        Vdova.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Vdova.isSelected()) {
                    VBrake.setEnabled(false);
                    V2Brak.setEnabled(false);
                    Razvod.setEnabled(false);
                    NeVBrake.setEnabled(false);

                } else {
                    VBrake.setEnabled(true);
                    V2Brak.setEnabled(true);
                    Razvod.setEnabled(true);
                    NeVBrake.setEnabled(true);
                }

                if (Vdova.isSelected()) {
                    sempol = "Vdova/Vdovec";

                } else {

                    sempol = "";
                }

            }
        });

        VBrake.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (VBrake.isSelected()) {
                    V2Brak.setEnabled(false);
                    Vdova.setEnabled(false);
                    Razvod.setEnabled(false);
                    NeVBrake.setEnabled(false);

                } else {
                    V2Brak.setEnabled(true);
                    Vdova.setEnabled(true);
                    Razvod.setEnabled(true);
                    NeVBrake.setEnabled(true);
                }

                if (VBrake.isSelected()) {
                    sempol = "sostoyu v brake";

                } else {

                    sempol = "";
                }

            }
        });


        V2Brak.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (V2Brak.isSelected()) {
                    VBrake.setEnabled(false);
                    Vdova.setEnabled(false);
                    Razvod.setEnabled(false);
                    NeVBrake.setEnabled(false);

                } else {
                    VBrake.setEnabled(true);
                    Vdova.setEnabled(true);
                    Razvod.setEnabled(true);
                    NeVBrake.setEnabled(true);
                }

                if (V2Brak.isSelected()) {
                    sempol = "Sostoyu v povtornom brake";

                } else {

                    sempol = "";
                }

            }
        });

        NeVBrake.setBounds(594, 482, 127, 25);
        frame.getContentPane().add(NeVBrake);
        Razvod.setBounds(506, 482, 92, 25);
        frame.getContentPane().add(Razvod);
        Vdova.setBounds(406, 482, 100, 25);
        frame.getContentPane().add(Vdova);
        V2Brak.setBounds(244, 482, 162, 25);
        frame.getContentPane().add(V2Brak);
        frame.getContentPane().add(label_24);
        VBrake.setBounds(130, 482, 116, 25);
        frame.getContentPane().add(VBrake);

        JLabel label_25 = new JLabel("\u041A\u043E\u043B\u0438\u0447\u0435\u0441\u0442\u0432\u043E \u0434\u0435\u0442\u0435\u0439");
        label_25.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_25.setBounds(12, 515, 113, 16);
        frame.getContentPane().add(label_25);

        Children = new JTextField();
        Children.setFont(new Font("Dialog", Font.PLAIN, 10));
        Children.setBounds(141, 512, 116, 22);
        frame.getContentPane().add(Children);
        Children.setColumns(10);

        JLabel label_26 = new JLabel("\u0418\u0437 \u043D\u0438\u0445 \u043D\u0435\u0441\u043E\u0432\u0435\u0440\u0448\u0435\u043D\u043D\u043E\u043B\u0435\u0442\u043D\u0438\u0445");
        label_26.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_26.setBounds(303, 515, 173, 16);
        frame.getContentPane().add(label_26);

        ne18 = new JTextField();
        ne18.setFont(new Font("Dialog", Font.PLAIN, 10));
        ne18.setBounds(490, 512, 116, 22);
        frame.getContentPane().add(ne18);
        ne18.setColumns(10);

        JLabel label_27 = new JLabel("2. \u0421\u0412\u0415\u0414\u0415\u041D\u0418\u042F \u041E \u0417\u0410\u041D\u042F\u0422\u041E\u0421\u0422\u0418");
        label_27.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        label_27.setBounds(12, 548, 218, 16);
        frame.getContentPane().add(label_27);

        JLabel label_28 = new JLabel("\u0421\u0432\u0435\u0434\u0435\u043D\u0438\u044F \u043E \u0437\u0430\u043D\u044F\u0442\u043E\u0441\u0442\u0438 \u0432 \u043D\u0430\u0441\u0442\u043E\u044F\u0449\u0435\u0435 \u0432\u0440\u0435\u043C\u044F (\u043E\u0441\u043D. \u043C\u0435\u0441\u0442\u043E \u0440\u0430\u0431\u043E\u0442\u044B)");
        label_28.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_28.setBounds(12, 577, 376, 16);
        frame.getContentPane().add(label_28);

        JCheckBox Rabota1 = new JCheckBox("\u041F\u043E\u0441\u0442\u043E\u044F\u043D\u043D\u0430\u044F \u0440\u0430\u0431\u043E\u0442\u0430");
        Rabota1.setFont(new Font("Dialog", Font.PLAIN, 10));
        JCheckBox Svoi = new JCheckBox("\u0421\u043E\u0431\u0441\u0442\u0432\u0435\u043D\u043D\u044B\u0439 \u0431\u0438\u0437\u043D\u0435\u0441");
        Svoi.setFont(new Font("Dialog", Font.PLAIN, 10));
        JCheckBox Rabota2 = new JCheckBox("\u0412\u0440\u0435\u043C\u0435\u043D\u043D\u0430\u044F \u0440\u0430\u0431\u043E\u0442\u0430");
        Rabota2.setFont(new Font("Dialog", Font.PLAIN, 10));

        Rabota1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Rabota1.isSelected()) {
                    Rabota2.setEnabled(false);
                    Svoi.setEnabled(false);
                } else {
                    Rabota2.setEnabled(true);
                    Svoi.setEnabled(true);
                }
                if (Rabota1.isSelected()) {
                    rabota = "Postoyannaya rabota";
                } else {

                    rabota = "";
                }

            }
        });

        Rabota2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Rabota2.isSelected()) {
                    Rabota1.setEnabled(false);
                    Svoi.setEnabled(false);
                } else {
                    Rabota1.setEnabled(true);
                    Svoi.setEnabled(true);
                }
                if (Rabota2.isSelected()) {
                    rabota = "Vremennaya rabota";
                } else {
                    rabota = "";
                }

            }
        });

        Svoi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Svoi.isSelected()) {
                    Rabota1.setEnabled(false);
                    Rabota2.setEnabled(false);
                } else {
                    Rabota1.setEnabled(true);
                    Rabota2.setEnabled(true);
                }
                if (Svoi.isSelected()) {
                    rabota = "Sobstvennyj biznes";
                } else {
                    rabota = "";
                }
            }
        });

        Rabota1.setBounds(324, 573, 143, 25);
        frame.getContentPane().add(Rabota1);
        Rabota2.setBounds(465, 573, 127, 25);
        frame.getContentPane().add(Rabota2);
        Svoi.setBounds(588, 573, 143, 25);
        frame.getContentPane().add(Svoi);

        JLabel label_29 = new
                JLabel("\u041F\u0440\u043E\u0444\u0435\u0441\u0441\u0438\u044F");
        label_29.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_29.setForeground(new Color(255, 0, 0));
        label_29.setBounds(12, 606, 78, 16);
        frame.getContentPane().add(label_29);

        JLabel label_30 = new JLabel("\u0421\u0440\u043E\u043A \u0440\u0430\u0431\u043E\u0442\u044B \u043D\u0430 \u0434\u0430\u043D\u043D\u043E\u043C \u043F\u0440\u0435\u0434\u043F\u0440\u0438\u044F\u0442\u0438\u0438");
        label_30.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_30.setBounds(12, 635, 228, 16);
        frame.getContentPane().add(label_30);

        Prof = new JTextField();
        Prof.setFont(new Font("Dialog", Font.PLAIN, 10));
        Prof.setBounds(108, 603, 252, 22);
        frame.getContentPane().add(Prof);
        Prof.setColumns(10);

        SrokRab = new JTextField();
        SrokRab.setFont(new Font("Dialog", Font.PLAIN, 10));
        SrokRab.setBounds(244, 632, 116, 22);
        frame.getContentPane().add(SrokRab);
        SrokRab.setColumns(10);

        JLabel label_31 = new JLabel("\u0410\u0434\u0440\u0435\u0441 \u043F\u0440\u0435\u0434\u043F\u0440\u0438\u044F\u0442\u0438\u044F");
        label_31.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_31.setBounds(372, 619, 129, 16);
        frame.getContentPane().add(label_31);

        AdressRab = new JTextField();
        AdressRab.setFont(new Font("Dialog", Font.PLAIN, 10));
        AdressRab.setBounds(480, 616, 191, 22);
        frame.getContentPane().add(AdressRab);
        AdressRab.setColumns(10);

        JLabel label_32 = new JLabel("\u0421\u0444\u0435\u0440\u0430 \u0434\u0435\u044F\u0442\u0435\u043B\u044C\u043D\u043E\u0441\u0442\u0438 ");
        label_32.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_32.setForeground(new Color(255, 0, 0));
        label_32.setBounds(12, 676, 134, 16);
        frame.getContentPane().add(label_32);

        JLabel label_33 = new JLabel("\u0432\u0430\u0448\u0435\u0433\u043E \u043F\u0440\u0435\u0434\u043F\u0440\u0438\u044F\u0442\u0438\u044F");
        label_33.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_33.setForeground(new Color(255, 0, 0));
        label_33.setBounds(12, 693, 127, 16);
        frame.getContentPane().add(label_33);

        JComboBox comboBox = new JComboBox();
        comboBox.setFont(new Font("Dialog", Font.PLAIN, 10));
        comboBox.setModel(new DefaultComboBoxModel(new String[]{"\u0423\u043F\u0440\u0430\u0432\u043B\u044F\u044E\u0449\u0438\u0435 \u043A\u043E\u043C\u043F\u0430\u043D\u0438\u0438", "\u0421\u0442\u0440\u0430\u0445\u043E\u0432\u0430\u043D\u0438\u0435", "\u0411\u0430\u043D\u043A\u0438", "\u041C\u0435\u0442\u0430\u043B\u043B\u0443\u0440\u0433\u0438\u044F", "\u042D\u043D\u0435\u0440\u0433\u0435\u0442\u0438\u043A\u0430", "\u042E\u0440\u0438\u0434\u0438\u0447\u0435\u0441\u043A\u0438\u0435 \u0443\u0441\u043B\u0443\u0433\u0438", "\u0418\u043D\u0444\u043E\u0440\u043C\u0430\u0446\u0438\u043E\u043D\u043D\u044B\u0435 \u0443\u0441\u043B\u0443\u0433\u0438", "\u0418\u043D\u0444\u043E\u0440\u043C\u0430\u0446\u0438\u043E\u043D\u043D\u044B\u0435 \u0442\u0435\u0445\u043D\u043E\u043B\u043E\u0433\u0438\u0438", "\u0422\u043E\u0440\u0433\u043E\u0432\u043B\u044F", "\u0420\u0430\u0437\u0432\u043B\u0435\u0447\u0435\u043D\u0438\u044F", "\u041B\u043E\u0433\u0438\u0441\u0442\u0438\u043A\u0430", "\u0422\u0443\u0440\u0438\u0437\u043C", "\u0417\u0434\u0440\u0430\u0432\u043E\u043E\u0445\u0440\u0430\u043D\u0435\u043D\u0438\u0435", "\u0421\u041C\u0418", "\u0422\u0440\u0430\u043D\u0441\u043F\u043E\u0440\u0442", "\u0413\u043E\u0441\u0443\u0434\u0430\u0440\u0441\u0442\u0432\u0435\u043D\u043D\u0430\u044F \u0441\u043B\u0443\u0436\u0431\u0430", "\u0420\u0435\u0441\u0442\u043E\u0440\u0430\u043D\u043D\u044B\u0439 \u0431\u0438\u0437\u043D\u0435\u0441", "\u041D\u0430\u0443\u043A\u0430", "\u041E\u0431\u0440\u0430\u0437\u043E\u0432\u0430\u043D\u0438\u0435", "\u041C\u0430\u0440\u043A\u0435\u0442\u0438\u043D\u0433", "\u041F\u043E\u0434\u0431\u043E\u0440 \u043F\u0435\u0440\u0441\u043E\u043D\u0430\u043B\u0430", "\u0421\u0442\u0440\u043E\u0438\u0442\u0435\u043B\u044C\u0441\u0442\u0432\u043E", "\u041D\u0435\u0434\u0432\u0438\u0436\u0438\u043C\u043E\u0441\u0442\u044C ", "\u041D\u0435\u0444\u0442\u0435\u0433\u0430\u0437\u043E\u0432\u0430\u044F \u043F\u0440\u043E\u043C\u044B\u0448\u043B\u0435\u043D\u043D\u043E\u0441\u0442\u044C"}));
        comboBox.setBounds(145, 690, 293, 23);
        comboBox.setSelectedItem(null);
        frame.getContentPane().add(comboBox);

        JLabel lblNewLabel_8 = new JLabel("\u0414\u043E\u0445\u043E\u0434 \u043F\u043E \u043E\u0441\u043D\u043E\u0432\u043D\u043E\u043C\u0443 \u043C\u0435\u0441\u0442\u0443 \u0440\u0430\u0431\u043E\u0442\u044B (\u043F\u043E\u0441\u043B\u0435\u0443\u043F\u043B\u0430\u0442\u044B \u043D\u0430\u043B\u043E\u0433\u043E\u0432)");
        lblNewLabel_8.setFont(new Font("Dialog", Font.PLAIN, 10));
        lblNewLabel_8.setBounds(737, 499, 309, 16);
        frame.getContentPane().add(lblNewLabel_8);

        JLabel label_34 = new JLabel("5. \u0418\u041D\u0424\u041E\u0420\u041C\u0410\u0426\u0418\u042F \u041E \u0414\u041E\u0425\u041E\u0414\u0410\u0425 \u0418 \u0420\u0410\u0421\u0425\u041E\u0414\u0410\u0425");
        label_34.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        label_34.setBounds(737, 470, 335, 16);
        frame.getContentPane().add(label_34);

        JLabel label_35 = new JLabel("\u0414\u043E\u0445\u043E\u0434 \u043E\u0442 \u0440\u0430\u0431\u043E\u0442\u044B \u043F\u043E \u0441\u043E\u0432\u043C\u0435\u0441\u0442\u0438\u0442\u0435\u043B\u044C\u0441\u0442\u0432\u0443");
        label_35.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_35.setBounds(737, 514, 212, 16);
        frame.getContentPane().add(label_35);

        JLabel label_36 = new JLabel("\u041F\u043E\u043B\u0443\u0447\u0430\u0435\u043C\u044B\u0435 \u0430\u043B\u0438\u043C\u0435\u043D\u0442\u044B \u0438 \u043F\u043E\u0441\u043E\u0431\u0438\u044F \u043D\u0430 \u0434\u0435\u0442\u0435\u0439");
        label_36.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_36.setBounds(737, 529, 218, 16);
        frame.getContentPane().add(label_36);

        JLabel label_37 = new JLabel("\u0414\u043E\u0445\u043E\u0434\u044B \u0432 \u0432\u0438\u0434\u0435 \u0430\u0440\u0435\u043D\u0434\u043D\u043E\u0439 \u043F\u043B\u0430\u0442\u044B");
        label_37.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_37.setBounds(737, 544, 173, 16);
        frame.getContentPane().add(label_37);

        JLabel label_38 = new JLabel("\u0418\u0441\u0442\u043E\u0447\u043D\u0438\u043A\u0438 ");
        label_38.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_38.setBounds(737, 604, 162, 16);
        frame.getContentPane().add(label_38);

        JLabel label_39 = new JLabel("\u041F\u0440\u043E\u0446\u0435\u043D\u0442\u044B \u043F\u043E \u0434\u0435\u043F\u043E\u0437\u0438\u0442\u0430\u043C, \u0434\u0438\u0432\u0438\u0434\u0435\u043D\u0442\u044B \u043F\u043E \u0446\u0435\u043D\u043D\u044B\u043C \u0431\u0443\u043C\u0430\u0433\u0430\u043C");
        label_39.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_39.setBounds(737, 559, 288, 16);
        frame.getContentPane().add(label_39);

        JLabel label_40 = new JLabel("\u0420\u0435\u0433\u0443\u043B\u044F\u0440\u043D\u0430\u044F \u043C\u0430\u0442\u0435\u0440\u0438\u0430\u043B\u044C\u043D\u0430\u044F \u043F\u043E\u043C\u043E\u0449\u044C");
        label_40.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_40.setBounds(737, 574, 184, 16);
        frame.getContentPane().add(label_40);

        JLabel label_41 = new JLabel("\u0418\u043D\u044B\u0435 \u0434\u043E\u0445\u043E\u0434\u044B");
        label_41.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_41.setBounds(737, 589, 78, 16);
        frame.getContentPane().add(label_41);

        JLabel label_42 = new JLabel("\u041E\u0431\u0449\u0438\u0435 \u0440\u0430\u0441\u0445\u043E\u0434\u044B, \u0432 \u0442\u043E\u043C \u0447\u0438\u0441\u043B\u0435:");
        label_42.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_42.setBounds(1170, 499, 179, 16);
        frame.getContentPane().add(label_42);

        JLabel label_43 = new JLabel("\u0423\u043F\u043B\u0430\u0447\u0438\u0432\u0430\u0435\u043C\u044B\u0435 \u0430\u043B\u0438\u043C\u0435\u043D\u0442\u044B");
        label_43.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_43.setBounds(1170, 514, 179, 16);
        frame.getContentPane().add(label_43);

        JLabel label_44 = new JLabel("\u041C\u0438\u043D\u0438\u043C\u0430\u043B\u044C\u043D\u044B\u0435 \u0441\u0440\u0435\u0434\u0441\u0442\u0432\u0430 \u043D\u0430 \u0441\u043E\u0434\u0435\u0440\u0436\u0430\u043D\u0438\u0435 \u0438\u0436\u0434\u0438\u0432\u0435\u043D\u0446\u0435\u0432");
        label_44.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_44.setBounds(1170, 529, 179, 16);
        frame.getContentPane().add(label_44);

        JLabel label_45 = new JLabel("\u041E\u0431\u044F\u0437\u0430\u0442\u0435\u043B\u044C\u043D\u044B\u0435 \u043F\u043B\u0430\u0442\u0435\u0436\u0438 \u043F\u043E\u043A\u0440\u0435\u0434\u0438\u0442\u0430\u043C \u0438 \u0441\u0442\u0440\u0430\u0445\u043E\u0432\u043A\u0435");
        label_45.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_45.setBounds(1170, 544, 179, 16);
        frame.getContentPane().add(label_45);

        JLabel label_46 = new JLabel("\u041F\u043B\u0430\u0442\u0430 \u0437\u0430 \u043E\u0431\u0440\u0430\u0437\u043E\u0432\u0430\u043D\u0438\u0435");
        label_46.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_46.setBounds(1170, 604, 179, 16);
        frame.getContentPane().add(label_46);

        JLabel label_47 = new JLabel("\u0410\u0440\u0435\u043D\u0434\u0430 \u0436\u0438\u043B\u044C\u044F");
        label_47.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_47.setBounds(1170, 559, 179, 16);
        frame.getContentPane().add(label_47);

        JLabel label_48 = new JLabel("\u041A\u043E\u043C\u043C\u0443\u043D\u0430\u043B\u044C\u043D\u044B\u0435 \u0443\u0441\u043B\u0443\u0433\u0438");
        label_48.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_48.setBounds(1170, 574, 179, 16);
        frame.getContentPane().add(label_48);

        JLabel label_49 = new JLabel("\u0421\u043E\u0434\u0435\u0440\u0436\u0430\u043D\u0438\u0435 \u0430\u0432\u0442\u043E\u043C\u043E\u0431\u0438\u043B\u044F");
        label_49.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_49.setBounds(1170, 589, 179, 16);
        frame.getContentPane().add(label_49);

        t1 = new JTextField();
        t1.setFont(new Font("Dialog", Font.PLAIN, 10));
        t1.setColumns(10);
        t1.setBounds(1045, 501, 116, 11);
        frame.getContentPane().add(t1);

        t2 = new JTextField();
        t2.setFont(new Font("Dialog", Font.PLAIN, 10));
        t2.setColumns(10);
        t2.setBounds(1045, 516, 116, 11);
        frame.getContentPane().add(t2);

        t3 = new JTextField();
        t3.setFont(new Font("Dialog", Font.PLAIN, 10));
        t3.setColumns(10);
        t3.setBounds(1045, 531, 116, 11);
        frame.getContentPane().add(t3);

        t4 = new JTextField();
        t4.setFont(new Font("Dialog", Font.PLAIN, 10));
        t4.setColumns(10);
        t4.setBounds(1045, 546, 116, 11);
        frame.getContentPane().add(t4);

        t5 = new JTextField();
        t5.setFont(new Font("Dialog", Font.PLAIN, 10));
        t5.setColumns(10);
        t5.setBounds(1044, 561, 116, 11);
        frame.getContentPane().add(t5);

        t6 = new JTextField();
        t6.setFont(new Font("Dialog", Font.PLAIN, 10));
        t6.setColumns(10);
        t6.setBounds(1044, 576, 116, 11);
        frame.getContentPane().add(t6);

        t7 = new JTextField();
        t7.setFont(new Font("Dialog", Font.PLAIN, 10));
        t7.setColumns(10);
        t7.setBounds(1045, 591, 116, 11);
        frame.getContentPane().add(t7);

        t8 = new JTextField();
        t8.setFont(new Font("Dialog", Font.PLAIN, 10));
        t8.setColumns(10);
        t8.setBounds(836, 604, 325, 35);
        frame.getContentPane().add(t8);

        t9 = new JTextField();
        t9.setFont(new Font("Dialog", Font.PLAIN, 10));
        t9.setColumns(10);
        t9.setBounds(1350, 499, 127, 11);
        frame.getContentPane().add(t9);

        t10 = new JTextField();
        t10.setFont(new Font("Dialog", Font.PLAIN, 10));
        t10.setColumns(10);
        t10.setBounds(1350, 514, 127, 11);
        frame.getContentPane().add(t10);

        t11 = new JTextField();
        t11.setFont(new Font("Dialog", Font.PLAIN, 10));
        t11.setColumns(10);
        t11.setBounds(1350, 529, 127, 11);
        frame.getContentPane().add(t11);

        t12 = new JTextField();
        t12.setFont(new Font("Dialog", Font.PLAIN, 10));
        t12.setColumns(10);
        t12.setBounds(1350, 544, 127, 11);
        frame.getContentPane().add(t12);

        t13 = new JTextField();
        t13.setFont(new Font("Dialog", Font.PLAIN, 10));
        t13.setColumns(10);
        t13.setBounds(1350, 559, 127,
                11);
        frame.getContentPane().add(t13);

        t14 = new JTextField();
        t14.setFont(new Font("Dialog", Font.PLAIN, 10));
        t14.setColumns(10);
        t14.setBounds(1350, 574, 127, 11);
        frame.getContentPane().add(t14);

        t15 = new JTextField();
        t15.setFont(new Font("Dialog", Font.PLAIN, 10));
        t15.setColumns(10);
        t15.setBounds(1350, 592, 127, 11);
        frame.getContentPane().add(t15);

        t16 = new JTextField();
        t16.setFont(new Font("Dialog", Font.PLAIN, 10));
        t16.setColumns(10);
        t16.setBounds(1350, 607, 127, 11);
        frame.getContentPane().add(t16);

        t17 = new JTextField();
        t17.setFont(new Font("Dialog", Font.PLAIN, 10));
        t17.setColumns(10);
        t17.setBounds(1350, 622, 127, 11);
        frame.getContentPane().add(t17);

        t18 = new JTextField();
        t18.setFont(new Font("Dialog", Font.PLAIN, 10));
        t18.setColumns(10);
        t18.setBounds(1350, 637, 127, 11);
        frame.getContentPane().add(t18);

        t19 = new JTextField();
        t19.setFont(new Font("Dialog", Font.PLAIN, 10));
        t19.setColumns(10);
        t19.setBounds(978, 128, 392, 22);
        frame.getContentPane().add(t19);

        t20 = new JTextField();
        t20.setFont(new Font("Dialog", Font.PLAIN, 10));
        t20.setColumns(10);
        t20.setBounds(978, 211, 392, 22);
        frame.getContentPane().add(t20);

        t21 = new JTextField();
        t21.setFont(new Font("Dialog", Font.PLAIN, 10));
        t21.setColumns(10);
        t21.setBounds(873, 275, 159, 22);
        frame.getContentPane().add(t21);

        t22 = new JTextField();
        t22.setFont(new Font("Dialog", Font.PLAIN, 10));
        t22.setColumns(10);
        t22.setBounds(873, 304, 159, 22);
        frame.getContentPane().add(t22);

        t23 = new JTextField();
        t23.setFont(new Font("Dialog", Font.PLAIN, 10));
        t23.setColumns(10);
        t23.setBounds(1136, 272, 158, 22);
        frame.getContentPane().add(t23);

        t24 = new JTextField();
        t24.setFont(new Font("Dialog", Font.PLAIN, 10));
        t24.setColumns(10);
        t24.setBounds(1136, 304, 158, 22);
        frame.getContentPane().add(t24);

        JLabel lblNewLabel_9 = new JLabel("\u0434\u0440\u0443\u0433\u0438\u0445 \u0434\u043E\u0445\u043E\u0434\u043E\u0432");
        lblNewLabel_9.setFont(new Font("Dialog", Font.PLAIN, 10));
        lblNewLabel_9.setBounds(737, 619, 103, 16);
        frame.getContentPane().add(lblNewLabel_9);

        JLabel label_50 = new JLabel("\u0414\u043E\u043F\u043E\u043B\u043D\u0438\u0442\u0435\u043B\u044C\u043D\u044B\u0435 \u0440\u0430\u0441\u0445\u043E\u0434\u044B");
        label_50.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_50.setBounds(1170, 618, 179, 16);
        frame.getContentPane().add(label_50);

        JLabel label_51 = new JLabel("\u041E\u0431\u044F\u0437\u0430\u0442\u0435\u043B\u044C\u043D\u044B\u0435 \u043D\u0430\u043B\u043E\u0433\u043E\u0432\u044B\u0435 \u043F\u043B\u0430\u0442\u0435\u0436\u0438");
        label_51.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_51.setBounds(1170, 633, 179, 16);
        frame.getContentPane().add(label_51);

        JComboBox comboBox_1 = new JComboBox();
        comboBox_1.setFont(new Font("Dialog", Font.PLAIN, 10));
        comboBox_1.setModel(new DefaultComboBoxModel(new String[]{"\u0418\u043C\u0435\u0435\u0442\u0441\u044F \u0432 \u041E\u0410\u041E \u00AB\u041E\u0422\u041F \u0411\u0430\u043D\u043A\u00BB", "\u0418\u043C\u0435\u0435\u0442\u0441\u044F \u0432 \u0434\u0440\u0443\u0433\u0438\u0445 \u0431\u0430\u043D\u043A\u0430\u0445", "\u0420\u0424 \u0418\u043C\u0435\u0435\u0442\u0441\u044F \u0432 \u0437\u0430\u0440\u0443\u0431\u0435\u0436\u043D\u044B\u0445 \u0431\u0430\u043D\u043A\u0430\u0445", "\u041D\u0435 \u0438\u043C\u0435\u0435\u0442\u0441\u044F"}));
        comboBox_1.setSelectedItem(null);
        comboBox_1.setBounds(958, 362, 304, 22);
        frame.getContentPane().add(comboBox_1);

        JLabel label_67 = new JLabel("\u0418\u043C\u0435\u0435\u0442\u0435 \u043B\u0438 \u0432\u044B \u043F\u043B\u0430\u0441\u0442\u0438\u043A\u043E\u0432\u0443\u044E \u043A\u0430\u0440\u0442\u0443?");
        label_67.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_67.setForeground(Color.BLACK);
        label_67.setBounds(738, 397, 208, 16);
        frame.getContentPane().add(label_67);

        JComboBox comboBox_2 = new JComboBox();
        comboBox_2.setFont(new Font("Dialog", Font.PLAIN, 10));
        comboBox_2.setModel(new DefaultComboBoxModel(new String[]{"Classic / Standart / Eurocard / MasterCard Mass", "Platinum / Centurion / Infinity", "Gold", "Business", "VISA Electron,Cirrus Maestro, \u0438\u043D\u043E\u0439 \u0442\u0438\u043F \u043A\u0430\u0440\u0442\u044B", "\u041D\u0435 \u0438\u043C\u0435\u044E"}));
        comboBox_2.setSelectedItem(null);
        comboBox_2.setBounds(958, 394, 304, 22);
        frame.getContentPane().add(comboBox_2);

        JLabel label_69 = new JLabel();
        label_69.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_69.setBounds(893, 549, 56, 16);
        frame.getContentPane().add(label_69);

        JButton btnNewButton = new JButton("\u0421\u043E\u0445\u0440\u0430\u043D\u0438\u0442\u044C");
        btnNewButton.setFont(new Font("Dialog", Font.PLAIN, 10));
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                CoefDuran coefDuran = new CoefDuran();
                kukuha = (String) comboBox.getSelectedItem();
                bank = (String) comboBox_1.getSelectedItem();
                card = (String) comboBox_2.getSelectedItem();

                if (pol != null) {
                    if (pol.equals("ZHenskij"))
                        q = q + 0.4;
                    coefDuran.setDuran(q);
                }


                if (bank != null && bank != "Ne imeetsya") {
                    q = q + 0.45;
                    coefDuran.setDuran(q);
                }


                if (Year.getText().isEmpty()) {
                    q = q + 0.0;
                    coefDuran.setDuran(q);
                } else {
                    if ((Double.parseDouble(Year.getText()) * 0.042) < 0.42) {
                        q = q + (Double.parseDouble(Year.getText()) * 0.042);
                        coefDuran.setDuran(q);
                    } else {
                        q = q + 0.42;
                        coefDuran.setDuran(q);
                    }
                }


                if (BirthDate.getText().isEmpty()) {

                    q = q + 0.0;
                    coefDuran.setDuran(q);

                } else {
                    if ((Double.parseDouble(BirthDate.getText()) > 20)) {
                        if (((Double.parseDouble(BirthDate.getText()) - 20) * 0.1) <= 0.3) {
                            q = q + ((Double.parseDouble(BirthDate.getText()) - 20) * 0.1);
                            coefDuran.setDuran(q);
                        } else {
                            q = q + 0.3;
                            coefDuran.setDuran(q);
                        }
                    }
                }

                if (SrokRab.getText().isEmpty()) {
                    q = q + 0.0;
                    coefDuran.setDuran(q);
                } else {
                    q = q + (Double.parseDouble(SrokRab.getText()) * 0.059);
                    coefDuran.setDuran(q);
                }

                if (kukuha != null) {
                    if (kukuha.equals("Metallurgiya") || kukuha.equals("Logistika") || kukuha.equals("Transport") || kukuha.equals("Stroitelstvo") || kukuha.equals("Neftegazovaya promyshlennost"))
                        q = q + 0.0;
                    coefDuran.setDuran(q);
                } else {
                    q = q + 0.55;
                    coefDuran.setDuran(q);
                }

                if (q != 0.0) {
                    label_69.setText(q + "");
                    coefDuran.setDuran(q);
                }

                if (kv != null) {
                    if (kv.equals("Edinolichnaya sobstvennost") || dom.equals("Edinolichnaya sobstvennost") || avto.equals("Edinolichnaya sobstvennost"))
                        q = q + 0.35;
                    coefDuran.setDuran(q);
                }

                if (strahpol != null) {
                    if (strahpol.equals("Imeyu"))
                        q = q + 0.19;
                    coefDuran.setDuran(q);
                }


                if (q <= 1.25) {
                    JOptionPane.showMessageDialog(null, "Vashe zayavlenie ne proshlo proverku na platyozhesposobnost.");

                } else {
                    Place place ;
                    list.add( place = new Place(Ru, pol, grazh, strahpol, adrsov, sempol, SumKr.getText(), SrokKr.getText(), Surname.getText(), Name.getText(),
                            SecondName.getText(), BirthDate.getText(), BirthPlace.getText(), SerNum.getText(), Num.getText(), PassDate.getText(), Organ.getText(),
                            Index.getText(), City.getText(), Street.getText(), House.getText(), Corp.getText(), Year.getText(), Phone.getText(),
                            Mobile.getText(), Children.getText(), ne18.getText(), Prof.getText(), SrokRab.getText(), kukuha, rabota, AdressRab.getText(),
                            kv, dom, avto, bank, card, lm, t1.getText(),
                            t2.getText(), t3.getText(), t4.getText(), t5.getText(), t6.getText(), t7.getText(),
                            t8.getText(), t9.getText(), t10.getText(), t11.getText(), t12.getText(),
                            t13.getText(), t14.getText(), t15.getText(), t16.getText(), t17.getText(), t18.getText(),
                            t19.getText(), t20.getText(), t21.getText(), t22.getText(), t23.getText(), t24.getText()));
                    System.out.println(place);
                    System.out.println(coefDuran);
                    db dbServ = new db();
                    dbServ.create(place);
                    dbServ.createCoefDurant(coefDuran);
                    Menu ab = new Menu();
                    ab.main(null);
                    frame.dispose();
                }


            }
        });
        frame.getContentPane().add(btnNewButton);
        btnNewButton.setBounds(680, 672, 323, 25);

        JLabel label_52 = new JLabel("3. \u0418\u041D\u0424\u041E\u0420\u041C\u0410\u0426\u0426\u0418\u042F \u041E\u0411 \u0418\u041C\u0423\u0429\u0415\u0421\u0422\u0412\u0415");
        label_52.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        label_52.setBounds(738, 75, 265, 16);
        frame.getContentPane().add(label_52);

        JLabel label_53 = new JLabel("\u041A\u0412\u0410\u0420\u0422\u0418\u0420\u0410");
        label_53.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_53.setBounds(738, 91, 67, 16);
        frame.getContentPane().add(label_53);

        JLabel label_54 = new JLabel("\u0418\u043C\u0435\u0435\u0442\u0435 \u043B\u0438 \u0432\u044B \u043A\u0432\u0430\u0440\u0442\u0438\u0440\u0443 \u0432 \u0441\u043E\u0431\u0441\u0442\u0432\u0435\u043D\u043D\u043E\u0441\u0442\u0438?");
        label_54.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_54.setForeground(Color.RED);
        label_54.setBounds(738, 104, 245, 16);
        frame.getContentPane().add(label_54);

        JCheckBox Have = new JCheckBox("\u0415\u0434\u0438\u043D\u043E\u043B\u0438\u0447\u043D\u0430\u044F \u0441\u043E\u0431\u0441\u0442\u0432\u0435\u043D\u043D\u043E\u0441\u0442\u044C");
        Have.setFont(new Font("Dialog", Font.PLAIN, 10));
        JCheckBox HalfHave = new JCheckBox("\u0421\u043E\u0432\u043C\u0435\u0441\u0442\u043D\u0430\u044F/\u0434\u043E\u043B\u0435\u0432\u0430\u044F \u0441\u043E\u0431\u0441\u0442\u0432\u0435\u043D\u043D\u043E\u0441\u0442\u044C");
        HalfHave.setFont(new Font("Dialog", Font.PLAIN, 10));
        JCheckBox Not = new JCheckBox("\u041D\u0435 \u0438\u043C\u0435\u044E");
        Not.setFont(new Font("Dialog", Font.PLAIN, 10));
        Have.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Have.isSelected()) {
                    HalfHave.setEnabled(false);
                    Not.setEnabled(false);


                } else {
                    HalfHave.setEnabled(true);
                    Not.setEnabled(true);
                }

                if (Have.isSelected()) {
                    kv = "Edinolichnaya sobstvennost";

                } else {

                    kv = "";
                }
            }
        });

        HalfHave.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (HalfHave.isSelected()) {
                    Have.setEnabled(false);
                    Not.setEnabled(false);


                } else {
                    Have.setEnabled(true);
                    Not.setEnabled(true);

                }

                if (HalfHave.isSelected()) {
                    kv = "Sovmestnaya sobstvennost";

                } else {

                    kv = "";
                }


            }
        });

        Not.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Not.isSelected()) {
                    Have.setEnabled(false);
                    HalfHave.setEnabled(false);


                } else {
                    Have.setEnabled(true);
                    HalfHave.setEnabled(true);

                }

                if (Not.isSelected()) {
                    kv = "Ne imeyu v sobstvennosti";

                } else {

                    kv = "";
                }


            }
        });

        Have.setBounds(950, 100, 173, 25);
        frame.getContentPane().add(Have);

        HalfHave.setBounds(1124, 100, 211, 25);
        frame.getContentPane().add(HalfHave);


        Not.setBounds(1334, 100, 78, 25);
        frame.getContentPane().add(Not);

        JLabel label_55 = new JLabel("\u0410\u0434\u0440\u0435\u0441 \u043A\u0432\u0430\u0440\u0442\u0438\u0440\u044B, \u043D\u0430\u0445\u043E\u0434\u044F\u0449\u0435\u0439\u0441\u044F \u0432 \u0441\u043E\u0431\u0441\u0442\u0432\u0435\u043D\u043D\u043E\u0441\u0442\u0438");
        label_55.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_55.setBounds(738, 130, 283, 16);
        frame.getContentPane().add(label_55);

        JLabel label_56 = new JLabel("\u0417\u0410\u0413\u041E\u0420\u041E\u0414\u041D\u042B\u0419 \u0414\u041E\u041C, \u041A\u041E\u0422\u0422\u0415\u0414\u0416, \u0416\u0418\u041B\u041E\u0419 \u0414\u041E\u041C");
        label_56.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_56.setBounds(738, 159, 290, 16);
        frame.getContentPane().add(label_56);

        JLabel label_57 = new JLabel("\u0418\u043C\u0435\u0435\u0442\u0435 \u043B\u0438 \u0432\u044B \u0437\u0430\u0433\u043E\u0440\u043E\u0434\u043D\u044B\u0439 \u0434\u043E\u043C \u0432 \u0441\u043E\u0431\u0441\u0442\u0432\u0435\u043D\u043D\u043E\u0441\u0442\u0438?");
        label_57.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_57.setBounds(738, 181, 290, 16);
        frame.getContentPane().add(label_57);

        JCheckBox Have1 = new JCheckBox("\u0415\u0434\u0438\u043D\u043E\u043B\u0438\u0447\u043D\u0430\u044F \u0441\u043E\u0431\u0441\u0442\u0432\u0435\u043D\u043D\u043E\u0441\u0442\u044C");
        Have1.setFont(new Font("Dialog", Font.PLAIN, 10));
        JCheckBox HalfHave1 = new JCheckBox("\u0421\u043E\u0432\u043C\u0435\u0441\u0442\u043D\u0430\u044F/\u0434\u043E\u043B\u0435\u0432\u0430\u044F \u0441\u043E\u0431\u0441\u0442\u0432\u0435\u043D\u043D\u043E\u0441\u0442\u044C");
        HalfHave1.setFont(new Font("Dialog", Font.PLAIN, 10));
        JCheckBox Not1 = new JCheckBox("\u041D\u0435 \u0438\u043C\u0435\u044E");
        Not1.setFont(new Font("Dialog", Font.PLAIN, 10));

        Have1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Have1.isSelected()) {
                    HalfHave1.setEnabled(false);
                    Not1.setEnabled(false);
                    dom = "Edinolichnaya sobstvennost";

                } else {
                    HalfHave1.setEnabled(true);
                    Not1.setEnabled(true);
                    dom = "";
                }
            }
        });

        HalfHave1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (HalfHave1.isSelected()) {
                    Have1.setEnabled(false);
                    Not1.setEnabled(false);


                } else {
                    Have1.setEnabled(true);
                    Not1.setEnabled(true);

                }

                if (HalfHave1.isSelected()) {
                    dom = "Sovmestnaya sobstvennost";

                } else {

                    dom = "";
                }


            }
        });

        Not1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Not1.isSelected()) {
                    Have1.setEnabled(false);
                    HalfHave1.setEnabled(false);


                } else {
                    Have1.setEnabled(true);
                    HalfHave1.setEnabled(true);

                }

                if (Not1.isSelected()) {
                    dom = "Ne imeyu v sobstvennosti";

                } else {

                    dom = "";
                }


            }
        });


        Have1.setBounds(978, 181, 167, 20);
        frame.getContentPane().add(Have1);

        HalfHave1.setBounds(1149, 183, 208, 20);
        frame.getContentPane().add(HalfHave1);

        Not1.setBounds(1362, 183, 79, 20);
        frame.getContentPane().add(Not1);

        JLabel label_58 = new JLabel("\u0410\u0434\u0440\u0435\u0441 \u0434\u043E\u043C\u0430, \u043D\u0430\u0445\u043E\u0434\u044F\u0449\u0435\u0433\u043E\u0441\u044F \u0432 \u0441\u043E\u0431\u0441\u0442\u0432\u0435\u043D\u043D\u043E\u0441\u0442\u0438");
        label_58.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_58.setBounds(738, 203, 265, 16);
        frame.getContentPane().add(label_58);

        JLabel label_59 = new JLabel("\u0410\u0412\u0422\u041E\u041C\u041E\u0411\u0418\u041B\u042C");
        label_59.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_59.setBounds(738, 225, 84, 16);
        frame.getContentPane().add(label_59);

        JLabel label_60 = new JLabel("\u0418\u043C\u0435\u0435\u0442\u0435 \u043B\u0438 \u0432\u044B \u0430\u0432\u0442\u043E\u043C\u043E\u0431\u0438\u043B\u044C \u0432 \u0441\u043E\u0431\u0441\u0442\u0432\u0435\u043D\u043D\u043E\u0441\u0442\u0438?");
        label_60.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_60.setBounds(738, 246, 290, 16);
        frame.getContentPane().add(label_60);

        JCheckBox Sobst = new JCheckBox("\u0421\u043E\u0431\u0441\u0442\u0432\u0435\u043D\u043D\u043E\u0441\u0442\u044C");
        Sobst.setFont(new Font("Dialog", Font.PLAIN, 10));
        JCheckBox Gen = new JCheckBox("\u0413\u0435\u043D\u0435\u0440\u0430\u043B\u044C\u043D\u0430\u044F \u0434\u043E\u0432\u0435\u0440\u0435\u043D\u043D\u043E\u0441\u0442\u044C");
        Gen.setFont(new Font("Dialog", Font.PLAIN, 10));
        JCheckBox Not2 = new JCheckBox("\u041D\u0435 \u0438\u043C\u0435\u044E");
        Not2.setFont(new Font("Dialog", Font.PLAIN, 10));

        Sobst.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Sobst.isSelected()) {
                    Gen.setEnabled(false);
                    Not2.setEnabled(false);
                    avto = "Edinolichnaya sobstvennost";

                } else {
                    Gen.setEnabled(true);
                    Not2.setEnabled(true);
                    avto = "";
                }
            }
        });
        Gen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Gen.isSelected()) {
                    Sobst.setEnabled(false);
                    Not2.setEnabled(false);
                    avto = "Generalnaya doverennost";

                } else {
                    Sobst.setEnabled(true);
                    Not2.setEnabled(true);
                    avto = "";
                }
            }
        });
        Not2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Not2.isSelected()) {
                    Gen.setEnabled(false);
                    Sobst.setEnabled(false);
                    avto = "Ne imeyu v sobstvennosti";

                } else {
                    Gen.setEnabled(true);
                    Not1.setEnabled(true);
                    avto = "";
                }
            }
        });


        Sobst.setBounds(1033, 244, 116, 20);
        frame.getContentPane().add(Sobst);

        Gen.setBounds(1158, 244, 191, 20);
        frame.getContentPane().add(Gen);

        Not2.setBounds(1346, 244, 79, 20);
        frame.getContentPane().add(Not2);

        JLabel label_61 = new JLabel("\u041C\u0430\u0440\u043A\u0430 \u0430\u0432\u0442\u043E\u043C\u043E\u0431\u0438\u043B\u044F");
        label_61.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_61.setBounds(738, 275, 111, 16);
        frame.getContentPane().add(label_61);

        JLabel label_62 = new JLabel("\u0413\u043E\u0434 \u0432\u044B\u043F\u0443\u0441\u043A\u0430");
        label_62.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_62.setBounds(1045, 275, 79,
                16);
        frame.getContentPane().add(label_62);

        JLabel label_63 = new JLabel("\u041C\u043E\u0434\u0435\u043B\u044C \u0430\u0432\u0442\u043E\u043C\u043E\u0431\u0438\u043B\u044F");
        label_63.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_63.setBounds(738, 307, 119, 16);
        frame.getContentPane().add(label_63);

        JLabel label_64 = new JLabel("\u0420\u0435\u0433. \u0437\u043D\u0430\u043A");
        label_64.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_64.setBounds(1045, 307, 56, 16);
        frame.getContentPane().add(label_64);

        JLabel label_65 = new JLabel("4. \u0418\u041D\u0424\u041E\u0420\u041C\u0410\u0426\u0418\u042F \u041E \u0424\u0418\u041D\u0410\u041D\u0421\u041E\u0412\u041E\u041C \u0421\u041E\u0421\u0422\u041E\u042F\u041D\u0418\u0418");
        label_65.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        label_65.setBounds(738, 336, 364, 16);
        frame.getContentPane().add(label_65);

        JLabel label_66 = new JLabel("\u0418\u043C\u0435\u0435\u0442\u0441\u044F \u043B\u0438 \u0443 \u0432\u0430\u0441 \u0431\u0430\u043D\u043A\u043E\u0432\u0441\u043A\u0438\u0439 \u0441\u0447\u0451\u0442?");
        label_66.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_66.setForeground(Color.RED);
        label_66.setBounds(738, 365, 208, 16);
        frame.getContentPane().add(label_66);


        JLabel label_68 = new JLabel("\u0418\u043C\u0435\u0435\u0442\u0435 \u043B\u0438 \u0432\u044B \u043A\u0440\u0435\u0434\u0438\u0442\u043D\u044B\u0439 \u043B\u0438\u043C\u0438\u0442 \u043F\u043E \u043A\u0430\u0440\u0442\u0435?");
        label_68.setFont(new Font("Dialog", Font.PLAIN, 10));
        label_68.setBounds(738, 426, 253, 16);
        frame.getContentPane().add(label_68);

        JCheckBox N = new JCheckBox("\u041D\u0435 \u0438\u043C\u0435\u044E");
        N.setFont(new Font("Dialog", Font.PLAIN, 10));
        JCheckBox Y = new JCheckBox("\u0418\u043C\u0435\u044E");
        Y.setFont(new Font("Dialog", Font.PLAIN, 10));

        N.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (N.isSelected()) {
                    Y.setEnabled(false);

                    lm = "Net";

                } else {
                    Y.setEnabled(true);

                    lm = "";
                }
            }
        });

        Y.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (Y.isSelected()) {
                    N.setEnabled(false);
                    lm = "Est";

                } else {
                    N.setEnabled(true);
                    lm = "";
                }
            }
        });

        N.setBounds(1033, 422, 79, 25);
        frame.getContentPane().add(N);
        Y.setBounds(1202, 422, 113, 25);
        frame.getContentPane().add(Y);
        JButton btnNewButton_1 = new JButton("");
        btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
        btnNewButton_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                JOptionPane.showMessageDialog(null, "� ������, �������!!!");
		/*milos ab = new milos();
		ab.main(null);
		ab.main(null);
		ab.main(null);
		ab.main(null);
		ab.main(null);
		ab.main(null);
		ab.main(null);
		ab.main(null);
		ab.main(null);
		ab.main(null);
		ab.main(null);
		ab.main(null);
		ab.main(null);
		ab.main(null);
		ab.main(null);
		ab.main(null);
		ab.main(null);
		ab.main(null);
		ab.main(null);
		ab.main(null);
		ab.main(null);
		ab.main(null);
		ab.main(null);
		ab.main(null);
		ab.main(null);
		ab.main(null);
		ab.main(null);
		ab.main(null);
		ab.main(null);
		ab.main(null);
		ab.main(null);
		ab.main(null);
		ab.main(null);
		ab.main(null);
		ab.main(null);
		ab.main(null);
		ab.main(null);
		ab.main(null);*/


            }
        });
        btnNewButton_1.setContentAreaFilled(false);
        btnNewButton_1.setBorderPainted(false);
        btnNewButton_1.setBounds(-1, 0, 97, 25);
        frame.getContentPane().add(btnNewButton_1);
    }


}