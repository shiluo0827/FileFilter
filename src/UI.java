import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.zip.ZipOutputStream;

/*
 * UI.java
 *
 * Created on __DATE__, __TIME__
 */

/**
 * 
 * @author __USER__
 */
public class UI extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** Creates new form UI */
	public UI() {
		initComponents();
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();
		jPanel2 = new javax.swing.JPanel();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTextArea2 = new javax.swing.JTextArea();
		jPanel3 = new javax.swing.JPanel();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jTextField2 = new javax.swing.JTextField();
		jTextField3 = new javax.swing.JTextField();
		jTextField4 = new javax.swing.JTextField();
		jButton3 = new javax.swing.JButton();
		jButton4 = new javax.swing.JButton();
		jButton5 = new javax.swing.JButton();
		jButton6 = new javax.swing.JButton();
		jButton7 = new javax.swing.JButton();
		jButton8 = new javax.swing.JButton();
		jButton9 = new javax.swing.JButton();
		jPanel4 = new javax.swing.JPanel();
		jProgressBar1 = new javax.swing.JProgressBar();
		jProgressBar2 = new javax.swing.JProgressBar();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setBackground(new java.awt.Color(204, 204, 204));
		setName("UIMainFrame");

		jPanel1.setBackground(java.awt.SystemColor.controlHighlight);
		jPanel1.setBorder(javax.swing.BorderFactory
				.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		jTextArea1.setColumns(20);
		jTextArea1.setRows(5);
		jTextArea1.setEnabled(false);
		jTextArea1.setSelectionColor(new java.awt.Color(102, 102, 102));
		jScrollPane1.setViewportView(jTextArea1);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				jPanel1Layout.createSequentialGroup().addContainerGap()
						.addComponent(jScrollPane1,
								javax.swing.GroupLayout.DEFAULT_SIZE, 269,
								Short.MAX_VALUE).addContainerGap()));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				jPanel1Layout.createSequentialGroup().addContainerGap()
						.addComponent(jScrollPane1,
								javax.swing.GroupLayout.DEFAULT_SIZE, 368,
								Short.MAX_VALUE).addContainerGap()));

		jPanel2.setBackground(java.awt.SystemColor.controlHighlight);
		jPanel2.setBorder(javax.swing.BorderFactory
				.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		jTextArea2.setColumns(20);
		jTextArea2.setRows(5);
		jTextArea2.setEnabled(false);
		jTextArea2.setSelectionColor(new java.awt.Color(102, 102, 102));
		jScrollPane2.setViewportView(jTextArea2);

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel2Layout.createSequentialGroup().addContainerGap()
						.addComponent(jScrollPane2,
								javax.swing.GroupLayout.DEFAULT_SIZE, 298,
								Short.MAX_VALUE).addContainerGap()));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel2Layout.createSequentialGroup().addContainerGap()
						.addComponent(jScrollPane2,
								javax.swing.GroupLayout.DEFAULT_SIZE, 368,
								Short.MAX_VALUE).addContainerGap()));

		jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

		jButton1.setText("Scan Files");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jButton2.setText("Copy Files");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jLabel5.setText("SourcePath:");

		jLabel6.setText("ObjectPath:");

		jLabel7.setText("StartTime:");

		jLabel8.setText("EndTime:");

		jTextField3.setText("0");

		jTextField4.setText("0");

		jButton3.setText("Clean All");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		jButton4.setText("Load");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
			}
		});

		jButton5.setText("Load");
		jButton5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton5ActionPerformed(evt);
			}
		});

		jButton6.setText("Set");
		jButton6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton6ActionPerformed(evt);
			}
		});

		jButton7.setText("Set");
		jButton7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton7ActionPerformed(evt);
			}
		});

		jButton8.setText("DoZip");
		jButton8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton8ActionPerformed(evt);
			}
		});

		jButton9.setText("UnZip");
		jButton9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton9ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout
				.setHorizontalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addGap(24, 24, 24)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel3Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel6)
																		.addGap(
																				103,
																				103,
																				103)
																		.addComponent(
																				jButton5,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				67,
																				Short.MAX_VALUE))
														.addGroup(
																jPanel3Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel5)
																		.addGap(
																				101,
																				101,
																				101)
																		.addComponent(
																				jButton4,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE))
														.addGroup(
																jPanel3Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel3Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																						.addComponent(
																								jButton8,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jButton9,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				78,
																				Short.MAX_VALUE)
																		.addGroup(
																				jPanel3Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								false)
																						.addComponent(
																								jButton1,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jButton2,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)
																						.addComponent(
																								jButton3,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)))
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																236,
																Short.MAX_VALUE)
														.addComponent(
																jTextField2,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																236,
																Short.MAX_VALUE)
														.addComponent(
																jTextField3,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																236,
																Short.MAX_VALUE)
														.addGroup(
																jPanel3Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel8)
																		.addGap(
																				126,
																				126,
																				126)
																		.addComponent(
																				jButton7,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				57,
																				Short.MAX_VALUE))
														.addComponent(
																jTextField4,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																236,
																Short.MAX_VALUE)
														.addGroup(
																jPanel3Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel7)
																		.addGap(
																				121,
																				121,
																				121)
																		.addComponent(
																				jButton6,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				57,
																				Short.MAX_VALUE)))
										.addContainerGap()));
		jPanel3Layout
				.setVerticalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel5,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																17,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jButton4))
										.addGap(6, 6, 6)
										.addComponent(
												jTextField1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel6,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																17,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jButton5))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jTextField2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel7,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																17,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jButton6))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jTextField3,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabel8,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																17,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jButton7))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jTextField4,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(76, 76, 76)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton1)
														.addComponent(jButton8))
										.addGap(27, 27, 27)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton2)
														.addComponent(jButton9))
										.addGap(31, 31, 31)
										.addComponent(jButton3)
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		jPanel4.setBackground(java.awt.SystemColor.controlHighlight);
		jPanel4.setBorder(javax.swing.BorderFactory
				.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

		jProgressBar1.setForeground(new java.awt.Color(0, 0, 0));

		jProgressBar2.setForeground(new java.awt.Color(0, 0, 0));

		jLabel1.setText("Current File :");

		jLabel2.setText("All Files :");

		jLabel3.setText("0%");

		jLabel4.setText("0%");

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(
				jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout
				.setHorizontalGroup(jPanel4Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel4Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(jLabel2,
																0, 0,
																Short.MAX_VALUE)
														.addComponent(
																jLabel1,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
										.addGap(27, 27, 27)
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(
																jProgressBar2,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE)
														.addComponent(
																jProgressBar1,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																479,
																Short.MAX_VALUE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jLabel4)
														.addComponent(jLabel3))
										.addContainerGap()));
		jPanel4Layout
				.setVerticalGroup(jPanel4Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel4Layout
										.createSequentialGroup()
										.addGap(17, 17, 17)
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jLabel3)
														.addComponent(jLabel1)
														.addComponent(
																jProgressBar1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jLabel4)
														.addComponent(
																jProgressBar2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel2))
										.addContainerGap()));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout
				.setHorizontalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addComponent(
																				jPanel1,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jPanel2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addComponent(
																jPanel4,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																Short.MAX_VALUE))
										.addGap(16, 16, 16)
										.addComponent(
												jPanel3,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap()));
		layout
				.setVerticalGroup(layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								layout
										.createSequentialGroup()
										.addGap(20, 20, 20)
										.addGroup(
												layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(
																jPanel3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGroup(
																layout
																		.createSequentialGroup()
																		.addGroup(
																				layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addComponent(
																								jPanel2,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jPanel1,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.PREFERRED_SIZE))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jPanel4,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	ArrayList<?> files = null;
	String formatType = "yyyy-MM-dd HH:mm:ss";

	private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				if (null != jTextField2.getText()
						&& 0 < jTextField2.getText().length()
						&& null != jTextField1.getText()
						&& 0 < jTextField1.getText().length()) {
					String np = jTextField2.getText();
					if (np.length() - 1 != np.lastIndexOf("\\")) {
						np = np + "\\";
					}
					String name = jTextField1.getText();
					if (name.length() - 1 == name.lastIndexOf("\\")) {
						name = name.substring(0, name.lastIndexOf("\\"));
						name = name.substring(name.lastIndexOf("\\") + 1);
					} else {
						name = name.substring(name.lastIndexOf("\\") + 1);
					}
					String zpath = jTextField1.getText();
					zpath = zpath.substring(zpath.indexOf("\\") + 1);
					if (zpath.length() - 1 == zpath.lastIndexOf("\\")) {
						zpath = zpath.substring(0, zpath.lastIndexOf("\\"));
					}
					String path = np
							+ jTextField1.getText().substring(
									jTextField1.getText().indexOf("\\") + 1);
					File fl = new File(path);
					DoZip doz = null;
					try {
						FileOutputStream fout = new FileOutputStream(np + name
								+ ".zip");
						ZipOutputStream zout = new ZipOutputStream(fout);
						doz.doZip(zout, fl, zpath);
						if (zout != null)
							zout.close();
						if (fout != null)
							fout.close();
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					jTextArea2.append("file is not exist!/n/n");
				}
			}
		});
	}
	
	@SuppressWarnings("static-access")
	private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				if (null != jTextField2.getText()
						&& 0 < jTextField2.getText().length()
						&& null != jTextField1.getText()
						&& 0 < jTextField1.getText().length()) {
					String np = jTextField2.getText();
					if (np.length() - 1 != np.lastIndexOf("\\")) {
						np = np + "\\";
					}
					String name = jTextField1.getText();
					if (name.length() - 1 == name.lastIndexOf("\\")) {
						name = name.substring(0, name.lastIndexOf("\\"));
						name = name.substring(name.lastIndexOf("\\") + 1);
					} else {
						name = name.substring(name.lastIndexOf("\\") + 1);
					}
					String zpath = jTextField1.getText();
					zpath = zpath.substring(zpath.indexOf("\\") + 1);
					if (zpath.length() - 1 == zpath.lastIndexOf("\\")) {
						zpath = zpath.substring(0, zpath.lastIndexOf("\\"));
					}
					String path = np
							+ jTextField1.getText().substring(
									jTextField1.getText().indexOf("\\") + 1);
					File fl = new File(path);
					DoZip doz = null;
					try {
						FileOutputStream fout = new FileOutputStream(np + name
								+ ".zip");
						ZipOutputStream zout = new ZipOutputStream(fout);
						doz.doZip(zout, fl, zpath);
						if (zout != null)
							zout.close();
						if (fout != null)
							fout.close();
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					jTextArea2.append("file is not exist!/n/n");
				}
			}
		});
	}

	private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
		new DateUI(jTextField4);
	}

	private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
		new DateUI(jTextField3);
	}

	private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
		new SetPath(jTextField2);
	}

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		new SetPath(jTextField1);
	}

	@SuppressWarnings("static-access")
	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				String sourcePath = jTextField1.getText();
				long startTime = 0;
				long endTime = 0;
				int level = 0;
				files = null;
				ScanFile sf = new ScanFile();
				try {
					if (new TimeTrans().checkDateTime(jTextField3.getText())) {
						startTime = new TimeTrans().stringToLong(jTextField3
								.getText(), formatType);
					} else {
						startTime = 0;
					}
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					if (new TimeTrans().checkDateTime(jTextField4.getText())) {
						endTime = new TimeTrans().stringToLong(jTextField4
								.getText(), formatType);
					} else {
						endTime = 0;
					}
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				files = sf.listAll(sourcePath, level, startTime, endTime);
				// System.out.println(files.size());
				if (null != files) {
					if (files.size() > 0) {
						for (Object file : files) {
							try {
								jTextArea1.append("  "
										+ file.toString()
										+ "\t"
										+ new TimeTrans().longToString(
												new File(file.toString())
														.lastModified(),
												formatType) + "\t"
										+ new File(file.toString()).length()
										+ "B  \n");
							} catch (ParseException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
						jTextArea1
								.append("  ----------------------------------------------\n");
					} else {
						jTextArea1
								.append("  Can not find any file or dir.\n\n");
					}
				} else {
					jTextArea1.append("  Can not find any file or dir.\n\n");
				}
			}
		});
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			@SuppressWarnings("static-access")
			public void run() {
				CopyFile cf = new CopyFile();
				if (null != files && 0 < files.size()) {
					for (int i = 0; i < files.size(); i++) {
						String path = files.get(i).toString();
						String np = jTextField2.getText();
						if (np.length() - 1 != np.lastIndexOf("\\")) {
							np = np + "\\";
						}
						String rp = np + path.substring(path.indexOf("\\") + 1);
						cf.copyFile(path, rp);
						try {
							jTextArea2.append("  "
									+ rp
									+ "\t"
									+ new TimeTrans().longToString(new File(rp)
											.lastModified(), formatType) + "\t"
									+ new File(rp).length() + "B OK!\n");
						} catch (ParseException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					jTextArea2
							.append("  ----------------------------------------------\n");
				} else {
					jTextArea2.append("There is not any file.\n\n");
				}
			}
		});
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		jTextArea1.setText("");
		jTextArea2.setText("");
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new UI().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JButton jButton5;
	private javax.swing.JButton jButton6;
	private javax.swing.JButton jButton7;
	private javax.swing.JButton jButton8;
	private javax.swing.JButton jButton9;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JProgressBar jProgressBar1;
	private javax.swing.JProgressBar jProgressBar2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTextArea jTextArea1;
	private javax.swing.JTextArea jTextArea2;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	// End of variables declaration//GEN-END:variables

}