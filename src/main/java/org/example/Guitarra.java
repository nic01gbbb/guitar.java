package org.example;

public class Guitarra {
    // Attributes
    private  String numeroSerie;
    private String fabricante;
    private String modelo;
    private String tipo;
    private String madeira;
    private double preco;


    // Constructor
    public Guitarra(String numeroSerie, String fabricante, String modelo, String tipo, String madeira, double preco ) {
    this.numeroSerie = numeroSerie;
    this.fabricante = fabricante;
    this.modelo = modelo;
    this.tipo = tipo;
    this.madeira = madeira;
    this.preco = preco;
    }


    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public void setMadeira(String madeira) {
        this.madeira = madeira;
    }

    public String getMadeira(){
    return  madeira;}
}
