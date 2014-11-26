import java.awt.*;
import java.awt.event.*;

public class CarFrame extends Frame {
	
	public CarFrame() {
		//Button btn1 = new Button();//this.setTitle("Car Frame");
		//btn1.setLabel("BTN1");
		//btn1.setSize(40, 15);
		//btn1.setLocation(50, 50);
		//btn1.setBounds(50, 50, 40, 15);
		//new �� ���� ������ �϶�� �ǹ�, ��ư add�� �Ϸ��� �����̳ʿ� �ȿ� ��� ������Ʈ�� �ʿ��ϴ�.
		//this.add(btn1, "North");
		//this.add(new Button("BTN2"), BorderLayout.SOUTH);
		//this.add(new Button("BTN3"), BorderLayout.WEST);
		//this.add(new Button("BTN4"), BorderLayout.EAST);
		//this.add(new Button("BTN5"), BorderLayout.CENTER);
		
		Panel panel = new Panel();
		panel.setBackground(Color.DARK_GRAY); //����� �̸��� �빮�ڷ� �ۼ��Ѵ�. ���Ÿ�ü�ε� �빮�ڷ� �����ϸ� ������ ����̴�. 
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
		setSize(300, 200); //this�� ���� �����ϱ� ������ �����Ǿ� �ִ�. 
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

//���� ���̾ƿ��� ����� �� ��
//calculator��� �ϴ� ��Ű���� ����� �� �ȿ� ���� ����� ���̾ƿ��� ����� ������ awt�� import �ؼ� ����� �� ��
//setLayout(new FlowLayout()); //���̾ƿ��� �����ϴ� ��� ���赵�� ������ new�� �ؾ߸� ����� �� �ִ�.
//setLayout(null); //���� ��ư���� ȭ���� ��ġ�� ���� ������ �ֱ� ���ؼ��� Default�� ������ NULL�� ���־�� ��� �� �� �ִ�.  
//�������� ���̾ƿ� �Ŵ����� ����Ѵ�. 
//ǥó�� ���̾ƿ��� ����� ���� �׸��� ���̾ƿ��̶�� �̾߱��Ѵ�. 
//�̺�Ʈ������, �ڵ鷯 
//�����ʴ� �̹� ������� �ִ� ���̰�, �ڵ鷯�� ���� ����ϴ� ���̴�. 