
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;


public class RestaurantGUI extends javax.swing.JFrame {
    // Calculator Variables
    double firstnum;
    double secondnum;
    double result;
    String operations;
    double [] i = new double [5];
    public RestaurantGUI() {
        initComponents();
        jTextField1.setEditable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTxt = new javax.swing.JTextField();
        Reset = new javax.swing.JButton();
        jBtn4 = new javax.swing.JButton();
        jBtn1 = new javax.swing.JButton();
        jBtn5 = new javax.swing.JButton();
        jBtn7 = new javax.swing.JButton();
        jBtn2 = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        jBtn8 = new javax.swing.JButton();
        jBtn9 = new javax.swing.JButton();
        jBtn6 = new javax.swing.JButton();
        Divide = new javax.swing.JButton();
        jBtn3 = new javax.swing.JButton();
        Multiply = new javax.swing.JButton();
        Minus = new javax.swing.JButton();
        Plus = new javax.swing.JButton();
        Percentage = new javax.swing.JButton();
        jBtn = new javax.swing.JButton();
        jBtn0 = new javax.swing.JButton();
        Dot = new javax.swing.JButton();
        Equals = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jCChicBurger = new javax.swing.JCheckBox();
        jCChicBurgerMeal = new javax.swing.JCheckBox();
        jCBCBurger = new javax.swing.JCheckBox();
        jtxtChicBurger = new javax.swing.JTextField();
        jtxtBCBurger = new javax.swing.JTextField();
        jtxtChicBurgerMeal = new javax.swing.JTextField();
        jCmbDrink = new javax.swing.JComboBox<>();
        jCTax = new javax.swing.JCheckBox();
        jCDelivery = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTxtDrink = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jlblCostOfDrinks = new javax.swing.JLabel();
        jlblCostOfMeals = new javax.swing.JLabel();
        jlblCostOfDelivery = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jcmbCurrency = new javax.swing.JComboBox<>();
        jtxtConvert = new javax.swing.JTextField();
        jBtnConvert = new javax.swing.JButton();
        jBtnReset = new javax.swing.JButton();
        jlblConvert = new javax.swing.JLabel();
        jCmbConvert = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jlblSubTotal = new javax.swing.JLabel();
        jlblTax = new javax.swing.JLabel();
        jlblTotal = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jBtnTotal = new javax.swing.JButton();
        jBtnReceipt = new javax.swing.JButton();
        jReset = new javax.swing.JButton();
        jBtnExit = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 316, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 193, Short.MAX_VALUE)
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jPanel1.setAutoscrolls(true);
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setPreferredSize(new java.awt.Dimension(460, 621));

        jTxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTxt.setText("0");
        jTxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtActionPerformed(evt);
            }
        });

        Reset.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Reset.setText("C");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });

        jBtn4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtn4.setText("4");
        jBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn4ActionPerformed(evt);
            }
        });

        jBtn1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtn1.setText("1");
        jBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn1ActionPerformed(evt);
            }
        });

        jBtn5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtn5.setText("5");
        jBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn5ActionPerformed(evt);
            }
        });

        jBtn7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtn7.setText("7");
        jBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn7ActionPerformed(evt);
            }
        });

        jBtn2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtn2.setText("2");
        jBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn2ActionPerformed(evt);
            }
        });

        Exit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Exit.setText("EXIT");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        jBtn8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtn8.setText("8");
        jBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn8ActionPerformed(evt);
            }
        });

        jBtn9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtn9.setText("9");
        jBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn9ActionPerformed(evt);
            }
        });

        jBtn6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtn6.setText("6");
        jBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn6ActionPerformed(evt);
            }
        });

        Divide.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Divide.setText("/");
        Divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DivideActionPerformed(evt);
            }
        });

        jBtn3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtn3.setText("3");
        jBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn3ActionPerformed(evt);
            }
        });

        Multiply.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Multiply.setText("X");
        Multiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MultiplyActionPerformed(evt);
            }
        });

        Minus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Minus.setText("-");
        Minus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MinusActionPerformed(evt);
            }
        });

        Plus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Plus.setText("+");
        Plus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlusActionPerformed(evt);
            }
        });

        Percentage.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Percentage.setText("%");
        Percentage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PercentageActionPerformed(evt);
            }
        });

        jBtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtn.setText("+/-");
        jBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnActionPerformed(evt);
            }
        });

        jBtn0.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtn0.setText("0");
        jBtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn0ActionPerformed(evt);
            }
        });

        Dot.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Dot.setText(".");
        Dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DotActionPerformed(evt);
            }
        });

        Equals.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Equals.setText("=");
        Equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EqualsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Percentage, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Divide, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Dot, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Equals, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Plus, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Minus, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 25, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTxt)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Exit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Percentage, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Divide, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Multiply, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Minus, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Plus, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dot, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Equals, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Calculator", jPanel1);

        jTextArea.setColumns(20);
        jTextArea.setRows(5);
        jScrollPane1.setViewportView(jTextArea);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 53, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Receipt", jPanel9);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jCChicBurger.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCChicBurger.setText("Chicken Burger");
        jCChicBurger.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCChicBurgerMouseClicked(evt);
            }
        });
        jCChicBurger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCChicBurgerActionPerformed(evt);
            }
        });

        jCChicBurgerMeal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCChicBurgerMeal.setText("Chicken Burger Meal");
        jCChicBurgerMeal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCChicBurgerMealMouseClicked(evt);
            }
        });
        jCChicBurgerMeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCChicBurgerMealActionPerformed(evt);
            }
        });

        jCBCBurger.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCBCBurger.setText("Bacon & Cheese Burger");
        jCBCBurger.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCBCBurgerMouseClicked(evt);
            }
        });
        jCBCBurger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBCBurgerActionPerformed(evt);
            }
        });

        jtxtChicBurger.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtChicBurger.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jtxtChicBurger.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtChicBurgerMouseClicked(evt);
            }
        });
        jtxtChicBurger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtChicBurgerActionPerformed(evt);
            }
        });

        jtxtBCBurger.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtBCBurger.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jtxtBCBurger.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtxtBCBurgerMouseClicked(evt);
            }
        });
        jtxtBCBurger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtBCBurgerActionPerformed(evt);
            }
        });

        jtxtChicBurgerMeal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtChicBurgerMeal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jtxtChicBurgerMeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtChicBurgerMealActionPerformed(evt);
            }
        });

        jCmbDrink.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCmbDrink.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select A Drink", "Apple Juice", "Tea", "Pepsi", "Coffee", "Ice Tea", "Ice Coffee", "Orange" }));
        jCmbDrink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCmbDrinkMouseClicked(evt);
            }
        });
        jCmbDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCmbDrinkActionPerformed(evt);
            }
        });

        jCTax.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCTax.setText("Tax");
        jCTax.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCTaxMouseClicked(evt);
            }
        });
        jCTax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCTaxActionPerformed(evt);
            }
        });

        jCDelivery.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCDelivery.setText("Home Delivery");
        jCDelivery.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCDeliveryMouseClicked(evt);
            }
        });
        jCDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCDeliveryActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Drinks");

        jTxtDrink.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTxtDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtDrinkActionPerformed(evt);
            }
        });
        jTxtDrink.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTxtDrinkPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCChicBurger)
                            .addComponent(jCBCBurger)
                            .addComponent(jCChicBurgerMeal))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtBCBurger)
                            .addComponent(jtxtChicBurger)
                            .addComponent(jtxtChicBurgerMeal))
                        .addGap(8, 8, 8))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jCTax, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jCDelivery))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTxtDrink, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jCmbDrink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCChicBurger)
                    .addComponent(jtxtChicBurger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCChicBurgerMeal)
                    .addComponent(jtxtChicBurgerMeal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCBCBurger)
                    .addComponent(jtxtBCBurger, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCmbDrink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxtDrink, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCTax)
                    .addComponent(jCDelivery))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Cost Of Drinks");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Cost Of Meals");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Cost Of Delivery");

        jlblCostOfDrinks.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblCostOfDrinks.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jlblCostOfMeals.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblCostOfMeals.setText("0");
        jlblCostOfMeals.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jlblCostOfMeals.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblCostOfMealsMouseClicked(evt);
            }
        });

        jlblCostOfDelivery.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblCostOfDelivery.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlblCostOfDrinks, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(67, 67, 67)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblCostOfMeals, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblCostOfDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jlblCostOfDrinks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblCostOfMeals, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblCostOfDelivery, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jcmbCurrency.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jcmbCurrency.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Convert From", "USA", "Nigeria", "Kenya", "Canada", "Brazil", "Indonesia", "India", "Pakistan", "Philippines" }));
        jcmbCurrency.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcmbCurrencyMouseClicked(evt);
            }
        });
        jcmbCurrency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcmbCurrencyActionPerformed(evt);
            }
        });

        jtxtConvert.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtConvert.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jtxtConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtConvertActionPerformed(evt);
            }
        });

        jBtnConvert.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnConvert.setText("Convert");
        jBtnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnConvertActionPerformed(evt);
            }
        });

        jBtnReset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnReset.setText("Reset");
        jBtnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnResetMouseClicked(evt);
            }
        });
        jBtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnResetActionPerformed(evt);
            }
        });

        jlblConvert.setBackground(new java.awt.Color(255, 255, 255));
        jlblConvert.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblConvert.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblConvert.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));

        jCmbConvert.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jCmbConvert.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Convert To", "USA", "Nigeria", "Kenya", "Canada", "Brazil", "Indonesia", "India", "Pakistan", "Philippines" }));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jBtnConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jlblConvert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtxtConvert, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                    .addComponent(jCmbConvert, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcmbCurrency, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jcmbCurrency, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtxtConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCmbConvert, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlblConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Sub Total");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Tax");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Total");

        jlblSubTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblSubTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jlblTax.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblTax.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jlblTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jlblSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlblTax, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jlblSubTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblTax, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlblTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jBtnTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnTotal.setText("Total");
        jBtnTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnTotalMouseClicked(evt);
            }
        });
        jBtnTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnTotalActionPerformed(evt);
            }
        });

        jBtnReceipt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnReceipt.setText("Receipt");
        jBtnReceipt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnReceiptMouseClicked(evt);
            }
        });
        jBtnReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnReceiptActionPerformed(evt);
            }
        });

        jReset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jReset.setText("Reset");
        jReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jResetMouseClicked(evt);
            }
        });
        jReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jResetActionPerformed(evt);
            }
        });

        jBtnExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnExit.setText("Exit");
        jBtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtnTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(jBtnReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(jReset, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jBtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jReset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jTextField1.setText("Restaurant Management System");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtChicBurgerMealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtChicBurgerMealActionPerformed
        
    }//GEN-LAST:event_jtxtChicBurgerMealActionPerformed

    private void MultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MultiplyActionPerformed
        try{
        firstnum = Double.parseDouble(jTxt.getText());
        jTxt.setText("");
        operations="*";
        }
        catch(NumberFormatException e){
            e.getMessage();
        }
    }//GEN-LAST:event_MultiplyActionPerformed

    private void MinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MinusActionPerformed
        try{
        firstnum = Double.parseDouble(jTxt.getText());
        jTxt.setText("");
        operations="-";
        }
        catch(NumberFormatException e){
            e.getMessage();
        }
    }//GEN-LAST:event_MinusActionPerformed

    private void PlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlusActionPerformed
        try{
        firstnum = Double.parseDouble(jTxt.getText());
        jTxt.setText("");
        operations="+";
        }
        catch(NumberFormatException e){
            e.getMessage();
        }
    }//GEN-LAST:event_PlusActionPerformed

    private void PercentageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PercentageActionPerformed
        try{
        firstnum = Double.parseDouble(jTxt.getText());
        jTxt.setText("");
        operations = "%";
        }
        catch(NumberFormatException e){
            e.getMessage();
        }
    }//GEN-LAST:event_PercentageActionPerformed

    private void EqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EqualsActionPerformed
        try{
        secondnum = Double.parseDouble(jTxt.getText());
        if( null != operations)
            switch (operations) {
                case "+":
                    result = firstnum + secondnum;
                    jTxt.setText(String.valueOf(result));
                    break;
                case "-":
                    result = firstnum - secondnum;
                    jTxt.setText(String.valueOf(result));
                    break;
                case "*":
                    result = firstnum * secondnum;
                    jTxt.setText(String.valueOf(result));
                    break;
                case "/":
                    result = firstnum / secondnum;
                    jTxt.setText(String.valueOf(result));
                    break;
                case "%":
                    result = (secondnum / 100) * firstnum;
                    jTxt.setText(String.valueOf(result));
                    break;
                default:
                    break;
            }
        }
        catch(NumberFormatException e){
            e.getMessage();
        }
    }//GEN-LAST:event_EqualsActionPerformed

    private void jTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtActionPerformed
        
    }//GEN-LAST:event_jTxtActionPerformed

    private void jBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn4ActionPerformed
        String Enternumber = jTxt.getText() + jBtn4.getText();
        jTxt.setText(Enternumber);
    }//GEN-LAST:event_jBtn4ActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
            System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        jTxt.setText("");
    }//GEN-LAST:event_ResetActionPerformed

    private void DivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DivideActionPerformed
        try{
        firstnum = Double.parseDouble(jTxt.getText());
        jTxt.setText("");
        operations="/";
        }
        catch(NumberFormatException e){
            e.getMessage();
        }
    }//GEN-LAST:event_DivideActionPerformed

    private void jBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn7ActionPerformed
        String Enternumber = jTxt.getText() + jBtn7.getText();
        jTxt.setText(Enternumber);
    }//GEN-LAST:event_jBtn7ActionPerformed

    private void jBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn8ActionPerformed
        String Enternumber = jTxt.getText() + jBtn8.getText();
        jTxt.setText(Enternumber);
    }//GEN-LAST:event_jBtn8ActionPerformed

    private void jBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn9ActionPerformed
        String Enternumber = jTxt.getText() + jBtn9.getText();
        jTxt.setText(Enternumber);
    }//GEN-LAST:event_jBtn9ActionPerformed

    private void jBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn5ActionPerformed
        String Enternumber = jTxt.getText() + jBtn5.getText();
        jTxt.setText(Enternumber);
    }//GEN-LAST:event_jBtn5ActionPerformed

    private void jBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn6ActionPerformed
        String Enternumber = jTxt.getText() + jBtn6.getText();
        jTxt.setText(Enternumber);
    }//GEN-LAST:event_jBtn6ActionPerformed

    private void jBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn1ActionPerformed
        String Enternumber = jTxt.getText() + jBtn1.getText();
        jTxt.setText(Enternumber);
    }//GEN-LAST:event_jBtn1ActionPerformed

    private void jBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn2ActionPerformed
        String Enternumber = jTxt.getText() + jBtn2.getText();
        jTxt.setText(Enternumber);
    }//GEN-LAST:event_jBtn2ActionPerformed

    private void jBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn3ActionPerformed
        String Enternumber = jTxt.getText() + jBtn3.getText();
        jTxt.setText(Enternumber);
    }//GEN-LAST:event_jBtn3ActionPerformed

    private void jBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnActionPerformed
        double ops = Double.parseDouble(String.valueOf(jTxt.getText()));
        ops = ops * (-1);
        jTxt.setText(String.valueOf(ops));
    }//GEN-LAST:event_jBtnActionPerformed

    private void jBtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn0ActionPerformed
        String Enternumber = jTxt.getText() + jBtn0.getText();
        jTxt.setText(Enternumber);
    }//GEN-LAST:event_jBtn0ActionPerformed

    private void DotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DotActionPerformed
        String Enternumber = jTxt.getText() + Dot.getText();
        jTxt.setText(Enternumber);
    }//GEN-LAST:event_DotActionPerformed

    private void jtxtConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtConvertActionPerformed
        
    }//GEN-LAST:event_jtxtConvertActionPerformed

    private void jBtnConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnConvertActionPerformed
        try{
        // From Nigeria Variables
        double NairaToUSD = 0.0032;
        double NairaToShilling = 0.33;
        double NairaToReal = 0.01;
        double NairaToC$ = 0.0042;
        double NairaToIndianRupee = 0.22;
        double NairaToPeso = 0.16;
        double NairaToRupiah = 42.41;
        double NairaToPKR = 0.33;
        // From USD Variables
        double USDToNaira = 314.75;
        double USDToShilling = 103.55;
        double USDToReal = 3.22;
        double USDToC$ = 1.33;
        double USDToIndianRupee = 67.86;
        double USDToPeso = 49.58;
        double USDToRupiah = 13349;
        double USDToPKR = 104.81;
        // From Shilling Variables
        double ShillingToUSD = 0.0097;
        double ShillingToNaira = 3.04;
        double ShillingToReal = 0.031;
        double ShillingToC$ = 0.013;
        double ShillingToIndianRupee = 0.66;
        double ShillingToPeso = 0.48;
        double ShillingToRupiah = 129;
        double ShillingToPKR = 1.01;
        // From Real Variables
        double RealToUSD = 0.31;
        double RealToNaira = 97.76;
        double RealToC$ = 0.41;
        double RealToIndianRupee = 21.07;
        double RealToPeso = 15.4;
        double RealToRupiah = 4144.65;
        double RealToPKR = 32.53;
        double RealToShilling = 32.14;
        // From Canadian Dollar Variables
        double C$ToUSD = 0.75;
        double C$ToNaira = 236.2;
        double C$ToReal = 2.42;
        double C$ToIndianRupee = 50.98;
        double C$ToPeso = 37.2;
        double C$ToRupiah = 10025.92;
        double C$ToPKR = 78.7;
        double C$ToShilling = 77.7;
        // From Indian Rupee Variables
        double IndianRupeeToUSD = 0.015;
        double IndianRupeeToNaira = 4.64;
        double IndianRupeeToReal = 0.047;
        double IndianRupeeToPeso = 0.73;
        double IndianRupeeToRupiah = 196.89;
        double IndianRupeeToPKR = 1.54;
        double IndianRupeeToShilling = 1.52;
        double IndianRupeeToC$ = 0.02;
        // From Peso Variables
        double PesoToUSD = 0.02;
        double PesoToNaira = 6.35;
        double PesoToReal = 0.065;
        double PesoToIndianRupee = 1.37;
        double PesoToRupiah = 269.33;
        double PesoToPKR = 2.11;
        double PesoToShilling = 2.09;
        double PesoToC$ = 0.027;
        // From Rupiah Variables
        double RupiahToUSD = 0.000075;
        double RupiahToNaira = 0.024;
        double RupiahToReal = 0.00024;
        double RupiahToPeso = 0.0037;
        double RupiahToPKR = 0.0078;
        double RupiahToShilling = 0.0077;
        double RupiahToC$ = 0.0001;
        double RupiahToIndianRupee = 0.0051;
        // From PKR Variables
        double PKRToNaira = 3;
        double PKRToUSD = 0.0095;
        double PKRToRupiah = 127.54;
        double PKRToReal = 0.031;
        double PKRToPeso = 0.47;
        double PKRToShilling = 0.99;
        double PKRToC$ = 0.013;
        double PKRToIndianRupee = 0.65;
        double amount = Double.parseDouble(jtxtConvert.getText());
        // If First Field Is Nigeria & Second Field Is Different
        if(jcmbCurrency.getSelectedItem().equals("Nigeria") && jCmbConvert.getSelectedItem().equals("Nigeria"))
        {
            JOptionPane.showMessageDialog(null, "Both Currency Are Same");
        }
        if(jcmbCurrency.getSelectedItem().equals("Nigeria") && jCmbConvert.getSelectedItem().equals("USA"))
        {
            String cConvert1 = String.format("$ %.2f", amount * NairaToUSD);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Nigeria") && jCmbConvert.getSelectedItem().equals("Kenya"))
        {
            String cConvert1 = String.format("K$ %.2f", amount * NairaToShilling);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Nigeria") && jCmbConvert.getSelectedItem().equals("Brazil"))
        {
            String cConvert1 = String.format("$ %.2f", amount * NairaToReal);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Nigeria") && jCmbConvert.getSelectedItem().equals("Canada"))
        {
            String cConvert1 = String.format("C$ %.2f", amount * NairaToC$);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Nigeria") && jCmbConvert.getSelectedItem().equals("India"))
        {
            String cConvert1 = String.format("₹ %.2f", amount * NairaToIndianRupee);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Nigeria") && jCmbConvert.getSelectedItem().equals("Philippines"))
        {
            String cConvert1 = String.format("₱ %.2f", amount * NairaToPeso);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Nigeria") && jCmbConvert.getSelectedItem().equals("Indonesia"))
        {
            String cConvert1 = String.format("IDR %.2f", amount * NairaToRupiah);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Nigeria") && jCmbConvert.getSelectedItem().equals("Pakistan"))
        {
            String cConvert1 = String.format("PKR %.2f", amount * NairaToPKR);
            jlblConvert.setText(cConvert1);
        }
        // If First Field Is US Dollar & Second Field Is Different
        if(jcmbCurrency.getSelectedItem().equals("USA") && jCmbConvert.getSelectedItem().equals("USA"))
        {
            JOptionPane.showMessageDialog(null, "Both Currency Are Same");
        }
        if(jcmbCurrency.getSelectedItem().equals("USA") && jCmbConvert.getSelectedItem().equals("Nigeria"))
        {
            String cConvert1 = String.format("₦ %.2f", amount * USDToNaira);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("USA") && jCmbConvert.getSelectedItem().equals("Kenya"))
        {
            String cConvert1 = String.format("K$ %.2f", amount * USDToShilling);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("USA") && jCmbConvert.getSelectedItem().equals("Brazil"))
        {
            String cConvert1 = String.format("$ %.2f", amount * USDToReal);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("USA") && jCmbConvert.getSelectedItem().equals("Canada"))
        {
            String cConvert1 = String.format("C$ %.2f", amount * USDToC$);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("USA") && jCmbConvert.getSelectedItem().equals("India"))
        {
            String cConvert1 = String.format("₹ %.2f", amount * USDToIndianRupee);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("USA") && jCmbConvert.getSelectedItem().equals("Philippines"))
        {
            String cConvert1 = String.format("₱ %.2f", amount * USDToPeso);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("USA") && jCmbConvert.getSelectedItem().equals("Indonesia"))
        {
            String cConvert1 = String.format("IDR %.2f", amount * USDToRupiah);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("USA") && jCmbConvert.getSelectedItem().equals("Pakistan"))
        {
            String cConvert1 = String.format("PKR %.2f", amount * USDToPKR);
            jlblConvert.setText(cConvert1);
        }
        // If First Field Is Kenyan Shilling & Second Field Is Different
        if(jcmbCurrency.getSelectedItem().equals("Kenya") && jCmbConvert.getSelectedItem().equals("Kenya"))
        {
            JOptionPane.showMessageDialog(null, "Both Currency Are Same");
        }
        if(jcmbCurrency.getSelectedItem().equals("Kenya") && jCmbConvert.getSelectedItem().equals("USA"))
        {
            String cConvert1 = String.format("$ %.2f", amount * ShillingToUSD);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Kenya") && jCmbConvert.getSelectedItem().equals("Nigeria"))
        {
            String cConvert1 = String.format("₦ %.2f", amount * ShillingToNaira);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Kenya") && jCmbConvert.getSelectedItem().equals("Brazil"))
        {
            String cConvert1 = String.format("$ %.2f", amount * ShillingToNaira);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Kenya") && jCmbConvert.getSelectedItem().equals("Canada"))
        {
            String cConvert1 = String.format("C$ %.2f", amount * ShillingToC$);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Kenya") && jCmbConvert.getSelectedItem().equals("India"))
        {
            String cConvert1 = String.format("₹ %.2f", amount * ShillingToIndianRupee);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Kenya") && jCmbConvert.getSelectedItem().equals("Philippines"))
        {
            String cConvert1 = String.format("₱ %.2f", amount * ShillingToPeso);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Kenya") && jCmbConvert.getSelectedItem().equals("Kenya"))
        {
            String cConvert1 = String.format("IDR %.2f", amount * ShillingToRupiah);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Kenya") && jCmbConvert.getSelectedItem().equals("Pakistani_Rupee "))
        {
            String cConvert1 = String.format("PKR %.2f", amount * ShillingToPKR);
            jlblConvert.setText(cConvert1);
        }
        // If First Field Is Canadian Dollar & Second Field Is Different
        if(jcmbCurrency.getSelectedItem().equals("Canada") && jCmbConvert.getSelectedItem().equals("Canada"))
        {
            JOptionPane.showMessageDialog(null, "Both Currency Are Same");
        }
        if(jcmbCurrency.getSelectedItem().equals("Canada") && jCmbConvert.getSelectedItem().equals("Nigeria"))
        {
            String cConvert1 = String.format("₦ %.2f", amount * C$ToNaira);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Canada") && jCmbConvert.getSelectedItem().equals("USA"))
        {
            String cConvert1 = String.format("$ %.2f", amount * C$ToUSD);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Canada") && jCmbConvert.getSelectedItem().equals("Kenya"))
        {
            String cConvert1 = String.format("K$ %.2f", amount * C$ToShilling);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Canada") && jCmbConvert.getSelectedItem().equals("Brazil"))
        {
            String cConvert1 = String.format("$ %.2f", amount * C$ToReal);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Canada") && jCmbConvert.getSelectedItem().equals("India"))
        {
            String cConvert1 = String.format("₹ %.2f", amount * C$ToIndianRupee);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Canada") && jCmbConvert.getSelectedItem().equals("Philippines"))
        {
            String cConvert1 = String.format("₱ %.2f", amount * C$ToPeso);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Canada") && jCmbConvert.getSelectedItem().equals("Indonesia"))
        {
            String cConvert1 = String.format("IDR %.2f", amount * C$ToRupiah);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Canada") && jCmbConvert.getSelectedItem().equals("Pakistan"))
        {
            String cConvert1 = String.format("PKR %.2f", amount * C$ToPKR);
            jlblConvert.setText(cConvert1);
        }
        // If First Field Is Brazil & Second Field Is Different
        if(jcmbCurrency.getSelectedItem().equals("Brazil") && jCmbConvert.getSelectedItem().equals("Brazil"))
        {
            JOptionPane.showMessageDialog(null, "Both Currency Are Same");
        }
        if(jcmbCurrency.getSelectedItem().equals("Brazil") && jCmbConvert.getSelectedItem().equals("Nigeria"))
        {
            String cConvert1 = String.format("₦ %.2f", amount * RealToNaira);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Brazil") && jCmbConvert.getSelectedItem().equals("USA"))
        {
            String cConvert1 = String.format("$ %.2f", amount * RealToUSD);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Brazil") && jCmbConvert.getSelectedItem().equals("Kenya"))
        {
            String cConvert1 = String.format("K$ %.2f", amount * RealToShilling);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Brazil") && jCmbConvert.getSelectedItem().equals("Canada"))
        {
            String cConvert1 = String.format("C$ %.2f", amount * RealToC$);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Brazil") && jCmbConvert.getSelectedItem().equals("India"))
        {
            String cConvert1 = String.format("₹ %.2f", amount * RealToIndianRupee);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Brazil") && jCmbConvert.getSelectedItem().equals("Philippines"))
        {
            String cConvert1 = String.format("₱ %.2f", amount * RealToPeso);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Brazil") && jCmbConvert.getSelectedItem().equals("Indonesia"))
        {
            String cConvert1 = String.format("IDR %.2f", amount * RealToRupiah);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Brazil") && jCmbConvert.getSelectedItem().equals("Pakistan"))
        {
            String cConvert1 = String.format("PKR %.2f", amount * RealToPKR);
            jlblConvert.setText(cConvert1);
        }
        // If First Field Is Indonesia & Second Field Is Different
        if(jcmbCurrency.getSelectedItem().equals("Indonesia") && jCmbConvert.getSelectedItem().equals("Indonesia"))
        {
            JOptionPane.showMessageDialog(null, "Both Currency Are Same");
        }
        if(jcmbCurrency.getSelectedItem().equals("Indonesia") && jCmbConvert.getSelectedItem().equals("Pakistan"))
        {
            String cConvert1 = String.format("PKR %.2f", amount * RupiahToPKR);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Indonesia") && jCmbConvert.getSelectedItem().equals("Nigeria"))
        {
            String cConvert1 = String.format("₦ %.2f", amount * RupiahToNaira);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Indonesia") && jCmbConvert.getSelectedItem().equals("USA"))
        {
            String cConvert1 = String.format("$ %.2f", amount * RupiahToUSD);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Indonesia") && jCmbConvert.getSelectedItem().equals("Kenya"))
        {
            String cConvert1 = String.format("K$ %.2f", amount * RupiahToShilling);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Indonesia") && jCmbConvert.getSelectedItem().equals("Brazil"))
        {
            String cConvert1 = String.format("$ %.2f", amount * RupiahToReal);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Indonesia") && jCmbConvert.getSelectedItem().equals("Canada"))
        {
            String cConvert1 = String.format("C$ %.2f", amount * RupiahToC$);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Indonesia") && jCmbConvert.getSelectedItem().equals("India"))
        {
            String cConvert1 = String.format("₹ %.2f", amount * RupiahToIndianRupee);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Indonesia") && jCmbConvert.getSelectedItem().equals("Philippines"))
        {
            String cConvert1 = String.format("₱ %.2f", amount * RupiahToPeso);
            jlblConvert.setText(cConvert1);
        }
        // If First Field Is India & Second Field Is Different
        if(jcmbCurrency.getSelectedItem().equals("India") && jCmbConvert.getSelectedItem().equals("India"))
        {
            JOptionPane.showMessageDialog(null, "Both Currency Are Same");
        }
        if(jcmbCurrency.getSelectedItem().equals("India") && jCmbConvert.getSelectedItem().equals("Nigeria"))
        {
            String cConvert1 = String.format("₦ %.2f", amount * IndianRupeeToNaira);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("India") && jCmbConvert.getSelectedItem().equals("USA"))
        {
            String cConvert1 = String.format("$ %.2f", amount * IndianRupeeToUSD);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("India") && jCmbConvert.getSelectedItem().equals("Kenya"))
        {
            String cConvert1 = String.format("K$ %.2f", amount * IndianRupeeToShilling);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("India") && jCmbConvert.getSelectedItem().equals("Brazil"))
        {
            String cConvert1 = String.format("$ %.2f", amount * IndianRupeeToReal);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("India") && jCmbConvert.getSelectedItem().equals("Canada"))
        {
            JOptionPane.showMessageDialog(null, "Both Currency Are Same");
        }
        if(jcmbCurrency.getSelectedItem().equals("India") && jCmbConvert.getSelectedItem().equals("Philippines"))
        {
            String cConvert1 = String.format("₱ %.2f", amount * IndianRupeeToPeso);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("India") && jCmbConvert.getSelectedItem().equals("Indonesia"))
        {
            String cConvert1 = String.format("IDR %.2f", amount * IndianRupeeToRupiah);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("India") && jCmbConvert.getSelectedItem().equals("Pakistan"))
        {
            String cConvert1 = String.format("₹ %.2f", amount * IndianRupeeToPKR);
            jlblConvert.setText(cConvert1);
        }
        // If First Field Is Pakistan & Second Field Is Different
        if(jcmbCurrency.getSelectedItem().equals("Pakistan") && jCmbConvert.getSelectedItem().equals("Pakistan"))
        {
            JOptionPane.showMessageDialog(null, "Both Currency Are Same");
        }
        if(jcmbCurrency.getSelectedItem().equals("Pakistan") && jCmbConvert.getSelectedItem().equals("Nigeria"))
        {
            String cConvert1 = String.format("₦ %.2f", amount * PKRToNaira);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Pakistan") && jCmbConvert.getSelectedItem().equals("USA"))
        {
            String cConvert1 = String.format("$ %.2f", amount * PKRToUSD);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Pakistan") && jCmbConvert.getSelectedItem().equals("Kenya"))
        {
            String cConvert1 = String.format("K$ %.2f", amount * PKRToShilling);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Pakistan") && jCmbConvert.getSelectedItem().equals("Brazil"))
        {
            String cConvert1 = String.format("$ %.2f", amount * PKRToReal);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Pakistan") && jCmbConvert.getSelectedItem().equals("Canada"))
        {
            String cConvert1 = String.format("C$ %.2f", amount * PKRToC$);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Pakistan") && jCmbConvert.getSelectedItem().equals("India"))
        {
            String cConvert1 = String.format("₹ %.2f", amount * PKRToIndianRupee);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Pakistan") && jCmbConvert.getSelectedItem().equals("Philippines"))
        {
            String cConvert1 = String.format("₱ %.2f", amount * PKRToPeso);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Pakistan") && jCmbConvert.getSelectedItem().equals("Indonesia"))
        {
            String cConvert1 = String.format("IDR %.2f", amount * PKRToRupiah);
            jlblConvert.setText(cConvert1);
        }
        // If First Field Is Philippines & Second Field Is Different
        if(jcmbCurrency.getSelectedItem().equals("Philippines") && jCmbConvert.getSelectedItem().equals("Philippines"))
        {
            JOptionPane.showMessageDialog(null, "Both Currency Are Same");
        }
        if(jcmbCurrency.getSelectedItem().equals("Philippines") && jCmbConvert.getSelectedItem().equals("Nigeria"))
        {
            String cConvert1 = String.format("₦ %.2f", amount * PesoToNaira);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Philippines") && jCmbConvert.getSelectedItem().equals("USA"))
        {
            String cConvert1 = String.format("$ %.2f", amount * PesoToUSD);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Philippines") && jCmbConvert.getSelectedItem().equals("Kenya"))
        {
            String cConvert1 = String.format("K$ %.2f", amount * PesoToShilling);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Philippines") && jCmbConvert.getSelectedItem().equals("Brazil"))
        {
            String cConvert1 = String.format("$ %.2f", amount * PesoToReal);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Philippines") && jCmbConvert.getSelectedItem().equals("Canada"))
        {
            String cConvert1 = String.format("C$ %.2f", amount * PesoToC$);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Philippines") && jCmbConvert.getSelectedItem().equals("India"))
        {
            String cConvert1 = String.format("₹ %.2f", amount * PesoToIndianRupee);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Philippines") && jCmbConvert.getSelectedItem().equals("Indonesia"))
        {
            String cConvert1 = String.format("IDR %.2f", amount * PesoToRupiah);
            jlblConvert.setText(cConvert1);
        }
        if(jcmbCurrency.getSelectedItem().equals("Philippines") && jCmbConvert.getSelectedItem().equals("Pakistan"))
        {
            String cConvert1 = String.format("PKR %.2f", amount * PesoToPKR);
            jlblConvert.setText(cConvert1);
        }
       }
        catch(NumberFormatException e){
            e.getMessage();
        }
    }//GEN-LAST:event_jBtnConvertActionPerformed

    private void jCmbDrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCmbDrinkActionPerformed
        double Tea = 1.20;
        double Apple_Juice = 1.40;
        double Coffee = 2.50;
        double Pepsi = 2.10;
        double Ice_Tea = 0.90;
        double Ice_Coffee = 1.10;
        double Orange = 1.60;
        if(jCmbDrink.getSelectedItem().equals("Tea"))
        {
            String cTea = String.format("%.2f", Tea);
            jlblCostOfDrinks.setText(cTea);
        }
        if(jCmbDrink.getSelectedItem().equals("Ice Tea"))
        {
            String cIce_Tea = String.format("%.2f", Ice_Tea);
            jlblCostOfDrinks.setText(cIce_Tea);
        }
        if(jCmbDrink.getSelectedItem().equals("Apple Juice"))
        {
            String cApple_Juice = String.format("%.2f", Apple_Juice);
            jlblCostOfDrinks.setText(cApple_Juice);
        }
        if(jCmbDrink.getSelectedItem().equals("Coffee"))
        {
            String cCoffee = String.format("%.2f", Coffee);
            jlblCostOfDrinks.setText(cCoffee);
        }
        if(jCmbDrink.getSelectedItem().equals("Pepsi"))
        {
            String cPepsi = String.format("%.2f", Pepsi);
            jlblCostOfDrinks.setText(cPepsi);
        }
        if(jCmbDrink.getSelectedItem().equals("Ice Coffee"))
        {
            String cIce_Coffee = String.format("%.2f", Ice_Coffee);
            jlblCostOfDrinks.setText(cIce_Coffee);
        }
        if(jCmbDrink.getSelectedItem().equals("Orange"))
        {
            String cOrange = String.format("%.2f", Orange);
            jlblCostOfDrinks.setText(cOrange);
        }
        if(jCmbDrink.getSelectedItem().equals("Select A Drink"))
        {
            jlblCostOfDrinks.setText(null);
        }
    }//GEN-LAST:event_jCmbDrinkActionPerformed

    private void jcmbCurrencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcmbCurrencyActionPerformed
        
    }//GEN-LAST:event_jcmbCurrencyActionPerformed

    private void jBtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnResetActionPerformed
        jtxtConvert.setText(null);
        jlblConvert.setText(null);
        jcmbCurrency.setSelectedIndex(0);
    }//GEN-LAST:event_jBtnResetActionPerformed

    private void jtxtBCBurgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtBCBurgerActionPerformed
        
    }//GEN-LAST:event_jtxtBCBurgerActionPerformed

    private void jBtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jBtnExitActionPerformed

    private void jCDeliveryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCDeliveryMouseClicked
        double iDelivery = 3.50;
        
        if(jCDelivery.isSelected())
        {
            String Delivery = String.format("%.2f", iDelivery);
            jlblCostOfDelivery.setText(Delivery);
        }
        else
        {
            jlblCostOfDelivery.setText(null);
        }
    }//GEN-LAST:event_jCDeliveryMouseClicked

    private void jCDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCDeliveryActionPerformed
        
    }//GEN-LAST:event_jCDeliveryActionPerformed

    private void jBtnReceiptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnReceiptMouseClicked
        
    }//GEN-LAST:event_jBtnReceiptMouseClicked

    private void jBtnReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnReceiptActionPerformed
        try{
        double Qty1 = Double.parseDouble(jtxtChicBurger.getText());
        double Qty2 = Double.parseDouble(jtxtChicBurgerMeal.getText());
        double Qty3 = Double.parseDouble(jtxtBCBurger.getText());
        double Qty4 = Double.parseDouble(jlblTax.getText());
        double Qty5 = Double.parseDouble(jlblCostOfDelivery.getText());
        double Qty6 = Double.parseDouble(jlblCostOfMeals.getText());
        double Qty7 = Double.parseDouble(jlblCostOfDrinks.getText());
        double Qty8 = Double.parseDouble(jlblTotal.getText());
        
        jTextArea.append("\tRestaurant Management System:\n\n" + "Chicken Burger:\t\t" + Qty1 + "\nChicken Burger Meal:\t\t" + Qty2 + 
                "\nBacon & Cheese Burger:\t\t" + Qty3 + "\n--------------------------------------------------------------------------------------------------------------" + 
                "\nTax Is:\t\t\t" + Qty4 + "\nHome Delivery Is:\t\t" + Qty5
                + "\n--------------------------------------------------------------------------------------------------------------\n" + 
                "Cost Of Meals \t\t\t" + Qty6 + "\nCost Of Drinks\t\t\t" + Qty7 + "\nTotal Is\t\t\t" + Qty8 + "\n\n\tThanks & Come Back Again");
    }
        catch(NumberFormatException e){
            e.getStackTrace()[2].getLineNumber();
        }
    }//GEN-LAST:event_jBtnReceiptActionPerformed

    private void jCChicBurgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCChicBurgerActionPerformed
//        double BCBurger = Double.parseDouble(jtxtChicBurger.getText());
//        double iBCBurger = 2.39;
//        
//        if(jCChicBurger.isSelected() && jCChicBurgerMeal.isSelected() && jCBCBurger.isSelected())
//        {
//            i[2] = ((BCBurger * iBCBurger));
//        }
    }//GEN-LAST:event_jCChicBurgerActionPerformed

    private void jCChicBurgerMealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCChicBurgerMealActionPerformed
//        double BCBurger = Double.parseDouble(jtxtChicBurgerMeal.getText());
//        double iBCBurger = 3.49;
//        
//        if(jCChicBurger.isSelected() && jCChicBurgerMeal.isSelected() && jCBCBurger.isSelected())
//        {
//            i[2] = ((BCBurger * iBCBurger));
//        }
    }//GEN-LAST:event_jCChicBurgerMealActionPerformed

    private void jCBCBurgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBCBurgerActionPerformed
//        try{
//        double BCBurger = Double.parseDouble(jtxtBCBurger.getText());
//        double iBCBurger = 4.50;
//        
//        if(jCChicBurger.isSelected() && jCChicBurgerMeal.isSelected() && jCBCBurger.isSelected())
//        {
//            i[2] = ((BCBurger * iBCBurger));
//        }
//        }
//        catch(NumberFormatException e){
//            e.getStackTrace()[2].getLineNumber();
//        }
    }//GEN-LAST:event_jCBCBurgerActionPerformed

    private void jtxtChicBurgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtChicBurgerActionPerformed
        
    }//GEN-LAST:event_jtxtChicBurgerActionPerformed

    private void jCChicBurgerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCChicBurgerMouseClicked
        String check = jtxtChicBurger.getText();
        if(check.isEmpty() && jCChicBurger.isSelected() == true){
            JOptionPane.showMessageDialog(null, "Please Fill The Text Box First");
        }
        try{
        double ChicBurger = Double.parseDouble(jtxtChicBurger.getText());
        double iChicBurger = 2.39;
        double cMeal = Double.parseDouble(jlblCostOfMeals.getText());
        if(jCChicBurger.isSelected())
        {
            i[0] = (ChicBurger * iChicBurger) + cMeal;
            String pMeal = String.format("%.2f", i[0]);
            jlblCostOfMeals.setText(pMeal);
        }
        // These lines of code incrementing values 3 times when i click check box ! -- Removing these only increment 1 time the value of prices!
//        if(jCChicBurger.isSelected() == false && jCChicBurgerMeal.isSelected() == true && jCBCBurger.isSelected() == true){
//            double ChicBurgerMeal = Double.parseDouble(jtxtChicBurgerMeal.getText());
//            double iChicBurgerMeal = 3.49;
//            
//            double BCBurger = Double.parseDouble(jtxtBCBurger.getText());
//            double iBCBurger = 4.50;
//            
//            i[0] = (ChicBurgerMeal * iChicBurgerMeal) + cMeal;
//            i[1] = (BCBurger * iBCBurger) + cMeal;
//            String pMeal = String.format("%.2f", i[0] + i[1]);
//            jlblCostOfMeals.setText(pMeal);
//        }       
//        boolean checkselected = jCChicBurger.isSelected();
//        String selection = String.valueOf(checkselected);
//        int checking = Integer.parseInt(selection);
//        if(checking > 1){
//            jlblCostOfMeals.setText(check);
//        }
        
        }
        catch(NumberFormatException e){
            e.getStackTrace()[2].getLineNumber();
        }
    }//GEN-LAST:event_jCChicBurgerMouseClicked

    private void jCChicBurgerMealMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCChicBurgerMealMouseClicked
        String check = jtxtChicBurgerMeal.getText();
        if(check.isEmpty() && jCChicBurgerMeal.isSelected() == true){
            JOptionPane.showMessageDialog(null, "Please Fill The Text Box First");
        }
        try{
        double cMeal = Double.parseDouble(jlblCostOfMeals.getText());    
        double ChicBurgerMeal = Double.parseDouble(jtxtChicBurgerMeal.getText());
        double iChicBurgerMeal = 3.49;
        if(jCChicBurgerMeal.isSelected())
        {
            i[1] = (ChicBurgerMeal * iChicBurgerMeal) + cMeal;
            String pMeal = String.format("%.2f", i[1]);
            jlblCostOfMeals.setText(pMeal);
        }
//        if(jCChicBurgerMeal.isSelected() == false && jCChicBurger.isSelected() == true && jCBCBurger.isSelected() == true){
//            double ChicBurger = Double.parseDouble(jtxtChicBurger.getText());
//            double iChicBurger = 2.39;
//            
//            double BCBurger = Double.parseDouble(jtxtBCBurger.getText());
//            double iBCBurger = 4.50;
//            
//            i[0] = (ChicBurger * iChicBurger) + cMeal;
//            i[1] = (BCBurger * iBCBurger) + cMeal;
//            String pMeal = String.format("%.2f", i[0] + i[1]);
//            jlblCostOfMeals.setText(pMeal);
//        }
        }
        catch(NumberFormatException e){
            e.getStackTrace()[2].getLineNumber();
        }
    }//GEN-LAST:event_jCChicBurgerMealMouseClicked

    private void jtxtChicBurgerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtChicBurgerMouseClicked
        
    }//GEN-LAST:event_jtxtChicBurgerMouseClicked

    private void jtxtBCBurgerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtxtBCBurgerMouseClicked
        
    }//GEN-LAST:event_jtxtBCBurgerMouseClicked

    private void jCBCBurgerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCBCBurgerMouseClicked
        String check = jtxtBCBurger.getText();
        if(check.isEmpty() && jCBCBurger.isSelected() == true){
            JOptionPane.showMessageDialog(null, "Please Fill The Text Box First");
        }
        try{
        double cMeal = Double.parseDouble(jlblCostOfMeals.getText());    
        double BCBurger = Double.parseDouble(jtxtBCBurger.getText());
        double iBCBurger = 4.50;
        if(jCBCBurger.isSelected())
        {
            i[2] = (BCBurger * iBCBurger) + cMeal;
            String pMeal = String.format("%.2f", i[2]);
            jlblCostOfMeals.setText(pMeal);
        }
        
//        if(jCBCBurger.isSelected() == false && jCChicBurger.isSelected() == true && jCBCBurger.isSelected() == true){
//            double ChicBurger = Double.parseDouble(jtxtChicBurger.getText());
//            double iChicBurger = 2.39;
//            
//            double ChicBurgerMeal = Double.parseDouble(jtxtChicBurgerMeal.getText());
//            double iChicBurgerMeal = 3.49;
//            
//            i[0] = (ChicBurger * iChicBurger) + cMeal;
//            i[1] = (ChicBurgerMeal * iChicBurgerMeal) + cMeal;
//            String pMeal = String.format("%.2f", i[0] + i[1]);
//            jlblCostOfMeals.setText(pMeal);
//        }
        }
        catch(NumberFormatException ex){
            ex.getMessage();
        }
    }//GEN-LAST:event_jCBCBurgerMouseClicked

    private void jCTaxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCTaxMouseClicked
        double iTax = 4.45;
        
        if(jCTax.isSelected())
        {
            String Tax = String.format("%.2f", iTax);
            jlblTax.setText(Tax);
        }
        else
        {
            jlblTax.setText(null);
        }
    }//GEN-LAST:event_jCTaxMouseClicked

    private void jBtnTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnTotalActionPerformed
        
    }//GEN-LAST:event_jBtnTotalActionPerformed
    
    private void jBtnTotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnTotalMouseClicked
        try{
        double cTotal1 = Double.parseDouble(jlblCostOfDrinks.getText());
        double cTotal2 = Double.parseDouble(jlblCostOfMeals.getText());
        double cTotal3 = Double.parseDouble(jlblCostOfDelivery.getText());
        double subTotal = (cTotal1 + cTotal2 + cTotal3);
        String iSubTotal = String.format("%.2f", subTotal);
        jlblSubTotal.setText(iSubTotal);
        double cTotal4 = Double.parseDouble(jlblTax.getText());
        double allTotal = (cTotal1 + cTotal2 + cTotal3 + cTotal4);
        String iTotal = String.format("%.2f", allTotal);
        jlblTotal.setText(iTotal);
        }
        catch(NumberFormatException e){
            e.getMessage();
        }
    }//GEN-LAST:event_jBtnTotalMouseClicked

    private void jResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jResetMouseClicked
        jtxtChicBurger.setText(null);
        jtxtChicBurgerMeal.setText(null);
        jtxtBCBurger.setText(null);
        jtxtConvert.setText(null);
        jlblConvert.setText(null);
        jlblCostOfDrinks.setText(null);
        jlblCostOfMeals.setText(null);
        jlblCostOfDelivery.setText(null);
        jlblSubTotal.setText(null);
        jlblTax.setText(null);
        jlblTotal.setText(null);
        jTxt.setText(null);
        jTxtDrink.setText(null);
        jcmbCurrency.setSelectedIndex(0);
        jCTax.setSelected(false);
        jCDelivery.setSelected(false);
        jCmbConvert.setSelectedIndex(0);
        jCmbDrink.setSelectedIndex(0);
        jCChicBurger.setSelected(false);
        jCChicBurgerMeal.setSelected(false);
        jCBCBurger.setSelected(false);
    }//GEN-LAST:event_jResetMouseClicked

    private void jBtnResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnResetMouseClicked
        
    }//GEN-LAST:event_jBtnResetMouseClicked

    private void jCmbDrinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCmbDrinkMouseClicked
        
    }//GEN-LAST:event_jCmbDrinkMouseClicked

    private void jCTaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCTaxActionPerformed
       
    }//GEN-LAST:event_jCTaxActionPerformed

    private void jlblCostOfMealsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblCostOfMealsMouseClicked
        
    }//GEN-LAST:event_jlblCostOfMealsMouseClicked

    private void jTxtDrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtDrinkActionPerformed
        try{
        double Tea = 1.20;
        double Apple_Juice = 1.40;
        double Coffee = 2.50;
        double Pepsi = 2.10;
        double Ice_Tea = 0.90;
        double Ice_Coffee = 1.10;
        double Orange = 1.60;
        double amount = Double.parseDouble(jTxtDrink.getText());
        if(jCmbDrink.getSelectedItem().equals("Tea"))
        {
            String cTea = String.format("%.2f", Tea * amount);            
            jlblCostOfDrinks.setText(cTea);
        }
        if(jCmbDrink.getSelectedItem().equals("Ice Tea"))
        {
            String cIce_Tea = String.format("%.2f", Ice_Tea * amount);
            jlblCostOfDrinks.setText(cIce_Tea);
        }
        if(jCmbDrink.getSelectedItem().equals("Apple Juice"))
        {
            String cApple_Juice = String.format("%.2f", Apple_Juice * amount);
            jlblCostOfDrinks.setText(cApple_Juice);
        }
        if(jCmbDrink.getSelectedItem().equals("Coffee"))
        {
            String cCoffee = String.format("%.2f", Coffee * amount);
            jlblCostOfDrinks.setText(cCoffee);
        }
        if(jCmbDrink.getSelectedItem().equals("Pepsi"))
        {
            String cPepsi = String.format("%.2f", Pepsi * amount);
            jlblCostOfDrinks.setText(cPepsi);
        }
        if(jCmbDrink.getSelectedItem().equals("Ice Coffee"))
        {
            String cIce_Coffee = String.format("%.2f", Ice_Coffee * amount);
            jlblCostOfDrinks.setText(cIce_Coffee);
        }
        if(jCmbDrink.getSelectedItem().equals("Orange"))
        {
            String cOrange = String.format("%.2f", Orange * amount);
            jlblCostOfDrinks.setText(cOrange);
        }
        if(jTxtDrink.getText().length() == 0)
        {
            JOptionPane.showMessageDialog(null, "Please Select A Drink");
        }
        }
        catch(NumberFormatException ex){
            ex.getMessage();
        }
    }//GEN-LAST:event_jTxtDrinkActionPerformed

    private void jcmbCurrencyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcmbCurrencyMouseClicked
        
    }//GEN-LAST:event_jcmbCurrencyMouseClicked

    private void jTxtDrinkPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTxtDrinkPropertyChange
        
    }//GEN-LAST:event_jTxtDrinkPropertyChange

    private void jResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jResetActionPerformed
        
    }//GEN-LAST:event_jResetActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new RestaurantGUI().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Divide;
    private javax.swing.JButton Dot;
    private javax.swing.JButton Equals;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Minus;
    private javax.swing.JButton Multiply;
    private javax.swing.JButton Percentage;
    private javax.swing.JButton Plus;
    private javax.swing.JButton Reset;
    private javax.swing.JButton jBtn;
    private javax.swing.JButton jBtn0;
    private javax.swing.JButton jBtn1;
    private javax.swing.JButton jBtn2;
    private javax.swing.JButton jBtn3;
    private javax.swing.JButton jBtn4;
    private javax.swing.JButton jBtn5;
    private javax.swing.JButton jBtn6;
    private javax.swing.JButton jBtn7;
    private javax.swing.JButton jBtn8;
    private javax.swing.JButton jBtn9;
    private javax.swing.JButton jBtnConvert;
    private javax.swing.JButton jBtnExit;
    private javax.swing.JButton jBtnReceipt;
    private javax.swing.JButton jBtnReset;
    private javax.swing.JButton jBtnTotal;
    private javax.swing.JCheckBox jCBCBurger;
    private javax.swing.JCheckBox jCChicBurger;
    private javax.swing.JCheckBox jCChicBurgerMeal;
    private javax.swing.JCheckBox jCDelivery;
    private javax.swing.JCheckBox jCTax;
    private javax.swing.JComboBox<String> jCmbConvert;
    private javax.swing.JComboBox<String> jCmbDrink;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton jReset;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTxt;
    private javax.swing.JTextField jTxtDrink;
    private javax.swing.JComboBox<String> jcmbCurrency;
    private javax.swing.JLabel jlblConvert;
    private javax.swing.JLabel jlblCostOfDelivery;
    private javax.swing.JLabel jlblCostOfDrinks;
    private javax.swing.JLabel jlblCostOfMeals;
    private javax.swing.JLabel jlblSubTotal;
    private javax.swing.JLabel jlblTax;
    private javax.swing.JLabel jlblTotal;
    private javax.swing.JTextField jtxtBCBurger;
    private javax.swing.JTextField jtxtChicBurger;
    private javax.swing.JTextField jtxtChicBurgerMeal;
    private javax.swing.JTextField jtxtConvert;
    // End of variables declaration//GEN-END:variables
}
