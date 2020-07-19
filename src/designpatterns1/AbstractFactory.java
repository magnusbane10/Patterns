package designpatterns1;

public abstract class AbstractFactory {
    public abstract CarpenterShop getCarpenterShop(String carpenterShop);
    public abstract SteelShop getSteelShop(String steelShop);

}
