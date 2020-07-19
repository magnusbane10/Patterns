package designpatterns1;

public class FactoryProducer {

    public static AbstractFactory getFactory(String factory) {
        if (factory.equalsIgnoreCase("Carpenter")) {
            return new CarpenterShopFactory();
        }
        if (factory.equalsIgnoreCase("Steel")) {
            return new SteelShopFactory();
        }
        return null;
    }

}
