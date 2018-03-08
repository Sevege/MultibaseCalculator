import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.*;

import javax.swing.*;
import javax.swing.event.*;

/**
 * Represent a panel with calculator functionality
 * @author yingdong
 */
public class MultibaseCalculatorPanel extends JPanel{
	private MultibaseCalculatorState state;
	JSlider slider;
	JLabel label;
	JTextField screen;
	ArrayList <JButton> buttons;
	String[] buttonName= {"0","1","2","3","4",
			"5","6","7","8",
			"9","A","B","C","D","E","F","+","-","*","/","clear","="};
	JButton save;
	/**
	 * Construct a panel with a calculator layout
	 * 
	 */
	MultibaseCalculatorPanel(){
		this.setLayout(new FlowLayout());
		
		label = new JLabel("16");
		slider = new JSlider(2,16,16);//from range 2 to 16, initial value 16
		slider.addChangeListener(new ChangeSlider());
		
		screen = new JTextField("0",20);
		screen.setHorizontalAlignment(JTextField.RIGHT);
		
		buttons = new ArrayList<JButton>();
		//add buttons to arrayList
		for(int i=0; i<buttonName.length;i++){
			JButton button = new JButton(buttonName[i]);
			buttons.add(button);
		}
		
		buttons.get(0).addActionListener(new Zero());
		buttons.get(1).addActionListener(new One());
		buttons.get(2).addActionListener(new Two());
		buttons.get(3).addActionListener(new Three());
		buttons.get(4).addActionListener(new Four());
		buttons.get(5).addActionListener(new Five());
		buttons.get(6).addActionListener(new Six());
		buttons.get(7).addActionListener(new Seven());
		buttons.get(8).addActionListener(new Eight());
		buttons.get(9).addActionListener(new Nine());
		buttons.get(10).addActionListener(new A());
		buttons.get(11).addActionListener(new B());
		buttons.get(12).addActionListener(new C());
		buttons.get(13).addActionListener(new D());
		buttons.get(14).addActionListener(new E());
		buttons.get(15).addActionListener(new F());
		buttons.get(16).addActionListener(new Add());
		buttons.get(17).addActionListener(new Minus());
		buttons.get(18).addActionListener(new Time());
		buttons.get(19).addActionListener(new Divide());
		buttons.get(20).addActionListener(new Clear());
		buttons.get(21).addActionListener(new Equal());
		
		add(label);
		add(slider);
		add(screen);
		//add buttons to this panel
		for(int i=0; i<buttonName.length;i++){
			add((JButton)buttons.get(i));
		}
		save = new JButton("Save");
		//save history of calculation
		save.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				  try {
					FileWriter writer = new FileWriter("history.txt");
					writer.write(state.getHistory());
					writer.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
				  
			}
			
	});	
		add(save);
		state = new MultibaseCalculatorState();
	}

	public class ChangeSlider implements ChangeListener{
		public void stateChanged(ChangeEvent e) {
			//get the current value of slider
			label.setText(String.valueOf(slider.getValue()));
			//enable and disable buttons based on the value of slider
			for(int i=0;i<slider.getValue();i++){
					buttons.get(i).setEnabled(true);
			}
			for(int j=slider.getMaximum()-1;j>slider.getValue()-1;j--){
				buttons.get(j).setEnabled(false);
			}
			//once the base is changed, return setting to default
			state.clear();
			screen.setText("0");
		
		
	}
	}
	/**
	 *Action listener for 0 button
	 *
	 */
		public class Zero implements ActionListener{
			public void actionPerformed(ActionEvent e) {
				//if the value of the screen is not 0, add 0 to the value, else set value to 0
				if(!screen.getText().equals("0")){
					state.setInValue("0");
					screen.setText(state.getInValue());
				}else{
					state.setInValue("0");
				}
			
			}
		}
		/**
		 *Action listener for 1 button
		 *
		 */
		public class One implements ActionListener{
			public void actionPerformed(ActionEvent e){
				state.setInValue("1");
				screen.setText(state.getInValue());
			}
		}
		/**
		 *Action listener for 2 button
		 *
		 */
		public class Two implements ActionListener{
			public void actionPerformed(ActionEvent e){
				state.setInValue("2");
				screen.setText(state.getInValue());
			}
		}
		/**
		 *Action listener for 3 button
		 *
		 */
		public class Three implements ActionListener{
			public void actionPerformed(ActionEvent e){
				state.setInValue("3");
				screen.setText(state.getInValue());
			}
		}
		/**
		 *Action listener for 4 button
		 *
		 */
		public class Four implements ActionListener{
			public void actionPerformed(ActionEvent e){
				state.setInValue("4");
				screen.setText(state.getInValue());
			}
		}
		/**
		 *Action listener for 5 button
		 *
		 */
		public class Five implements ActionListener{
			public void actionPerformed(ActionEvent e){
				state.setInValue("5");
				screen.setText(state.getInValue());
			}
		}
		/**
		 *Action listener for 6 button
		 *
		 */
		public class Six implements ActionListener{
			public void actionPerformed(ActionEvent e){
				state.setInValue("6");
				screen.setText(state.getInValue());
			}
		}
		/**
		 *Action listener for 7 button
		 *
		 */
		public class Seven implements ActionListener{
			public void actionPerformed(ActionEvent e){
				state.setInValue("7");
				screen.setText(state.getInValue());
			}
		}
		/**
		 *Action listener for 8 button
		 *
		 */
		public class Eight implements ActionListener{
			public void actionPerformed(ActionEvent e){
				state.setInValue("8");
				screen.setText(state.getInValue());
			}
		}
		/**
		 *Action listener for 9 button
		 *
		 */
		public class Nine implements ActionListener{
			public void actionPerformed(ActionEvent e){
				state.setInValue("9");
				screen.setText(state.getInValue());
			}
		}
		/**
		 *Action listener for A button
		 *
		 */
		public class A implements ActionListener{
			public void actionPerformed(ActionEvent e){
				state.setInValue("A");
				screen.setText(state.getInValue());
			}
		}
		/**
		 *Action listener for B button
		 *
		 */
		public class B implements ActionListener{
			public void actionPerformed(ActionEvent e){
				state.setInValue("B");
				screen.setText(state.getInValue());
			}
		}
		/**
		 *Action listener for C button
		 *
		 */
		public class C implements ActionListener{
			public void actionPerformed(ActionEvent e){
				state.setInValue("C");
				screen.setText(state.getInValue());
			}
		}
		/**
		 *Action listener for D button
		 *
		 */
		public class D implements ActionListener{
			public void actionPerformed(ActionEvent e){
				state.setInValue("D");
				screen.setText(state.getInValue());
			}
		}
		/**
		 *Action listener for E button
		 *
		 */
		public class E implements ActionListener{
			public void actionPerformed(ActionEvent e){
				state.setInValue("E");
				screen.setText(state.getInValue());
			}
		}
		/**
		 *Action listener for F button
		 *
		 */
		public class F implements ActionListener{
			public void actionPerformed(ActionEvent e){
				state.setInValue("F");
				screen.setText(state.getInValue());
			}
		}
		/**
		 *Action listener for clear button
		 *
		 */
		public class Clear implements ActionListener{
			public void actionPerformed(ActionEvent e){
				state.clear();
				screen.setText("0");
				
			}
		}
		/**
		 *Action listener for add button
		 *
		 */
		public class Add implements ActionListener{
			public void actionPerformed(ActionEvent e){
				//if no operand there, set operand, else calculate numbers
				if(state.getOperand().equals("")){
					state.setValue(state.getInValue());
					state.clearInValue();
				}else if(!state.getInValue().equals("")){
					state.setValue(BaseCalculate(state.getValue(),state.getOperand(),state.getInValue()));
				}
				state.setOperand("+");
				
			}
		}
		/**
		 *Action listener for minus buttons
		 *
		 */
		public class Minus implements ActionListener{
			public void actionPerformed(ActionEvent e){
				//if no operand there, set operand, else calculate numbers
				if(state.getOperand().equals("")){
					state.setValue(state.getInValue());
					state.clearInValue();
				}else if(!state.getInValue().equals("")){
					state.setValue(BaseCalculate(state.getValue(),state.getOperand(),state.getInValue()));
				}
				
				state.setOperand("-");
				
			}
		}
		/**
		 *Action listener for time button
		 *
		 */
		public class Time implements ActionListener{
			public void actionPerformed(ActionEvent e){
				//if no operand there, set operand, else calculate numbers
				if(state.getOperand().equals("")){
					state.setValue(state.getInValue());
					state.clearInValue();
				}else if(!state.getInValue().equals("")){
					state.setValue(BaseCalculate(state.getValue(),state.getOperand(),state.getInValue()));
				}
				
				state.setOperand("*");
				
			}
		}
		/**
		 *Action listener for divide button
		 *
		 */
		public class Divide implements ActionListener{
			public void actionPerformed(ActionEvent e){
				//if no operand there, set operand, else calculate numbers
				if(state.getOperand().equals("")){
					state.setValue(state.getInValue());
					state.clearInValue();
				
				}else if(!state.getInValue().equals("")){
					state.setValue(BaseCalculate(state.getValue(),state.getOperand(),state.getInValue()));
				}
				
				state.setOperand("/");

				
			}
		}
		/**
		 *Action listener for equal button
		 *
		 */
		public class Equal implements ActionListener{
			public void actionPerformed(ActionEvent e){
				//try to calculate numbers, but if catch the exception, set operand to its last operand
				try{
				if(state.getValue() !="" && state.getInValue()!=""){
				state.setInValue(BaseCalculate(state.getValue(),state.getOperand(),state.getInValue()));
				}
				}
				catch(Exception ex){
					state.setOperand(state.getOperand());
				}
				
			
			}
		}
		/**
		 * Calculate two numbers based on the operand
		 * @param a number one
		 * @param o operand
		 * @param b number 2
		 * @return String answer
		 */
		public String BaseCalculate(String a, String o,String b){
			
			String ans="";
			//get the base that the calculator is currently at
			int base=slider.getValue();
			//calculate two numbers according to the operand
			if(o.equals("+")){
				ans = (Integer.toString(Integer.parseInt(a,base)+Integer.parseInt(b,base),base)).toUpperCase();

				
			}
			else if(o.equals("-")){
				ans = (Integer.toString(Integer.parseInt(a,base)-Integer.parseInt(b,base),base)).toUpperCase();
				screen.setText(String.valueOf(ans));
							
	
			}
			else if(o.equals("*")){
				ans = (Integer.toString(Integer.parseInt(a,base)*Integer.parseInt(b,base),base)).toUpperCase();
				screen.setText(String.valueOf(ans));
				
			}
			else if(o.equals("/")){
				ans = (Integer.toString(Integer.parseInt(a,base)/Integer.parseInt(b,base),base)).toUpperCase();
			}
			screen.setText(String.valueOf(ans));
			//store history
			state.setHistory(a + o + b +"="+ ans);
			state.clear();
			return ans;
		
}
	
}
