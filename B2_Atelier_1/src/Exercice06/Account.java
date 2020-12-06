package Exercice06;

public class Account {

	private String nom;
    private String adress;
    private double solde;

    private double retier;

    public void setNom(String nom) {
        if(!nom.equals("")) {
            this.nom = nom;
        }
    }
    public String getNom() {
        return this.nom;
    }

    public void setAdress(String adress) {
        if(!adress.equals("")) {
            this.adress = adress;
        }
    }
    public String getAdress() {
        return this.adress;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }
    public double getSolde() {
        return this.solde;
    }

    public void retier(double retier) {
        if(this.retier > this.solde) {
            this.retier = 0;
        }
        else {
            this.retier = retier;
        }
    }
    public double getRetier() {
        return this.retier;
    }

    public double nouveauxSolde() {
        return (getSolde() - getSolde()*0.07) - getRetier();
    }

    @Override
    public String toString() {
        return "Nom: " + getNom() + ", Adress: " + getAdress() + ", Solde: " + getSolde() + ", calculerInterer: " + getSolde()*0.07 + 
                "\n tu est retiere: " + getRetier() +
                "\n votre nouveaux solde est: " + nouveauxSolde();
    }
    
    public static void main(String[] args) {
        Account account = new Account();
        account.setNom("saloua");
        account.setAdress("safi");
        account.setSolde(5000);
        account.retier(1000);

        System.out.println(account.toString());
    }

}
