package designpatterns1;

public class SteelShopFactory extends AbstractFactory{
    @Override
    public CarpenterShop getCarpenterShop(String carpenterShop) {
        return null;
    }

    @Override
    public SteelShop getSteelShop(String steelShop) {
        if(steelShop.equals(null)){
            return null;
        }
        if(steelShop.equalsIgnoreCase("Steel Table")){
            return new SteelTable();
            }

        return null;
    }
}
