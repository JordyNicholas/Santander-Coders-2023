package Animais;

public class dog extends animal{

    //atributos
    static int dogNumber;
    private int tamanhoRabo;


    //construtor padrão
    //construtor adicionado
    public dog(String nome, String cor, int altura, double peso, String estadoEspirito, int tamanhoRabo){
        super(nome,cor,altura);
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.estadoEspirito = estadoEspirito;
        this.tamanhoRabo = tamanhoRabo;

        dogNumber++;
    };

    //métodos
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCor() {
        return this.cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return this.altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return this.peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTamanhoRabo() {
        return this.tamanhoRabo;
    }

    public void setTamanhoRabo(int tamanhoRabo) {
        this.tamanhoRabo = tamanhoRabo;
    }

    public String getEstadoEspirito() {
        return this.estadoEspirito;
    }
    public void setEstadoDeEspirito(String estadoEspirito) {
        this.estadoEspirito = estadoEspirito;
    }

    public int getDogNumber(){
        return this.dogNumber;
    }
    public void setDogNumber(){
        this.dogNumber = dogNumber;
    }



    public String pegar(){
        return "Bolinha";
    } 

    public String interagir(String acao){
        switch(acao)
        {
            case "carinho": this.estadoEspirito = "feliz"; break;
            case "sai caraio": this.estadoEspirito = "brabão"; break;
            case "tomale um murrão": this.estadoEspirito = "te chamano po panque"; break;
            default: this.estadoEspirito = "suavera"; break;
        }
    return estadoEspirito;
    }

    @Override
    public String toString() {
        return "Nome = " + getNome();
    }

    @Override
    public void soar(){
        System.out.println("AU AU PORA");
    }
}
