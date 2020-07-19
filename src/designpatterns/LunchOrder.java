package designpatterns;

public class LunchOrder {
    private String bread;
    private String tomato;
    private String eggs;
    private String cheese;
    private String dressing;
    private String avocado;
    private String meat;

    public LunchOrder(String bread) {
        this.bread = bread;
    }

    public LunchOrder(String bread, String tomato) {
        this(bread);
        this.tomato = tomato;
    }

    public LunchOrder(String bread, String tomato, String cheese){
        this(bread, tomato);
        this.cheese = cheese;
    }

    public LunchOrder(String bread, String tomato, String eggs, String avocado ){
        this(bread, tomato);
        this.eggs = eggs;
        this.avocado = avocado;
    }

    public LunchOrder(String bread, String tomato, String eggs, String avocado, String dressing, String meat){
        this(bread, tomato, eggs, avocado);
        this.dressing = dressing;
        this.meat = meat;
    }

    public String getBread() {
        return bread;
    }

    public String getTomato() {
        return tomato;
    }

    public String getEggs() {
        return eggs;
    }

    public String getCheese() {
        return cheese;
    }

    public String getDressing() {
        return dressing;
    }

    public String getAvocado() {
        return avocado;
    }

    public String getMeat() {
        return meat;
    }
}
