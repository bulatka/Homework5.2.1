import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> positiveList = new ArrayList<>();
        List<Integer> resultList = new ArrayList<>();

        for (Integer entry : intList) {
            if (entry > 0) {
                positiveList.add(entry);
            }
        }
        for (Integer entry : positiveList) {
            if (entry % 2 == 0) {
                resultList.add(entry);
            }
        }
        resultList.sort(Comparator.naturalOrder());
        for (Integer entry : resultList) {
            System.out.println(entry);
        }
    }
}
