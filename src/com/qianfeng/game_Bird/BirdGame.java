package com.qianfeng.game_Bird;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class BirdGame extends JPanel{
 //读出图片
	private BufferedImage bg = null,start =null;
	//声明一个地面
	private Ground ground = null;
	private Bird niao     = null;
	//代表游戏状态
	private static int state = -1;
	private static final int START= 0;
	private static final int RUNNING= 1;
	private static final int GAMEOVER= 2;
	
	
	
	public BirdGame(){
	 try {
		 //读取图片
		bg = ImageIO.read(getClass().getResource("bg.png"));
		//创建地面的对象
		
		ground = new Ground();
		
		//设置为开始状态
		state= START;
		//得到开始界面的图片
		start = ImageIO.read(getClass().getResource("start.png"));
		
		niao = new Bird();
		
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
 @Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(bg, 0, 0, null);
		g.drawImage(niao.img, niao.x, niao.y, null);
		g.drawImage(ground.gd, ground.x, ground.y, null);
	    switch (state) {
		case START:
			g.drawImage(start, 0, 0, null);
			break;
        case RUNNING:
			
			break;
         case GAMEOVER:
	
	         break;
//		default:
//			break;
		} 
        
 
 }
 //死循环一直实现左移
 public void action(){
	 while(true){
		 ground.move();
		 niao.fly();
		 try {
			Thread.sleep(15);
			//重新开始写地点
			repaint();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
 }
 
 
 
}
