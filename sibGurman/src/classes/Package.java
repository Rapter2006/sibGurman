package classes;

public class Package {
    private int number;
    private double weight;
    private String packageType;
    
    private void initPackage(int number, double weight, String packageType)
    {
    	this.number = number;
    	this.weight = weight;
    	this.packageType = packageType;
    }
    
    public Package() {
		initPackage(0, 0, "");
	}
    
    public Package(int number, double weight, String packageType) {
		initPackage(number, weight, packageType);
	}
    
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getPackageType() {
		return packageType;
	}
	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}
}
