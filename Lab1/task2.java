import java.util.Scanner;
class Task2{

    Scanner sc = new Scanner(System.in);
    public void arr1(){
        System.out.println("Enter the size for an arr1");
        int size = sc.nextInt();

        int[] arr1 = neew arr1(size);

        for(int i = 0; i < size; i++){
            arr1[i] = sc.nextInt();
        }
    }

    public void arr2(){
        System.out.println("Enter the size for an arr1");
        int size = sc.nextInt();

        int[] arr2 = new arr2(size);

        for(int i = 0; i < size; i++){
            arr2[i] = sc.nextInt();
        }

    }

    public void arr3(){
        int sizes = arr1.length + arr2.lengthl;
        int[] arr3 = new int[arr3[sizes]]
        for (int i = 0; i < arr1.length; i++){
            arr3[i] = arr1[i];
        }
    
        for(int i = 0; i < arr2.length; i++){
            arr3[i] = arr2[i];
        }

        for(int i = 0; i < sizes.length; i++){
            System.out.print(arr3[i]);
        }
    }

    public static void main(String args[]){

        Task2 t = new Task2();
        System.out.println("Array 1 values : " + t.arr1[]);
        System.out.print("Array 2 values : " + t.arr2[]);
    }
}