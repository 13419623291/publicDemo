package com.ruicai.面向对象.entity;
/** 编写Truck（卡车）类继承于Vehicles类，增加float型成员属性load（载重），
  * 还应增加成员方法showTruck（在控制台显示卡车的信息），并编写构造方法。
  */
public class Work8Truck extends Work8Vehicles {
        private float load;

		public Work8Truck(String brand, String color,float load) {
			super(brand,color);
			this.load=load;
		}

		public float getLoad() {
			return load;
		}

		public void setLoad(float load) {
			this.load = load;
		}
	    public void showTruck(){
	    	System.out.println("商标："+brand+"\n颜色："+color+"\n载重："+load+"t");
	    }
}
