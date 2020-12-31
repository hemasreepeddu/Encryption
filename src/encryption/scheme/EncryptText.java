package encryption.scheme;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

public class EncryptText {
	static String encryption(String s) {
		double row = 0, column = 0;
		StringBuffer sb = new StringBuffer();
		double var = Math.sqrt(s.length());
		row = Math.floor(var);
		column = Math.ceil(var);
		for (int i = 0; i < column; i++) {
			for (int j = i; j < s.length(); j = j + (int) column) {
				sb.append(s.charAt(j));
			}
			sb.append(" ");

		}
		return sb.toString();
	}

	public static void main(String[] args) {
		InputStreamReader inputStreamReader = new InputStreamReader(System.in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		String str = null;
		try {
			str = bufferedReader.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(encryption(str));

	}

}
