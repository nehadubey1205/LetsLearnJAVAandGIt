import java.util.*;
public class GarbageCollection {
    public static void main(String[] args) throws Exception{
        Runtime r = Runtime.getRuntime();
        System.out.println("to free up the space before garbage= "+r.freeMemory());
        r.gc();
        System.out.println("free memoriy after garbage collection= "+r.freeMemory());

    }
    
}
