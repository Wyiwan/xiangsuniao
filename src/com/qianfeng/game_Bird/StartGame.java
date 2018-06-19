package com.qianfeng.game_Bird;

import javax.swing.JFrame;

public class StartGame {
public static void main(String[] args) {
	//窗体
	JFrame frame = new JFrame();
	//size
	frame.setSize(440,670);
	//设置布局方式
	frame.setLocationRelativeTo(null);
	BirdGame game = new BirdGame();
	frame.add(game);
	//设置显示
	frame.setVisible(true);
	//设置默认的关闭模式：窗体关闭，程序退出
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//game调用action
	game.action();
	
	
}
}
