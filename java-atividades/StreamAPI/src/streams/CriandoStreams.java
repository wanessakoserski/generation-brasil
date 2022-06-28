package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		
		Consumer<Object> print = System.out::print;
		
		Stream<String> langs = Stream.of("Java ", "Go ", "Python\n");
		langs.forEach(print);
		
		String[] maisLangs = {"JavaScript ", "Perl ", "Rusty\n"};
		
		Stream.of(maisLangs).forEach(print);	
		Arrays.stream(maisLangs).forEach(print);
		Arrays.stream(maisLangs, 1, 3).forEach(print);
		
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);
		
		// Stream.generate(() -> "a").forEach(print); trava o pc gera sem ordenação
		// Stream.iterate(0, n -> n + 1).forEach(print); -> gera de maneira ordenada
	}
	
}
