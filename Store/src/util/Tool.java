package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import controller.porder.PorderMainUI;

public class Tool {
	public static void main (String[] args) {
	//System.out.println("當前執行目錄：" + System.getProperty("user.dir"));
	}

	public static void saveMember(Object object,String filename) {
	
		
		try {
			FileOutputStream fileoutputstream=new FileOutputStream(filename);
			ObjectOutputStream objectoutputstream=new ObjectOutputStream(fileoutputstream);
			objectoutputstream.writeObject(object);

		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	public static Object read(String filename) {
	    Object object = null;
	    File file = new File(filename); // 檢查檔案是否存在
	    if (file.exists()) {
	        System.out.println("檔案存在");
	        if (file.canRead()) {
	            System.out.println("檔案可讀");
	            try {
	                FileInputStream fileinputstream = new FileInputStream(filename);
	                ObjectInputStream objectinputstream = new ObjectInputStream(fileinputstream);
	                object = objectinputstream.readObject();
	            } catch (IOException | ClassNotFoundException e) {
	                e.printStackTrace();
	            }
	        } else {
	            System.out.println("檔案不可讀");
	        }
	    } else {
	        System.out.println("檔案不存在");
	    }
	    return object;
	}

	
	public static void goToPorderMain() {
		PorderMainUI pordermainui=new PorderMainUI();
		pordermainui.setVisible(true);
	}
	
	public static String clock() {
		SimpleDateFormat simpledateformat=new SimpleDateFormat("yyy/MM/dd HH:mm:ss");
		return simpledateformat.format(new Date());
		
	}

}
