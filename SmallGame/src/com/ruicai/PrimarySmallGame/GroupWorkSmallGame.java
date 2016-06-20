package com.ruicai.PrimarySmallGame;
/**
 * 小游戏系统  组长：熊昭  成员：汪林 杜新裕 陈俊  周勇  雷波
 */
import java.util.Scanner;

public class GroupWorkSmallGame {

	/**
	 * 根据游戏类型和游戏时长计算应支付的游戏币 游戏类型分为两大类: 牌类和休闲竞技类 游戏的收费标准: 牌类：10元/小时、 休闲竞技类：20元/小时
	 * 游戏的收费规则:游戏时间超过10小时，可以打5折10小时及以下，打8折
	 * 
	 * 游戏选择模块 完成者：杜新裕
	 */

	public static void charge() {

		Scanner sca = new Scanner(System.in);
		// 选择游戏种类
		System.out.println("****************************");
		System.out.println("1.棋牌类\n2.休闲竞技类");
		while (true) {
			System.out.println("请选择游戏种类");
			String class3 = sca.next();
			// 判断游戏种类
			if (class3.equals("1")) {
				System.out.println("您选择的是棋牌类游戏，请输入游戏时长:");
				double num = sca.nextDouble();
				if (num > 10) {
					System.out.println("享受5折优惠！");
					System.out.println("您需投入游戏币为：" + (num * 5));
					System.out.println("****************************");
					break;
				} else {
					System.out.println("享受8折优惠！");
					System.out.println("您需投入游戏币为：" + (num * 8));
					System.out.println("****************************");
					break;
				}
			} else if (class3.equals("2")) {
				System.out.println("您选择的是休闲竞技类游戏，请输入游戏时长:");
				double num1 = sca.nextDouble();
				if (num1 > 10) {
					System.out.println("享受5折优惠！");
					System.out.println("您需投入游戏币为：" + (num1 * 10));
					System.out.println("****************************");
					break;
				} else {
					System.out.println("享受8折优惠！");
					System.out.println("您需投入游戏币为：" + (num1 * 16));
					System.out.println("****************************");
					break;
				}
			} else {
				System.out.println("您的选择有误，请重新选择");
			}
		}
	}

	/**
	 * 登录首页模块 完成者：熊昭
	 */
	public static void login() {
		System.out.println("**********欢迎进入1605班小游戏系统！！***********\n1，登录；\n2，退出；\n3，添加用户；");
		Scanner in = new Scanner(System.in);

		while (true) {
			String num = in.next();
			if (num.equals("1")) {
				// 登录到选择界面 需要定义一个选择类
				primary();
				break;
			} else if (num.equals("2")) {
				System.out.println("**********成功推出1605班小游戏系统！！**********\n欢迎下次再来！");
				break;
			} else if (num.equals("3")) {
				//////////////
				information();
				break;
			} else {
				System.out.println("输入错误请重新输入:");
			}
		}
	}

	/**
	 * 要求： 当用户输入除1---4之外的数字的时候给出错误提示并始终处于可以再次输入的状态 该功能和瑞才购物系统登录主界面是类似的。
	 * 开发时间建议：20分钟
	 * 
	 * 完成者：雷波
	 * 
	 */
	public static void primary() {
		System.out.println("****************************");
		System.out.println("\t1.斗地主");
		System.out.println("\t2.斗牛");
		System.out.println("\t3.泡泡龙");
		System.out.println("\t4.连连看");
		System.out.println("****************************\n");
		System.out.println("选择你喜爱的游戏：\n");
		Scanner scan = new Scanner(System.in);
		// boolean flaga =false;//定义一个布尔类型来循环
		while (true) {
			String zifu = scan.next();
			switch (zifu) {
			case "1":
				System.out.println("****************************");
				System.out.println("\t1.斗地主");
				gamePlaying();
				break;
			case "2":
				System.out.println("****************************");
				System.out.println("\t2.斗牛");
				gamePlaying();
				break;
			case "3":
				System.out.println("****************************");
				System.out.println("\t3.泡泡龙");
				gamePlaying();
				break;
			case "4":
				System.out.println("****************************");
				System.out.println("\t4.连连看");
				gamePlaying();
				break;
			default:
				System.out.println("输入错误请重新输入");

				// flaga=false;
			}
		}
	}

	/**
	 * 用户信息录入模块 完成者 汪林 陈俊
	 */
	// 用户信息录入
	public static void information() {
		System.out.println("请输入要录入用户的数量");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for (int i = 1; i <= num; i++) {
			boolean flag;
			int userNum;
			int oldNum;
			System.out.print("请输入用户编号：<4位数>");
			do {
				userNum = scan.nextInt();
				if (userNum < 1000 || userNum > 9999) {
					System.out.println("请正确输入用户编号！");
					flag = true;
				} else {
					break;
				}
			} while (flag != false);
			System.out.print("请输入用户年龄：");
			do {
				oldNum = scan.nextInt();
				if (oldNum < 10) {
					System.out.println("很抱歉，您的年龄不适合玩游戏");
					System.out.println("录入信息失败");
					flag = true;
				} else {
					break;
				}
			} while (flag != false);
			System.out.print("请输入用户积分：");
			int saveNum = scan.nextInt();
			System.out.println("您录入的用户信息是：");
			System.out.println("用户编号：" + userNum);
			System.out.println("年龄：" + oldNum);
			System.out.println("积分：" + saveNum);
		}
		login();
	}

	/**
	 * 游戏模块 完成者：周勇
	 */
	// game
	public static void gamePlaying() {

		charge();
		System.out.println("\n\n");
		System.out.println("游戏开始");
		int time = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.println("第" + i + "次游戏");
			int num = (int) (Math.random() * 100); // 随机产生一个数字
			System.out.println("您本次成绩为" + num);
			if (num > 60) {
				time++;
			}
			System.out.println("是否继续游戏：" + "\ny" + "\nn");
			Scanner scan = new Scanner(System.in); // 接收键盘输
			while (true) {
				String letter = scan.next(); // 接收一个String类型输入
				if (letter.equals("y")) {
					System.out.println("******");
					break;
				} else if (letter.equals("n")) {
					System.out.println("退出游戏");
					primary();
					break;
				} else {
					System.out.println("请输入准确选择");
				}
			}
		} // 游戏成绩的划分
		if (time > 4) {
			System.out.println("恭喜你，你的等级为一级");
		} else if (time > 3) {
			System.out.println("恭喜你，你的等级为二级");
		} else {
			System.out.println("你的等级为三级，继续加油\n\n");
			
		}
		
		primary();
	}

	public static void main(String[] args) {

		// gamePlaying();
		login();

	}

}
