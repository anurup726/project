package MavenProject.ProjectMaven;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       
        Paypal p=new Paypal();
        p.validate();
        p.processPayment(2000.00);
        CreditCard c=new CreditCard();
        c.validate();
        c.processPayment(1000.00);
    }
}
