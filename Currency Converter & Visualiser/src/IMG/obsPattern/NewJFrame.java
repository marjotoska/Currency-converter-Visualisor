/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IMG.obsPattern;

/**
 *
 * @author marjo
 */


public class NewJFrame extends javax.swing.JFrame {
        


    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        result1 = new javax.swing.JTextField();
        result2 = new javax.swing.JTextField();
        currency1 = new javax.swing.JComboBox<>();
        currency2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        convert = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        org.jdesktop.layout.GroupLayout jDialog1Layout = new org.jdesktop.layout.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Currency Converter");
        setResizable(false);

        jPanel1.setLayout(null);

        result1.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        result1.setText("1");
        result1.setToolTipText("Enter nr you to be converted(you can use either fields)");
        result1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                result1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                result1MousePressed(evt);
            }
        });
        result1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                result1ActionPerformed(evt);
            }
        });
        jPanel1.add(result1);
        result1.setBounds(40, 190, 138, 60);

        result2.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        result2.setText("121.8");
        result2.setToolTipText("Enter nr you to be converted(you can use either fields)");
        result2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                result2MousePressed(evt);
            }
        });
        result2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                result2ActionPerformed(evt);
            }
        });
        jPanel1.add(result2);
        result2.setBounds(270, 190, 138, 60);

        currency1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EUR", "ALL", "GBP", "USD" }));
        currency1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                currency1ActionPerformed(evt);
            }
        });
        jPanel1.add(currency1);
        currency1.setBounds(30, 30, 138, 52);

        currency2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALL", "EUR", "USD", "GBP", " " }));
        jPanel1.add(currency2);
        currency2.setBounds(270, 30, 138, 54);

        //jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/convertIconJavaSmall.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(190, 110, 55, 52);

        convert.setText("Convert");
        convert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                convertMouseClicked(evt);
            }
        });
        convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertActionPerformed(evt);
            }
        });
        jPanel1.add(convert);
        convert.setBounds(320, 290, 93, 29);

        clear.setEnabled(false);
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear);
        clear.setBounds(40, 290, 69, 29);

        //jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/ezgif.com-resize (1).gif"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 0, 440, 380);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(null);
        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 460, 380);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void currency1ActionPerformed(java.awt.event.ActionEvent evt) {                                          

    }                                         

    private void result1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
    
    }                                       

    private void result1MouseClicked(java.awt.event.MouseEvent evt) {                                     
       
     

    }                                    

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        String txt1 = (String)currency1.getSelectedItem();
        String txt2 = (String)currency2.getSelectedItem();
        currency1.setSelectedItem(txt2);
        currency2.setSelectedItem(txt1);
            
    }                                        

    private void result2ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        
  
    }                                       

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void result1MousePressed(java.awt.event.MouseEvent evt) {                                     
        clear.setEnabled(true);
    }                                    

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {                                      
      
    }                                     

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {                                      
        result1.setText("");
        result2.setText("");
    }                                     

    private void convertActionPerformed(java.awt.event.ActionEvent evt) {                                        

      Euro euro = new Euro();

      USD usd = new USD(euro, Double.parseDouble(result1.getText()));
           
      System.out.println("\nFirst state change: " + Double.parseDouble(result1.getText()));	
      euro.seteuroToUSD(1.083317); 
      
      System.out.println("\nSecond state change: " + Double.parseDouble(result1.getText()));	
      euro.seteuroToUSD(3);
      
      double double1 = Double.parseDouble(result1.getText());
      double finalResult = double1 * euro.geteuroToUSD();
      result2.setText(String.valueOf(finalResult));

  
        
//      Euro euro = new Euro();
//      USD usd = new USD();
//      new USD(euro, Double.parseDouble(result1.getText())).toString();
//      
//      euro.seteuroToUSD(1.083317);
//   
//      
//
////      new USD(euro, 123);
//      if("EUR".equals(currency1.getSelectedItem().toString()) && "USD".equals(currency2.getSelectedItem().toString())){
//
//      
//          
//      result2.setText(total);
        
//     Euro euro = new Euro();
//     USD usd = new USD(euro, Double.parseDouble(result1.getText()));
//     double secondresult;    
//
//     if("EUR".equals(currency1.getSelectedItem().toString()) && "USD".equals(currency2.getSelectedItem().toString())){ 
//             
//            
//
//                result2.setText(String.valueOf(euro.geteuroToUSD()));
     
     
        
        
        
        
        
        
        
        
        
        
        
        
        
//        EUR EUR = new EUR();
//        USD USD = new USD();
//        ALL ALL = new ALL();
//        GBP GBP = new GBP();  
//        Double Double.parseDouble(result1.getText()) = Double.parseDouble(result1.getText());  //Convert entered nr to double
//        double secondresult;    //Create container for calc between 2 currencies
//        
////EURO TO EVERYTHING ELSE
//String txt1 = (String)result1.getText();
//String txt2 = (String)result2.getText();
//
//try{
//if ("".equals(txt1) && "".equals(txt2)){
//    JOptionPane.showMessageDialog(null, "Input a nr in txtArea");
//
//
//        }else if("EUR".equals(currency1.getSelectedItem().toString()) && "USD".equals(currency2.getSelectedItem().toString())){ 
//             secondresult = Double.parseDouble(result1.getText()) * EUR.getRateToUSD();
//            result2.setText(String.valueOf(secondresult));
//            
//        }else if("USD".equals(currency1.getSelectedItem().toString()) && "EUR".equals(currency2.getSelectedItem().toString())){ 
//             secondresult = Double.parseDouble(result1.getText()) * USD.getRateToEUR();
//                        result2.setText(String.valueOf(secondresult));
//            
///*breathe
//--------------------------------------------------------------------------------*/
//
//        }else if(currency1.getSelectedItem().toString() == "EUR" && currency2.getSelectedItem().toString() == "ALL"){ 
//             secondresult = Double.parseDouble(result1.getText()) * EUR.getRateToALL();
//                        result2.setText(String.valueOf(secondresult));
//            
//        }else if(currency1.getSelectedItem().toString() == "ALL" && currency2.getSelectedItem().toString() == "EUR"){ 
//             secondresult = Double.parseDouble(result1.getText()) * ALL.getRateToEUR();
//                        result2.setText(String.valueOf(secondresult));
//            
//            /*breathe
//--------------------------------------------------------------------------------*/
//            
//        }else if(currency1.getSelectedItem().toString() == "EUR" && currency2.getSelectedItem().toString() == "GBP"){ 
//             secondresult = Double.parseDouble(result1.getText()) * EUR.getRateToGBP();
//            result2.setText(String.valueOf(secondresult));
//            
//        }else if(currency1.getSelectedItem().toString() == "GBP" && currency2.getSelectedItem().toString() == "EUR"){ 
//             secondresult = Double.parseDouble(result1.getText()) * GBP.getRateToEUR();
//                        result2.setText(String.valueOf(secondresult));
//        
///*breathe
//--------------------------------------------------------------------------------*/
////USD to ALL, GBP
//        }else if(currency1.getSelectedItem().toString() == "USD" && currency2.getSelectedItem().toString() == "ALL"){ 
//             secondresult = Double.parseDouble(result1.getText()) * USD.getRateToALL();
//                        result2.setText(String.valueOf(secondresult));
//                        
//        }else if(currency1.getSelectedItem().toString() == "ALL" && currency2.getSelectedItem().toString() == "USD"){ 
//             secondresult = Double.parseDouble(result1.getText()) * ALL.getRateToUSD();
//                        result2.setText(String.valueOf(secondresult));
//                            
///*breathe
//--------------------------------------------------------------------------------*/
//        }else if(currency1.getSelectedItem().toString() == "USD" && currency2.getSelectedItem().toString() == "GBP"){ 
//             secondresult = Double.parseDouble(result1.getText()) * USD.getRateToGBP();
//                        result2.setText(String.valueOf(secondresult));
//                        
//        }else if(currency1.getSelectedItem().toString() == "GBP" && currency2.getSelectedItem().toString() == "USD"){ 
//             secondresult = Double.parseDouble(result1.getText()) * GBP.getRateToUSD();
//                        result2.setText(String.valueOf(secondresult));
//                        
//        
//
//                            
///*breathe
//--------------------------------------------------------------------------------*/
////ALL to GBP
//    }else if(currency1.getSelectedItem().toString() == "ALL" && currency2.getSelectedItem().toString() == "GBP"){ 
//             secondresult = Double.parseDouble(result1.getText()) * ALL.getRateToGBP();
//                        result2.setText(String.valueOf(secondresult));
//                        
//        }else if(currency1.getSelectedItem().toString() == "GBP" && currency2.getSelectedItem().toString() == "ALL"){ 
//             secondresult = Double.parseDouble(result1.getText()) * GBP.getRateToALL();
//                        result2.setText(String.valueOf(secondresult));
//                        
//        }
//        }catch(NumberFormatException e){
//            JOptionPane.showMessageDialog(this, "Try to type a number ;)");
//                }
//                        
//  
         //END CONVERT BUTTON
    //}                                       
    
}
    
    private void convertMouseClicked(java.awt.event.MouseEvent evt) {                                     

    }                                    

    private void result2MousePressed(java.awt.event.MouseEvent evt) {                                     
       clear.setEnabled(true);
    }                                    

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
  }

    // Variables declaration - do not modify                     
    private javax.swing.JButton clear;
    private javax.swing.JButton convert;
    private javax.swing.JComboBox<String> currency1;
    private javax.swing.JComboBox<String> currency2;
    private javax.swing.JButton jButton1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField result1;
    private javax.swing.JTextField result2;
    // End of variables declaration                   
}