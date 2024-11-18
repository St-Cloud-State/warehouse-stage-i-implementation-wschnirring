import WarehouseSystem.*;

class WarehouseTest{
public static void main(String args[]){
    Warehouse wh = Warehouse.instance();
    Client cl = wh.addClient("joe user", "j@user.com");
    Product pr = wh.addProduct("tool", 3.99f, 5);
    Product pr1 = wh.addProduct("tool", 3.99f, 5);
    pr.setQuantity(100);
    pr.modifyQuantity(5);
    System.out.println(pr.getQuantity());
    System.out.println(pr.getID());
    System.out.println(pr1.getID());
    System.out.println(cl.getName());
    System.out.println(wh.findProduct("0"));
}
}