package rekenmasjien;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/*
* $Id: CalculatorView.java,v 1.4 2007/03/31 11:05:52 wimpunk Exp $
*
* $Header: /cvs/stdx/rekenmachine/src/rekenmasjien/CalculatorView.java,v 1.4 2007/03/31 11:05:52 wimpunk Exp $
* $LastChangedDate: 2007-03-13 23:25:45 +0100 (Tue, 13 Mar 2007) $
* $Revision: 1.4 $
* $Author: wimpunk $
* 
* $Log: CalculatorView.java,v $
* Revision 1.4  2007/03/31 11:05:52  wimpunk
* We blijven spelen met cvs
*
*
* */

public class CalculatorView extends JFrame {
    private final class ButtonListener implements java.awt.event.ActionListener {
        public void actionPerformed(java.awt.event.ActionEvent e) {
            System.out.println("action: " + e.getActionCommand());
            String actie = e.getActionCommand();
            char[] c = actie.toCharArray();
            if (c.length > 0)
                calculatorControler.action(c[0]);
        }
    }

    private static final long serialVersionUID = 1L;
    private JPanel jContentPane = null;
    private JButton button1 = null;
    private JButton button2 = null;
    private JButton button3 = null;
    private JButton button4 = null;
    private JButton button5 = null;
    private JButton button6 = null;
    private JButton button7 = null;
    private JButton button8 = null;
    private JButton button9 = null;
    private JButton button0 = null;
    private JButton buttonPlus = null;
    private JButton buttonIsGelijkAan = null;
    private JTextArea txtGetal = null;
    private ButtonListener b = new ButtonListener();
    private CalculatorControler calculatorControler;
    private JButton buttonMaal = null;
    private JButton buttonMin = null;
    private JButton buttonClear = null;
    /**
     * This is the default constructor
     */
    public CalculatorView(CalculatorControler calculatorControler) {
        this.calculatorControler = calculatorControler;
        initialize();
    }

    /**
     * This method initializes this
     * 
     * @return void
     */
    private void initialize() {
        this.setSize(232, 226);
        this.setContentPane(getJContentPane());
        this.setTitle("JFrame");
    }

    /**
     * This method initializes jContentPane
     * 
     * @return javax.swing.JPanel
     */
    private JPanel getJContentPane() {
        if (jContentPane == null) {
            GridBagConstraints gridBagConstraints31 = new GridBagConstraints();
            gridBagConstraints31.gridx = 2;
            gridBagConstraints31.gridy = 6;
            GridBagConstraints gridBagConstraints21 = new GridBagConstraints();
            gridBagConstraints21.gridx = 1;
            gridBagConstraints21.gridy = 6;
            GridBagConstraints gridBagConstraints13 = new GridBagConstraints();
            gridBagConstraints13.gridx = 0;
            gridBagConstraints13.gridy = 6;
            GridBagConstraints gridBagConstraints12 = new GridBagConstraints();
            gridBagConstraints12.fill = GridBagConstraints.BOTH;
            gridBagConstraints12.gridy = 0;
            gridBagConstraints12.weightx = 0.0;
            gridBagConstraints12.weighty = 0.0;
            gridBagConstraints12.gridwidth = 3;
            gridBagConstraints12.gridx = 0;
            GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
            gridBagConstraints11.gridx = 2;
            gridBagConstraints11.ipadx = 0;
            gridBagConstraints11.ipady = 0;
            gridBagConstraints11.insets = new Insets(4, 4, 4, 4);
            gridBagConstraints11.gridy = 5;
            GridBagConstraints gridBagConstraints10 = new GridBagConstraints();
            gridBagConstraints10.gridx = 1;
            gridBagConstraints10.ipadx = 0;
            gridBagConstraints10.ipady = 0;
            gridBagConstraints10.insets = new Insets(4, 4, 4, 4);
            gridBagConstraints10.gridy = 5;
            GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
            gridBagConstraints9.gridx = 0;
            gridBagConstraints9.ipadx = 0;
            gridBagConstraints9.ipady = 0;
            gridBagConstraints9.insets = new Insets(4, 4, 4, 4);
            gridBagConstraints9.gridy = 5;
            GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
            gridBagConstraints8.gridx = 2;
            gridBagConstraints8.ipadx = 0;
            gridBagConstraints8.ipady = 0;
            gridBagConstraints8.insets = new Insets(4, 4, 4, 4);
            gridBagConstraints8.gridy = 4;
            GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
            gridBagConstraints7.gridx = 1;
            gridBagConstraints7.ipadx = 0;
            gridBagConstraints7.ipady = 0;
            gridBagConstraints7.insets = new Insets(4, 4, 4, 4);
            gridBagConstraints7.gridy = 4;
            GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
            gridBagConstraints6.gridx = 0;
            gridBagConstraints6.ipadx = 0;
            gridBagConstraints6.ipady = 0;
            gridBagConstraints6.insets = new Insets(4, 4, 4, 4);
            gridBagConstraints6.gridy = 4;
            GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
            gridBagConstraints5.gridx = 2;
            gridBagConstraints5.ipadx = 0;
            gridBagConstraints5.ipady = 0;
            gridBagConstraints5.insets = new Insets(4, 4, 4, 4);
            gridBagConstraints5.gridy = 3;
            GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
            gridBagConstraints4.gridx = 1;
            gridBagConstraints4.ipadx = 0;
            gridBagConstraints4.ipady = 0;
            gridBagConstraints4.insets = new Insets(4, 4, 4, 4);
            gridBagConstraints4.gridy = 3;
            GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
            gridBagConstraints3.gridx = 0;
            gridBagConstraints3.ipadx = 0;
            gridBagConstraints3.ipady = 0;
            gridBagConstraints3.insets = new Insets(4, 4, 4, 4);
            gridBagConstraints3.gridy = 3;
            GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
            gridBagConstraints2.gridx = 2;
            gridBagConstraints2.ipadx = 0;
            gridBagConstraints2.ipady = 0;
            gridBagConstraints2.insets = new Insets(4, 4, 4, 4);
            gridBagConstraints2.gridy = 1;
            GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
            gridBagConstraints1.gridx = 1;
            gridBagConstraints1.ipadx = 0;
            gridBagConstraints1.ipady = 0;
            gridBagConstraints1.insets = new Insets(4, 4, 4, 4);
            gridBagConstraints1.gridy = 1;
            GridBagConstraints gridBagConstraints = new GridBagConstraints();
            gridBagConstraints.gridx = 0;
            gridBagConstraints.ipadx = 0;
            gridBagConstraints.ipady = 0;
            gridBagConstraints.insets = new Insets(4, 4, 4, 4);
            gridBagConstraints.gridy = 1;
            jContentPane = new JPanel();
            jContentPane.setLayout(new GridBagLayout());
            jContentPane.add(getButton1(), gridBagConstraints);
            jContentPane.add(getButton2(), gridBagConstraints1);
            jContentPane.add(getButton3(), gridBagConstraints2);
            jContentPane.add(getButton4(), gridBagConstraints3);
            jContentPane.add(getJButton(), gridBagConstraints4);
            jContentPane.add(getButton6(), gridBagConstraints5);
            jContentPane.add(getButton7(), gridBagConstraints6);
            jContentPane.add(getButton8(), gridBagConstraints7);
            jContentPane.add(getButton9(), gridBagConstraints8);
            jContentPane.add(getButton0(), gridBagConstraints9);
            jContentPane.add(getButtonPlus(), gridBagConstraints10);
            jContentPane.add(getButtonIsGelijkAan(), gridBagConstraints11);
            jContentPane.add(getTxtGetal(), gridBagConstraints12);
            jContentPane.add(getButtonMaal(), gridBagConstraints13);
            jContentPane.add(getButtonMin(), gridBagConstraints21);
            jContentPane.add(getButtonClear(), gridBagConstraints31);
        }
        return jContentPane;
    }

    /**
     * This method initializes button1	
     * 	
     * @return javax.swing.JButton	
     */
    private JButton getButton1() {
        if (button1 == null) {
            button1 = new JButton();
            button1.setText("1");
            button1.addActionListener(b);
        }
        return button1;
    }

    /**
     * This method initializes button2	
     * 	
     * @return javax.swing.JButton	
     */
    private JButton getButton2() {
        if (button2 == null) {
            button2 = new JButton();
            button2.setText("2");
            button2.addActionListener(b);
        }
        return button2;
    }

    /**
     * This method initializes button3	
     * 	
     * @return javax.swing.JButton	
     */
    private JButton getButton3() {
        if (button3 == null) {
            button3 = new JButton();
            button3.setText("3");
            button3.addActionListener(b);
        }
        return button3;
    }

    /**
     * This method initializes button4	
     * 	
     * @return javax.swing.JButton	
     */
    private JButton getButton4() {
        if (button4 == null) {
            button4 = new JButton();
            button4.setText("4");
            button4.addActionListener(b);
        }
        return button4;
    }

    /**
     * This method initializes jButton	
     * 	
     * @return javax.swing.JButton	
     */
    private JButton getJButton() {
        if (button5 == null) {
            button5 = new JButton();
            button5.setText("5");
            button5.addActionListener(b);
        }
        return button5;
    }

    /**
     * This method initializes button6	
     * 	
     * @return javax.swing.JButton	
     */
    private JButton getButton6() {
        if (button6 == null) {
            button6 = new JButton();
            button6.setText("6");
            button6.addActionListener(b);
        }
        return button6;
    }

    /**
     * This method initializes button7	
     * 	
     * @return javax.swing.JButton	
     */
    private JButton getButton7() {
        if (button7 == null) {
            button7 = new JButton();
            button7.setText("7");
            button7.addActionListener(b);
        }
        return button7;
    }

    /**
     * This method initializes button8	
     * 	
     * @return javax.swing.JButton	
     */
    private JButton getButton8() {
        if (button8 == null) {
            button8 = new JButton();
            button8.setText("8");
            button8.addActionListener(b);
        }
        return button8;
    }

    /**
     * This method initializes button9	
     * 	
     * @return javax.swing.JButton	
     */
    private JButton getButton9() {
        if (button9 == null) {
            button9 = new JButton();
            button9.setText("9");
            button9.addActionListener(b);
        }
        return button9;
    }

    /**
     * This method initializes button0	
     * 	
     * @return javax.swing.JButton	
     */
    private JButton getButton0() {
        if (button0 == null) {
            button0 = new JButton();
            button0.setText("0");
            button0.addActionListener(b);
        }
        return button0;
    }

    /**
     * This method initializes buttonPlus	
     * 	
     * @return javax.swing.JButton	
     */
    private JButton getButtonPlus() {
        if (buttonPlus == null) {
            buttonPlus = new JButton();
            buttonPlus.setText("+");
            buttonPlus.addActionListener(b);
        }
        return buttonPlus;
    }

    /**
     * This method initializes buttonIsGelijkAan	
     * 	
     * @return javax.swing.JButton	
     */
    private JButton getButtonIsGelijkAan() {
        if (buttonIsGelijkAan == null) {
            buttonIsGelijkAan = new JButton();
            buttonIsGelijkAan.setText("=");
            buttonIsGelijkAan.addActionListener(b);
        }
        return buttonIsGelijkAan;
    }

    /**
     * This method initializes txtGetal	
     * 	
     * @return javax.swing.JTextArea	
     */
    private JTextArea getTxtGetal() {
        if (txtGetal == null) {
            txtGetal = new JTextArea();
            txtGetal.setText("0");
        }
        return txtGetal;
    }
    
    public void setGetal(String getal) {
        txtGetal.setText(getal);
    }

    /**
     * This method initializes buttonMaal	
     * 	
     * @return javax.swing.JButton	
     */
    private JButton getButtonMaal() {
        if (buttonMaal == null) {
            buttonMaal = new JButton();
            buttonMaal.setText("*");
            buttonMaal.addActionListener(b);
        }
        return buttonMaal;
    }

    /**
     * This method initializes buttonMin	
     * 	
     * @return javax.swing.JButton	
     */
    private JButton getButtonMin() {
        if (buttonMin == null) {
            buttonMin = new JButton();
            buttonMin.setText("-");
            buttonMin.addActionListener(b);
        }
        return buttonMin;
    }

    /**
     * This method initializes buttonClear	
     * 	
     * @return javax.swing.JButton	
     */
    private JButton getButtonClear() {
        if (buttonClear == null) {
            buttonClear = new JButton();
            buttonClear.setText("C");
            buttonClear.addActionListener(b);
        }
        return buttonClear;
    }

}  //  @jve:decl-index=0:visual-constraint="17,21"
