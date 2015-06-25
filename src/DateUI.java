import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

import java.util.*;


public class DateUI extends MouseAdapter {

	JDialog jf = new JDialog();

	JPanel jp = new JPanel();

	JComboBox yearBox = new JComboBox();

	JComboBox monthBox = new JComboBox();

	JComboBox hourBox = new JComboBox();
	
	JComboBox minBox = new JComboBox();
	
	JComboBox secBox = new JComboBox();
	
	JButton[][] buttons = new JButton[7][7];

	String[] weeks = { "日", "一", "二", "三", "四", "五", "六" };

	Calendar cd = Calendar.getInstance();

	int curX = -1;

	int curY = -1;

	JTextField dateText;

	public DateUI(JTextField dateText) {

		this.dateText = dateText;
		jf.setLocationRelativeTo(dateText);
		jf.getContentPane().add(jp);
		jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		jp.setBorder(BorderFactory.createTitledBorder("日期"));
		jp.setLayout(new BorderLayout());
		JPanel northPanel = new JPanel(new GridLayout(1, 0, 0, 0));
		for (int i = 1900; i < 2999; i++) {
			yearBox.addItem(i + "年");
		}
		yearBox.setSelectedItem("2000年");
		for (int i = 1; i <= 12; i++) {
			if(i < 10)
				monthBox.addItem("0" + i + "月");
			else
				monthBox.addItem(i + "月");
		}
		northPanel.add(yearBox);
		northPanel.add(monthBox);
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new GridLayout(7, 7));
		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				if (i == 0) {
					buttons[i][j] = new JButton(weeks[j]);
					buttons[i][j].setEnabled(false);
					buttons[i][j].setBackground(Color.green);
				} else {
					buttons[i][j] = new JButton("");
					buttons[i][j].setBackground(Color.white);
					buttons[i][j].addMouseListener(this);
				}
				if (j == 0) {
					buttons[i][j].setForeground(Color.red);
				}
				centerPanel.add(buttons[i][j]);
			}
		}
		for(int i = 0; i < 24; i++){
			if(i < 10)
				hourBox.addItem("0" + i + "时");
			else
				hourBox.addItem(i + "时");
		}
		for(int i = 0; i < 60; i++){
			if(i < 10)
				minBox.addItem("0" + i + "分");
			else
				minBox.addItem(i + "分");
		}
		for(int i = 0; i < 60; i++){
			if(i < 10)
				secBox.addItem("0" + i + "秒");
			else
				secBox.addItem(i + "秒");
		}
		JPanel southPanel = new JPanel();
		southPanel.setLayout(new GridLayout(1, 0, 0, 0));
		southPanel.add(hourBox);
		southPanel.add(minBox);
		southPanel.add(secBox);
		setDate();
		yearBox.addItemListener(new ItemListener() {

			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == 2) {
					return;
				}
				String yy = e.getItem().toString();
				int yi = Integer.parseInt(yy.substring(0, yy.length() - 1));
				cd.set(Calendar.YEAR, yi);
				setDate();
			}

		});
		monthBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == 2) {
					return;
				}
				String yy = e.getItem().toString();
				int yi = Integer.parseInt(yy.substring(0, yy.length() - 1));
				cd.set(Calendar.MONTH, yi - 1);
				setDate();
			}

		});
		hourBox.addItemListener(new ItemListener() {
			@SuppressWarnings("static-access")
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == 2) {
					return;
				}
				String yy = e.getItem().toString();
				int yi = Integer.parseInt(yy.substring(0, yy.length() - 1));
				cd.set(Calendar.HOUR_OF_DAY, yi);
			}

		});
		minBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == 2) {
					return;
				}
				String yy = e.getItem().toString();
				int yi = Integer.parseInt(yy.substring(0, yy.length() - 1));
				cd.set(Calendar.MINUTE, yi);
				setDate();
			}

		});
		secBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == 2) {
					return;
				}
				String yy = e.getItem().toString();
				int yi = Integer.parseInt(yy.substring(0, yy.length() - 1));
				cd.set(Calendar.SECOND, yi);
				setDate();
			}

		});
		
		jp.add(northPanel, BorderLayout.NORTH);
		jp.add(southPanel, BorderLayout.SOUTH);
		jp.add(centerPanel, BorderLayout.CENTER);
		jf.setSize(370, 220);
		jf.setVisible(true);
	}

	public void mousePressed(MouseEvent e) {

		if (e.getClickCount() == 1) {
			buttons[curX][curY].setBackground(Color.white);
			for (int i = 1; i < 7; i++) {
				for (int j = 0; j < 7; j++) {
					if (buttons[i][j].getText().equals("")) {
						continue;
					}
					if (buttons[i][j].equals(e.getSource())) {
						curX = i;
						curY = j;
						buttons[curX][curY].setBackground(Color.MAGENTA);
					}
				}
			}
		} else {
			String d;
			if(Integer.parseInt(buttons[curX][curY].getText()) < 10)
				d = "0" + buttons[curX][curY].getText();
			else
				d = buttons[curX][curY].getText();
			String ds = yearBox.getSelectedItem().toString()
					+ monthBox.getSelectedItem().toString()
					+ d
					+ " "
					+ hourBox.getSelectedItem().toString()
					+ minBox.getSelectedItem().toString()
					+ secBox.getSelectedItem().toString();
			ds = ds.replaceAll("年|月", "-");
			ds = ds.replaceAll("时|分", ":");
			ds = ds.replaceAll("秒", "");
			dateText.setText(ds);
			jf.dispose();
		}
	}

	public void setDate() {
		for (int i = 1; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				buttons[i][j].setText("");
				buttons[i][j].setBackground(Color.white);
				buttons[i][j].setEnabled(false);
			}
		}
		int year = cd.get(Calendar.YEAR);
		int month = cd.get(Calendar.MONTH) + 1;
		int day = cd.get(Calendar.DAY_OF_MONTH);
		int hour = cd.get(Calendar.HOUR_OF_DAY);
		int minute = cd.get(Calendar.MINUTE);
		int second = cd.get(Calendar.SECOND);
		curX = cd.get(Calendar.WEEK_OF_MONTH);
		curY = cd.get(Calendar.DAY_OF_WEEK) - 1;
		buttons[curX][curY].setBackground(Color.MAGENTA);
		yearBox.setSelectedItem(year + "年");
		monthBox.setSelectedItem((month > 10 ? month : "0" + month) + "月");
		hourBox.setSelectedItem((hour > 10 ? hour : "0" + hour) + "时");
		minBox.setSelectedItem((minute > 10 ? minute : "0" + minute) + "分");
		secBox.setSelectedItem((second > 10 ? second : "0" + second) + "秒");
		cd.set(Calendar.DAY_OF_MONTH, 1);
		int week = cd.get(Calendar.DAY_OF_WEEK);
		int maxDay = cd.getActualMaximum(Calendar.DAY_OF_MONTH);
		int k = 0;
		int dm = 1;
		for (int i = 1; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				k++;
				if (k >= week && k < maxDay + week) {
					buttons[i][j].setText(dm++ + "");
					buttons[i][j].setEnabled(true);
				}
			}
		}
		cd.set(Calendar.DAY_OF_MONTH, day);
	}
}