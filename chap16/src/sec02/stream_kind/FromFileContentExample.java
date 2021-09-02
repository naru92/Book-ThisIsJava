package sec02.stream_kind;

import java.io.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.util.stream.*;

public class FromFileContentExample {

	public static void main(String[] args) throws IOException {
		Path path = Paths.get("src/sec02/stream_kind/linedata.txt");
		Stream<String> stream;
		
		//Files.lines() �޼ҵ� �̿�
		stream = Files.lines(path, Charset.defaultCharset());
		stream.forEach(System.out :: println);
		stream.close();
		System.out.println();
		
		//BufferedReader�� lines() �޼ҵ� �̿�
		File file = path.toFile();
		FileReader fileReader = new FileReader(file);
		BufferedReader br = new BufferedReader(fileReader);
		stream = br.lines();
		stream.forEach(System.out :: println);
		stream.close();
		System.out.println();
	}

}
