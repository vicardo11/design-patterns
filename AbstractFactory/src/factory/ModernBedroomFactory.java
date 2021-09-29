package factory;

import furnitures.beds.Bed;
import furnitures.beds.ModernBed;
import furnitures.bedside_cabinets.BedsideCabinet;
import furnitures.bedside_cabinets.ModernBedsideCabinet;
import furnitures.bedside_lamps.BedsideLamp;
import furnitures.bedside_lamps.ModernBedsideLamp;

public class ModernBedroomFactory implements AbstractBedroomFactory{

    @Override
    public Bed buildBed() {
        return new ModernBed();
    }

    @Override
    public BedsideLamp buildBedsideLamp() {
        return new ModernBedsideLamp();
    }

    @Override
    public BedsideCabinet buildBedsideCabinet() {
        return new ModernBedsideCabinet();
    }
}
