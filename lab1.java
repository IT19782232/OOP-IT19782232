class lab2_Q1
{

public static void main(String args[])
{
	int miles,yards;
	double kilometers;
	miles=26;
	yards=385;
	kilometers=miles*1.609;
	System.out.println("26 miles = "+kilometers+"km");
	kilometers=yards/1760.0*1.609;
	System.out.println("385 yards = "+kilometers+"km");
}
}