import java.util.ArrayList;

public class BinaryToDecimalConverter {
	
	public BinaryToDecimalConverter() {
		
	}
	
	public static String DtoB (String decimalString) {
		long decimal = Long.parseLong (decimalString);
		ArrayList<Integer> binaries =  new ArrayList<Integer>();
		while (decimal != 0) {
			int remainder = (int) decimal % 2;
			decimal /= 2;
			
			binaries.add (remainder);
		}
		
		String binaryString = "";
		for (int i = binaries.size() -1 ; i >= 0; i--) {
			binaryString += binaries.get(i);
		}
		return binaryString;
	}
	
	public static String BtoD (String binary) {
		long totalDecimalSum = 0;
		for (int i = binary.length() - 1; i >= 0; i-- ) {
			totalDecimalSum += Integer.parseInt ("" + binary.charAt(binary.length()-i-1)) * Math.pow(2, i);
		}
		return totalDecimalSum + "";
	}
	
}
