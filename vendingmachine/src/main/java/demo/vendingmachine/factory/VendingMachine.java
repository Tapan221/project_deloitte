package demo.vendingmachine.factory;

import java.util.List;

import demo.vendingmachine.model.Coin;
import demo.vendingmachine.model.Item;
import demo.vendingmachine.utility.Bucket;

public interface VendingMachine {   
    public long selectItemAndGetPrice(Item item);
    public void insertCoin(Coin coin);
    public List<Coin> refund();
    public Bucket<Item, List<Coin>> collectItemAndChange();   
    public void reset();
}


