package rekenmasjien;
/*
* $Id: CalculatorMain.java,v 1.3 2007/03/31 11:05:52 wimpunk Exp $
*
* $Header: /cvs/stdx/rekenmachine/src/rekenmasjien/CalculatorMain.java,v 1.3 2007/03/31 11:05:52 wimpunk Exp $
* $LastChangedDate: 2007-03-13 23:25:45 +0100 (Tue, 13 Mar 2007) $
* $Revision: 1.3 $
* $Author: wimpunk $
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
