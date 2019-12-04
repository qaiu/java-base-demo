package Jframetext;

import javax.swing.*;

public class Jframetext extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
        JDialog dialog = new JDialog();
        // 设置大小
        dialog.setSize(300, 300);
        // 设置标题
        dialog.setTitle("登录界面");
        JLabel unameLabel = new JLabel("账号：");
        JTextField unameField = new JTextField();
        JLabel upsdLabel = new JLabel("密码：");
        JTextField upsdField = new JTextField();
        JButton login = new JButton("登录");
        JButton cancel = new JButton("取消");
        // 设置位置与大小
        unameLabel.setBounds(50, 50, 50, 30);
        unameField.setBounds(100, 50, 150, 30);
        upsdLabel.setBounds(50, 100, 50, 30);
        upsdField.setBounds(100, 100, 150, 30);
        login.setBounds(60, 160, 60, 40);
        cancel.setBounds(160, 160, 60, 40);
        // 设置布局为空，使用坐标控制控件位置的时候，一定要设置布局为空
        dialog.setLayout(null);
        // 添加控件
        dialog.add(login);
        dialog.add(cancel);
        dialog.add(unameField);
        dialog.add(unameLabel);
        dialog.add(upsdLabel);
        dialog.add(upsdField);
        // 设置dislog的相对位置，参数为null，即显示在屏幕中间
        dialog.setLocationRelativeTo(null);
        // 设置当用户在此对话框上启动 "close" 时默认执行的操作
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        // 设置是否显示
        dialog.setVisible(true);
    }

}
