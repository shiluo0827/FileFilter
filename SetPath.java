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
		FileSystemView fsv = FileSystemView.getFileSystemView(); // ע���ˣ�������Ҫ��һ��
		fileChooser.setCurrentDirectory(fsv.getHomeDirectory());
		fileChooser.setDialogTitle("ѡ���ļ�");
		fileChooser.setApproveButtonText("ȷ��");
		fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		result = fileChooser.showOpenDialog(chatFrame);
		if (JFileChooser.APPROVE_OPTION == result) {
			path = fileChooser.getSelectedFile().getPath();
			jt.setText(path);
		}
	}
}
