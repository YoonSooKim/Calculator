import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class CarFrame2 extends Frame implements WindowListener {
   
   public CarFrame2(){
      
//	  addWindowListener(new MyWindowListener()); // 1�� ���
//	  addWindowListener(new MyWindowListener2()); // 2�� ���
//    addWindowListener(this); //3�����
	   addWindowListener(new WindowAdapter() {
		   public void windowClosing(WindowEvent arg0) {
			   System.exit(0);
		   }
	   });
	   
      setSize(400, 600);
      setVisible(true);
   }
   
   
   class MyWindowListener implements WindowListener {

      @Override
      public void windowActivated(WindowEvent arg0) {
         // TODO Auto-generated method stub
         
      }

      @Override
      public void windowClosed(WindowEvent arg0) {
         // TODO Auto-generated method stub
         
      }

      @Override
      public void windowClosing(WindowEvent arg0) {
         // TODO Auto-generated method stub
         System.exit(0);
      }

      @Override
      public void windowDeactivated(WindowEvent arg0) {
         // TODO Auto-generated method stub
         
      }

      @Override
      public void windowDeiconified(WindowEvent arg0) {
         // TODO Auto-generated method stub
         
      }

      @Override
      public void windowIconified(WindowEvent arg0) {
         // TODO Auto-generated method stub
         
      }

      @Override
      public void windowOpened(WindowEvent arg0) {
         // TODO Auto-generated method stub
         
      }
      
      
   }
   //WindowListener�� �������̽���.
   class MyWindowListener2 extends WindowAdapter {
      
      public void windowClosing(WindowEvent e) {
         System.exit(0);
      }
      
	}
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		 System.exit(0);
	}
	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}