package modules;

import com.google.gson.Gson;

public class LocalValues {
    Gson gson =new Gson();

    private int dolar;
    private int pesoArgentino;
    private int pesoColombiano;
    private int realBrasileno;

    public LocalValues() {
    }

    public LocalValues(ValuesApi valuesApi) {
        this.dolar = valuesApi.USD();
        this.pesoArgentino = valuesApi.ARS();
        this.pesoColombiano = valuesApi.COP();
        this.realBrasileno = valuesApi.BRL();
    }

    public int getDolar() {
        return dolar;
    }

    public int getPesoArgentino() {
        return pesoArgentino;
    }

    public int getPesoColombiano() {
        return pesoColombiano;
    }

    public int getRealBrasileno() {
        return realBrasileno;
    }
}
