public class CSStudent extends Student {
    String favoriteLanguage;

    public CSStudent() {

    }

    public CSStudent(Name name) {
        super(name);
    }

    public CSStudent(Name name, String favoriteLanguage) {
        super(name);
        this.favoriteLanguage = favoriteLanguage;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    @Override
    public String toString() {
        return this.favoriteLanguage;
    }

}
