import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;



class CollectionUtils {

    public static Collection<Integer> pow2(Collection<Integer> numbers) {
        ArrayList<Integer> powed = new ArrayList<>(numbers);

        powed.replaceAll(integer -> integer * integer);

        return powed;
    }
}

public class Main {

    public static String readFileAsString(String fileName) throws Exception {
        String data = new String(Files.readAllBytes(Paths.get(fileName)));
        return data;
    }


    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(readFileAsString("dataset.txt"));
        Collection<Integer> numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        Collection<Integer> result = CollectionUtils.pow2(numbers);

        System.out.println(result.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" ")));
    }
}
