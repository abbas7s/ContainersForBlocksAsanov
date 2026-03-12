public class ContainersForBlocksAsanov {

    public static void main(String[] args) {

        int amountOfBricksAsanov = 73;
        System.out.println("I chose an odd number between 50 and 100 for the amount of bricks: " + amountOfBricksAsanov);

        int containerCapacityAsanov = 6;
        System.out.println("I chose an even number between 5 and 10 for container capacity: " + containerCapacityAsanov);

        int fullContainersAsanov = amountOfBricksAsanov / containerCapacityAsanov;
        System.out.println("I calculated how many FULL containers we have: " + fullContainersAsanov);

        int remainingBricksAsanov = amountOfBricksAsanov % containerCapacityAsanov;
        System.out.println("Using modulo (%) I calculated how many bricks are left in the not full container: " + remainingBricksAsanov);

        int totalContainersAsanov;

        if (remainingBricksAsanov > 0) {
            totalContainersAsanov = fullContainersAsanov + 1;
        } else {
            totalContainersAsanov = fullContainersAsanov;
        }

        System.out.println("I calculated the TOTAL number of containers needed (full and not full): " + totalContainersAsanov);
    }
}