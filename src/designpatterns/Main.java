package designpatterns;

public class Main {

    public static void main(String[] args) {
        // Telescoping
        LunchOrder lunchOrder1 = new LunchOrder("white bread");
        System.out.println(lunchOrder1.getBread());

        LunchOrder lunchOrder2 = new LunchOrder("white bread","tomato","blue cheese",null,"salad",null);
        System.out.println("Whithout builder" + " " + lunchOrder2.getBread());
        System.out.println("Whithout builder" + " " + lunchOrder2.getTomato());
        System.out.println("Whithout builder" + " " + lunchOrder2.getCheese());
        System.out.println("Whithout builder" + " " + lunchOrder2.getAvocado());

        // Builder solution

        LunchOrderBuilder lunchOrderBuilder1 = new LunchOrderBuilder.Builder()
                .withCheese("Blue cheese")
                .build();
        System.out.println(" Whit Builder" + " " + lunchOrderBuilder1.getCheese());

        LunchOrderBuilder lunchOrderBuilder2 = new LunchOrderBuilder.Builder()
                .withDressing("Salad")
                .withTomato("Tomato")
                .withEggs("Scrambled eggs")
                .withBread("white bread")
                .build();
        System.out.println("With Builder" + " " + lunchOrderBuilder2.getEggs());





    }
}
