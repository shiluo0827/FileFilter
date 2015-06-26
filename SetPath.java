import java.awt.Component;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JTextField;
import javax.swing.filechooser.FileSystemView;

public class SetPath {
	File file = null;
	String path = null;
	int result = 0;
	Component chatFrame;

	public SetPath(JTextField jt) {
		JFileChooser fileChooser = new JFileChooser();
		FileSystemView fsv = FileSystemView.getFileSystemView(); // 注意了，这里重要的一句
		fileChooser.setCurrentDirectory(fsv.getHomeDirectory());
		fileChooser.setDialogTitle("选择文件");
		fileChooser.setApproveButtonText("确定");
		fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		result = fileChooser.showOpenDialog(chatFrame);
		if (JFileChooser.APPROVE_OPTION == result) {
			path = fileChooser.getSelectedFile().getPath();
			jt.setText(path);
		}
	}
}
