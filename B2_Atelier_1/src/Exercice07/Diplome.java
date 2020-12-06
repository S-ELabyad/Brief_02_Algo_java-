package Exercice07;


public class Diplome {
    private String titre;
    private String mention;
    private int anobtenu;

    Diplome() {

    }

    Diplome(String titre, String mention, int anobtenu) {
        this.titre = titre;
        this.mention = mention;
        this.anobtenu = anobtenu;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getMention() {
        return mention;
    }

    public void setMention(String mention) {
        this.mention = mention;
    }

    public int getAnobtenu() {
        return anobtenu;
    }

    public void setAnobtenu(int anobtenu) {
        this.anobtenu = anobtenu;
    }

    @Override
    public String toString() {
        return "Titre: " + getTitre() + ", Mention: " + getMention() + ", Anobtenu: " + getAnobtenu();
    }
    
    


        public static void main(String[] args) {
            Diplome diplome = new Diplome();

            diplome.setTitre("DevOp");
            diplome.setMention("Bien");
            diplome.setAnobtenu(15);

            System.out.println(diplome.toString());
        }
    
    
    
    
}