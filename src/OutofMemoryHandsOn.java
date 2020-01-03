import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OutofMemoryHandsOn {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        Random random = new Random();

        while (true)
            list.add(random.nextInt());

    }
}
