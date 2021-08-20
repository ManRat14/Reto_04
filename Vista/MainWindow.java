package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.sql.SQLException;

import javax.swing.JFrame;

public class MainWindow extends JFrame  {
	
	public MainWindow () throws SQLException{
		
		
		setLayout(new BorderLayout());
		add(new Requerimiento1().getTable(), BorderLayout.WEST);
		add(new Requerimiento2().getTable(), BorderLayout.CENTER);
		add(new Requerimiento3().getTable(), BorderLayout.EAST);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setExtendedState(MAXIMIZED_BOTH);
	    setMinimumSize(new Dimension(800,600));
	    setLocationRelativeTo(null);
	    setVisible(true);
	    
	    setBackground(Color.MAGENTA);
	    
		
	}
	
	
	

}
