package com.qianfeng.game_Bird;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;




public class Bird {
   public int x;
   public int y;
  public BufferedImage img;
  //循环播放的话可以实现飞的状态
  public BufferedImage [] images =new BufferedImage[8];
  public static int index = 0;
   public Bird(){
	   x = 140;
	   y = 220;
	   //初始化一张小年图片
	   try {		
		   img = ImageIO.read(getClass().getResource("0.png"));
	for(int i= 0;i<8;i++){
		images[i] =ImageIO.read(getClass().getResource(i+".png"));
	}
	   
	   
	   } catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
   public void fly(){
	 
	   index ++;
	   //  /10放慢index的循环速度
	   img = images[index/10%8];
   }
   
   
   
   
}
