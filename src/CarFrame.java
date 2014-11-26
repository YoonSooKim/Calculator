import java.awt.*;
import java.awt.event.*;

public class CarFrame extends Frame {
	
	public CarFrame() {
		//Button btn1 = new Button();//this.setTitle("Car Frame");
		//btn1.setLabel("BTN1");
		//btn1.setSize(40, 15);
		//btn1.setLocation(50, 50);
		//btn1.setBounds(50, 50, 40, 15);
		//new 한 것을 실행을 하라는 의미, 버튼 add를 하려면 콘테이너와 안에 담길 컴포넌트가 필요하다.
		//this.add(btn1, "North");
		//this.add(new Button("BTN2"), BorderLayout.SOUTH);
		//this.add(new Button("BTN3"), BorderLayout.WEST);
		//this.add(new Button("BTN4"), BorderLayout.EAST);
		//this.add(new Button("BTN5"), BorderLayout.CENTER);
		
		Panel panel = new Panel();
		panel.setBackground(Color.DARK_GRAY); //상수의 이름은 대문자로 작성한다. 이탤릭체인데 대문자로 시작하면 무조건 상수이다. 
		MyListener listener = new MyListener();
		Button btn1 = new Button("Btn1");
		Button btn2 = new Button("Btn2");
		Button btn3 = new Button("Btn3");
		Button btn4 = new Button("Btn4");
		Button btn5 = new Button("Btn5");
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);
		btn1.addActionListener(listener);
		btn2.addActionListener(listener);
		btn3.addActionListener(listener);
		btn4.addActionListener(listener);
		btn5.addActionListener(listener);

		
		panel.setLayout(new FlowLayout());
		this.add(panel, BorderLayout.NORTH);
		

		setTitle("Car Frame");
		setSize(300, 200); //this는 생략 가능하기 때문에 생략되어 있다. 
		setVisible(true);
	}
	
	class MyListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			Button btn = (Button) e.getSource();
			btn.setBackground(Color.RED);
			//Button button = e.getSource();
			
		}
	}
	
	
}

//계산기 레이아웃을 만들어 올 것
//calculator라고 하는 패키지를 만들고 그 안에 계산기 모양의 레이아웃의 모양을 가지는 awt를 import 해서 만들어 올 것
//setLayout(new FlowLayout()); //레이아웃을 지정하는 방법 설계도를 가지고 new를 해야만 사용할 수 있다.
//setLayout(null); //직접 버튼등을 화면의 위치를 직접 지정해 주기 위해서는 Default값 때문에 NULL을 해주어야 사용 할 수 있다.  
//여러가지 레이아웃 매니져를 사용한다. 
//표처럼 레이아웃을 만드는 것을 그리드 레이아웃이라고 이야기한다. 
//이벤트리스너, 핸들러 
//리스너는 이미 만들어져 있는 것이고, 핸들러는 만들어서 사용하는 것이다. 