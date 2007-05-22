package rekenmasjien;
/*
* $Id$
*
* $Header: /cvs/stdx/rekenmachine/src/rekenmasjien/CalculatorMain.java,v 1.3 2007/03/31 11:05:52 wimpunk Exp $
* $LastChangedDate$
* $Revision$
* $Author$
* 
* $Log: CalculatorMain.java,v $
* Revision 1.3  2007/03/31 11:05:52  wimpunk
* We blijven spelen met cvs
*
*
* */

public class CalculatorMain {
    public static void main(String[] args) {
    	CalculatorModelType type = CalculatorModelType.RPN_MODEL;

    	@SuppressWarnings("unused")
		CalculatorControler controler = new CalculatorControler(type);
    }
}
