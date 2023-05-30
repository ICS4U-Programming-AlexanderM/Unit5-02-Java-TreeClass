/**
* This file contains the main class.
*
* @author  Alexander Matheson
* @version 1.0
* @since   2023-05-30
*/

public final class Main {
    /**
    * For style checker.
    *
    *
    * @exception IllegalStateException Utility class.
    * @see IllegalStateException
    */
    private Main() {
        throw new IllegalStateException("Utility class");
    }

    /**
    * Print messages.
    *
    * @param args Unused
    */
    public static void main(String[] args) {
        // String variables to appease the style checker.
        final String height = "Height: ";
        final String age = "Age: ";
        final String species = "Species: ";
        final String numOfLeaves = "Number of leaves: ";

        // Create tree.
        final Tree maple = new Tree(10, 5000, "Maple");

        // Display tree attributes.
        System.out.println("Initial attributes: ");
        System.out.println(height + maple.getHeight());
        System.out.println(numOfLeaves + maple.getLeaves());
        System.out.println(species + maple.getSpecies());
        System.out.println(age + maple.getAge());

        // Grow the tree once.
        System.out.println("After one growth: ");
        maple.grow();
        System.out.println(height + maple.getHeight());
        System.out.println(numOfLeaves + maple.getLeaves());
        System.out.println(species + maple.getSpecies());
        System.out.println(age + maple.getAge());

        // Grow the tree slowly.
        System.out.println("After a slow growth: ");
        maple.growSlow();
        System.out.println(height + maple.getHeight());
        System.out.println(numOfLeaves + maple.getLeaves());
        System.out.println(species + maple.getSpecies());
        System.out.println(age + maple.getAge());

        // Grow the tree by a specified amount.
        System.out.println("After a specified growth: ");
        maple.grow(7, 9000);
        System.out.println(height + maple.getHeight());
        System.out.println(numOfLeaves + maple.getLeaves());
        System.out.println(species + maple.getSpecies());
        System.out.println(age + maple.getAge());

        // Prepare for winter.
        System.out.println("Winter is coming: ");
        maple.loseLeaves();
        System.out.println(height + maple.getHeight());
        System.out.println(numOfLeaves + maple.getLeaves());
        System.out.println(species + maple.getSpecies());
        System.out.println(age + maple.getAge());
    }
}
