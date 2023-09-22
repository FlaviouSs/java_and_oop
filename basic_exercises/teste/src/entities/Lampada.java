package entities;

public class Lampada {
	private String cor;
    public int teste;
    private int horasUteis;
    public Lampada() {
        ++teste;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getHorasUteis() {
        return horasUteis;
    }
    public void setHorasUteis(int idade) {
        this.horasUteis = idade;
    }
}
