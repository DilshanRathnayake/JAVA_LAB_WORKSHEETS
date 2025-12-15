package LW_06;

public class Cat extends Pet{

    private String costColor;


    @Override
    public String speak(){
        return "";
    }

    public String getCostColor() {
        return costColor;
    }

    public void setCostColor(String costColor){
        this.costColor = costColor;
    }

   @Override
    public String toString(){
        return "Cat - Name: " + getName() + ", Coat Color: " + costColor;
   }


}
