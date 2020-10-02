package Simulation;
import java.lang.*;
import java.util.concurrent.Semaphore;
import javax.swing.*;
public class Sim {
	
	static Semaphore sema = new Semaphore(8);
	
	static class Threads extends Thread{
		String name="";
		
		Threads(String name){
			this.name=name;
		}
		
		public void run(){
			try {
				for( int i = 1; i<6; i++) {
					int ID = (int)(Math.random()*5);
					Thread ID = new Thread(ID);
					sema.acquire();
					
					while(ID) {
						jb.Thread();
						Thread.start();
						Thread.sleep(ID, 1000);
					}
					
					if(ID%2 = 0) {
						System.out.println(" Lasanha a Bolonhesa"+ ID + "De 0,5 a 0,8s pra ficar pronto...");
						
					}else {
						System.out.println("Sopa de Cebola" + "De 0,6 a 1,2s pra ficar pronto...");
						
					}
				}
			} finally {
				sema.release();
				
			}
		}
	}
	
	public class ProgressBar extends JFrame{
		JProgressBar jb;    
		int i=0,num=0;     
		ProgressBar(){    
		jb=new JProgressBar(0,2000);    
		jb.setBounds(40,40,160,30);         
		jb.setValue(0);    
		jb.setStringPainted(true);    
		add(jb);    
		setSize(250,150);    
		setLayout(null);    
	}    
		public void iterate(){
	     while(i<=2000){    
		  jb.setValue(i);    
		  i=i+20;
		  
	  try{Thread.sleep(150);
		  
		  }catch(Exception e){
			  
		  }    
		}    
	}    
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ProgressBar m=new ProgressBar();    
		    m.setVisible(true);    
		    m.iterate();  
		
        Threads t1 = new Threads(ID); 		t1.start();

        Threads t2 = new Threads(ID); 		t2.start();
        
        Threads t3 = new Threads(ID);		t3.start();

        Threads t4 = new Threads(ID);		t4.start();

        Threads t5 = new Threads(ID);		t5.start();

        Threads t6 = new Threads(ID);		t6.start();

        Threads t7 = new Threads(ID);		t7.start();

        Threads t8 = new Threads(ID);		t8.start();

	}

}