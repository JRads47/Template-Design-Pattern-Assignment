//Template Design Pattern Assignment by Jay-Rads Villanueva
public class House 
{
	public House()
	{		
	}
	public void prepFoundation()
	{
		System.out.println("Foundation: Adding a crawlspace, and a strong backbone.");
	}
	public void installDrywall()
	{
		System.out.println("Drywall: Creating the interior walls.");
	}
	public void addWindows()
	{
		System.out.println("Windows: Putting in the glass for the windows.");
	}
	public void addElectrical()
	{
		System.out.println("Electrical: Running all the wires and hooking up the power.");
	}
	public void addPlumbing()
	{
		System.out.println("Plumbing: Letting water run through the house.");
	}
	public void createFrame()
	{
		System.out.println("Framing: Adding the walls.");
	}
	public void buildHouse()
	{
		this.prepFoundation();
		this.createFrame();
		this.installDrywall();
		this.addWindows();
		this.addElectrical();
		this.addPlumbing();
	}
}
