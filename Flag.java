import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;


public class Flag {
	public static void draw(Graphics g)
	{  
		g.setColor(Color.WHITE);
		// g.fillRect(x, y, width, height)
		g.fillRect(0, 0, 500, 300)
		g.setColor(Color.RED);
		// g.fillOval(x, y, width, height)
		g.fillOval(166, 100, 168, 100) // 500 / 3 = 166.67, 300 / 3 = 100
	/* public static void draw(Graphics g)
	{  
		final int width = 20;
		g.setColor(Color.BLUE);

		// Top row. Note that the top left corner of the drawing has coordinates 
		// (0, 0)
		int x = 0;
		int y = 0;
		for (int i = 0; i < 10; i++)
		{
			g.fillRect(x, y, width, width);
			x = x + 2 * width;
		}
		// Second row, offset from the first one
		x = width;
		y = width;
		for (int i = 0; i < 10; i++)
		{
			g.fillRect(x, y, width, width);
			x = x + 2 * width;
		}
	} */
	}

	public static void main(String[] args) 
	{
		final int FRAME_WIDTH = 800;
		final int FRAME_HEIGHT = 600;

		JFrame frame = new JFrame();
		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JComponent component = new JComponent()
		{
			public void paintComponent(Graphics graph)
			{
				draw(graph);
			}
		};

		frame.add(component);
		frame.setVisible(true);
	}   
}
