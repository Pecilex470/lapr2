package lapr.project.model;

import java.io.Serializable;

/**
 * @author Nuno Bettencourt <nmb@isep.ipp.pt> on 24/05/16.
 */
public class CalculatorExample implements Serializable{

    
     static final long serialVersionUID = 3;
	/**
	 * Calculate the sum of two int numbers.
	 *
	 * @param firstOperand First number to be added
	 * @param secondOperand Second number to be added
	 * @return Return the sum of both operands.
	 */
	public int sum(int firstOperand, int secondOperand)
	{
		return firstOperand + secondOperand;
	}
}
