package sec06.exam03_constructor_references;

import java.util.function.*;

public class ConstructorReferencesExample {
	public static void main(String[] args) {
		Function <String, Member> fucntion1 = Member :: new;
		Member member1 = fucntion1.apply("angel");
		
		BiFunction<String, String, Member> function2 = Member :: new;
		Member member2 = function2.apply("Ω≈√µªÁ", "angel");
	}
}
