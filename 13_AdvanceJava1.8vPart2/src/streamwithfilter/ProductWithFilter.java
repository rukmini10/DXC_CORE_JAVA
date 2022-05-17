package streamwithfilter;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/*

Product 
id
name
price
if(record>1000) {
	sysout
}
*/

class Product{
	private int pid;
	private String pName;
	private int pPrice;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getpPrice() {
		return pPrice;
	}
	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}
	@Override
	public String toString() {
		return "\n" + pid + "," + pName + "," + pPrice;
	}
	public Product(int pid, String pName, int pPrice) {
		super();
		this.pid = pid;
		this.pName = pName;
		this.pPrice = pPrice;
	}
	
	
}


public class ProductWithFilter {

	public static void main(String[] args) {
		List<Product> productList=Arrays.asList(new Product(1,"Mobile",50000),
				new Product(2,"Laptop",100000),
				new Product(3,"Choclate",100),
				new Product(4,"Vegetable",150),
				new Product(6,"Soaps",500),
				new Product(7,"Washing Machine",20000),
				new Product(8,"AC",30000)
				
				);
	//filtering products whose price is more than 100	
		List<Product> filteredProduct=productList.stream()
.filter(p -> p.getpPrice() > 1000)
.collect(Collectors.toList());
		System.out.println(filteredProduct);
				// TODO Auto-generated method stub
		
		//filtering products whose name starts with L 
				List<Product> filteredProduct2=productList.stream()
		.filter(p -> p.getpName().charAt(0)=='L')
		.collect(Collectors.toList());
				System.out.println(filteredProduct2);
						// TODO Auto-generated method stub
				
				//filtering products whose name length <5 
				List<Product> filteredProduct3=productList.stream()
		.filter(p -> p.getpName().length()<=5)
		.collect(Collectors.toList());
				System.out.println(filteredProduct3);
			
				//counting all strings exceppt empty
				List<String> string=Arrays.asList("Rukminni","Pranav","","Saikumar","Spandana");
				long count=string.stream()
						.filter(x -> !x.isEmpty())
						.count();
				System.out.println("Number of string empty"+count);
//converting list of strings into one string separated by comma
				String str=string.stream()
						.map(x -> x.toUpperCase())
						.collect(Collectors.joining(", "));
				System.out.println("New String : "+str);
			
				//find the square of unique number from list
	List<Integer> numbers=Arrays.asList(2,5,7,5,8,9,5);
	List<Integer> numbers2=numbers.stream()
			.map(i -> i*i)
			.distinct()
			.collect(Collectors.toList());
	System.out.println(numbers2);
	
	//find summary report as count,min,max,sum,avg
	
	IntSummaryStatistics stats=numbers.stream()
			.mapToInt((x)-> x)
			.summaryStatistics();
	System.out.println(stats);
	
	//filtered a first number
	
	List<Integer> mynumbers=Arrays.asList(1,2,3,4,20,24);
Integer num=mynumbers.stream().filter(j -> j%2==0)
.filter(j -> j%2==0)
.findFirst().get();

System.out.println("first number"+num);

}


}






