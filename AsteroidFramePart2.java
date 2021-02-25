package asteroidPackage;

//import frame, labels, images
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

//import action events action listener for inputs and a timer
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class AsteroidFramePart2 extends JFrame implements ActionListener {
	
	//new pictures to use
	JLabel background = new JLabel(new ImageIcon("images/hell.gif"));
	JLabel asteroid = new JLabel(new ImageIcon("images/assazaza6-min.png"));
	
	//new timer setup
	Timer gameTimer = new Timer(10, this);
	
	//integers to set x and y boundaries
	int dx = 5;
	int dy = -2;
	
	//call method
	public AsteroidFramePart2() {
		
		//size of window
		setSize(1920, 1080);
		setTitle("Lukas' Asteroid Game"); //title of window
		
		//disable layout
		background.setLayout(null);
		
		//set sizr and bounds
		asteroid.setBounds(200,100,500,500);
		background.add(asteroid); //ad asteroid to background
		
		//ad background photo
		add(background);
		
		//starts the timer
		gameTimer.start();
		
		//set window to be visible
		setVisible(true);
	}
	
	@Override
	//action event begins (movement0
	public void actionPerformed(ActionEvent event) {
		
		//set boundaries as to where the asteroid can go
		asteroid.setBounds(asteroid.getX() + dx, asteroid.getY() + dy, 500, 500);
		
		//set wall at left of window
		if (asteroid.getX() < 0)
			dx = -dx;
		
		//set wall at top of window
		if (asteroid.getY() < 0)
			dy = -dy;
		
		//set wall at max width - 500
		if (asteroid.getX() > this.getWidth() - 500)
			dx = -dx;
		
		//set wall at maximum height - 500
		if (asteroid.getY() > this.getHeight() - 500)
			dy = -dy;
		
	}

}
