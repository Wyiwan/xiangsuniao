package com.qianfeng.game_Bird;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;




public class Bird {
   public int x;
   public int y;
  public BufferedImage img;
  //ѭ�����ŵĻ�����ʵ�ַɵ�״̬
  public BufferedImage [] images =new BufferedImage[8];
  public static int index = 0;
   public Bird(){
	   x = 140;
	   y = 220;
	   //��ʼ��һ��С��ͼƬ
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
	   //  /10����index��ѭ���ٶ�
	   img = images[index/10%8];
   }
   
   
   
   
}
