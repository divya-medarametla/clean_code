package epam4_divya;

public class Construct {
public Construction_Abstract materials(String material)
{
	if(material.equalsIgnoreCase("Standard")) {
		return new Standard();
	}
	else if(material.equalsIgnoreCase("AboveStandard"))
	{
		return new Abovestandard();
	}
	else if(material.equalsIgnoreCase("HighStandards"))
	{
		return new Highstandards();
	}
	else if(material.equalsIgnoreCase("ExcellentStandard"))
	{
		return new Excellentstandard();
	}
	return null;
}
}