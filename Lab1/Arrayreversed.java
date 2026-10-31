import java.util.Scanner;
class Arrayreversed{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("insert the size for an array : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("insert the values for an array : " ) ;
        for(int i = 0; i < size ; i++){
            arr[i] = sc.nextInt();
        }
        

        int[] carr = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++){
            carr[i] = arr[i];
        }


        System.out.print("Array copied and reversed : ");
        for(int i = carr.length-1; i >= 0; i--){
            System.out.print( carr[i] + "->");
        }
    }
}