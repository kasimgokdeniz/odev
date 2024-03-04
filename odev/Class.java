class Kosucular {

    public static int enDusukZaman(int[] Sureler) {
        int min = 0;
        int minSure = Sureler[0];

        for (int i = 1; i < Sureler.length; i++) {
            if (Sureler[i] < minSure) {
                minSure = Sureler[i];
                min = i;
            }
        }

        return min;
    }

    public static int ikinciEnIyiKosucu(int[] Sureler) {
        int enIyi = enDusukZaman(Sureler);
        int ikinciMinSure = Integer.MAX_VALUE;
        int ikinciMinIndex = -1;

        for (int i = 0; i < Sureler.length; i++) {
            if (i != enIyi && Sureler[i] < ikinciMinSure) {
                ikinciMinSure = Sureler[i];
                ikinciMinIndex = i;
            }
        }

        return ikinciMinIndex;
    }

    public static int ucuncuEnIyiKosucu(int[] Sureler) {
        int enIyi = enDusukZaman(Sureler);
        int ikinciEnIyi = ikinciEnIyiKosucu(Sureler);
        int ucuncuMinSure = Integer.MAX_VALUE;
        int ucuncuMin = -1;

        for (int i = 0; i < Sureler.length; i++) {
            if (i != enIyi && i != ikinciEnIyi && Sureler[i] < ucuncuMinSure) {
                ucuncuMinSure = Sureler[i];
                ucuncuMin = i;
            }
        }

        return ucuncuMin;
    }

    public static int[] sirala(int[] Sureler) {
        int[] siniflar = new int[3];

        for (int sure : Sureler) {
            if (sure >= 200 && sure < 300)
                siniflar[0]++;
            else if (sure >= 300 && sure < 400)
                siniflar[1]++;
            else if (sure >= 400)
                siniflar[2]++;
        }

        return siniflar;
    }
}