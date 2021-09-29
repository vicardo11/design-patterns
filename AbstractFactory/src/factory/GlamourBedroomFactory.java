package factory;

import furnitures.beds.Bed;
import furnitures.beds.GlamourBed;
import furnitures.bedside_cabinets.BedsideCabinet;
import furnitures.bedside_cabinets.GlamourBedsideCabinet;
import furnitures.bedside_lamps.BedsideLamp;
import furnitures.bedside_lamps.GlamourBedsideLamp;

public class GlamourBedroomFactory implements AbstractBedroomFactory{

    @Override
    public Bed buildBed() {
        return new GlamourBed();
    }

    @Override
    public BedsideLamp buildBedsideLamp() {
        return new GlamourBedsideLamp();
    }

    @Override
    public BedsideCabinet buildBedsideCabinet() {
        return new GlamourBedsideCabinet();
    }
}
