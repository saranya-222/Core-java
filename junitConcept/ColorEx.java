package junitConcept;

public class ColorEx {
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public boolean checkColor()
	{
		if(color.equalsIgnoreCase("green")||color.equalsIgnoreCase("Red"))
			return true;
		else
		{
			return false;
		}
				
	}

}
