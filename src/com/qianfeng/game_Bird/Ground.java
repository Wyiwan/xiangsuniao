package com.qianfeng.game_Bird;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Ground {

	public int x;
	public int y;
	public BufferedImage gd;
	//����һ������

	
	public Ground(){
		x=0;
		y=500;
		try {
			gd = ImageIO.read(getClass().getResource("ground.png"));
			//��������Ķ���
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	//��������
	public void move(){
		x--;
		if(x==-100){
			x=0;
		}
	}
	
	
	
}
