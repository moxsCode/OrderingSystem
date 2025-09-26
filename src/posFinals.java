
import com.mysql.cj.xdevapi.Statement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Paul Noriel
 */
public class posFinals extends javax.swing.JFrame {

    private int total = 0;
    private int receipt = 0;
    public posFinals() {
        initComponents();
        init();
    }
    
    public void init(){
        timeandDate();
    }
    
    private void table(){
        
    }
            
    

    public void timeandDate(){
        new Thread(new Runnable(){
            @Override
            public void run(){
                while(true){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(posFinals.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    Date date = new Date();
                    SimpleDateFormat tf = new SimpleDateFormat("h:mm:ss aa");
                    SimpleDateFormat df = new SimpleDateFormat("EEEE, dd-MM-yyyy");
                    String time = tf.format(date);
                    timeLabel.setText(time.split(" ")[0] + " " + time.split(" ")[1]);
                    dateLabel.setText(df.format(date));
                  
                }
            }
        }).start();
    }
    
    public void resto(){
        posTa.setText("""
                      ==================================AUTHENTIC RESTAURANT=============================
                      \t\t    Time: """ + timeLabel.getText() +"    " + "Date: " + dateLabel.getText() + "\n"
                + "====================================================================================\n"
                + "\tORDER: \t\t" + "\t\tPrice(₱) \n");
    }
    @SuppressWarnings("unchecked")
    
    Connection con1;
    PreparedStatement insert;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        burgerCt = new javax.swing.JComboBox<>();
        sandwichCt = new javax.swing.JComboBox<>();
        friesCt = new javax.swing.JComboBox<>();
        addCt = new javax.swing.JComboBox<>();
        butButton2 = new javax.swing.JButton();
        buyButton3 = new javax.swing.JButton();
        buyButton4 = new javax.swing.JButton();
        buyButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        changeTf = new javax.swing.JTextField();
        paymentTf = new javax.swing.JTextField();
        senior = new javax.swing.JRadioButton();
        normal = new javax.swing.JRadioButton();
        insertBt = new javax.swing.JButton();
        clearBt1 = new javax.swing.JButton();
        discount = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        posTa = new javax.swing.JTextArea();
        totalBt = new javax.swing.JButton();
        clearBt2 = new javax.swing.JButton();
        exitBt = new javax.swing.JButton();
        timeLabel = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Segoe Print", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("BURGERS ");

        jLabel3.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("SANDWICHES");

        jLabel4.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        jLabel4.setText("FRIES");

        jLabel5.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        jLabel5.setText("ADDS ON");

        burgerCt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        burgerCt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BOARD SLIDE", "BARACHA", "KETO", "FAKIE SANDWICH", "CHICK & BURGER" }));
        burgerCt.setBorder(new javax.swing.border.MatteBorder(null));
        burgerCt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                burgerCtActionPerformed(evt);
            }
        });

        sandwichCt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sandwichCt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CHICKEN SANDWICH", "BACON & EGG", "HAM & EGG", "SPAM & EGG" }));
        sandwichCt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sandwichCtActionPerformed(evt);
            }
        });

        friesCt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        friesCt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FIRST FRIES", "GRAND FRIES" }));
        friesCt.setBorder(null);
        friesCt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                friesCtActionPerformed(evt);
            }
        });

        addCt.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addCt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BACON", "CHEESE", "EGG", "HAM", "SPAM", "BBQ SAUCE" }));
        addCt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCtActionPerformed(evt);
            }
        });

        butButton2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        butButton2.setText("BUY");
        butButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butButton2ActionPerformed(evt);
            }
        });

        buyButton3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        buyButton3.setText("BUY");
        buyButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyButton3ActionPerformed(evt);
            }
        });

        buyButton4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        buyButton4.setText("BUY");
        buyButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyButton4ActionPerformed(evt);
            }
        });

        buyButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        buyButton1.setText("BUY");
        buyButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe Script", 0, 12)); // NOI18N
        jLabel7.setText("PAYMENT: ");

        jLabel9.setFont(new java.awt.Font("Segoe Script", 0, 12)); // NOI18N
        jLabel9.setText("CHANGE: ");

        changeTf.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        changeTf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        paymentTf.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        paymentTf.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        senior.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        senior.setText("SENIOR CITIZEN");

        normal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        normal.setText("NORMAL CUSTOMER");
        normal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                normalActionPerformed(evt);
            }
        });

        insertBt.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        insertBt.setText("INSERT");
        insertBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBtActionPerformed(evt);
            }
        });

        clearBt1.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        clearBt1.setText("CLEAR");
        clearBt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBt1ActionPerformed(evt);
            }
        });

        discount.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        discount.setText("10% DISCOUNT");

        jLabel8.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("PLEASE SELECT PAYMENT");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(senior)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(paymentTf, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel9)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(changeTf, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(normal)
                                .addGap(18, 18, 18)
                                .addComponent(discount))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(friesCt, 0, 190, Short.MAX_VALUE)
                                    .addComponent(burgerCt, 0, 190, Short.MAX_VALUE)
                                    .addComponent(buyButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(buyButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(59, 59, 59)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(butButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sandwichCt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addCt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buyButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(insertBt)
                                .addGap(18, 18, 18)
                                .addComponent(clearBt1)))))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(burgerCt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sandwichCt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buyButton1)
                    .addComponent(butButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(friesCt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addCt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buyButton3)
                    .addComponent(buyButton4))
                .addGap(18, 18, 18)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senior)
                    .addComponent(normal)
                    .addComponent(discount))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel9)
                    .addComponent(changeTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paymentTf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insertBt)
                    .addComponent(clearBt1))
                .addGap(38, 38, 38))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        posTa.setColumns(20);
        posTa.setRows(5);
        jScrollPane2.setViewportView(posTa);

        totalBt.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        totalBt.setText("TOTAL");
        totalBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalBtActionPerformed(evt);
            }
        });

        clearBt2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        clearBt2.setText("CLEAR");
        clearBt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBt2ActionPerformed(evt);
            }
        });

        exitBt.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        exitBt.setText("BACK");
        exitBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtActionPerformed(evt);
            }
        });

        timeLabel.setFont(new java.awt.Font("Segoe Script", 0, 12)); // NOI18N

        dateLabel.setFont(new java.awt.Font("Segoe Script", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(totalBt, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clearBt2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(timeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(exitBt))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalBt)
                            .addComponent(clearBt2))
                        .addGap(31, 31, 31))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(exitBt)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(dateLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                                .addComponent(timeLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(36, Short.MAX_VALUE))))
        );

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setFont(new java.awt.Font("SansSerif", 3, 36)); // NOI18N

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 3, 60)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Authentic Restaurant");

        jLabel6.setFont(new java.awt.Font("Segoe Script", 1, 12)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("\"SATISFY YOUR CRAVINGS, AND AVAIL OUR 10% DISCOUNT\"");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 873, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void burgerCtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_burgerCtActionPerformed
        
    }//GEN-LAST:event_burgerCtActionPerformed

    private void sandwichCtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sandwichCtActionPerformed
    }//GEN-LAST:event_sandwichCtActionPerformed

    private void friesCtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_friesCtActionPerformed
        
    }//GEN-LAST:event_friesCtActionPerformed

    private void addCtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCtActionPerformed
        
    }//GEN-LAST:event_addCtActionPerformed

    private void buyButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyButton1ActionPerformed
        
        int boardSlide = 179;
        int baracha = 159;
        int keto = 159;
        int fakieSand = 209;
        int cb = 220;
        
        int payment = 1;
        
        String selectedValue1 = burgerCt.getSelectedItem().toString();
        String order1A = "BOARD SLIDE";
        int id = 0;
        
        if("BOARD SLIDE".equals(selectedValue1)){
            receipt++;
            if(receipt == 1){
                resto();
            }
            int totalA1 = boardSlide * payment;
            total += totalA1;
            posTa.setText(posTa.getText() + receipt + "." + "BOARD SLIDE" + "\t\t\t\t"+totalA1 + "\n");
            int price1 = totalA1;
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/listmenu","root","");
            insert = con1.prepareStatement("INSERT INTO burger(item, orderBurger, price)values(?, ?, ?)");
            insert.setInt(1, id);
            insert.setString(2, order1A);
            insert.setInt(3, price1);
            insert.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Sucessfully updated");   
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(posFinals.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(posFinals.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else if("BARACHA".equals(selectedValue1)){
            
            String order2A = "BOARD SLIDE";
            
            receipt++;
            if(receipt == 1){
                 resto();
            }
            int totalA2 = baracha * payment;
            total += totalA2;
            posTa.setText(posTa.getText() + receipt + "." + "BARACHA" + "\t\t\t\t\t"+totalA2 + "\n");
            int price2 = totalA2;
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/listmenu","root","");
            insert = con1.prepareStatement("INSERT INTO burger(item, orderBurger, price)values(?, ?, ?)");
            insert.setInt(1, id);
            insert.setString(2, order2A);
            insert.setInt(3, price2);
            insert.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Sucessfully updated");   
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(posFinals.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(posFinals.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else if("KETO".equals(selectedValue1)){
            
            String order3A = "KETO";
            
            receipt++;
            if(receipt == 1){
                 resto();
            }
            int totalA3 = keto * payment;
            total += totalA3;
            posTa.setText(posTa.getText() + receipt + "." + "KETO" + "\t\t\t\t\t"+totalA3 + "\n");
            int price3 = totalA3;
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/listmenu","root","");
            insert = con1.prepareStatement("INSERT INTO burger(item, orderBurger, price)values(?, ?, ?)");
            insert.setInt(1, id);
            insert.setString(2, order3A);
            insert.setInt(3, price3);
            insert.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Sucessfully updated");   
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(posFinals.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(posFinals.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else if("FAKIE SANDWICH".equals(selectedValue1)){
            
            String order4A = "FAKIE SANDWICH";
            
            receipt++;
            if(receipt == 1){
                 resto();
            }
            int totalA4 = fakieSand * payment;
            total += totalA4;
            posTa.setText(posTa.getText() + receipt + "." + "FAKIE SANDWICH" + "\t\t\t\t"+totalA4 + "\n");
            int price4 = totalA4;
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/listmenu","root","");
            insert = con1.prepareStatement("INSERT INTO burger(item, orderBurger, price)values(?, ?, ?)");
            insert.setInt(1, id);
            insert.setString(2, order4A);
            insert.setInt(3, price4);
            insert.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Sucessfully updated");   
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(posFinals.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(posFinals.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else if("CHICK & BURGER".equals(selectedValue1)){
            
            String order5A = "CHICK & BURGER";
            
            receipt++;
            if(receipt == 1){
                 resto();
            }
            int totalA5 = cb * payment;
            total += totalA5;
            posTa.setText(posTa.getText() + receipt + "." + "CHICK & BURGER" + "\t\t\t\t"+totalA5 + "\n");
            int price5 = totalA5;
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/listmenu","root","");
            insert = con1.prepareStatement("INSERT INTO burger(item, orderBurger, price)values(?, ?, ?)");
            insert.setInt(1, id);
            insert.setString(2, order5A);
            insert.setInt(3, price5);
            insert.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Sucessfully updated");   
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(posFinals.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(posFinals.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        
    }//GEN-LAST:event_buyButton1ActionPerformed

    private void butButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butButton2ActionPerformed
        
        int cs = 169;
        int be = 79;
        int he = 79;
        int se = 89;
        
        int payment = 1;
        
        String selectedValue2 = sandwichCt.getSelectedItem().toString();
        String order1B = "CHICKEN SANDWICH";
        int id = 0;
        
        if("CHICKEN SANDWICH".equals(selectedValue2)){
            receipt++;
            if(receipt == 1){
                resto();
            }
            int totalB1 = cs * payment;
            total += totalB1;
            posTa.setText(posTa.getText() + receipt + "." + "CHICKEN SANDWICH" + "\t\t\t\t"+totalB1 + "\n");
            int price1 = totalB1;
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/listmenu","root","");
            insert = con1.prepareStatement("INSERT INTO sandwich(item, orderSand, price)values(?, ?, ?)");
            insert.setInt(1, id);
            insert.setString(2, order1B);
            insert.setInt(3, price1);
            insert.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Sucessfully updated");   
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(posFinals.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(posFinals.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else if("BACON & EGG".equals(selectedValue2)){
            
            String order2B = "BACON & EGG";
            
            receipt++;
            if(receipt == 1){
                resto();
            }
            int totalB2 = be * payment;
            total += totalB2;
            posTa.setText(posTa.getText() + receipt + "." + "BACON & EGG" + "\t\t\t\t"+totalB2 + "\n");
            int price2 = totalB2;
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/listmenu","root","");
            insert = con1.prepareStatement("INSERT INTO sandwich(item, orderSand, price)values(?, ?, ?)");
            insert.setInt(1, id);
            insert.setString(2, order2B);
            insert.setInt(3, price2);
            insert.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Sucessfully updated");   
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(posFinals.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(posFinals.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else if ("HAM & EGG".equals(selectedValue2)){
            
            String order3B = "HAM & EGG";
             
            receipt++;
            if(receipt == 1){
                resto();
            }
            int totalB3 = he * payment;
            total += totalB3;
            posTa.setText(posTa.getText() + receipt + "." + "HAM & EGG" + "\t\t\t\t\t"+totalB3 + "\n");
            int price3 = totalB3;
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/listmenu","root","");
            insert = con1.prepareStatement("INSERT INTO sandwich(item, orderSand, price)values(?, ?, ?)");
            insert.setInt(1, id);
            insert.setString(2, order3B);
            insert.setInt(3, price3);
            insert.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Sucessfully updated");   
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(posFinals.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(posFinals.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else if("SPAM & EGG".equals(selectedValue2)){
            
            String order3B = "SPAM & EGG";
            
            receipt++;
            if(receipt == 1){
                resto();
            }
            int totalB4 = se * payment;
            total += totalB4;
            posTa.setText(posTa.getText() + receipt + "." + "SPAM & EGG" + "\t\t\t\t\t"+totalB4 + "\n");
            int price4 = totalB4;
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/listmenu","root","");
            insert = con1.prepareStatement("INSERT INTO sandwich(item, orderSand, price)values(?, ?, ?)");
            insert.setInt(1, id);
            insert.setString(2, order3B);
            insert.setInt(3, price4);
            insert.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Sucessfully updated");   
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(posFinals.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(posFinals.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
          
    }//GEN-LAST:event_butButton2ActionPerformed

    private void buyButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyButton3ActionPerformed
        
        int ff = 79;
        int gf = 119;
        
        int payment = 1;
        
        String selectedValue3 = friesCt.getSelectedItem().toString();
        String order3F = "FIRST FRIES";
        int id = 0;
        
         if("FIRST FRIES".equals(selectedValue3)){
            receipt++;
            if(receipt == 1){
                resto();
            }
            int totalC1 = ff * payment;
            total += totalC1;
            posTa.setText(posTa.getText() + receipt + "." + "FIRST FRIES" + "\t\t\t\t\t"+totalC1 + "\n");
            int price3 = totalC1;
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/listmenu","root","");
            insert = con1.prepareStatement("INSERT INTO fries(item, orderFries, price)values(?, ?, ?)");
            insert.setInt(1, id);
            insert.setString(2, order3F);
            insert.setInt(3, price3);
            insert.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Sucessfully updated");   
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(posFinals.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(posFinals.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }
        else if("GRAND FRIES".equals(selectedValue3)){
            String order4F = "GRAND FRIES";
            receipt++;
            if(receipt == 1){
                resto();
            }
            int totalC2 = gf * payment;
            total += totalC2;
            posTa.setText(posTa.getText() + receipt + "." + "GRAND FRIES" + "\t\t\t\t"+totalC2 + "\n");
            int price3 = totalC2;
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/listmenu","root","");
            insert = con1.prepareStatement("INSERT INTO fries(item, orderFries, price)values(?, ?, ?)");
            insert.setInt(1, id);
            insert.setString(2, order4F);
            insert.setInt(3, price3);
            insert.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Sucessfully updated");   
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(posFinals.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(posFinals.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
         
         
         
         
         
        
    }//GEN-LAST:event_buyButton3ActionPerformed

    private void buyButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyButton4ActionPerformed
        
        int bacon = 25;
        int cheese = 20;
        int egg = 20;
        int ham = 25;
        int spam = 30;
        int bbq = 20;
        
        int payment = 1;
        
        String selectedValue4 = addCt.getSelectedItem().toString();
        String order1C = "BACON";
        int id = 0;
        
        if("BACON".equals(selectedValue4)){
            receipt++;
            if(receipt == 1){
                resto();
            }
            int totalD1 = bacon * payment;
            total += totalD1;
            posTa.setText(posTa.getText() + receipt + "." + "BACON" + "\t\t\t\t\t"+totalD1 + "\n");
            int price1 = totalD1;
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/listmenu","root","");
            insert = con1.prepareStatement("INSERT INTO addons(item, orderAdd, price)values(?, ?, ?)");
            insert.setInt(1, id);
            insert.setString(2, order1C);
            insert.setInt(3, price1);
            insert.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Sucessfully updated");   
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(posFinals.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(posFinals.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else if("CHEESE".equals(selectedValue4)){
            String order2C = "CHEESE";
            receipt++;
            if(receipt == 1){
                resto();
            }
            int totalD2 = cheese * payment;
            total += totalD2;
            posTa.setText(posTa.getText() + receipt + "." + "CHEESE" + "\t\t\t\t\t"+totalD2 + "\n");
            int price2 = totalD2; 
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/listmenu","root","");
            insert = con1.prepareStatement("INSERT INTO addons(item, orderAdd, price)values(?, ?, ?)");
            insert.setInt(1, id);
            insert.setString(2, order2C);
            insert.setInt(3, price2);
            insert.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Sucessfully updated");   
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(posFinals.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(posFinals.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else if("EGG".equals(selectedValue4)){
            String order3C = "EGG";
            receipt++;
            if(receipt == 1){
                resto();
            }
            int totalD3 = egg * payment;
            total += totalD3;
            posTa.setText(posTa.getText() + receipt + "." + "EGG" + "\t\t\t\t\t"+totalD3 + "\n");
            int price3 = totalD3;
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/listmenu","root","");
            insert = con1.prepareStatement("INSERT INTO addons(item, orderAdd, price)values(?, ?, ?)");
            insert.setInt(1, id);
            insert.setString(2, order3C);
            insert.setInt(3, price3);
            insert.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Sucessfully updated");   
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(posFinals.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(posFinals.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else if("HAM".equals(selectedValue4)){
            String order4C = "HAM";
            receipt++;
            if(receipt == 1){
                resto();
            }
            int totalD4 = ham * payment;
            total += totalD4;
            posTa.setText(posTa.getText() + receipt + "." + "HAM" + "\t\t\t\t\t"+totalD4 + "\n");
            int price4 = totalD4;
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/listmenu","root","");
            insert = con1.prepareStatement("INSERT INTO addons(item, orderAdd, price)values(?, ?, ?)");
            insert.setInt(1, id);
            insert.setString(2, order4C);
            insert.setInt(3, price4);
            insert.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Sucessfully updated");   
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(posFinals.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(posFinals.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else if("SPAM".equals(selectedValue4)){
            String order5C = "SPAM";
            receipt++;
            if(receipt == 1){
                resto();
            }
            int totalD5 = spam * payment;
            total += totalD5;
            posTa.setText(posTa.getText() + receipt + "." + "SPAM" + "\t\t\t\t\t"+totalD5 + "\n");
            int price5 = totalD5;
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/listmenu","root","");
            insert = con1.prepareStatement("INSERT INTO addons(item, orderAdd, price)values(?, ?, ?)");
            insert.setInt(1, id);
            insert.setString(2, order5C);
            insert.setInt(3, price5);
            insert.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Sucessfully updated");   
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(posFinals.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(posFinals.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        else if("BBQ SAUCE".equals(selectedValue4)){
            String order6C = "BBQ SAUCE";
            receipt++;
            if(receipt == 1){
                resto();
            }
            int totalD6 = bbq * payment;
            total += totalD6;
            posTa.setText(posTa.getText() + receipt + "." + "BBQ SAUCE" + "\t\t\t\t\t"+totalD6 + "\n");
            int price6 = totalD6;
            
            try {
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost/listmenu","root","");
            insert = con1.prepareStatement("INSERT INTO addons(item, orderAdd, price)values(?, ?, ?)");
            insert.setInt(1, id);
            insert.setString(2, order6C);
            insert.setInt(3, price6);
            insert.executeUpdate();
            
            JOptionPane.showMessageDialog(this, "Sucessfully updated");   
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(posFinals.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(posFinals.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        
    }//GEN-LAST:event_buyButton4ActionPerformed

    private void totalBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalBtActionPerformed
        if(total == 0){
            JOptionPane.showMessageDialog(null, "Please select item");
        }
        else{
            posTa.setText(posTa.getText()
                    +"==================================================================================== \n"
                    + "Total: " + total + "\n"
                    + "Change: \n"
                    +"==================================================================================== \n"
                    + "GET THE 5% DISCOUNT FOR SENIOR CITIZEN, JUST CLICK THE BUTTON ABOVE\n"
                    + "AVAIL 10% DISCOUNT FOR EVERY PHP 600 PURCHASE!!!\n"
            );
            totalBt.setEnabled(false);
            
           
        }
    }//GEN-LAST:event_totalBtActionPerformed

    private void insertBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBtActionPerformed
        
        int payment = Integer.parseInt(paymentTf.getText());
        DecimalFormat df = new DecimalFormat("0.00");
        
        if(normal.isSelected()){
            int customersChange;
            customersChange = payment - total;
            changeTf.setText(String.valueOf(customersChange));
        }
        else if(senior.isSelected()){
            double customerDiscount;
            double customerChange1;
            double customerChange2;
            customerDiscount = total * 0.05;
            customerChange1 = total - customerDiscount ;
            customerChange2 = payment - customerChange1;
            changeTf.setText(String.valueOf(df.format(customerChange2)));   
        }
        else if(discount.isSelected()){
            double customerDiscount;
            double customerChange1;
            double customerChange2;
            customerDiscount = total * 0.10;
            customerChange1 = total - customerDiscount ;
            customerChange2 = payment - customerChange1;
            changeTf.setText(String.valueOf(df.format(customerChange2))); 
        }
        
            
        
        
        
        
            
        
    }//GEN-LAST:event_insertBtActionPerformed

    private void normalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_normalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_normalActionPerformed

    private void exitBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtActionPerformed
        menuTab jf1 = new menuTab();
                   
                jf1.show();
                dispose();
    }//GEN-LAST:event_exitBtActionPerformed

    private void clearBt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBt2ActionPerformed
        posTa.setText("");
    }//GEN-LAST:event_clearBt2ActionPerformed

    private void clearBt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBt1ActionPerformed
        paymentTf.setText("");
        changeTf.setText("");
    }//GEN-LAST:event_clearBt1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(posFinals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(posFinals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(posFinals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(posFinals.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new posFinals().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> addCt;
    private javax.swing.JComboBox<String> burgerCt;
    private javax.swing.JButton butButton2;
    private javax.swing.JButton buyButton1;
    private javax.swing.JButton buyButton3;
    private javax.swing.JButton buyButton4;
    private javax.swing.JTextField changeTf;
    private javax.swing.JButton clearBt1;
    private javax.swing.JButton clearBt2;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JRadioButton discount;
    private javax.swing.JButton exitBt;
    private javax.swing.JComboBox<String> friesCt;
    private javax.swing.JButton insertBt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton normal;
    private javax.swing.JTextField paymentTf;
    private javax.swing.JTextArea posTa;
    private javax.swing.JComboBox<String> sandwichCt;
    private javax.swing.JRadioButton senior;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JButton totalBt;
    // End of variables declaration//GEN-END:variables
}
