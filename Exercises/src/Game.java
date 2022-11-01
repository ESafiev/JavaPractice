import java.util.*;

public class Game {
    public static void main(String[] args) {
        int max = 200;
        int incrementMin = 1;
        int incrementMax = 10;
        Integer [] cars = new Integer[5];
        List<Integer> carsList = Arrays.asList(cars);

        Arrays.fill(cars,0);

        while (Collections.max(carsList) < max) {
            for (int i = 0; i < carsList.size(); i += 1) {
                Integer increment = incrementMin + (int) (Math.random() * incrementMax);

                carsList.set(i, carsList.get(i) + increment);
            }
        }

        System.out.println("" + (carsList.indexOf(Collections.max(carsList)) + 1) + " " + Collections.max(carsList));
    }
}
