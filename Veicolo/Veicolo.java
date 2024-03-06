class Veicolo 
{
    private String marca;
    private int annoProduzione;

    public Veicolo(String marca, int annoProduzione) // Costruttore della classe Veicolo
    {
        this.marca = marca;
        this.annoProduzione = annoProduzione;
    }

    public String getMarca() // Metodo per ottenere la marca del veicolo
    {
        return marca;
    }

    public void setMarca(String marca)  // Metodo per impostare la marca del veicolo
    {
        this.marca = marca;
    }

    public int getAnnoProduzione()  // Metodo per ottenere l'anno di produzione del veicolo
    {
        return annoProduzione;
    }

    public void setAnnoProduzione(int annoProduzione) // Metodo per impostare l'anno di produzione del veicolo
    {
        this.annoProduzione = annoProduzione;
    }

    public String descrizione()  // Metodo per ottenere la descrizione del veicolo
    {
        return "Veicolo " + marca + " prodotto nel " + annoProduzione;
    }
}

class Automobile extends Veicolo // Classe Automobile che estende la classe Veicolo
{
    private int numeroPosti;

    public Automobile(String marca, int annoProduzione, int numeroPosti) // Costruttore della classe Automobile
    {
        super(marca, annoProduzione);
        this.numeroPosti = numeroPosti;
    }

    @Override // Override del metodo descrizione() della classe Veicolo
    public String descrizione() 
    {
        return "Automobile " + getMarca() + " prodotta nel " + getAnnoProduzione() + " con " + numeroPosti + " posti";
    }
}

class Moto extends Veicolo // Classe Moto che estende la classe Veicolo
{
    private int cilindrata;

    public Moto(String marca, int annoProduzione, int cilindrata)  // Costruttore della classe Moto
    {
        super(marca, annoProduzione); // Chiama il costruttore della superclasse (Veicolo)
        this.cilindrata = cilindrata;
    }

    @Override // Override del metodo descrizione() della classe Veicolo
    public String descrizione() 
    {
        return "Moto " + getMarca() + " prodotta nel " + getAnnoProduzione() + " con cilindrata " + cilindrata + "cc";
    }
}