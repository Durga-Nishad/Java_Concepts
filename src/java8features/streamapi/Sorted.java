package java8features.streamapi;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;

public class Sorted {
	
	public static void simpleSorted() {
		List<String> name = Arrays.asList("harsha","aruna","sanjana","Aarti","Soumya","kamya","mala","neetu");
		name.stream().sorted().map(e->e.toUpperCase()).forEach(System.out::println);
	}
	
	public static void sortedWithReverseOrder() {
		List<String> name = Arrays.asList("harsha","aruna","sanjana","Aarti","Soumya","kamya","mala","neetu");
		name.stream().sorted(Comparator.reverseOrder()).map(String::toUpperCase).forEach(System.out::println);
		
	}
	
	public static void sortedwithCaseInsensitiveOrder() {
		List<String> name = Arrays.asList("harsha","aruna","sanjana","Aarti","Soumya","kamya","mala","neetu");
		name.stream().sorted(String.CASE_INSENSITIVE_ORDER).map(String::toUpperCase).forEach(System.out::println);
	}
	
	public static void caseSensitiveReverseOrder() {
		List<String> name = Arrays.asList("harsha","aruna","sanjana","Aarti","Soumya","kamya","mala","neetu");
		name.stream().sorted(String.CASE_INSENSITIVE_ORDER.reversed()).map(String::toUpperCase).forEach(System.out::println);
	}
	public static void main(String[] args) {
		
		System.out.println("Using sorted(): it's sorted the value based on ASCII/UNICODE value");
		Sorted.simpleSorted();
		System.out.println("*".repeat(15));
		
		System.out.println("Using sorted(String.CASE_INSENSITIVE_ORDER) : it's ignore the upperCase/Lowercase ");
		Sorted.sortedwithCaseInsensitiveOrder();
		System.out.println("*".repeat(15));
		
		System.out.println("Using sorted(Comparator.reverseOrder()) : it's sort String in reverse order ");
		Sorted.sortedWithReverseOrder();
		System.out.println("*".repeat(15));
		
		System.out.println("Using sorted(String.CASE_INSENSITIVE_ORDER.reversed()) : it's sort String in reverse order but ignore the case");
		Sorted.caseSensitiveReverseOrder();
		
		
		
		

	}

}
