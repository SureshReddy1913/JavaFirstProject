package com.sapient.problem2;


public class Conversion {

	public static String fig_to_words(int i) {
		String units[]= {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
		String tens[]= {"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eigthy","Ninety"};
		if(i<0) {
			return("Minus "+fig_to_words(-i));
		}
		if(i<20) {
			return (units[i]);
		}
		if(i<100) {
			return(tens[i/10]+units[i%10]);
		}
		if(i<1000) {
			return (units[i/100]+" Hundred "+fig_to_words(i%100));
		}
		if(i<1000000) {
			return (fig_to_words(i/1000)+" Thousand "+fig_to_words(i%1000));
		}
			
		return (fig_to_words(i/1000000)+" Million "+fig_to_words(i%1000000));
	}

}