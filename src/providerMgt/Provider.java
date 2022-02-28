package providerMgt;

public class Provider {
    String url;
    String tel;
    String adresse;
    String nom;
    long id;
    static long lastId=0;

    public Provider(String url, String tel, String adresse, String nom) {
        this.id =++lastId;
        this.url = url;
        this.tel = tel;
        this.adresse = adresse;
        this.nom = nom;
    }
    public Provider() {
        this.id =++lastId;
        this.url = null;
        this.tel = null;
        this.adresse = null;
        this.nom = null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Provider provider = (Provider) o;

        if (!adresse.equals(provider.adresse)) return false;
        return nom.equals(provider.nom);
    }

    @Override
    public int hashCode() {
        int result = adresse.hashCode();
        result = 31 * result + nom.hashCode();
        return result;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public static long getLastId() {
        return lastId;
    }

    public static void setLastId(long lastId) {
        Provider.lastId = lastId;
    }
}
