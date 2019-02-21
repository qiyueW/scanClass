package weixinkeji.vip.jweb.scanclasss;

import java.io.File;

public class JWebScanClass {
	private Class<?>[] cs;
	static {
		String path=JWebScanClass.class.getClassLoader().getResource("").getFile();
		File f=new File(path);
		
	}
}
