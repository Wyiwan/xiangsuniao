package com.qianfeng.game_Bird;

import javax.swing.JFrame;

public class StartGame {
public static void main(String[] args) {
	//����
	JFrame frame = new JFrame();
	//size
	frame.setSize(440,670);
	//���ò��ַ�ʽ
	frame.setLocationRelativeTo(null);
	BirdGame game = new BirdGame();
	frame.add(game);
	//������ʾ
	frame.setVisible(true);
	//����Ĭ�ϵĹر�ģʽ������رգ������˳�
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//game����action
	game.action();
	
	
}
}
