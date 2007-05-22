package rekenmasjien;
/*
 * $Id$
 *
 * $LastChangedDate$
 * $Rev$
 * $Author$
 *
 * */
public class CalculatorModelFactory {
	private CalculatorModelFactory() {
	}

	public static CalculatorModelInterface createCalculatorModel(CalculatorModelType type) {
		CalculatorModelInterface calculatorModel=null;

		if (type == CalculatorModelType.OPERATOR_MODEL)
			//Todo: Rename CalculatorModel to CalculatorModelOperator
			calculatorModel = new CalculatorModelOperator();
		else if (type == CalculatorModelType.RPN_MODEL)
			calculatorModel = new CalculatorModelRPN();
//		else
//			throw new RuntimeException("Ongeldige type rekenmachine: " + type);

		return calculatorModel;
	}

	public static void main(String[] args) {
		createCalculatorModel(CalculatorModelType.OPERATOR_MODEL);
	}
}

