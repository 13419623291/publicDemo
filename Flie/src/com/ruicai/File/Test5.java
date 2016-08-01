package com.ruicai.File;

import java.io.File;
import java.io.FilenameFilter;
import java.text.SimpleDateFormat;

/*获取一个文件夹的大小C:\Windows\System32
 * 里面所有的文件
 * 最后一次修改的日期
   C:\Windows\System32
 */
public class Test5 {
	static Long sum=0L;
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
      test(new File("D:\\E盘资料PLC暂存"));
	  System.out.println("文件的大小："+(double)sum/1024/1024/1024+"G");
    File file3=new File("D:\\ProgramData\\BSplayer");
	File[] arr=file3.listFiles(new FilenameFilter() {
		@Override
		public boolean accept(File dir, String name) {
			// TODO Auto-generated method stub
			return new File(dir,name).isFile()&&name.endsWith(".png");
		}
	});
	  for (File file : arr) {
		System.out.println(file);
	}
	  System.out.println("-----------------------------------");
	  File [] fileList=file3.listFiles();
	  for (int i = 0; i < fileList.length; i++) {
		if(fileList[i].getName().endsWith(".exe")){
			System.out.println(fileList[i]);
		}
	}
	  System.out.println("-----------------------------------");
	  String [] file=file3.list();
	  for (int i = 0; i < file.length; i++) {
		if(file[i].endsWith(".ico")){
			System.out.println(file[i]);
		}
	}
 }
      public static void test(File file){
    	 
    	  File []file2=file.listFiles();
    	  SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");
    	  /*sdf.format(file2[i].length())
    	   * Date num=new Date(file2[i].length());
    	   */
    	  if(file2!=null&&file2.length>0){
    		  for (int i=0;i<file2.length;i++) {
				if(file2[i].isDirectory()){
					test(file2[i]);
				}else{
					sum=sum+file2[i].length();
					System.out.println(file2[i]+"最后的修改时间"+sdf.format(file2[i].lastModified() )+"文件大小："+file2[i].length()/1024/1024+"M");
				}
			}   		 
    	  }
      }

}
