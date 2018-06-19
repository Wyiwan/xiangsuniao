package com.qianfeng.game_Bird;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Ground {

	public int x;
	public int y;
	public BufferedImage gd;
	//声明一个地面

	
	public Ground(){
		x=0;
		y=500;
		try {
			gd = ImageIO.read(getClass().getResource("ground.png"));
			//创建地面的对象
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	//地面左移
	public void move(){
		x--;
		if(x==-100){
			x=0;
		}
	}
	
	
	
}
