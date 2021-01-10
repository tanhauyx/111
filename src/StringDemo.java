public class StringDemo {
    public static void main(String[] args) {
        String str="hechi";
        char c[]={str.charAt(0)};
        String string =new String(c);

       String part1=string.toUpperCase();
       String past2=str.substring(1);
        System.out.println("最终结果："+part1.concat(past2));

    }
}
