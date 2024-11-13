package MavenProject.ProjectMaven;

public abstract class Credit2 implements MyCard{
	public void validate()
	{
		System.out.println("Credit2: validating otp of paypal");
		
	}
	public abstract void processPayment(double amount);

}
