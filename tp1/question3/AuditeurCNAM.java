package question3;


public class AuditeurCNAM {
  
    private String nom;
   
    private String prenom;
  
    private String matricule;

  
    public AuditeurCNAM(String nom, String prenom, String matricule) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
    }

    
    public String login() {
        if (this.nom !=null && this.prenom !=null){
            String login = "";
            
            login += nom().length() > 6 ? nom().substring(0,6) : nom();
            login += "_";
            login += prenom().length() > 1 ? prenom().substring(0,1) : prenom();
            
            login = login.toLowerCase();
            login = login.replaceAll("é", "e");
            login = login.replaceAll("è", "e");
            login = login.replaceAll("ê", "e");
            login = login.replaceAll("à", "a");
            login = login.replaceAll("â", "a");
           
            login = login.replaceAll("[^a-z0-9]", "_");
            return login;
        }
        return "Attention ! Le nom et le prénom ne peuvent pas être null";
    }

   
    public String nom() {
        return this.nom;
    }

  
    public String prenom() {
        return this.prenom;
    }

    public String matricule() {
        return this.matricule;
    }

    @Override
    public String toString() {
        return nom() + " " + prenom() + " login : " + login();
    }

}
