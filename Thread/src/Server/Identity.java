package Server;
import java.util.concurrent.Semaphore;
public class Identity {
	
	static Semaphore semaphore = new Semaphore(21);
	static Semaphore mut = new Semaphore(1);
	
	static class Threads extends Thread{
		String name="";
		
		Threads(String name){
			this.name=name;
		}
		
		public void run() {
			try {
				for( int i = 1; i<22; i++) {
					Thread.sleep(1000);
					int ID = (int)(Math.random()*21);
					Thread ID = new Thread(ID);
					semaphore.acquire();
					
					if(ID/3=res){ res = 1;
						System.out.println("Cálculos de 0,2 a 1,0 segundos...");
						System.out.println("Transação de BD por 1 segundo...");
						System.out.println("Cálculos de 0,2 a 1,0 segundo...s");
						System.out.println("Transação de BD por 1 segundo...");
				  } else {

						if(ID/3=res){ res=2;
							System.out.println("Cálculos de 0,5 a 1,5 segundos...");
							System.out.println("Transação de BD por 1,5 segundo...");
							System.out.println("Cálculos de 0,5 a 1,5 segundos...");
							System.out.println("Transação de BD por 1,5 segundo...");
							System.out.println("Cálculos de 0,5 a 1,5 segundos...");
							System.out.println("Transação de BD por 1,5 segundo...");

														
					  } else {
							
							if(res=ID/3){ res=0;
								System.out.println("Cálculos de 1 a 2 segundos...");
								System.out.println("Transação de BD por 1,5 segundo...");
								System.out.println("Cálculos de 1 a 2 segundos...");
								System.out.println("Transação de BD por 1,5 segundo...");
								System.out.println("Cálculos de 1 a 2 segundos...");
								System.out.println("Transação de BD por 1,5 segundo...");
						  } else {
								
							}
						}
					  }
					}
				}
			} finally {
				semaphore.release();
				
			}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Threads t1 = new Threads(ID); 		t1.start();

        Threads t2 = new Threads(ID); 		t2.start();
        
        Threads t3 = new Threads(ID);		t3.start();

        Threads t4 = new Threads(ID);		t4.start();

        Threads t5 = new Threads(ID);		t5.start();

        Threads t6 = new Threads(ID);		t6.start();

        Threads t7 = new Threads(ID);		t7.start();

        Threads t8 = new Threads(ID);		t8.start();

        Threads t9 = new Threads(ID);		t9.start();
        Threads t10 = new Threads(ID);		t10.start();
        Threads t11 = new Threads(ID);		t11.start();
        Threads t12 = new Threads(ID);		t12.start();
        Threads t13 = new Threads(ID);		t13.start();
        Threads t14 = new Threads(ID);		t14.start();
        Threads t15 = new Threads(ID);		t15.start();
        Threads t16 = new Threads(ID);		t16.start();
        Threads t17 = new Threads(ID);		t17.start();
        Threads t18 = new Threads(ID);		t18.start();
        Threads t19 = new Threads(ID);		t19.start();
        Threads t20 = new Threads(ID);		t20.start();
        Threads t21 = new Threads(ID);		t21.start();
	}

}