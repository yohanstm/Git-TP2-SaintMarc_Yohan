public class Journée {
    private int matin;
    private int aprem;
    private int soir;

    public Journée(int spectateursMatin, int spectateursAprem, int spectateursSoir, Auteur auteur) {
      
        this.matin = spectateursMatin * auteur.getQualitéDrame();  
        this.aprem = spectateursAprem * auteur.getQualitéComedie();  
        this.soir = spectateursSoir * auteur.getQualitéTragédie(); 
    }

    public int sommeScore() {
        return this.matin + this.aprem +this.soir;
    }

    public int getScoreMatin() {
        return this.matin;
    }

    public int getScoreAprem() {
        return this.aprem;
    }

    public int getScoreSoir() {
        return this.soir;
    }
}
