package LW_03.Q3;

public class Bicycle {
    private Owner owner;

    public Bicycle(){
        this.owner = new Owner("Unknow","1234");
    }

    public Bicycle(String name, String num){
        this.owner = new Owner(name, num);
    }

    public Owner getOwner(){
        return owner;
    }

    public void setOwner(Owner owner){
        this.owner = owner;
    }

    public void setOwnerDetails(String name, String num){
        this.owner.setOwnerName(name);
        this.owner.setPhoneNo(num);
    }
}
