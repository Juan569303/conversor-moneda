package maths;

import modules.ApiResponse;
import modules.GetApi;
import modules.ValuesApi;

public class Conversion {

    GetApi getApi = new GetApi();


    public double UsdToArg(double mount, String selection){
        ValuesApi values = getApi.getValues(selection);
        return (mount*values.ARS());
    }
    public double ArgToUsd(double mount, String selection){
        ValuesApi values = getApi.getValues(selection);
        return (mount*values.USD());
    }
    public double UsdToBrl(double mount, String selection){
        ValuesApi values = getApi.getValues(selection);
        return (mount*values.BRL());
    }
    public double BrlToUsd(double mount, String selection){
        ValuesApi values = getApi.getValues(selection);
        return (mount*values.USD());
    }
    public double UsdToCop(double mount, String selection){
        ValuesApi values = getApi.getValues(selection);
        return (mount*values.COP());
    }
    public double CopToUsd(double mount, String selection){
        ValuesApi values = getApi.getValues(selection);
        return (mount*values.USD());
    }
}
