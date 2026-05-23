package java8features.OptionalClass;

import java.util.Optional;

public class OptionalMahasunya {

	public static void main(String[] args) {
		Optional<String> opt = Optional.of("hello");         //creation of optional object 
		System.out.println(opt);							//print optional object
		System.out.println(opt.get());						//get the value from optional object 
		
		System.out.println("*".repeat(10));
		Optional<String> opt1 = Optional.of("java").filter(s->s.length()>10);
		Optional<String> opt2 = Optional.of("java").filter(s->s.length()>2);
		System.out.println(opt1); 					//output :-  Optional.empty
		//System.out.println(opt1.get());			//output :- NoSuchElementException
		System.out.println(opt2.get());				//output :- java
		
		Optional<String> opt3 = Optional.of("hello");
		//String result  = opt3.map(s->null).orElse("default");		    		
		String result  = opt3.map(s->(String)null).orElse("default");
		System.out.println(result);
	}

}
