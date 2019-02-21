package weixinkeji.vip.jweb.scanclasss.tools;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FindFileTool {

	private List<File> list = new ArrayList<>();

	public void findFile(File file) {

		if (file.isFile()) {
			list.add(file);
			System.out.println(file.getName());
		}
		File[] fs = file.listFiles();
		if (null != fs) {
			System.out.println("\n");
			for (File f : fs) {
				findFile(f);
			}
		}
	}

	public List<File> getFile() {
		return this.list;
	}

	public static void main(String args[]) {
		File f = new File("D:\\360极速浏览器下载");
		FindFileTool ft = new FindFileTool();
		ft.findFile(f);
	}
}
