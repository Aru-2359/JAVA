enum Laptop{
    Macbook(5000), XPS(5500), Surface, ThinkPad(4800);
    private Laptop(){
        this.price = 1000;
    }
    private int price;
    private Laptop(int price){
        this.price = price;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }
}
class Enum2 {
    public static void main(String[] args) {
        Laptop lap = Laptop.Macbook;
        System.out.println(lap + " : " + lap.getPrice());
        for(Laptop l : Laptop.values()){
            System.out.println(l + " : " + l.getPrice());
        }
    }
}
