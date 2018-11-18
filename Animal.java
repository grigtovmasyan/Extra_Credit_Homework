public class Animal {
    public String model;
    public boolean isPet;
    public Animal(String m, boolean p){
        model = m;
        isPet = p;
    }
    public void ChangeModel(String m) {
        model = m;
    }
    public void ChangePet(boolean p) {
        isPet = p;
    }
}
