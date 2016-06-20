package com.ruicai.duoxiancheng;

import com.ruicai.duoxiancheng.entity.Test41;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Test41 t=new Test41();
        Thread th=new Thread(t,"窗口1");
        Thread th1=new Thread(t,"窗口2");
        Thread th2=new Thread(t,"窗口3");
        th.start();
        th1.start();
        th2.start();
	}

}
