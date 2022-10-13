
public class myTurtle extends ExampleTurtle {
	
	ExampleTurtle et = new ExampleTurtle();
	
	public void draw() {
		forward(5);
		face(30);
		forward(2);
		face(45);
		forward(2);
		face(90);
		forward(5);
		back(5);
		forward(5);
		face(3);
		turn(30);
		
	}
}
