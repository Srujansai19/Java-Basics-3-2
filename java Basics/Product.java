public class Product {
    private double price;
    public void setPrice(double price){
        if(price>0) {
            this.price = price;
        }
    }
    public double getPrice(){
        return price;
    }

    public static void main(String[] args) {
        Product obj=new Product();
        obj.setPrice(27);
        System.out.println(obj.getPrice());
    }
}
