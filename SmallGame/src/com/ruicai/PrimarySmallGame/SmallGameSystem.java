package com.ruicai.PrimarySmallGame;

import java.util.Scanner;

/**
 * 
 * @author 1605班 小游戏系统 初级版  熊昭
 *
 */
public class SmallGameSystem {

	// 登录界面 登录 和退出功能 1，登录 2，退出3，添加用户
	public static void login() {
		System.out.println("**********欢迎进入1605班小游戏系统！！***********\n1，登录；\n2，退出；\n3，添加用户；");
		Scanner in = new Scanner(System.in);

		while (true) {
			String num = in.next();
			if (num.equals("1")) {
				// 登录到选择界面 需要定义一个选择类
				chooseGame();
				break;
			} else if (num.equals("2")) {
				System.out.println("**********成功推出1605班小游戏系统！！**********\n欢迎下次再来！");
				break;
			} else if (num.equals("3")) {

				System.out.println("输入用户编号：");

				while (true) {
					int num1 = in.nextInt();
					if (num1 > 999 && num1 < 9999) {
						System.out.println("信息录入成功！");
						System.out.println("用户编号：" + num1);
						break;
					} else {
						System.out.println("输入错误！请重新输入：");
					}
				}

				System.out.println("输入用户年龄：");
				while (true) {
					int num1 = in.nextInt();
					if (num1 >= 18 && num1 < 80) {
						System.out.println("信息录入成功！");
						System.out.println("用户年龄：" + num1);
						break;
					} else if (num1 > 0 && num1 < 18) {
						System.out.println("信息录入失败！未成年禁止注册！返回登录主页！");
						login();
						break;
					} else {
						System.out.println("输入错误！请重新输入：");
					}
				}

				System.out.println("输入用户积分：");
				while (true) {
					int num1 = in.nextInt();
					if (num1 > 0) {
						System.out.println("信息录入成功！");
						System.out.println("用户积分：" + num1);
						login();
						break;
					} else {
						System.out.println("输入错误！请重新输入：");
					}
				}

				break;
			} else {
				System.out.println("输入错误！请重新输入：");
			}
		}
	}

	// 选择游戏的界面
	public static void chooseGame() {
		System.out.println("***********登录成功！************");
		System.out.println("请选择你喜欢的游戏：1，斗地主；2，斗牛；3，泡泡龙；4，连连看");

		Scanner in = new Scanner(System.in);

		while (true) {
			String num = in.next();
			if (num.equals("1")) {
				// 斗地主
				System.out.println("*****你已经进入斗地主游戏！（纸牌游戏）******");
				cardGamePlaying();
				break;
			} else if (num.equals("2")) {
				// 斗牛
				System.out.println("*****你已经进入斗牛游戏！（纸牌游戏）******");
				cardGamePlaying();
				break;
			} else if (num.equals("3")) {
				// 泡泡龙
				System.out.println("*****你已经进入泡泡龙游戏！（休闲竞技游戏）******");
				fightGamePlaying();
				break;
			} else if (num.equals("4")) {
				// 连连看
				System.out.println("*****你已经进入连连看游戏！（休闲竞技游戏）******");
				fightGamePlaying();
				break;
			} else {
				System.out.println("输入错误！请重新输入：");
			}
		}
	}

	// 游戏过程 五次游戏 判断是否能升级
	public static void cardGamePlaying() {
		charge();
		System.out.println("您将进行五次游戏！！");
		int count = 0;
		for (int i = 0; i < 5; i++) {

			System.out.println("开始第" + (i + 1) + "次游戏!\n");
			double rad = (double) Math.random() * 10;

			if (rad > 3) {
				System.out.println("这次游戏，你获胜了！");
				count++;
			} else {
				System.out.println("这次游戏，你失败了！");
			}
			System.out.println("是否继续？1，是；2，否；");
			Scanner in = new Scanner(System.in);
			while (true) {
				String num = in.next();
				if (num.equals("1")) {
					System.out.println("**********************");
					break;
				} else if (num.equals("2")) {
					//
					level(count);
					chooseGame();
					break;
				} else {
					System.out.println("输入错误！请重新输入：");
				}
			}
		}

		System.out.println("成功率为：" + count * 20 + "%!!");
		if (count >= 4) {
			System.out.println("您的等级为一级！");
		} else if (count >= 3 && count < 4) {
			System.out.println("您的等级为二级！");
		} else {

			System.out.println("您的等级为三级！\n继续努力吧！");
		}

		System.out.println("是否继续？1，是；2，否；");
		Scanner in = new Scanner(System.in);
		while (true) {
			String num = in.next();
			if (num.equals("1")) {
				cardGamePlaying();
				break;
			} else if (num.equals("2")) {
				//
				chooseGame();
				break;
			} else {
				System.out.println("输入错误！请重新输入：");
			}
		}

	}

	public static void fightGamePlaying() {
		charge();
		System.out.println("您将进行五次游戏！！");
		int count = 0;
		for (int i = 0; i < 5; i++) {

			System.out.println("开始第" + (i + 1) + "次游戏!\n");
			double rad = (double) Math.random() * 10;

			if (rad > 3) {
				System.out.println("这次游戏，你获胜了！");
				count++;
			} else {
				System.out.println("这次游戏，你失败了！");
			}
			System.out.println("是否继续？1，是；2，否；");
			Scanner in = new Scanner(System.in);
			while (true) {
				String num = in.next();
				if (num.equals("1")) {
					System.out.println("**********************");
					break;
				} else if (num.equals("2")) {
					//
					level(count);
					chooseGame();
					break;
				} else {
					System.out.println("输入错误！请重新输入：");
				}
			}
		}

		System.out.println("成功率为：" + count * 20 + "%!!");
		if (count >= 4) {
			System.out.println("您的等级为一级！");
		} else if (count >= 3 && count < 4) {
			System.out.println("您的等级为二级！");
		} else {

			System.out.println("您的等级为三级！\n继续努力吧！");
		}

		System.out.println("是否继续？1，是；2，否；");
		Scanner in = new Scanner(System.in);
		while (true) {
			String num = in.next();
			if (num.equals("1")) {
				fightGamePlaying();
				break;
			} else if (num.equals("2")) {
				//
				chooseGame();
				break;
			} else {
				System.out.println("输入错误！请重新输入：");
			}
		}

	}

	public static void charge() {
		System.out.println("输入您选择的游戏类型：1，纸牌类；2，休闲竞技类；");
		Scanner in = new Scanner(System.in);
		while (true) {
			String num = in.next();
			if (num.equals("1")) {
				System.out.println("输入游戏时长：（单位小时）");
				double time = in.nextDouble();
				if (time >= 10) {
					double sum = time * 10 * 0.5;
					System.out.println("享受5折优惠！应付金额：" + sum + "元！\n\n");
				} else {
					double sum = time * 10 * 0.8;
					System.out.println("享受8折优惠！应付金额：" + sum + "元！\n\n");
				}

				break;
			} else if (num.equals("2")) {
				//
				System.out.println("输入游戏时长：");
				double time = in.nextDouble();
				if (time >= 10) {
					double sum = time * 20 * 0.5;
					System.out.println("享受5折优惠！应付金额：" + sum + "元！\n\n");
				} else {
					double sum = time * 20 * 0.8;
					System.out.println("享受8折优惠！应付金额：" + sum + "元！\n\n");
				}

				break;
			} else {
				System.out.println("输入错误！请重新输入：");
			}
		}
	}
	
	
	//计算等级地方法
	
	public static void level(int a){
		System.out.println("成功率为：" +a * 20 + "%!!");
		if (a >= 4) {
			System.out.println("您的等级为一级！\n\n");
		} else if (a >= 3 && a < 4) {
			System.out.println("您的等级为二级！\n\n");
		} else {

			System.out.println("您的等级为三级！\n继续努力吧！\n\n");
		}

	}

	public static void main(String[] args) {

		login();

		// charge();
		//cardGamePlaying();

	}

}
