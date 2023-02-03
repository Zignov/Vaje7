class Pes{
    String ime;
    String barva;
    int starost;
    String pasma;

    String opis(){
        return ime + " (Pasma: " + pasma + 
        ", Starost: "+ starost + "let, Barva: "+barva+")";
    }

    String lajaj(){
        return ime + " (Pasma: " + pasma + 
        ", Starost: "+ starost + "let, Barva: "+barva+") laja";
    }

    String sedi(){
        return ime + " (Pasma: " + pasma + 
        ", Starost: "+ starost + "let, Barva: "+barva+") sedi";
    }

    String spi(){
        return ime + " (Pasma: " + pasma + 
        ", Starost: "+ starost + "let, Barva: "+barva+") spi";
    }


    Pes(
        String vIme,
        String vBarva,
        int vStarost,
        String vPasma
    ){
        ime = vIme;
        barva = vBarva;
        starost = vStarost;
        pasma = vPasma;

    }




}