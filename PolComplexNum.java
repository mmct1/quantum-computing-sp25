public class PolComplexNum {
	
	private double r, theta;
	
	public PolComplexNum() {
		this.r=0;
		this.theta=0;
	}
	public PolComplexNum(double r, double theta) {
		this.r=r;
		this.theta=theta;
	}	
	public PolComplexNum(GenComplexNum gen) {
		double re=gen.getReal();
		double im=gen.getImaginary();
		
		this.r=Math.sqrt(re*re+im*im);
		this.theta=(re==0?0:Math.atan(im/re));
	}
	public PolComplexNum(ExpComplexNum exp) {
		this.r=exp.getR();
		this.theta=exp.getTheta();
	}
	
	double getR() {
		return r;
	}
	double getTheta() {
		return theta;
	}
	
	public String toString() {
		r=Double.parseDouble(String.format("%.2f", r));
		theta=Double.parseDouble(String.format("%.2f", theta));
		return "("+r+", "+theta+")";
	}
	
}