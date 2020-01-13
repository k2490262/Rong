package com.bit.exam01;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class StudentTest extends JFrame {
	int idx;
	JTextField jtf_name;
	JTextField jtf_kor;
	JTextField jtf_eng;
	JTextField jtf_math;

	JTable table;
	Vector<Vector<String>> rowData;

	public void listStudent() {
		rowData.clear();

		String sql = "select * from student";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "c##bit", "bit");
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Vector<String> v = new Vector<String>();
				v.add(rs.getString(1));
				v.add(rs.getInt(2) + "");
				v.add(rs.getInt(3) + "");
				v.add(rs.getInt(4) + "");
				rowData.add(v);
			}

			table.updateUI();

		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public StudentTest() {
		jtf_name = new JTextField();
		jtf_kor = new JTextField();
		jtf_eng = new JTextField();
		jtf_math = new JTextField();

		Vector<String> colNames = new Vector<String>();
		colNames.add("�̸�");
		colNames.add("����");
		colNames.add("����");
		colNames.add("����");

		rowData = new Vector<Vector<String>>();
		table = new JTable(rowData, colNames);
		JScrollPane jsp = new JScrollPane(table);

		table.addMouseListener(new MouseListener() {
			public void mouseReleased(MouseEvent e) {
				idx = table.getSelectedRow();
				Vector<String> v = rowData.get(idx);
				jtf_name.setText(v.get(0));
				jtf_kor.setText(v.get(1));
				jtf_eng.setText(v.get(2));
				jtf_math.setText(v.get(3));
			}

			public void mousePressed(MouseEvent e) {
			}

			public void mouseExited(MouseEvent e) {
			}

			public void mouseEntered(MouseEvent e) {
			}

			public void mouseClicked(MouseEvent e) {
			}
		});

		JPanel p_up = new JPanel();
		JPanel p_btn = new JPanel();
		p_up.setLayout(new GridLayout(4, 2));

		p_up.add(new JLabel("�̸�"));
		p_up.add(jtf_name);
		p_up.add(new JLabel("����"));
		p_up.add(jtf_kor);
		p_up.add(new JLabel("����"));
		p_up.add(jtf_eng);
		p_up.add(new JLabel("����"));
		p_up.add(jtf_math);

		JButton btn_Add = new JButton("�߰�");
		p_btn.add(btn_Add);

		JButton btn_list = new JButton("�л����");
		p_btn.add(btn_list);

		JButton btn_update = new JButton("����");
		p_btn.add(btn_update);

		JButton btn_delete = new JButton("����");
		p_btn.add(btn_delete);

		btn_delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = jtf_name.getText();
				String sql = "delete student where name = '" + name + "'";
				Connection conn = null;
				Statement stmt = null;

				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "c##bit", "bit");
					stmt = conn.createStatement();
					int re = stmt.executeUpdate(sql); // db ��ü�� ������ �ִ� ��ɾ ������ �� execute�� ����Ѵ�.

					if (re > 0) {
						JOptionPane.showMessageDialog(null, "�л��� ������ �����Ͽ����ϴ�.");
					}

					listStudent();
				} catch (Exception ex) {
					System.out.println(ex.getMessage());
				} finally {
					try {
						if (stmt != null) {
							stmt.close();
						}
					} catch (Exception ex2) {
						System.out.println(ex2.getMessage());
					}

					if (conn != null) {
						try {
							conn.close();
						} catch (Exception ex2) {
							System.out.println(ex2.getMessage());
						}
					}
				}

				listStudent();
			}
		});

		btn_update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = jtf_name.getText();
				int kor = Integer.parseInt(jtf_kor.getText());
				int eng = Integer.parseInt(jtf_eng.getText());
				int math = Integer.parseInt(jtf_math.getText());

				try {
					String sql = "update student set kor = " + kor + ", eng = " + eng + ", math = " + math
							+ "where name = '" + name + "'";

					// 1. jdbc ����̹��� �޸𸮷� �ε��Ѵ�.
					Class.forName("oracle.jdbc.driver.OracleDriver");

					// 2. db Server�� �����Ѵ�.
					Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "c##bit",
							"bit");

					// 3. �����ͺ��̽� ��ɾ� ������ ���� Statement ��ü�� �����Ѵ�.
					Statement stmt = conn.createStatement();

					// 4. �����ͺ��̽� ����� �����Ѵ�.
					// executeUpdate insert, update, delete
					// executeQuery select
					stmt.executeUpdate(sql);
					JOptionPane.showMessageDialog(null, "�л��� ������ �����Ͽ����ϴ�.");
					stmt.close();
					conn.close();

					listStudent();
				} catch (Exception ex) {

				}
			}
		});

		btn_list.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listStudent();
			}
		});

		btn_Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = jtf_name.getText();
				int kor = Integer.parseInt(jtf_kor.getText());
				int eng = Integer.parseInt(jtf_eng.getText());
				int math = Integer.parseInt(jtf_math.getText());
				String sql = "insert into student values('" + name + "', " + kor + ", " + eng + ", " + math + ")";
				System.out.println(sql);

				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "c##bit",
							"bit");
					Statement stmt = conn.createStatement();
					stmt.executeUpdate(sql);
					JOptionPane.showMessageDialog(null, "�л��� ������ ����Ͽ����ϴ�.");
					stmt.close();
					conn.close();
				} catch (Exception ex) {
					System.out.println(ex.getMessage());
				}

				listStudent();
			}
		});

		JPanel p_input = new JPanel();
		p_input.setLayout(new BorderLayout());

		p_input.add(p_up, BorderLayout.CENTER);
		p_input.add(p_btn, BorderLayout.SOUTH);

		add(p_input, BorderLayout.NORTH);
		add(jsp, BorderLayout.CENTER);

		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new StudentTest();
	}
}
