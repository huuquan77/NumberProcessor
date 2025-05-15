// NumberProcessor.java
import java.util.List;

public class NumberProcessor {
    public int process(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) { // vòng lặp
            if (num % 2 == 0) { // rẽ nhánh
                System.out.println(num + " là số chẵn");
            }
            if (num % 3 == 0) {
                sum += num;
            }
        }
        return sum;
    }
}
