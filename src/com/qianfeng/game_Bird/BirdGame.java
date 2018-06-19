package com.qianfeng.game_Bird;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class BirdGame extends JPanel{
 //����ͼƬ
	private BufferedImage bg = null,start =null;
	//����һ������
	private Ground ground = null;
	private Bird niao     = null;
	//������Ϸ״̬
	private static int state = -1;
	private static final int START= 0;
	private static final int RUNNING= 1;
	private static final int GAMEOVER= 2;
	
	
	
	public BirdGame(){
	 try {
		 //��ȡͼƬ
		bg = ImageIO.read(getClass().getResource("bg.png"));
		//��������Ķ���
		
		ground = new Ground();
		
		//����Ϊ��ʼ״̬
		state= START;
		//�õ���ʼ�����ͼƬ
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
 //��ѭ��һֱʵ������
 public void action(){
	 while(true){
		 ground.move();
		 niao.fly();
		 try {
			Thread.sleep(15);
			//���¿�ʼд�ص�
			repaint();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }
 }
 
 
 
}
