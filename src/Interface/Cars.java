package Interface;

public class Cars implements IVehicle {

	public static void main(String[] args) {
IVehicle car=new Cars();
car.start();
//car.startCars()
	}
public void startCars() {
	System.out.println(" this is startcars method");
}
	@Override
	public void start() {
System.out.println("THis is overrdie method of interface");		
	}

	

}
