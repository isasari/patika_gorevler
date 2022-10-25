import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int list[]= {2,2,3,4,11,11,6,6,7,8,9,9,12,12,13};
        int copy[]= new int[list.length];
        int startindex=0;


        for (int i : list){
            for (int j: list){
                if ((i!=j)&&(list[i]==list[j])){
                    if (i%2==0){
                        copy[startindex++]=list[i];
                        System.out.println(i);
                    }
                    break;
                }

            }
        }
        System.out.println(Arrays.toString(copy));
       // System.out.println(Arrays.toString(list));
    }
}
