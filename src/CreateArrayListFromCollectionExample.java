import java.util.ArrayList;
import java.util.List;

public class CreateArrayListFromCollectionExample {

    public static void main(String[] args) {
        List<Integer> firsFivePrimeNumbers = new ArrayList<>();
        firsFivePrimeNumbers.add(2);
        firsFivePrimeNumbers.add(3);
        firsFivePrimeNumbers.add(5);
        firsFivePrimeNumbers.add(7);
        firsFivePrimeNumbers.add(11);

        List<Integer> firstTenPrimaNumbers = new ArrayList<>(firsFivePrimeNumbers);

        List<Integer> nextFivePrimeNumbers = new ArrayList<>();
        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(17);
        nextFivePrimeNumbers.add(19);
        nextFivePrimeNumbers.add(23);
        nextFivePrimeNumbers.add(29);

        firstTenPrimaNumbers.addAll(nextFivePrimeNumbers);

        System.out.println(firstTenPrimaNumbers);
    }
}
