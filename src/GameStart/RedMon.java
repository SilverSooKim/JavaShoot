package GameStart;

import java.awt.Image;

import javax.swing.ImageIcon;

import GameStart.GameRoom.MyCanvas;

public class RedMon {
	
	int x = -1;
	int y = -1;
	int speed = 50;
	//MyCanvas mc = null;
	private Image myMon = null;
	int width = 0;
	int height = 0;
	
	public Image getMyMon() {
		return myMon;
	}

	RedMon(int x, int y, MyCanvas mc){
		this.x=x;
		this.y=y;
	//	this.mc=mc;
		
		myMon = new ImageIcon("./img/mon_red.jpg").getImage();
		this.width = myMon.getWidth(mc);
		this.height = myMon.getHeight(mc);
		
		autoPoint();
		setTimer();
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	private void setTimer() {
		// TODO Auto-generated method stub
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					Thread.sleep(3000);
					speed = 30;
					Thread.sleep(3000);
					speed = 10;
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}).start();
	}

	private void autoPoint() {
		new Thread(new Runnable() {
			@Override
			public void run() {
				while(getY() < 400) {
					try {
						Thread.sleep(speed);
						setY(getY()+1);
					//	mc.repaint();  // update(g) >> paint(g)
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			}
		}).start();
		
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	

}
