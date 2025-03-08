public class GenComplexNum {
	
	private double real, imaginary;
	
	public GenComplexNum() {
		this.real=0;
		this.imaginary=0;
	}
	public GenComplexNum(double real, double imaginary) {
		this.real=real;
		this.imaginary=imaginary;
	}
	public GenComplexNum(ExpComplexNum exp) {
		double r=exp.getR();
		double th=exp.getTheta();
		
		this.real=r*Math.cos(th);
		this.imaginary=r*Math.sin(th);
	}
	public GenComplexNum(PolComplexNum pol) {
		double r=pol.getR();
		double th=pol.getTheta();
		
		this.real=r*Math.cos(th);
		this.imaginary=r*Math.sin(th);
	}
	
	double getReal() {
		return real;
	}
	double getImaginary() {
		return imaginary;
	}
	
	public String toString() {
		real=Double.parseDouble(String.format("%.2f", real));
		imaginary=Double.parseDouble(String.format("%.2f", imaginary));
		return "("+real+")+("+imaginary+")i";
	}
	
}
