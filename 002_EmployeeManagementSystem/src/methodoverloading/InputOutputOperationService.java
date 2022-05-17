package methodoverloading;

public class InputOutputOperationService {

	public static void main(String[] args) {
		InputOutputOperation operation=new InputOutputOperation();
		operation.showData(23);
		operation.showData("Rukmini");
		operation.showData(298,"Ruk");
		operation.showData("Roshi",254);
		operation.getData();
		operation.getData("Enter a string");

	}

}
