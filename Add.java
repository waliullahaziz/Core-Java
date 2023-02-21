package calculator;

public class Add implements Operate {
	
	public Double getResult(Double...numbers) {
		System.out.println("Inside Add class " + String.valueOf(numbers));
		Double sum = 0.0;
		for (Double num: numbers ) {
			sum += 	num;
			
		}
		return sum;
		
	}
	
	

}
