package GameStart;

public class Missile {
	int x = 0;
	int y = 0;
	int speed=5;
	
	Missile(int x, int y){
		this.x=x;
		this.y=y;
		autoPoint();
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = this.x + x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = this.y + y;
	}
	private void autoPoint() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				while(getY() > 20) {
					try {
						Thread.sleep(speed);
						setY(-1);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}
		}).start();
		
	}
}
