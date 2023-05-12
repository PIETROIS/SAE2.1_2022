import java.lang.Math;

public class Bit {
	public static int ByteToInt (int[] octet) {
		int buffer = 0;
		for (int i=0;i<8;i++){
			buffer += octet[i]*((int)Math.pow(2,i));
		}
		return buffer;
	}
}
