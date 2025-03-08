public class ExpComplexNum {
	
	private double r, theta;
	
	public ExpComplexNum() {
		this.r=0;
		this.theta=0;
	}
	public ExpComplexNum(double r, double theta) {
		this.r=r;
		this.theta=theta;
	}
	public ExpComplexNum(GenComplexNum gen) {
		double re = gen.getReal();
		double im = gen.getImaginary();
		
		this.r= Math.sqrt(re*re+im*im);
		this.theta=(re==0?0:Math.atan(im/re));
	}
	public ExpComplexNum(PolComplexNum pol) {
		this.r=pol.getR();
		this.theta=pol.getTheta();
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
		return r+"(cos("+theta+") + isin("+theta+"))";	
	}
	
}