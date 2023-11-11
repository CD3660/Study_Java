import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.BoxLayout;
import javax.swing.JSplitPane;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JPasswordField;

public class Swing1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField createCustomerInputId;
	private Connection conn;
	private final String DB_URL = "jdbc:oracle:thin:@118.40.91.135:1521:xe";
	private final String DB_USER = "BTEAM";
	private final String DB_PASSWORD = "BTEAM2";
	private JPasswordField createCustomerInputPw;
	private JTextField textField;
	private JPasswordField passwordField;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Swing1 frame = new Swing1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Swing1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 872, 765);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(625, 10, 219, 610);
		getContentPane().add(panel);
		panel.setLayout(new CardLayout(0, 0));

		CardLayout cards = new CardLayout(0, 0);
		JPanel panel_1 = new JPanel(cards);
		panel_1.setBounds(12, 10, 601, 610);
		getContentPane().add(panel_1);

		JPanel mainPage = new JPanel();
		panel_1.add(mainPage, "메인페이지");
		cards.show(panel_1, "메인페이지");
		mainPage.setLayout(null);

		JLabel lblNewLabel = new JLabel("쇼핑몰 프로그램");
		lblNewLabel.setBounds(12, 10, 577, 84);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 20));
		mainPage.add(lblNewLabel);

		

		JPanel loginPage = new JPanel();
		panel_1.add(loginPage, "로그인페이지");
		loginPage.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("로그인");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_2_1.setBounds(12, 10, 255, 57);
		loginPage.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("아이디");
		lblNewLabel_3_2.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel_3_2.setBounds(12, 94, 82, 33);
		loginPage.add(lblNewLabel_3_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(114, 94, 311, 33);
		loginPage.add(textField);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("비밀번호");
		lblNewLabel_3_1_1.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel_3_1_1.setBounds(12, 151, 82, 33);
		loginPage.add(lblNewLabel_3_1_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(114, 151, 311, 33);
		loginPage.add(passwordField);
		
		JButton createCustomerConfirm_1 = new JButton("입력");
		createCustomerConfirm_1.setBounds(298, 541, 127, 37);
		loginPage.add(createCustomerConfirm_1);
		
		JButton createCustomerCancle_1 = new JButton("취소");
		createCustomerCancle_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cards.show(panel_1, "메인페이지");
			}
		});
		createCustomerCancle_1.setBounds(437, 541, 127, 37);
		loginPage.add(createCustomerCancle_1);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(12, 630, 832, 86);
		getContentPane().add(panel_2);
		panel_2.setLayout(null);

		JLabel lblNewLabel_1 = new JLabel("로그인");
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(new Color(219, 218, 220));
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cards.show(panel_1, "로그인페이지");
			}
		});
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(12, 104, 266, 60);
		mainPage.add(lblNewLabel_1);
		
		
		
		JPanel createCustomer = new JPanel();
		panel_1.add(createCustomer, "회원가입");
		createCustomer.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("회원가입");
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(12, 10, 255, 57);
		createCustomer.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("회원가입");
		lblNewLabel_1_1.setOpaque(true);
		lblNewLabel_1_1.setBackground(new Color(219, 218, 220));
		lblNewLabel_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cards.show(panel_1, "회원가입");
			}
		});
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_1_1.setBounds(323, 104, 266, 60);
		mainPage.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_3 = new JLabel("아이디");
		lblNewLabel_3.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(12, 94, 82, 33);
		createCustomer.add(lblNewLabel_3);
		
		
		
		JButton createCustomerCancle = new JButton("취소");
		createCustomerCancle.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cards.show(panel_1, "메인페이지");
			}
		});
		createCustomerCancle.setBounds(437, 541, 127, 37);
		createCustomer.add(createCustomerCancle);
		
		createCustomerInputId = new JTextField();
		createCustomerInputId.setBounds(114, 94, 311, 33);
		createCustomer.add(createCustomerInputId);
		createCustomerInputId.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("비밀번호");
		lblNewLabel_3_1.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel_3_1.setBounds(12, 151, 82, 33);
		createCustomer.add(lblNewLabel_3_1);
		
		JButton createCustomerConfirm = new JButton("입력");
		createCustomerConfirm.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String id = createCustomerInputId.getText();
				String pw = createCustomerInputPw.getText();
				try {
					conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
					PreparedStatement ps = conn.prepareStatement("INSERT INTO customerdto (id, pw) VALUES ( ? , ? )");
					ps.setString(1, id);
					ps.setString(2, pw);
					int result = ps.executeUpdate();
					if (result == 1) {
						JOptionPane.showMessageDialog(new JFrame(), "회원가입이 완료되었습니다.");
						cards.show(panel_1, "메인페이지");
					} else {
						
					}
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(new JFrame(), "중복된 아이디로 인해 회원가입 실패");
				} finally {
					try {
						conn.close();
					} catch (SQLException e1) {
						
					}
				}
			}
		});
		createCustomerConfirm.setBounds(298, 541, 127, 37);
		createCustomer.add(createCustomerConfirm);
		
		createCustomerInputPw = new JPasswordField();
		createCustomerInputPw.setBounds(114, 151, 311, 33);
		createCustomer.add(createCustomerInputPw);
		
		JPanel userMenu = new JPanel();
		userMenu.setLayout(null);
		panel_1.add(userMenu, "유저 메뉴");
		
		JLabel lblNewLabel_2_2 = new JLabel("사용자 메뉴");
		lblNewLabel_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_2_2.setBounds(12, 10, 255, 57);
		userMenu.add(lblNewLabel_2_2);
		
		JLabel toEditCustomer = new JLabel("회원정보 수정");
		toEditCustomer.setOpaque(true);
		toEditCustomer.setHorizontalAlignment(SwingConstants.CENTER);
		toEditCustomer.setFont(new Font("굴림", Font.PLAIN, 20));
		toEditCustomer.setBackground(new Color(219, 218, 220));
		toEditCustomer.setBounds(12, 89, 266, 60);
		userMenu.add(toEditCustomer);
		
		JLabel toSearchItem = new JLabel("상품검색");
		toSearchItem.setOpaque(true);
		toSearchItem.setHorizontalAlignment(SwingConstants.CENTER);
		toSearchItem.setFont(new Font("굴림", Font.PLAIN, 20));
		toSearchItem.setBackground(new Color(219, 218, 220));
		toSearchItem.setBounds(323, 89, 266, 60);
		userMenu.add(toSearchItem);
		
		JLabel toAdminMenu = new JLabel("관리자 메뉴");
		toAdminMenu.setOpaque(true);
		toAdminMenu.setHorizontalAlignment(SwingConstants.CENTER);
		toAdminMenu.setFont(new Font("굴림", Font.PLAIN, 20));
		toAdminMenu.setBackground(new Color(219, 218, 220));
		toAdminMenu.setBounds(12, 182, 266, 60);
		userMenu.add(toAdminMenu);
		
		JLabel toCartMenu = new JLabel("장바구니");
		toCartMenu.setOpaque(true);
		toCartMenu.setHorizontalAlignment(SwingConstants.CENTER);
		toCartMenu.setFont(new Font("굴림", Font.PLAIN, 20));
		toCartMenu.setBackground(new Color(219, 218, 220));
		toCartMenu.setBounds(12, 270, 266, 60);
		userMenu.add(toCartMenu);
		
		JLabel toOrderList = new JLabel("구매내역");
		toOrderList.setOpaque(true);
		toOrderList.setHorizontalAlignment(SwingConstants.CENTER);
		toOrderList.setFont(new Font("굴림", Font.PLAIN, 20));
		toOrderList.setBackground(new Color(219, 218, 220));
		toOrderList.setBounds(323, 270, 266, 60);
		userMenu.add(toOrderList);
		
		JLabel toPurchaseItem = new JLabel("상품구매");
		toPurchaseItem.setOpaque(true);
		toPurchaseItem.setHorizontalAlignment(SwingConstants.CENTER);
		toPurchaseItem.setFont(new Font("굴림", Font.PLAIN, 20));
		toPurchaseItem.setBackground(new Color(219, 218, 220));
		toPurchaseItem.setBounds(323, 182, 266, 60);
		userMenu.add(toPurchaseItem);
		
		JButton logout = new JButton("로그아웃");
		logout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cards.show(panel_1, "메인페이지");
			}
		});
		logout.setBounds(462, 563, 127, 37);
		userMenu.add(logout);
		
		JPanel editCustomer = new JPanel();
		editCustomer.setLayout(null);
		panel_1.add(editCustomer, "회원정보 수정");
		
		toEditCustomer.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cards.show(editCustomer, "회원정보 수정");
			}
		});
		
		JLabel lblNewLabel_2_2_1 = new JLabel("사용자 정보 수정");
		lblNewLabel_2_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_2_1.setFont(new Font("굴림", Font.PLAIN, 20));
		lblNewLabel_2_2_1.setBounds(12, 10, 255, 57);
		editCustomer.add(lblNewLabel_2_2_1);
		
		JButton toUserMenu = new JButton("사용자 메뉴");
		toUserMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cards.show(userMenu, "유저 메뉴");
			}
		});
		toUserMenu.setBounds(462, 563, 127, 37);
		editCustomer.add(toUserMenu);
		
		JLabel displayCustomerInfo = new JLabel("New label");
		displayCustomerInfo.setBounds(12, 77, 577, 279);
		editCustomer.add(displayCustomerInfo);
	}
}
