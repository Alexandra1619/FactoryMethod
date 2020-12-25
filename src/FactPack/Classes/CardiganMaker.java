package FactPack.Classes;

import FactPack.InterFace.Clothes;
import FactPack.InterFace.ClothesMaker;

public class CardiganMaker implements ClothesMaker {
    @Override
    public Clothes createClothes() {
        return new Cardigan();
    }
}
