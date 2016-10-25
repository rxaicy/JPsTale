package org.pstale.utils;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileChooser {

	JFileChooser chooser;

	public FileChooser() {
		chooser = new JFileChooser();
		
		if (new File("D:/Priston Tale/0_�ز�/Client").isDirectory()) {
			chooser.setCurrentDirectory(new File("D:/Priston Tale/0_�ز�/Client"));
		} else if (new File("F:/1_DEVELOP/3_�ز�").isDirectory()) {
			chooser.setCurrentDirectory(new File("F:/1_DEVELOP/3_�ز�"));
		} else if (new File("models").isDirectory()) {
			chooser.setCurrentDirectory(new File("models"));
		}
		chooser.setDialogType(JFileChooser.OPEN_DIALOG);
		chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		chooser.setDialogTitle("���ļ�");
		
		chooser.addChoosableFileFilter(new FileNameExtensionFilter("*.inx", "inx"));
		chooser.addChoosableFileFilter(new FileNameExtensionFilter("*.smd", "smd"));
		chooser.addChoosableFileFilter(new FileNameExtensionFilter("*.ase", "ase"));
		chooser.addChoosableFileFilter(new FileNameExtensionFilter("*.3ds", "3ds"));
	}
	
	public File getFile() {
		if (chooser.showOpenDialog(null) != JFileChooser.APPROVE_OPTION) {
			return null;
		}
		return chooser.getSelectedFile();
	}
}