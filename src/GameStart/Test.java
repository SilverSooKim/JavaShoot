package GameStart;

public class Test {

	Test(){
		gogo();
	}
	
	public void gogo() {
		new Thread(new Runnable() {
			int a=0;
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while(a < 100) {
					try {
						Thread.sleep(1000);
						System.out.println(a++);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}).start();
	}
}	
