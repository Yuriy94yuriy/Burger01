package burger;

public class Burger {
    int meat;
    public int cheese;
    public int bread;
    public int greenery;
    public int mayonnaise;

    public Burger(int meat, int cheese, int bread, int greenery) {
        this.meat = meat;
        this.cheese = cheese;
        this.bread = bread;
        this.greenery = greenery;
    }

    public Burger(int meat, int cheese, int bread, int greenery, int mayonnaise) {
        this.meat = meat;
        this.cheese = cheese;
        this.bread = bread;
        this.greenery = greenery;
        this.mayonnaise = mayonnaise;
    }

    public Burger(int meat, int cheese, int bread, int greenery, int mayonnaise, int pork) {
        this.meat = meat;
        this.cheese = cheese;
        this.bread = bread;
        this.greenery = greenery;
        this.mayonnaise = mayonnaise;
        this.meat = pork;
    }

    public void printInfo() {
        System.out.println("Consists: " + "Bread: " + this.bread + " Meat: " + this.meat);
        System.out.println("Greenery: " + this.greenery + " Mayonnaise: " + this.mayonnaise);
        System.out.println("Cheese: " + this.cheese);
        System.out.println();
    }
}
