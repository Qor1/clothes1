public class Boots extends Clothes {
    private String company;


    public Boots(double size, double price, String color, String company){
        super(size, price, color);
        this.company=company;
    }


    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
