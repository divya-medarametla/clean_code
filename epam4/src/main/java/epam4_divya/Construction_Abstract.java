package epam4_divya;

public abstract class Construction_Abstract {
double amount;
public abstract double getAmount();

public double Bill(double amount,double area){  
    return (amount*area);  
}
}