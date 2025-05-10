

public class Trousers extends Clothes{

    private String trousersType;


    public Trousers(double size, double price, String color, String trousersType){
        super(size, price, color);
        this.trousersType=trousersType;
    }


    public String getTrousersType() {
        return trousersType;
    }

    public void setTrousersType(String trousersType) {
        this.trousersType = trousersType;
    }
}
