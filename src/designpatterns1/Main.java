package designpatterns1;

public class Main {
    public static void main(String[] args) {


        AbstractFactory carpenterShopFactory = FactoryProducer.getFactory("Carpenter");
        AbstractFactory steelShopFactory = FactoryProducer.getFactory("Steel");

        CarpenterShop carpenterShop = carpenterShopFactory.getCarpenterShop("Wood Table");
        carpenterShop.woodenTable();

        SteelShop steelShop = steelShopFactory.getSteelShop("Steel Table");
        steelShop.steelTable();


    }

}
