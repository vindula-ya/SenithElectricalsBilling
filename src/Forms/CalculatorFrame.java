/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import javax.swing.JOptionPane;

/**
 *
 * @author Nafis
 */
public class CalculatorFrame extends javax.swing.JFrame {

    double a;
    double b;
    double result;
    int flag1=0;
    public CalculatorFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        calcTxt = new javax.swing.JTextField();
        cosBtn = new javax.swing.JButton();
        tanBtn = new javax.swing.JButton();
        sinBtn = new javax.swing.JButton();
        equalBtn = new javax.swing.JButton();
        unPowBtn = new javax.swing.JButton();
        sevenBtn = new javax.swing.JButton();
        eightBtn = new javax.swing.JButton();
        nineBtn = new javax.swing.JButton();
        fourBtn = new javax.swing.JButton();
        fiveBtn = new javax.swing.JButton();
        sixBtn = new javax.swing.JButton();
        threeBtn = new javax.swing.JButton();
        twoBtn = new javax.swing.JButton();
        oneBtn = new javax.swing.JButton();
        pointBtn = new javax.swing.JButton();
        multiBtn = new javax.swing.JButton();
        divBtn = new javax.swing.JButton();
        subBtn = new javax.swing.JButton();
        addiBtn = new javax.swing.JButton();
        powBtn = new javax.swing.JButton();
        acBtn = new javax.swing.JButton();
        zeroBtn = new javax.swing.JButton();
        delBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Calculator");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        calcTxt.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        calcTxt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        calcTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcTxtActionPerformed(evt);
            }
        });
        getContentPane().add(calcTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 41, 380, 70));

        cosBtn.setText("cos");
        cosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosBtnActionPerformed(evt);
            }
        });
        getContentPane().add(cosBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 60, -1));

        tanBtn.setText("tan");
        tanBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanBtnActionPerformed(evt);
            }
        });
        getContentPane().add(tanBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 60, -1));

        sinBtn.setText("sin");
        sinBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinBtnActionPerformed(evt);
            }
        });
        getContentPane().add(sinBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 60, -1));

        equalBtn.setText("=");
        equalBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalBtnActionPerformed(evt);
            }
        });
        getContentPane().add(equalBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, 130, 40));

        unPowBtn.setText("√ x");
        unPowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unPowBtnActionPerformed(evt);
            }
        });
        getContentPane().add(unPowBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 60, -1));

        sevenBtn.setText("7");
        sevenBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenBtnActionPerformed(evt);
            }
        });
        getContentPane().add(sevenBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 60, 40));

        eightBtn.setText("8");
        eightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightBtnActionPerformed(evt);
            }
        });
        getContentPane().add(eightBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 60, 40));

        nineBtn.setText("9");
        nineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineBtnActionPerformed(evt);
            }
        });
        getContentPane().add(nineBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 60, 40));

        fourBtn.setText("4");
        fourBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourBtnActionPerformed(evt);
            }
        });
        getContentPane().add(fourBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 60, 40));

        fiveBtn.setText("5");
        fiveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveBtnActionPerformed(evt);
            }
        });
        getContentPane().add(fiveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 290, 60, 40));

        sixBtn.setText("6");
        sixBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixBtnActionPerformed(evt);
            }
        });
        getContentPane().add(sixBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 60, 40));

        threeBtn.setText("3");
        threeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeBtnActionPerformed(evt);
            }
        });
        getContentPane().add(threeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 60, 40));

        twoBtn.setText("2");
        twoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoBtnActionPerformed(evt);
            }
        });
        getContentPane().add(twoBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 60, 40));

        oneBtn.setText("1");
        oneBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneBtnActionPerformed(evt);
            }
        });
        getContentPane().add(oneBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 60, 40));

        pointBtn.setText(".");
        pointBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointBtnActionPerformed(evt);
            }
        });
        getContentPane().add(pointBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 60, 40));

        multiBtn.setText("X");
        multiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiBtnActionPerformed(evt);
            }
        });
        getContentPane().add(multiBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 60, 40));

        divBtn.setText("/");
        divBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divBtnActionPerformed(evt);
            }
        });
        getContentPane().add(divBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 60, 40));

        subBtn.setText("-");
        subBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subBtnActionPerformed(evt);
            }
        });
        getContentPane().add(subBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 60, 40));

        addiBtn.setText("+");
        addiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addiBtnActionPerformed(evt);
            }
        });
        getContentPane().add(addiBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 60, 40));

        powBtn.setText("x^y");
        powBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                powBtnActionPerformed(evt);
            }
        });
        getContentPane().add(powBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 60, -1));

        acBtn.setText("AC");
        acBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acBtnActionPerformed(evt);
            }
        });
        getContentPane().add(acBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 60, -1));

        zeroBtn.setText("0");
        zeroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroBtnActionPerformed(evt);
            }
        });
        getContentPane().add(zeroBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 130, 40));

        delBtn.setText("DEL");
        delBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delBtnActionPerformed(evt);
            }
        });
        getContentPane().add(delBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 60, -1));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void calcTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_calcTxtActionPerformed

    private void equalBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalBtnActionPerformed
        String s = calcTxt.getText();
        
        if(flag1==1){
            b=Double.parseDouble(s);
            result=a+b;
        }
        else if(flag1==2){
            b=Double.parseDouble(s);
            result=a-b;
        }
        else if(flag1==3){
            b=Double.parseDouble(s);
            result=a*b;
        }
        else if(flag1==4){
            b=Double.parseDouble(s);
            if(b==0) {
                JOptionPane.showMessageDialog(null,"Invalid input");
            }
            else{
                result=a/b;
            }
            
        }
        else if(flag1==5)result=Math.sin(Math.toRadians(a));
        else if(flag1==6)result=Math.cos(Math.toRadians(a));
        else if(flag1==7){
            if(a==90){
                JOptionPane.showMessageDialog(null,"Invalid input");
            }
            else{
                result=Math.tan(Math.toRadians(a));
            }
        }
        else if(flag1==8){
            b=Double.parseDouble(s);
            result=Math.pow(a, b);
        }
        else if(flag1==9){
            result=Math.sqrt(a);
        }
        
        if(result!=Math.ceil(result)) calcTxt.setText(result+"");
        else{
            calcTxt.setText(Math.round(result)+"");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_equalBtnActionPerformed

    private void oneBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneBtnActionPerformed
        String s = calcTxt.getText();
        calcTxt.setText(s+'1');// TODO add your handling code here:
    }//GEN-LAST:event_oneBtnActionPerformed

    private void twoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoBtnActionPerformed
        String s = calcTxt.getText();
        calcTxt.setText(s+'2');// TODO add your handling code here:
    }//GEN-LAST:event_twoBtnActionPerformed

    private void threeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeBtnActionPerformed
        String s = calcTxt.getText();
        calcTxt.setText(s+'3');// TODO add your handling code here:
    }//GEN-LAST:event_threeBtnActionPerformed

    private void fourBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourBtnActionPerformed
        String s = calcTxt.getText();
        calcTxt.setText(s+'4');// TODO add your handling code here:
    }//GEN-LAST:event_fourBtnActionPerformed

    private void fiveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveBtnActionPerformed
        String s = calcTxt.getText();
        calcTxt.setText(s+'5');// TODO add your handling code here:
    }//GEN-LAST:event_fiveBtnActionPerformed

    private void sixBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixBtnActionPerformed
        String s = calcTxt.getText();
        calcTxt.setText(s+'6');// TODO add your handling code here:
    }//GEN-LAST:event_sixBtnActionPerformed

    private void sevenBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenBtnActionPerformed
        String s = calcTxt.getText();
        calcTxt.setText(s+'7');// TODO add your handling code here:
    }//GEN-LAST:event_sevenBtnActionPerformed

    private void eightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightBtnActionPerformed
        String s = calcTxt.getText();
        calcTxt.setText(s+'8');// TODO add your handling code here:
    }//GEN-LAST:event_eightBtnActionPerformed

    private void nineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineBtnActionPerformed
        String s = calcTxt.getText();
        calcTxt.setText(s+'9');// TODO add your handling code here:
    }//GEN-LAST:event_nineBtnActionPerformed

    private void zeroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroBtnActionPerformed
        String s = calcTxt.getText();
        calcTxt.setText(s+'0');// TODO add your handling code here:
    }//GEN-LAST:event_zeroBtnActionPerformed

    private void pointBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointBtnActionPerformed
        String s = calcTxt.getText();
        calcTxt.setText(s+'.');// TODO add your handling code here:
    }//GEN-LAST:event_pointBtnActionPerformed

    private void addiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addiBtnActionPerformed
        
        String s = calcTxt.getText();
        a=Double.parseDouble(s);
        calcTxt.setText("");
        flag1=1;
        // TODO add your handling code here:
    }//GEN-LAST:event_addiBtnActionPerformed

    private void subBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subBtnActionPerformed
        String s = calcTxt.getText();
        a=Double.parseDouble(s);
        calcTxt.setText("");
        flag1=2;// TODO add your handling code here:
    }//GEN-LAST:event_subBtnActionPerformed

    private void divBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divBtnActionPerformed
        String s = calcTxt.getText();
        a=Double.parseDouble(s);
        calcTxt.setText("");
        flag1=4;// TODO add your handling code here:
    }//GEN-LAST:event_divBtnActionPerformed

    private void multiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiBtnActionPerformed
        String s = calcTxt.getText();
        a=Double.parseDouble(s);
        calcTxt.setText("");
        flag1=3;// TODO add your handling code here:
    }//GEN-LAST:event_multiBtnActionPerformed

    private void sinBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinBtnActionPerformed
        String s = calcTxt.getText();
        if(s.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null,"Enter Input First");
        }
        else{
            a=Double.parseDouble(s);
            calcTxt.setText("sin("+a+")");
            flag1=5;
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_sinBtnActionPerformed

    private void acBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acBtnActionPerformed
        calcTxt.setText("");
    }//GEN-LAST:event_acBtnActionPerformed

    private void cosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosBtnActionPerformed
        String s = calcTxt.getText();
        if(s.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null,"Enter Input First");
        }
        else{
        a=Double.parseDouble(s);
        calcTxt.setText("cos("+a+")");
        flag1=6;
        }// TODO add your handling code here:
    }//GEN-LAST:event_cosBtnActionPerformed

    private void tanBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanBtnActionPerformed
        String s = calcTxt.getText();
        if(s.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null,"Enter Input First");
        }
        else{
        a=Double.parseDouble(s);
        calcTxt.setText("tan("+a+")");
        flag1=7;
        }// TODO add your handling code here:
    }//GEN-LAST:event_tanBtnActionPerformed

    private void powBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_powBtnActionPerformed
        String s = calcTxt.getText();
        if(s.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null,"Enter Input First");
        }
        else{
        a=Double.parseDouble(s);
        calcTxt.setText("");
        flag1=8;// TODO add your handling code here:
        }
    }//GEN-LAST:event_powBtnActionPerformed

    private void unPowBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unPowBtnActionPerformed
        String s = calcTxt.getText();
        if(s.equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null,"Enter Input First");
        }
        else{
        a=Double.parseDouble(s);
        calcTxt.setText("√"+a);
        flag1=9;
        }// TODO add your handling code here:
    }//GEN-LAST:event_unPowBtnActionPerformed

    private void delBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delBtnActionPerformed
        String s = calcTxt.getText();
        StringBuilder str = new StringBuilder(s);
        str.deleteCharAt(s.length()-1);
        calcTxt.setText(str.toString());// TODO add your handling code here:
    }//GEN-LAST:event_delBtnActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acBtn;
    private javax.swing.JButton addiBtn;
    private javax.swing.JTextField calcTxt;
    private javax.swing.JButton cosBtn;
    private javax.swing.JButton delBtn;
    private javax.swing.JButton divBtn;
    private javax.swing.JButton eightBtn;
    private javax.swing.JButton equalBtn;
    private javax.swing.JButton fiveBtn;
    private javax.swing.JButton fourBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton multiBtn;
    private javax.swing.JButton nineBtn;
    private javax.swing.JButton oneBtn;
    private javax.swing.JButton pointBtn;
    private javax.swing.JButton powBtn;
    private javax.swing.JButton sevenBtn;
    private javax.swing.JButton sinBtn;
    private javax.swing.JButton sixBtn;
    private javax.swing.JButton subBtn;
    private javax.swing.JButton tanBtn;
    private javax.swing.JButton threeBtn;
    private javax.swing.JButton twoBtn;
    private javax.swing.JButton unPowBtn;
    private javax.swing.JButton zeroBtn;
    // End of variables declaration//GEN-END:variables
}
