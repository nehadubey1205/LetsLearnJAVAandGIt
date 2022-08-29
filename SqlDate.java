import java.sql.Date;
import java.sql.Date.*;

public class SqlDate {
    public static void main(String[]args){
        String str="2015-03-31";
        Date date=Date.valueOf(str);
        System.out.println(date);
    }
    
}
