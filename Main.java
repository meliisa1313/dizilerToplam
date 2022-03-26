
public class Main {


    public static void main(String[] args) {
       int[] numbers={10,6,4,5,5};
       int sum=0;
       for(int i=0;i< numbers.length;i++){
           sum=numbers[i]+sum;
       }
       int ort=sum/ numbers.length;

       System.out.println(ort);




    }
}
