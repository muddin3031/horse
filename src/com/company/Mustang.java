package com.company;

public class Mustang implements Horse{
    private String Name;
    private int Weight;
    public Mustang(String Name, int Weight)
    {
        this.Name = Name;
        this.Weight = Weight;
    }
    public String getName() {
        return Name;
    }
    public int getWeight() {
        return Weight;
    }
    public String toString()
    {
        String output ="";
        output += this.getName() + "," + " weights: " + this.getWeight();
        return output;
    }
}
