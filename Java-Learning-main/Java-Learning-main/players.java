
class players {
    private String name;
    private String lastName;
    private double height;
    private int age;
    private int dorsal;
    private String position;


public players(){
name="";
lastName = "";
height = 0;
age = 0;
dorsal = 0;
position = "";
};

public players(String Name, String Lastname, double Height, int Age, int Dorsal, String Position){

    this.name= Name;
    this.lastName= Lastname;
    setAge(Age);
    setHeight(Height);
    setDorsal(Dorsal);
    this.position = Position;
    }




    public String toString(){

return "The data for the player is \n Name: " + this.name + "\nLastname: " + this.lastName + "\nHeight; " + getHeight() + "\n Dorsal: " + getDorsal() + "\n Position: " + this.position;

    }

    public String getName() {
        return name;
    } 
    public String getLastName() {
        return lastName;
    }
    public double getHeight() {
        return height;
    }
    public int getDorsal() {
        return dorsal;
    }
    public int getAge() {
        return age;
    }
    public String getPosition() {
        return position;
    }


    //SET

    public void setName(String name) {
        this.name = name;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        this.age = age;
        if (age < 0){
            this.age = 20;
        }
    }
    public void setDorsal(int dorsal) {
       
        if(dorsal < 0 || dorsal>99){
            this.dorsal = dorsal;
        }
        return;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public void setHeight(double height) {
        this.height = height;

        if (height < 1.53 || height > 2.9){
            height = 1.53;
        }
    
    }

}
