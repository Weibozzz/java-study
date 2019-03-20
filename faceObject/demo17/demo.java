interface USB{
    public void open();
    public void close();
}
class BookPC{
    public static void main(String[] args){
        useUSB(new UPan());
        useUSB(new Mouse());
    }
    public static void useUSB (USB u){
        u.open();
        u.close();
    }
}
// 一年后。
class UPan implements USB{
    public void open(){
        System.out.println("upan open");
    }
    public void close(){
        System.out.println("upan close");
    }
}
class Mouse implements USB{
    public void open(){
        System.out.println("Mouse open");
    }
    public void close(){
        System.out.println("Mouse close");
    }
}