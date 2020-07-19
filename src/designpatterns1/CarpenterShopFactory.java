package designpatterns1;

public class CarpenterShopFactory extends AbstractFactory{
    @Override
    public CarpenterShop getCarpenterShop(String carpenterShop) {
        if(carpenterShop.equals(null)){
            return null;
        }
        if(carpenterShop.equalsIgnoreCase("Wood Table")){
            return new WoodenTable();
        }

        return null;
    }

    @Override
    public SteelShop getSteelShop(String steelShop) {
        return null;
    }
}
