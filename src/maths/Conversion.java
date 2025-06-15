package maths;

import modules.LocalValues;

public class Conversion {

    LocalValues localValues = new LocalValues();

    public int UsdToArg(int base){
        return (base*localValues.getPesoArgentino());
    }
    public int ArgToUsd(int base){
        return (base*localValues.getDolar());
    }
    public int UsdToBrl(int base){
        return (base*localValues.getRealBrasileno());
    }
    public int BrlToUsd(int base){
        return (base*localValues.getDolar());
    }
    public int UsdToCop(int base){
        return (base*localValues.getPesoColombiano());
    }
    public int CopToUsd(int base){
        return (base*localValues.getDolar());
    }
}
