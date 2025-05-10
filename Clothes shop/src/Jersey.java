public class Jersey extends Clothes{

    private String material;

    public Jersey(double size, double price, String color, String material){
        super(size, price, color);
        this.material=material;
    }


    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
