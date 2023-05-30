/**
* This file contains the tree class.
*
* @author  Alexander Matheson
* @version 1.0
* @since   2023-05-30
*/
public class Tree {
    // Variables for this class.
    private int numLeaves;
    private int feetTall;
    private int age;
    private String species;

    /**
    * Constructor to set initial values.
    *
    * @param height from user.
    * @param leaves from user.
    * @param type of tree.
    */
    public Tree(int height, int leaves, String type) {
        this.feetTall = height;
        this.numLeaves = leaves;
        this.species = type;
        this.age = 0;
    }

    /**
    * Accessor method.
    *
    * @return requested variable.
    */
    public int getLeaves() {
        return numLeaves;
    }

    /**
    * Accessor method.
    *
    * @return requested variable.
    */
    public int getHeight() {
        return feetTall;
    }

    /**
    * Accessor method.
    *
    * @return requested variable.
    */
    public int getAge() {
        return age;
    }

    /**
    * Accessor method.
    *
    * @return requested variable.
    */
    public String getSpecies() {
        return species;
    }

    /**
    * Grow the tree by a set amount.
    */
    public void grow() {
        this.feetTall = this.feetTall + 5;
        this.numLeaves = this.numLeaves + 10000;
        this.age++;
    }

    /**
    * Grow the tree by a user set amount (overloaded).
    *
    * @param addHeight decided by user.
    * @param addLeaves decided by user.
    */
    public void grow(int addHeight, int addLeaves) {
        this.feetTall = this.feetTall + addHeight;
        this.numLeaves = this.numLeaves + addLeaves;
        this.age++;
    }

    /**
    * Grow the tree by a small amount.
    */
    public void growSlow() {
        this.feetTall = this.feetTall + 1;
        this.numLeaves = this.numLeaves + 100;
        this.age++;
    }

    /**
    * Drop all leaves.
    */
    public void loseLeaves() {
        this.numLeaves = 0;
    }
}
