package admin.admin;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import database.AdminDAO;
import database.AdminVO;
import user.home.MainTitle;
import user.home.SetStyle;

public class AdminTab extends JPanel {
	
	SetStyle style = new SetStyle();
	JTabbedPane northTab = new JTabbedPane(JTabbedPane.NORTH);

	AdminList apprvList = new AdminList();
	AdminData adminData = new AdminData();
	
	public AdminTab() {
		setLayout(new BorderLayout());
		add(northTab);
    	northTab.setFont(style.fnt16);
    	northTab.addTab("流盔 格废", adminData);
    	northTab.addTab("流盔 鼻茄 包府", apprvList);
			
    	
    	
//		setSize(1000,800);
//		setVisible(true);
//		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    	
    	
	}
	
	public static void main(String[] args) {
//		new AdminTab();
	}

}
