package FactPack.Classes;

import FactPack.InterFace.Clothes;
import FactPack.InterFace.ClothesMaker;

public class TrousersMaker implements ClothesMaker {
    @Override
    public Clothes createClothes() {
        return new Trousers();
    }
}
