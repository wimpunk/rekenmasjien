package rekenmasjien;

import java.util.LinkedList;
/*
* $Id: CalculatorModel.java,v 1.3 2007/03/31 11:05:52 wimpunk Exp $
*
* $Header: /cvs/stdx/rekenmachine/src/rekenmasjien/CalculatorModel.java,v 1.3 2007/03/31 11:05:52 wimpunk Exp $
* $LastChangedDate: 2007-03-13 23:25:45 +0100 (Tue, 13 Mar 2007) $
* $Revision: 1.3 $
* $Author: wimpunk $
* 
* $Log: CalculatorModel.java,v $
* Revision 1.3  2007/03/31 11:05:52  wimpunk
* We blijven spelen met cvs
*
*
* */

public class CalculatorModelOperator implements CalculatorModelInterface {

	private LinkedList<Integer> stack;

	private Integer getal = 0;

	private Boolean action = false; // was de laatste handeling een actie.
									// Indien het zo is dan staat getal enkel
									// ter info op het scherm. Indien niet, dan
									// is getal editeerbaar.

	public CalculatorModelOperator() {
		stack = new LinkedList<Integer>();
	}

	public Integer pullGetal() {
		Integer i = stack.getLast();
		stack.removeLast();

		if ((i) != null)
			return i;
		else
			return 0;
	}

	public Integer pushGetal(Integer i) {
		stack.offer(i);

		return i;
	}

	public Integer pushGetal() {
		pushGetal(getal);

		return getal;
	}

	public void setC(char c) {

		switch (c) {
		case '0':
		case '1':
		case '2':
		case '3':
		case '4':
		case '5':
		case '6':
		case '7':
		case '8':
		case '9':
			int val = c - '0';
			if (action)
				getal = val;
			else
				getal = getal * 10 + val;
			action = false;
			break;
		case 'C':
			getal = 0;
			action = true;
			break;
		case '+':
			berekenPlus();
			break;
		case '-':
			berekenMin();
			pushGetal();
			action = true;
			break;
		case '*':
			berekenMaal();
			pushGetal();
			action = true;
			break;
		case '/':
			berekenGedeeld();
			pushGetal();
			action = true;
			break;
		case '=':
			pushGetal();
			action = true;
			break;
		}
		toonStatus();
	}

	/**
	 * toon de inhoud van mijn rekenmachine, voor debugging
	 */
	private void toonStatus() {
		System.out.println("Getal = " + getal + " stack = " + stack);
	}

	private void berekenPlus() {
		getal += pullGetal();
		pushGetal();
		action = true;

	}

	private void berekenMin() {

		getal = pullGetal() - getal;
		pushGetal();
		action = true;

	}

	private void berekenMaal() {

		getal *= pullGetal();
		pushGetal();
		action = true;

	}

	private void berekenGedeeld() {

		getal = pullGetal() / getal;
		pushGetal();
		action = true;

	}

	public static void main(String[] args) {
		CalculatorModelOperator calculatorModel = new CalculatorModelOperator();
		calculatorModel.pushGetal(123);
		calculatorModel.pushGetal(234);
		calculatorModel.pushGetal(345);
		calculatorModel.pushGetal(0);

		calculatorModel.setC('1');
		calculatorModel.setC('=');
		calculatorModel.setC('1');
		calculatorModel.setC('0');
		calculatorModel.setC('+');
		System.out.println(calculatorModel.getGetal());

		calculatorModel.setC('1');
		calculatorModel.setC('-');
		System.out.println(calculatorModel.getGetal());

		calculatorModel.setC('2');
		calculatorModel.setC('*');
		System.out.println(calculatorModel.getGetal());

		calculatorModel.setC('4');
		calculatorModel.setC('/');
		System.out.println(calculatorModel.getGetal());

	}

	/**
	 * @return the getal
	 */
	public Integer getGetal() {
		return getal;
	}

	/**
	 * @param getal
	 *            the getal to set
	 */
	public void setGetal(Integer getal) {
		this.getal = getal;
	}
}
