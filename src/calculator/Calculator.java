package calculator;

import java.awt.*;

public class Calculator extends Frame {
	public Calculator() {
		
	this.setLayout(new GridLayout(5,1));
	FlowLayout menulay = new FlowLayout(FlowLayout.LEFT);
	Panel panel = new Panel();
	Button btn1 = new Button("����(V)");
	Button btn2 = new Button("����(E)");
	Button btn3 = new Button("����(H)");
	Button btn4 = new Button("MC");
	Button btn5 = new Button("MR");
	Button btn6 = new Button("MS");
	Button btn7 = new Button("M+");
	Button btn8 = new Button("M-");
	Button btn9 = new Button("��");
	Button btn10 = new Button("CE");
	Button btn11 = new Button("C");
	Button btn12 = new Button("��");
	Button btn13 = new Button("��");
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
	Button btn31 = new Button("����");
	Container menu = new Container();
	TextField text = new TextField("0");
	Container but1 = new Container();
	Container but2 = new Container();
	Container but3 = new Container();
	Container but4 = new Container();

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
	but4.add(panel);
	but3.add(but4);
	but3.add(btn31);

	this.add(menu);
	this.add(text);
	this.add(but1);
	this.add(but2);
	this.add(but3);

	this.setBackground(Color.LIGHT_GRAY);
	setVisible(true);
	setSize(300,500);
	setTitle("����");
	
	}
}