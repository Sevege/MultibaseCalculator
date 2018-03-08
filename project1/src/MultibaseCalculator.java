import javax.swing.*;
/**
 *This class contains main method and create GUI window
 * @author yingdong
 */
public class MultibaseCalculator{
	/**
	 * Main method that invokes createGUI method
	 * @param args string array argument
	 */
	public static void main(String[]args){
		createGUI();
	}
	/**
	 * Create GUI window for calculator
	 */
	public static void createGUI(){
		JFrame frame = new JFrame("Multibase Calculator");
		frame.add(new MultibaseCalculatorPanel());
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(325,325);
		frame.setVisible(true);
	}
}