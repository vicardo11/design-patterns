package factory;

import furnitures.beds.Bed;
import furnitures.bedside_cabinets.BedsideCabinet;
import furnitures.bedside_lamps.BedsideLamp;

public interface AbstractBedroomFactory {
    Bed buildBed();
    BedsideLamp buildBedsideLamp();
    BedsideCabinet buildBedsideCabinet();

}
