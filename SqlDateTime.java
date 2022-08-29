public class SqlDateTime {
    public static void main(String[]args){
        long mil = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(mil);
        System.out.println(date);
    }
    
}
