package in.ashokit.security;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordService {
	public static String encode(String txt)
	{
	   Encoder encoder=Base64.getEncoder();
	   return encoder.encodeToString(txt.getBytes());
	}
	public static String decode(String encodeTxt)
	{
		//changes for 121 bug
		String name="raju";
	  Decoder decoder=Base64.getDecoder();
	  byte[] decode=decoder.decode(encodeTxt);
	  return new String(decode);
	}


}
