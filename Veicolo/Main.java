public class Main{
    public static void main(String[] args) {
        Veicolo veicolo = new Veicolo("jeep", 2022); // Creazione di un oggetto Veicolo con marca "Fiat" e anno di produzione 2020
        System.out.println(veicolo.descrizione());  // Stampare la descrizione del veicolo

        Automobile automobile = new Automobile("fiat panda", 1998, 5);  // Creazione di un oggetto Automobile con marca "Toyota", anno di produzione 2018 e 5 posti
        System.out.println(automobile.descrizione());  // Stampare la descrizione dell'automobile

        Moto moto = new Moto("aprilia", 2024, 2000); // Creazione di un oggetto Moto con marca "Honda", anno di produzione 2019 e cilindrata 1000cc
        System.out.println(moto.descrizione());  // Stampare la descrizione della moto
    }
} 
    