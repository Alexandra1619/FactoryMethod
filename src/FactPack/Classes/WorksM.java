package FactPack.Classes;

import FactPack.InterFace.Clothes;
import FactPack.InterFace.ClothesMaker;

public class WorksM {
    public static void main(String[] args) {

        ClothesMaker maker=getMakerByName("cardigan");
        Clothes clothes=maker.createClothes();
        clothes.ShowClothes();
    }
    public static ClothesMaker getMakerByName(String maker)
    {
        if(maker.equals("trousers"))
        {
            return new TrousersMaker();
        }
        else if(maker.equals("cardigan"))
        {
            return new CardiganMaker();
        }
        throw new RuntimeException(maker+" произвоства нет");
    }
}
