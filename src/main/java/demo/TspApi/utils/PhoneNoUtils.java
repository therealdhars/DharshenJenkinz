package demo.TspApi.utils;



public class PhoneNoUtils {

	 public static long trimPhoneNumber(long phoneNo) {
	        String phoneNumberString = String.valueOf(phoneNo);
	        String trimmedPhoneNumberString = phoneNumberString.substring(0,4);
	        return Long.parseLong(trimmedPhoneNumberString);
	    }
	
}
