public class Odev {
    public static void main(String[] args) {
        int[] sureler = {341, 273, 278, 329, 445, 402, 388, 270, 243, 334, 412, 393, 299, 343, 317, 265};
        String[] isimler = {"Kadir", "Gökhan", "Hakan", "Suzan", "Pınar", "Mehmet", "Ali", "Emel", "Fırat", "James", "Jale", "Ersin", "Deniz", "Gözde", "Anıl", "Burak"};


        int enDusuk = Kosucular.enDusukZaman(sureler);
        int ikinciEnIyi = Kosucular.ikinciEnIyiKosucu(sureler);
        int ucuncuEnIyi = Kosucular.ucuncuEnIyiKosucu(sureler);
        int[] siniflar = Kosucular.sirala(sureler);


        System.out.println("Birinci: " + isimler[enDusuk] + " " + sureler[enDusuk] + "'");
        System.out.println("İkinci: " + isimler[ikinciEnIyi] + " " + sureler[ikinciEnIyi] + "'");
        System.out.println("Üçüncü: " + isimler[ucuncuEnIyi] + " " + sureler[ucuncuEnIyi] + "'");
        System.out.println("A -> " + siniflar[0]);
        System.out.println("B -> " + siniflar[1]);
        System.out.println("C -> " + siniflar[2]);
    }
}

