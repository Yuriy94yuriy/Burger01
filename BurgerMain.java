package burger;

public class BurgerMain extends Burger{
    public BurgerMain(int meat, int cheese, int bread, int greenery,int mayonnaise) {
        super(meat, cheese, bread, greenery,mayonnaise);
    }

    public static void main(String[] args) {
        Burger standartBurger = new Burger(1, 1, 1, 1, 1);
        standartBurger.printInfo();
        System.out.println();
        Burger dietBurger = new Burger(1, 1, 1, 1);
        dietBurger.printInfo();
        System.out.println();
        Burger extraMeat = new Burger(2, 1, 1, 1, 1);
        extraMeat.printInfo();
        System.out.println();
    }
}


//Зробити клас Burger, який матиме поля:
//булочка, м'ясо, сир, зелень, майонез
//Зробити три конструктори, які дозволятимуть робити бургери трьох видів:
//звичайний бургер (усі компоненти)
//дієтичний бургер (без майонезу)
//з подвійним м'ясом
//У кожен конструктор додати виведення в консоль складу даного варіанту бургера
// (при створенні екземпляра бургера, який використовує даний конструктор - буде виводитися в консоль його склад).
//Зробити клас BurgerMain, в якому створити три різні бургери.
