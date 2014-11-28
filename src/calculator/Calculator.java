package calculator;

import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener {
	int c=0;
	long cal=0;
	double num1,num2,value;
	String str1,str2;
	int or= 0;
	Panel panel = new Panel();
	Button btn1 = new Button("보기(V)");
	Button btn2 = new Button("편집(E)");
	Button btn3 = new Button("도움말(H)");
	Button btn4 = new Button("MC");
	Button btn5 = new Button("MR");
	Button btn6 = new Button("MS");
	Button btn7 = new Button("M+");
	Button btn8 = new Button("M-");
	Button btn9 = new Button("←");
	Button btn10 = new Button("CE");
	Button btn11 = new Button("C");
	Button btn12 = new Button("±");
	Button btn13 = new Button("√");
	Button btn14 = new Button("7");
	Button btn15 = new Button("8");
	Button btn16 = new Button("9");
	Button btn17 = new Button("/");
	Button btn18 = new Button("%");
	Button btn19 = new Button("4");
	Button btn20 = new Button("5");
	Button btn21 = new Button("6");
	Button btn22 = new Button("*");
	Button btn23 = new Button("1/x");
	Button btn34 = new Button("1");
	Button btn24 = new Button("2");
	Button btn25 = new Button("3");
	Button btn26 = new Button("-");
	Button btn27 = new Button("=");
	Button btn28 = new Button("0");
	Button btn29 = new Button(".");
	Button btn30 = new Button("+");
	Button btn31 = new Button("종료");
	Container menu = new Container();
	TextField text = new TextField("");
	Container but1 = new Container();
	Container but2 = new Container();
	Container but3 = new Container();
	Container but4 = new Container();


	public Calculator() {
		
	this.setLayout(new GridLayout(5,1));
	FlowLayout menulay = new FlowLayout(FlowLayout.LEFT);
	
	menu.add(btn1);
	menu.add(btn2);
	menu.add(btn3);
	menu.setLayout(menulay);
	but1.setLayout(new GridLayout(2,5));
	but1.add(btn4);
	but1.add(btn5);
	but1.add(btn6);
	but1.add(btn7);
	but1.add(btn8);
	but1.add(btn9);
	but1.add(btn10);
	but1.add(btn11);
	but1.add(btn12);
	but1.add(btn13);
	but2.setLayout(new GridLayout(2,5));
	but2.add(btn14);
	but2.add(btn15);
	but2.add(btn16);
	but2.add(btn17);
	but2.add(btn18);
	but2.add(btn19);
	but2.add(btn20);
	but2.add(btn21);
	but2.add(btn22);
	but2.add(btn23);
	but3.setLayout(new GridLayout(2,5));
	but3.add(btn34);
	but3.add(btn24);
	but3.add(btn25);
	but3.add(btn26);
	but3.add(btn30);
	but3.add(btn29);
	but3.add(btn28);
	but3.add(btn27);
	but3.add(but4);
	but3.add(panel);
	but3.add(panel);
	
	
	this.add(menu);
	this.add(text);
	this.add(but1);
	this.add(but2);
	this.add(but3);

	this.setBackground(Color.LIGHT_GRAY);
	setVisible(true);
	setSize(300,500);
	setTitle("계산기");
	
	btn30.addActionListener(new MyListener());
	btn26.addActionListener(new MyListener());
	btn27.addActionListener(new MyListener());
	btn22.addActionListener(new MyListener());
	btn17.addActionListener(new MyListener());
	btn34.addActionListener(new number());
	btn24.addActionListener(new number());
	btn25.addActionListener(new number());
	btn19.addActionListener(new number());
	btn20.addActionListener(new number());
	btn21.addActionListener(new number());
	btn14.addActionListener(new number());
	btn15.addActionListener(new number());
	btn16.addActionListener(new number());
	btn28.addActionListener(new number());
	btn10.addActionListener(new MyListener());

	
	addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	});
}

	class MyListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn30){
			c = 1;
			str1 = text.getText();
			num1 = Double.parseDouble(str1);
			text.setText("");
			or++;
		}
		else if (e.getSource() == btn26){
			c = 2;
			str1 = text.getText();
			num1 = Double.parseDouble(str1);
			text.setText("");
			or++;
			}
		else if (e.getSource() == btn22){
			c = 3;
			str1 = text.getText();
			num1 = Double.parseDouble(str1);
			text.setText("");
			or++;
		}
		else if (e.getSource() == btn17){
			c = 4;
			str1 = text.getText();
			num1 = Double.parseDouble(str1);
			text.setText("");
			or++;
		}
		else if(e.getSource() == btn10) {
			text.setText("");
		}
		else if(e.getSource() == btn31) {
			
		}
		else if (e.getSource() == btn27) {
			if(c == 1) {
				str2 = text.getText();
				num2 = Double.parseDouble(str2);
				value = num1 + num2;
				text.setText(num1 + " + " + num2 + " = " + value);
				or=2;
			}
			if(c == 2) {
				str2 = text.getText();
				num2 = Double.parseDouble(str2);
				value = num1 - num2;
				text.setText(num1 + " - " + num2 + " = " + value);
				or=2;
			}
			if(c == 3) {
				str2 = text.getText();
				num2 = Double.parseDouble(str2);
				value = num1 * num2;
				text.setText(num1 + " * " + num2 + " = " + value);
				or=2;
			}
			if(c == 4) {
				str2 = text.getText();
				num2 = Double.parseDouble(str2);
				value = num1 / num2;
				text.setText(num1 + " / " + num2 + " = " + value);
				or=2;
			}
		}
		
	}
}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	class number implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(or == 0) {
			if (e.getSource() == btn34) {
				str1="1";
				text.setText(text.getText() + str1);
			}
			else if(e.getSource() == btn24) {
				str1 ="2";
				text.setText(text.getText() + str1);
			}
			else if(e.getSource() == btn25) {
				str1 ="3";
				text.setText(text.getText() + str1);
			}
			else if(e.getSource() == btn19) {
				str1 ="4";
				text.setText(text.getText() + str1);
			}
			else if(e.getSource() == btn20) {
				str1 ="5";
				text.setText(text.getText() + str1);
			}
			else if(e.getSource() == btn21) {
				str1 ="6";
				text.setText(text.getText() + str1);
			}
			else if(e.getSource() == btn14) {
				str1 ="7";
				text.setText(text.getText() + str1);
			}
			else if(e.getSource() == btn15) {
				str1 ="8";
				text.setText(text.getText() + str1);
			}
			else if(e.getSource() == btn16) {
				str1 ="9";
				text.setText(text.getText() + str1);
			}
			else if(e.getSource() == btn28) {
				str1 ="0";
				text.setText(text.getText() + str1);
			}
		}
			else if(or==1){
				if (e.getSource() == btn34) {
					str2="1";
					text.setText(text.getText() + str2);
				}
				else if(e.getSource() == btn24) {
					str2 ="2";
					text.setText(text.getText() + str2);
				}
				else if(e.getSource() == btn25) {
					str2 ="3";
					text.setText(text.getText() + str2);
				}
				else if(e.getSource() == btn19) {
					str2 ="4";
					text.setText(text.getText() + str2);
				}
				else if(e.getSource() == btn20) {
					str2 ="5";
					text.setText(text.getText() + str2);
				}
				else if(e.getSource() == btn21) {
					str2 ="6";
					text.setText(text.getText() + str2);
				}
				else if(e.getSource() == btn14) {
					str2 ="7";
					text.setText(text.getText() + str2);
				}
				else if(e.getSource() == btn15) {
					str2 ="8";
					text.setText(text.getText() + str2);
				}
				else if(e.getSource() == btn16) {
					str2 ="9";
					text.setText(text.getText() + str2);
				}
				else if(e.getSource() == btn28) {
					str2 ="0";
					text.setText(text.getText() + str2);
				}
			}
			else if(or==2){
				text.setText("");
				or=0;
			}
		
		}

	}
}