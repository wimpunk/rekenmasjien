package rekenmasjien;

/*
* $Id$
*
* $Header: /cvs/stdx/rekenmachine/src/rekenmasjien/CalculatorControler.java,v 1.3 2007/05/20 13:16:38 wimpunk Exp $
* $LastChangedDate$
* $Revision$
* $Author$
* 
* $Log: CalculatorControler.java,v $
* Revision 1.3  2007/05/20 13:16:38  wimpunk
* Updated ID
*
*
* */


import javax.swing.JFrame;

public class CalculatorControler {
    private CalculatorView view;
    private CalculatorModelInterface model;

    public CalculatorControler(CalculatorModelType type) {
        view = new CalculatorView(this);
        model = CalculatorModelFactory.createCalculatorModel(type);

        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setVisible(true);
    }

    public void action(char c) {
        System.out.println("Character ontvangen: " + c);
        model.setC(c);
        String getal = model.getGetal().toString();
        view.setGetal(getal);
    }
}
