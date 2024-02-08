public class Auteur{
    private String nom;
    private int perf_Tragedie;
    private int perf_Comedie;
    private int perf_Drame;
    private String citationTragedie;
    private String citationComedie;
    private String citationDrame;


    public Auteur(String nom, int NoteTragedie,String citation1,int NoteComedie,String citation2,int NoteDrame, String citation3){
        this.nom = nom;
        this.perf_Tragedie = NoteTragedie;
        this.perf_Comedie = NoteComedie;
        this.perf_Drame = NoteDrame;
        this.citationTragedie = citation1;
        this.citationComedie = citation2;
        this.citationDrame = citation3;

    }

    public int getQualitéTragédie(){
        return this.perf_Tragedie;
    }

    public String getCitationTragédie(){
        return this.citationTragedie;
    }

    public int getQualitéComedie(){
        return this.perf_Comedie;
    }

    public String getCitationComedie(){
        return this.citationComedie;
    }

    public int getQualitéDrame(){
        return this.perf_Drame;
    }

    public String getCitationDrame(){
        return this.citationDrame;
    }

    public String getMeilleurStyle() {
        int maxQualite = Math.max(Math.max(perf_Tragedie, perf_Comedie), perf_Drame);

        if (maxQualite == perf_Tragedie) {
            return "Tragédie";
        } else if (maxQualite == perf_Comedie) {
            return "Comédie";
        } else {
            return "Drame";
        }
    } 

    @Override
    public String toString() {
        String s = "L'Honnorable";
        s = s.concat(this.nom);
        return s;
    }
}

