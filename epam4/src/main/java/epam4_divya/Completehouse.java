package epam4_divya;

public class Completehouse {
public double construct(String material,double area)
{
	Construct con=new Construct();
	Construction_Abstract ca=con.materials(material);
	double amount=ca.getAmount();
	double bill=ca.Bill(amount,area);
    return bill;
	
}
}