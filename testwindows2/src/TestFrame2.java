import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

import java.awt.Panel;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import java.util.*;

public class TestFrame2 extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldx1;
	private JTextField textFieldy1;
	MyPanel panel;
	
	ArrayList<Integer> xlist;
	ArrayList<Integer> ylist;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestFrame2 frame = new TestFrame2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TestFrame2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		xlist = new ArrayList<Integer>();
		ylist = new ArrayList<Integer>();
		
		
		
		
		textFieldx1 = new JTextField();
		textFieldx1.setColumns(10);
		
		textFieldy1 = new JTextField();
		textFieldy1.setColumns(10);
		
		panel = new MyPanel();
		
		
		JButton buttonDrawPt = new JButton("Draw a point!");
		buttonDrawPt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//JOptionPane.showMessageDialog(null,"WOOOO" + textFieldx1.getText());
				xlist.add(Integer.parseInt(textFieldx1.getText()));
				ylist.add(Integer.parseInt(textFieldy1.getText()));
				
				//x = Integer.parseInt(textFieldx1.getText());
				panel.repaint();
			
			}
		});
		
		JButton buttonDrawLn = new JButton("Draw a line!");
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 272, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(buttonDrawPt, Alignment.TRAILING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(textFieldx1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textFieldy1, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
							.addGap(6))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(buttonDrawPt)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(textFieldx1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textFieldy1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(11)
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(82, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		
		
	}
	
	
	class MyPanel extends JPanel {
		public MyPanel() {
	        setBorder(BorderFactory.createLineBorder(Color.black));
	    }

	    public Dimension getPreferredSize() {
	        return new Dimension(250,200);
	    }

	    public void paintComponent(Graphics g) {
	        super.paintComponent(g);       

	        // Draw Text
	        //g.drawLine(0, 0, 100, 100);
	        //g.drawString("This is my custom Panel!",10,20);
	        for(int i = 0; i < xlist.size(); i++)
	        {
	        	g.setColor(Color.BLUE);
	        	g.drawRect(xlist.get(i), ylist.get(i), 0, 0);
	        	
	        }
	    }  
	}
	
}
