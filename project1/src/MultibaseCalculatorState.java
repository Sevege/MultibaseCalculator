/**
 * This class manages data of calculation
 * @author yingdong
 *
 */
public class MultibaseCalculatorState{
private String inValue;
private String value; 
private String operand;
private String history;

	/**
	 * Create multibaseCalculatorState object with all instance variables set to empty strings
	 */
	public MultibaseCalculatorState(){ 
		value = ""; 
		operand="";
		inValue ="";
		history="";
		}
	/**
	 * Clear all instance variable by setting them to empty strings
	 */
	public void clear(){
		value = ""; 
		operand ="";
		inValue ="";
		}
	/**
	 * Add a string to inValue
	 * @param n string 
	 */
	public void setInValue(String n){
		inValue+=n;
	}
	/**
	 * Return inValue
	 * @return the value of inValue
	 */
	public String getInValue(){
		return inValue;
	}
	/**
	 * Clear inValue by setting it to empty string
	 */
	public void clearInValue(){
		inValue="";
	}
	/**
	 * Set value to parameter
	 * @param ans string
	 */
	public void setValue(String ans){
		value =ans;
	}
	/**
	 * Return the value of Value
	 * @return string
	 */
	public String getValue(){ 
		return value; 
		}
	/**
	 * Set parameter to operand
	 * @param o string (+,-,* or /)
	 */
	public void setOperand(String o){
			operand = o;
	}
	/**
	 * Return value of operand
	 * @return string (+,-,* or /)
	 */
	
	public String getOperand(){
		return operand;
	}
	/**
	 * Store history of calculations
	 * @param n string
	 */
	public void setHistory(String n){
		history += n+"\n";
	}
	/**
	 * Return the value of history
	 * @return string
	 */
	public String getHistory(){
		return history;
	}

}