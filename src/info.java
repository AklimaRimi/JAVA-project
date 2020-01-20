import java.io.Serializable;

public class info implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String P_name,D_name,Oshukh,Med1,Med2,Syrup,phone,add;
	int age,Q1=0,Q2=0,Q3=0,total=0;
	static int s = 1000;
	public info() {
		// TODO Auto-generated constructor stub
		s++;
	}
	
	public info(String phone,String add,String P_name,int age,String D_name,String Oshukh,String Med1,String Med2,String Syrup,int Q1, int Q2,int Q3) {
		super();
		this.P_name = P_name;
		this.age = age;
		this.D_name = D_name;
		this.Oshukh = Oshukh;
		this.Med1 = Med1;
		this.Med2 = Med2;
		this.Syrup = Syrup;
		this.Q1=Q1;
		this.Q2= Q2;
		this.Q3= Q3;
		total = (Q1*5)+(Q2*5)+(Q3*10);
		this.phone = phone;
		this.add=add;
		
	}
	
	String print()
	{
		return "Name : "+P_name+"\nPhone: "+phone+  "\nMedicine : "+Med1+" , "+Med2+", "+Syrup+"\nTotal: "+total+" tk.\n Percel Will be given in 30 min.";
	}

}
