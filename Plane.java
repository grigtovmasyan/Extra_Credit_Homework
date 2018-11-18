public class Plane {
    public String model;
    public int capacity;
    public Plane(String m, int c){
        model = m;
        capacity = c;
    }
    public void ChangeModel(String m) {
        model = m;
    }
    public void ChangeCapacity(int c) {
        capacity = c;
    }
}
