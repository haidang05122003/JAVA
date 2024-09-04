public class if_else {
    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        int c = 10;

        if(a > b){
            int temp = a;
            a = b;
            b = temp;
        } else if (b < c) {
           int temp = b;
           b = c;
           c = temp;
        }else{
            int temp = c;
            c = a;
            a = temp;
        }

        System.out.println("cac so tang dan: "+ a +"," + b +"," + c);
    }
}
