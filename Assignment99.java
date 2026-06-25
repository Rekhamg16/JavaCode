package package2;

public class Assignment99 {
	  private int age=25;
	  private String name ="rakhi";
	  public int getAge()
	  {
	     return age;
	  }
	  public void setAge(int age)
	  {
	     this.age=age;
	  }
     public String getname() {
    	 return name;
     }
     public void setname (String name)
     {this.name =name;}
     
     public static void main(String[] args) {
		Assignment99 a1= new Assignment99();
		a1.getAge();
		a1.getname();
		System.out.println("student age:"+a1.getAge());
		System.out.println("student name:"+a1.getname());
	}
}
