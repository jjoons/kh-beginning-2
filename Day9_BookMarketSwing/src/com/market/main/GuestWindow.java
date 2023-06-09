package com.market.main;

import javax.swing.*;
import java.awt.*;

public class GuestWindow extends JFrame {
  public static final String SHOP_IMAGE_PATH = "./images/shop.png";
  public static final String USER_IMAGE_PATH = "images/user.png";

  // 프레임 창의 기본 설정은 생성자 안에서 설정
  public GuestWindow(String title, int x, int y, int width, int height) {
    this.initContainer(title, x, y, width, height);

    this.setVisible(true);
    this.setResizable(true); // 창 크기 조절 여부
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setIconImage(new ImageIcon(SHOP_IMAGE_PATH).getImage());
  }

  // 컴포넌트 (버튼, 텍스트 필드, 라벨, 이미지)
  public void initContainer(String title, int x, int y, int width, int height) {
    this.setTitle(title);
    this.setBounds(x, y, width, height); // 프레임 크기, 위치 설정
    this.setLayout(null); // 프레임 미설정 (배치)

    // 글꼴 설정
    Font font = new Font("함초롬돋움", Font.BOLD, 20);
    this.setFont(font);

    // 너비와 높이를 필드로 가지고 있는 클래스
    // Toolkit 클래스
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    this.setLocation(screenSize.width / 4, screenSize.height / 4);

    // 여러 컴포넌트를 올리는 보조 프레임 생성
    JPanel userPanel = new JPanel();
    userPanel.setBounds(0, 100, 1000, 260);

    // 아이콘 (고양이 가져와서 아이콘 객체 생성)
    // 상대 경로 .(점)으로 현재 폴더 (src)
    ImageIcon imageIcon = new ImageIcon(USER_IMAGE_PATH);

    // 가져온 이미지를 패널 크기와 맞도록 이미지 수정
    // 이미지 아이콘의 크기, 스타일을 지정하는 메소드 setImage()
    imageIcon.setImage(imageIcon.getImage().getScaledInstance(160, 160, Image.SCALE_SMOOTH));

    // 라벨
    JLabel userLabel = new JLabel(imageIcon);
    userPanel.add(userLabel);

    // userPanel.add() 추가
    // userPanel.add();

    // 보조 프레임을 메인 프레임에 붙인다
    this.add(userPanel);

    // 고객 정보를 입력하세요
    JPanel titlePanel = new JPanel();
    titlePanel.setBounds(0, 350, 1000, 50);
    this.add(titlePanel);

    JLabel titleLabel = new JLabel("--고객 정보를 입력하세요--");
    titleLabel.setFont(font);
    titleLabel.setForeground(Color.CYAN); // 글꼴 색상
    titlePanel.add(titleLabel);

    // 이름 : 입력받는 text 필드
    JPanel namePanel = new JPanel();
    namePanel.setBounds(0, 400, 1000, 50);
    this.add(namePanel);

    // 이름하고 text 객체 각각 생성해서 namePanel 추가
    JLabel nameLabel = new JLabel("이 름: ");
    nameLabel.setFont(font);
    namePanel.add(nameLabel);

    // 입력받는 텍스트 필드
    JTextField nameField = new JTextField(10);
    nameField.setFont(font);
    namePanel.add(nameField);

    // 연락처
    // 연락처 라벨 연락처 텍스트 필드 생성해서 phonePanel
    JPanel phonePanel = new JPanel();
    phonePanel.setBounds(0, 450, 1000, 50);
    this.add(phonePanel);

    JLabel phoneLabel = new JLabel("연 락 처: ");
    phoneLabel.setFont(font);
    phonePanel.add(phoneLabel);

    JTextField phoneTextField = new JTextField(10);
    // phoneTextField.setBounds(0, 400, 1000, 50);
    phoneTextField.setFont(font);
    phonePanel.add(phoneTextField);

    JPanel buttonPanel = new JPanel();
    buttonPanel.setBounds(0, 500, 1000, 50);
    this.add(buttonPanel);

    JLabel buttonLabel = new JLabel("쇼핑하기", new ImageIcon(SHOP_IMAGE_PATH), JLabel.LEFT);
    buttonLabel.setFont(font);
    JButton enterButton = new JButton();
    enterButton.add(buttonLabel);
    buttonPanel.add(enterButton);
  }

  public static void main(String[] args) {
    new GuestWindow("온라인서점", 0, 0, 1000, 750);
  }
}
