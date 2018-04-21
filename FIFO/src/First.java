
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class First extends JFrame implements ActionListener {
	JLabel sn1,sn2,sn3,sn4,sn5,msg ;
	JButton b1,b2;
	JTextField t1,t2,t3;
	
	First(String string){
		super(string);
		// TODO Auto-generated constructor stub
				
				setLayout(null);
				
				sn1=new JLabel("FirstNo");
				sn1.setBounds(50, 50, 100, 30);
				add(sn1);
				
				
				t1=new JTextField();
				t1.setBounds(180, 50, 100, 30);
				add(t1);
				
				
				
				sn2=new JLabel("SecondNo");
				sn2.setBounds(50, 100, 100, 30);
				add(sn2);
				
				
				t2=new JTextField();
				t2.setBounds(180, 100, 100, 30);
				add(t2);
				
				sn2=new JLabel("ThirdNo");
				sn2.setBounds(50, 140, 100, 30);
				add(sn2);
				
				
				t3=new JTextField();
				t3.setBounds(180, 140, 100, 30);
				add(t3);
				

				b1=new JButton("Submit");
				b1.setBounds(150, 200, 80, 50);
				add(b1);
				b1.addActionListener(this);
				
				setVisible(true);
				setSize(600, 600);
				setLayout(null);

				addWindowListener(new WindowAdapter() {
					 public void windowClosing(WindowEvent we)
					 {
						 System.exit(0);
					 }
				});
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s=(String)e.getActionCommand();
		if(s=="Submit"){
			String s1=t1.getText();
			String s2=t2.getText();
			String s3=t3.getText();
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/firstout","root","");
			java.sql.Statement st=con.createStatement();
			
			String sql="select * from firstin WHERE id = (SELECT MAX(id) FROM TABLE)";
			ResultSet rs=st.executeQuery(sql);
			while(rs.next()){
			int i1=rs.getInt(1);
			int i2=rs.getInt(2);
			int i3=rs.getInt(3);
			
			String sql1="insert into firstin(firstno,secondno,thirdno) values('"+s1+"','"+s2+"','"+s3+"')";
			int i=st.executeUpdate(sql1);
			if(i>0){
				System.out.println("Sucessfully Added");
			}
			else{
				System.out.println("Insert Again");
			}
			}
			}catch (Exception e1) {
				// TODO: handle exception
				System.out.println(e1);
			}
			}
		}
		
	
	public static void main(String[] args) {
		First ft=new First("First");
		ft.setSize(600,600);
		ft.setVisible(true);
	}
}
