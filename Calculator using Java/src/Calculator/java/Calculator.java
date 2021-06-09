
package Calculator.java;

import java.util.*;



public class Calculator extends javax.swing.JFrame {
    
    String op;
    double fnum;
    double snum;
    double R;
    
    public Calculator() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jbtn7 = new javax.swing.JButton();
        jbtnBackspace = new javax.swing.JButton();
        jbtnC = new javax.swing.JButton();
        jbtnPlus = new javax.swing.JButton();
        jbtn8 = new javax.swing.JButton();
        jbtn9 = new javax.swing.JButton();
        jbtnMinus = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jbtn5 = new javax.swing.JButton();
        jbtn6 = new javax.swing.JButton();
        jbtn1 = new javax.swing.JButton();
        jbtn2 = new javax.swing.JButton();
        jbtn3 = new javax.swing.JButton();
        jbtnMultiply = new javax.swing.JButton();
        jbtnDivide = new javax.swing.JButton();
        jbtn0 = new javax.swing.JButton();
        jbtnDot = new javax.swing.JButton();
        jbtnEqual = new javax.swing.JButton();
        jbtnRoot = new javax.swing.JButton();
        jbtnSqr = new javax.swing.JButton();
        jbtnQube = new javax.swing.JButton();
        jbtnLog = new javax.swing.JButton();
        jbtnPie = new javax.swing.JButton();
        jbtnRound = new javax.swing.JButton();
        jbtnSin = new javax.swing.JButton();
        jbtnCos = new javax.swing.JButton();
        jbtnTan = new javax.swing.JButton();
        jbtnCot = new javax.swing.JButton();
        jbtnSec = new javax.swing.JButton();
        jbtnCosec = new javax.swing.JButton();
        jbtnCbrt = new javax.swing.JButton();
        jbtnAbs = new javax.swing.JButton();
        jbtnLn = new javax.swing.JButton();
        jbtnInverse = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Scientific Calculator");
        setResizable(false);

        jTextField1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jbtn7.setBackground(new java.awt.Color(0, 153, 153));
        jbtn7.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jbtn7.setText("7");
        jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn7ActionPerformed(evt);
            }
        });

        jbtnBackspace.setBackground(new java.awt.Color(0, 153, 153));
        jbtnBackspace.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jbtnBackspace.setText("←");
        jbtnBackspace.setActionCommand("");
        jbtnBackspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBackspaceActionPerformed(evt);
            }
        });

        jbtnC.setBackground(new java.awt.Color(0, 153, 153));
        jbtnC.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jbtnC.setText("C");
        jbtnC.setActionCommand("");
        jbtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCActionPerformed(evt);
            }
        });

        jbtnPlus.setBackground(new java.awt.Color(0, 153, 153));
        jbtnPlus.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jbtnPlus.setText("+");
        jbtnPlus.setActionCommand("");
        jbtnPlus.setPreferredSize(new java.awt.Dimension(41, 32));
        jbtnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPlusActionPerformed(evt);
            }
        });

        jbtn8.setBackground(new java.awt.Color(0, 153, 153));
        jbtn8.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jbtn8.setText("8");
        jbtn8.setActionCommand("");
        jbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn8ActionPerformed(evt);
            }
        });

        jbtn9.setBackground(new java.awt.Color(0, 153, 153));
        jbtn9.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jbtn9.setText("9");
        jbtn9.setActionCommand("");
        jbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn9ActionPerformed(evt);
            }
        });

        jbtnMinus.setBackground(new java.awt.Color(0, 153, 153));
        jbtnMinus.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jbtnMinus.setText("-");
        jbtnMinus.setActionCommand("");
        jbtnMinus.setMaximumSize(new java.awt.Dimension(42, 32));
        jbtnMinus.setMinimumSize(new java.awt.Dimension(42, 32));
        jbtnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMinusActionPerformed(evt);
            }
        });

        jbtn4.setBackground(new java.awt.Color(0, 153, 153));
        jbtn4.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jbtn4.setText("4");
        jbtn4.setActionCommand("");
        jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn4ActionPerformed(evt);
            }
        });

        jbtn5.setBackground(new java.awt.Color(0, 153, 153));
        jbtn5.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jbtn5.setText("5");
        jbtn5.setActionCommand("");
        jbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn5ActionPerformed(evt);
            }
        });

        jbtn6.setBackground(new java.awt.Color(0, 153, 153));
        jbtn6.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jbtn6.setText("6");
        jbtn6.setActionCommand("");
        jbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn6ActionPerformed(evt);
            }
        });

        jbtn1.setBackground(new java.awt.Color(0, 153, 153));
        jbtn1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jbtn1.setText("1");
        jbtn1.setActionCommand("");
        jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn1ActionPerformed(evt);
            }
        });

        jbtn2.setBackground(new java.awt.Color(0, 153, 153));
        jbtn2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jbtn2.setText("2");
        jbtn2.setActionCommand("");
        jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn2ActionPerformed(evt);
            }
        });

        jbtn3.setBackground(new java.awt.Color(0, 153, 153));
        jbtn3.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jbtn3.setText("3");
        jbtn3.setActionCommand("");
        jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn3ActionPerformed(evt);
            }
        });

        jbtnMultiply.setBackground(new java.awt.Color(0, 153, 153));
        jbtnMultiply.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jbtnMultiply.setText("*");
        jbtnMultiply.setActionCommand("");
        jbtnMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMultiplyActionPerformed(evt);
            }
        });

        jbtnDivide.setBackground(new java.awt.Color(0, 153, 153));
        jbtnDivide.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jbtnDivide.setText("/");
        jbtnDivide.setActionCommand("");
        jbtnDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDivideActionPerformed(evt);
            }
        });

        jbtn0.setBackground(new java.awt.Color(0, 153, 153));
        jbtn0.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jbtn0.setText("0");
        jbtn0.setActionCommand("");
        jbtn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn0ActionPerformed(evt);
            }
        });

        jbtnDot.setBackground(new java.awt.Color(0, 153, 153));
        jbtnDot.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jbtnDot.setText(".");
        jbtnDot.setActionCommand("");
        jbtnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDotActionPerformed(evt);
            }
        });

        jbtnEqual.setBackground(new java.awt.Color(0, 153, 153));
        jbtnEqual.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jbtnEqual.setText("=");
        jbtnEqual.setActionCommand("");
        jbtnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEqualActionPerformed(evt);
            }
        });

        jbtnRoot.setBackground(new java.awt.Color(0, 153, 153));
        jbtnRoot.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jbtnRoot.setText("√");
        jbtnRoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRootActionPerformed(evt);
            }
        });

        jbtnSqr.setBackground(new java.awt.Color(0, 153, 153));
        jbtnSqr.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jbtnSqr.setText(" x²");
        jbtnSqr.setActionCommand("");
        jbtnSqr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSqrActionPerformed(evt);
            }
        });

        jbtnQube.setBackground(new java.awt.Color(0, 153, 153));
        jbtnQube.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jbtnQube.setText("x^3");
        jbtnQube.setActionCommand("");
        jbtnQube.setMaximumSize(new java.awt.Dimension(42, 32));
        jbtnQube.setMinimumSize(new java.awt.Dimension(42, 32));
        jbtnQube.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnQubeActionPerformed(evt);
            }
        });

        jbtnLog.setBackground(new java.awt.Color(0, 153, 153));
        jbtnLog.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        jbtnLog.setText("Log");
        jbtnLog.setActionCommand("");
        jbtnLog.setMaximumSize(new java.awt.Dimension(42, 32));
        jbtnLog.setMinimumSize(new java.awt.Dimension(42, 32));
        jbtnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLogActionPerformed(evt);
            }
        });

        jbtnPie.setBackground(new java.awt.Color(0, 153, 153));
        jbtnPie.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jbtnPie.setText("π");
        jbtnPie.setActionCommand("");
        jbtnPie.setMaximumSize(new java.awt.Dimension(42, 32));
        jbtnPie.setMinimumSize(new java.awt.Dimension(42, 32));
        jbtnPie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPieActionPerformed(evt);
            }
        });

        jbtnRound.setBackground(new java.awt.Color(0, 153, 153));
        jbtnRound.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        jbtnRound.setText("Rund");
        jbtnRound.setActionCommand("");
        jbtnRound.setMaximumSize(new java.awt.Dimension(42, 32));
        jbtnRound.setMinimumSize(new java.awt.Dimension(42, 32));
        jbtnRound.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRoundActionPerformed(evt);
            }
        });

        jbtnSin.setBackground(new java.awt.Color(0, 153, 153));
        jbtnSin.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        jbtnSin.setText("Sin");
        jbtnSin.setActionCommand("");
        jbtnSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSinActionPerformed(evt);
            }
        });

        jbtnCos.setBackground(new java.awt.Color(0, 153, 153));
        jbtnCos.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        jbtnCos.setText("Cos");
        jbtnCos.setActionCommand("");
        jbtnCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCosActionPerformed(evt);
            }
        });

        jbtnTan.setBackground(new java.awt.Color(0, 153, 153));
        jbtnTan.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        jbtnTan.setText("Tan");
        jbtnTan.setActionCommand("");
        jbtnTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTanActionPerformed(evt);
            }
        });

        jbtnCot.setBackground(new java.awt.Color(0, 153, 153));
        jbtnCot.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        jbtnCot.setText("Cot");
        jbtnCot.setActionCommand("");
        jbtnCot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCotActionPerformed(evt);
            }
        });

        jbtnSec.setBackground(new java.awt.Color(0, 153, 153));
        jbtnSec.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        jbtnSec.setText("Sec");
        jbtnSec.setActionCommand("");
        jbtnSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnSecActionPerformed(evt);
            }
        });

        jbtnCosec.setBackground(new java.awt.Color(0, 153, 153));
        jbtnCosec.setFont(new java.awt.Font("Agency FB", 1, 16)); // NOI18N
        jbtnCosec.setText("Cosec");
        jbtnCosec.setActionCommand("");
        jbtnCosec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCosecActionPerformed(evt);
            }
        });

        jbtnCbrt.setBackground(new java.awt.Color(0, 153, 153));
        jbtnCbrt.setFont(new java.awt.Font("Agency FB", 1, 22)); // NOI18N
        jbtnCbrt.setText("Cbrt");
        jbtnCbrt.setActionCommand("");
        jbtnCbrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCbrtActionPerformed(evt);
            }
        });

        jbtnAbs.setBackground(new java.awt.Color(0, 153, 153));
        jbtnAbs.setFont(new java.awt.Font("Agency FB", 1, 22)); // NOI18N
        jbtnAbs.setText("Abs");
        jbtnAbs.setActionCommand("");
        jbtnAbs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAbsActionPerformed(evt);
            }
        });

        jbtnLn.setBackground(new java.awt.Color(0, 153, 153));
        jbtnLn.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        jbtnLn.setText("log10");
        jbtnLn.setActionCommand("");
        jbtnLn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnLnActionPerformed(evt);
            }
        });

        jbtnInverse.setBackground(new java.awt.Color(0, 153, 153));
        jbtnInverse.setFont(new java.awt.Font("Agency FB", 1, 20)); // NOI18N
        jbtnInverse.setText("1/x");
        jbtnInverse.setActionCommand("");
        jbtnInverse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnInverseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jbtnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jbtnRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jbtnBackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jbtnMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jbtnSqr, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jbtnSin, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnCosec, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jbtnDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jbtnQube, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jbtnCos, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnCbrt, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jbtnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jbtnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jbtnTan, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnAbs, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jbtnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jbtnPie, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jbtnCot, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnLn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jbtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jbtnC, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jbtnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jbtnRound, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jbtnSec, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnInverse, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jbtnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jbtnRoot, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jbtnBackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jbtnMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jbtnSqr, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnSin, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnCosec, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jbtnQube, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtnCos, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnCbrt, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnTan, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnAbs, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnCot, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnLn, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnPie, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtn0, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnC, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnRound, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbtnSec, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbtnInverse, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn7ActionPerformed
        
        String EnterNumber = jTextField1.getText() + jbtn7.getText();
        jTextField1.setText(EnterNumber);
    }//GEN-LAST:event_jbtn7ActionPerformed

    private void jbtnBackspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBackspaceActionPerformed
        StringBuilder erase = new StringBuilder(jTextField1.getText());
        erase.reverse();
        
        erase.deleteCharAt(0);
        
        erase.reverse();
        
        String BackSpace = new String(erase);
        
        jTextField1.setText(BackSpace);
        
        
    }//GEN-LAST:event_jbtnBackspaceActionPerformed

    private void jbtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCActionPerformed
        
        jTextField1.setText("");
    }//GEN-LAST:event_jbtnCActionPerformed

    private void jbtnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPlusActionPerformed
        
        
        fnum = Double.parseDouble(jTextField1.getText());
        jTextField1.setText(" ");
        op = "+";
        
    }//GEN-LAST:event_jbtnPlusActionPerformed

    private void jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn8ActionPerformed
        String EnterNumber = jTextField1.getText() + jbtn8.getText();
        jTextField1.setText(EnterNumber);
    }//GEN-LAST:event_jbtn8ActionPerformed

    private void jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn9ActionPerformed
        String EnterNumber = jTextField1.getText() + jbtn9.getText();
        jTextField1.setText(EnterNumber);
    }//GEN-LAST:event_jbtn9ActionPerformed

    private void jbtnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMinusActionPerformed
        fnum = Double.parseDouble(jTextField1.getText());
        jTextField1.setText(" ");
        op = "-";
    }//GEN-LAST:event_jbtnMinusActionPerformed

    private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn4ActionPerformed
        String EnterNumber = jTextField1.getText() + jbtn4.getText();
        jTextField1.setText(EnterNumber);
    }//GEN-LAST:event_jbtn4ActionPerformed

    private void jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn5ActionPerformed
        String EnterNumber = jTextField1.getText() + jbtn5.getText();
        jTextField1.setText(EnterNumber);
    }//GEN-LAST:event_jbtn5ActionPerformed

    private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn6ActionPerformed
        String EnterNumber = jTextField1.getText() + jbtn6.getText();
        jTextField1.setText(EnterNumber);
    }//GEN-LAST:event_jbtn6ActionPerformed

    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn1ActionPerformed
        String EnterNumber = jTextField1.getText() + jbtn1.getText();
        jTextField1.setText(EnterNumber);
    }//GEN-LAST:event_jbtn1ActionPerformed

    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn2ActionPerformed
        String EnterNumber = jTextField1.getText() + jbtn2.getText();
        jTextField1.setText(EnterNumber);
    }//GEN-LAST:event_jbtn2ActionPerformed

    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn3ActionPerformed
        
        String EnterNumber = jTextField1.getText() + jbtn3.getText();
        jTextField1.setText(EnterNumber);
    }//GEN-LAST:event_jbtn3ActionPerformed

    private void jbtnMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMultiplyActionPerformed
       
        fnum = Double.parseDouble(jTextField1.getText());
        jTextField1.setText(" ");
        op = "*";
    }//GEN-LAST:event_jbtnMultiplyActionPerformed

    private void jbtnDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDivideActionPerformed
        
        fnum = Double.parseDouble(jTextField1.getText());
        jTextField1.setText(" ");
        op = "/";
    }//GEN-LAST:event_jbtnDivideActionPerformed

    private void jbtn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn0ActionPerformed
        
        String EnterNumber = jTextField1.getText() + jbtn0.getText();
        jTextField1.setText(EnterNumber);
    }//GEN-LAST:event_jbtn0ActionPerformed

    private void jbtnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDotActionPerformed
        String EnterNumber = jTextField1.getText() + jbtnDot.getText();
        jTextField1.setText(EnterNumber);
    }//GEN-LAST:event_jbtnDotActionPerformed

    private void jbtnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEqualActionPerformed
        String answer;
        snum= Double.parseDouble(jTextField1.getText());
        
        if(op == "+")
        {
           
            R = fnum + snum;
            answer = String.format("%.2f",R);
            jTextField1.setText(answer);
        
        }
        
        else if(op == "-")
        {
                
           
            R =  fnum - snum;
            answer = String.format("%.2f",R);
            jTextField1.setText(answer);
        
        }
        
        else if(op == "*")
        {
           
            R =  fnum * snum;
            answer = String.format("%.2f",R);
            jTextField1.setText(answer);
        
        }
        
        else if(op == "/")
        {
           
            R =  fnum / snum;
            answer = String.format("%.2f",R);
            jTextField1.setText(answer);
        
        }  

        
        
    }//GEN-LAST:event_jbtnEqualActionPerformed

    private void jbtnRootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRootActionPerformed
        double ops =Double.parseDouble(String.valueOf(jTextField1.getText()));
        
        ops = Math.sqrt(ops);
        
        jTextField1.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnRootActionPerformed

    private void jbtnSqrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSqrActionPerformed
        double ops =Double.parseDouble(String.valueOf(jTextField1.getText()));
        
        ops = Math.pow(ops,2);
        
        jTextField1.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnSqrActionPerformed

    private void jbtnQubeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnQubeActionPerformed
        double ops =Double.parseDouble(String.valueOf(jTextField1.getText()));
        
        ops = Math.pow(ops,3);
        
        jTextField1.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnQubeActionPerformed

    private void jbtnLogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLogActionPerformed
        double ops =Double.parseDouble(String.valueOf(jTextField1.getText()));
        
        ops = Math.log(ops);
        
        jTextField1.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnLogActionPerformed

    private void jbtnPieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPieActionPerformed
        double ops;
        
        ops = (3.1415926535897);
        
        jTextField1.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnPieActionPerformed

    private void jbtnRoundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRoundActionPerformed
        double ops =Double.parseDouble(String.valueOf(jTextField1.getText()));
        
        ops = Math.round(ops);
        
        jTextField1.setText(String.valueOf(ops));
    }//GEN-LAST:event_jbtnRoundActionPerformed

    private void jbtnSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSinActionPerformed
        double ops =Double.parseDouble(String.valueOf(jTextField1.getText()));
        
        double radians = Math.toRadians(ops); 
        
        double SinValue= Math.sin(radians);
        
        jTextField1.setText(String.valueOf(SinValue));
    }//GEN-LAST:event_jbtnSinActionPerformed

    private void jbtnCosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCosActionPerformed
        double ops =Double.parseDouble(String.valueOf(jTextField1.getText()));
        
        double radians = Math.toRadians(ops); 
        
        double CosValue= Math.cos(radians);
        
        jTextField1.setText(String.valueOf(CosValue));
    }//GEN-LAST:event_jbtnCosActionPerformed

    private void jbtnTanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTanActionPerformed
        double ops =Double.parseDouble(String.valueOf(jTextField1.getText()));
        
        double radians = Math.toRadians(ops); 
        
        double TanValue= Math.tan(radians);
        
        jTextField1.setText(String.valueOf(TanValue));
    }//GEN-LAST:event_jbtnTanActionPerformed

    private void jbtnCotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCotActionPerformed
        double ops =Double.parseDouble(String.valueOf(jTextField1.getText()));
        
        double radians = Math.toRadians(ops); 
        
        double CotValue= 1/Math.tan(radians);
        
        jTextField1.setText(String.valueOf(CotValue));
    }//GEN-LAST:event_jbtnCotActionPerformed

    private void jbtnSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnSecActionPerformed
        double ops =Double.parseDouble(String.valueOf(jTextField1.getText()));
        
        double radians = Math.toRadians(ops); 
        
        double SecValue= 1/Math.cos(radians);
        
        jTextField1.setText(String.valueOf(SecValue));
    }//GEN-LAST:event_jbtnSecActionPerformed

    private void jbtnCosecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCosecActionPerformed
        double ops =Double.parseDouble(String.valueOf(jTextField1.getText()));
        
        double radians = Math.toRadians(ops); 
        
        double CosecValue= 1/Math.sin(radians);
        
        jTextField1.setText(String.valueOf(CosecValue));
    }//GEN-LAST:event_jbtnCosecActionPerformed

    private void jbtnCbrtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCbrtActionPerformed
        double ops =Double.parseDouble(String.valueOf(jTextField1.getText()));
        
        ops = Math.cbrt(ops);
        
        jTextField1.setText(String.valueOf(ops));
                        
    }//GEN-LAST:event_jbtnCbrtActionPerformed

    private void jbtnAbsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAbsActionPerformed
        double ops =Double.parseDouble(String.valueOf(jTextField1.getText()));
        
        ops = Math.abs(ops);
        
        jTextField1.setText(String.valueOf(ops));

    }//GEN-LAST:event_jbtnAbsActionPerformed

    private void jbtnLnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnLnActionPerformed
        double ops =Double.parseDouble(String.valueOf(jTextField1.getText()));
        
        ops = Math.log10(ops);
        
        jTextField1.setText(String.valueOf(ops));  
        
    }//GEN-LAST:event_jbtnLnActionPerformed

    private void jbtnInverseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnInverseActionPerformed
       double ops =Double.parseDouble(String.valueOf(jTextField1.getText()));
        
        ops = Math.pow(ops,-1);
        
        jTextField1.setText(String.valueOf(ops));
        
    }//GEN-LAST:event_jbtnInverseActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        //java.awt.EventQueue.invokeLater(() -> {
            new Calculator().setVisible(true);
       // });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbtn0;
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn5;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn8;
    private javax.swing.JButton jbtn9;
    private javax.swing.JButton jbtnAbs;
    private javax.swing.JButton jbtnBackspace;
    private javax.swing.JButton jbtnC;
    private javax.swing.JButton jbtnCbrt;
    private javax.swing.JButton jbtnCos;
    private javax.swing.JButton jbtnCosec;
    private javax.swing.JButton jbtnCot;
    private javax.swing.JButton jbtnDivide;
    private javax.swing.JButton jbtnDot;
    private javax.swing.JButton jbtnEqual;
    private javax.swing.JButton jbtnInverse;
    private javax.swing.JButton jbtnLn;
    private javax.swing.JButton jbtnLog;
    private javax.swing.JButton jbtnMinus;
    private javax.swing.JButton jbtnMultiply;
    private javax.swing.JButton jbtnPie;
    private javax.swing.JButton jbtnPlus;
    private javax.swing.JButton jbtnQube;
    private javax.swing.JButton jbtnRoot;
    private javax.swing.JButton jbtnRound;
    private javax.swing.JButton jbtnSec;
    private javax.swing.JButton jbtnSin;
    private javax.swing.JButton jbtnSqr;
    private javax.swing.JButton jbtnTan;
    // End of variables declaration//GEN-END:variables
}
