package MavenProject.ProjectMaven;

public abstract class Credit1 implements MyCard {
	
	
	public void validate()
	{
		System.out.println("Credit1: validating credit card");
	}
	public abstract void processPayment(double amount);
	
	

}
