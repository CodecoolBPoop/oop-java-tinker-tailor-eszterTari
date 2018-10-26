import java.util.*;

public class TinkerTailor {

    public static void playGame(int numberOfChildren, int numberOfWords) {

        ArrayList<Integer> children = new ArrayList<>(numberOfChildren);
        ArrayList<Integer> excludedChildren = new ArrayList<>();

        for (int i = 1; i <= numberOfChildren; i++) {
            children.add(i);
        }

        Iterator<Integer> iterator = children.iterator();
        while (children.size() > 0) {
            for (int i = 1; i <= numberOfWords; i++) {
                if (!iterator.hasNext()) {
                    iterator = children.iterator();
                }
                int excludedChild = iterator.next();
                if (i == numberOfWords) {
                    excludedChildren.add(excludedChild);
                    iterator.remove();
                }
            }
        }

        System.out.println("The result (from the first excluded player to the winner): ");
        System.out.println(excludedChildren);
    }

    public static void main(String[] args) {
        System.out.println("Number of players: ");
        Scanner scanner = new Scanner(System.in);
        int playerNumber = scanner.nextInt();
        System.out.println("Length of rhyme: ");
        int rhymeLength = scanner.nextInt();
        playGame(playerNumber,rhymeLength);
    }
}