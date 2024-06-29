package Conversor;

import modelo.moedas;

public class Conversor {

    ConsultaComAPI consultaComAPI;
    moedas moedas;

    public Conversor() {
        this.consultaComAPI = new ConsultaComAPI();
        this.moedas = consultaComAPI.consultar("usd");
    }

    public double dolarReal(double dolar) {
        return dolar * moedas.brl();
    }

    public double realDolar(double real){
        return real / moedas.brl();
    }

    public double dolarPesoArg(double dolar){
        return dolar * moedas.ars();
    }

    public double pesoArgDolar(double peso){
        return peso / moedas.ars();
    }

    public double dolarPesoCol(double dolar){
        return dolar * moedas.cop();
    }

    public double pesoColDolar(double peso){
        return peso / moedas.cop();
    }
}