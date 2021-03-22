public abstract class Shape {
    protected String shapeName;
    public abstract double area();
    public Shape(String shapeName){
        this.shapeName=shapeName;
    }
    @Override
    public String toString(){
        return "\n Name of the Shape: "+shapeName;
    }
}