import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Pattern Design - Strategy!");

        Context<Integer, Double> context = new Context<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("+ - *: ");
        String operand = scanner.nextLine().toLowerCase();
        System.out.println("X: ");
        Integer argX = scanner.nextInt();
        System.out.println("Y: ");
        Double argY = scanner.nextDouble();

        if (operand.equals("+")) {
            context.setStrategy(new AutoCarStrategy<>(12));
        }
        if (operand.equals("-")) {
            context.setStrategy(new WalkLegs<>());
        }
        if (operand.equals("*")) {
            context.setStrategy(new PublicTransport<>());
        }
        HashMap<Integer, Double> result = context.executeStrategy(argX, argY);

        System.out.println(result);
        for (Integer key : result.keySet()) {
            System.out.println(key);
            System.out.println(result.get(key));

        }
        System.out.println("=========================");
        for (Map.Entry<Integer, Double> entry : result.entrySet()) {
            Integer key = entry.getKey();
            Double value = entry.getValue();
            System.out.println(key + ":" + value);
        }

    }
}








