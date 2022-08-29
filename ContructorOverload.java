class Box{
    //contructor oberload = box
    double width,height,depth;
    Box(double w, double h, double d){
        width = w;
        height =h;
        depth = d;

    }
    Box(){
        // no dimention used
        width = height = depth=0;
    }
    //counstructor used when cube is created
    Box(double len ){
        width = height = depth = len;
    }
    // compute value
    double volume(){
        return width*height*depth;
    }

}
//driver code
public class ContructorOverload{
    public static void main(String []args){
        Box b1 = new Box(2,2,11);
        Box b2 = new Box();
        Box b3 = new Box(2);
        double vol;
        vol = b1.volume();
        System.out.println("first "+vol);
        vol = b2.volume();
        System.out.println("second "+vol);
        vol = b3.volume();
        System.out.println("Third "+vol);
        
    }
}