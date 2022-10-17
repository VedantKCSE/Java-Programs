import java.util.Scanner;

public class SetOperations {

    public static void Accept(int s[], int c){
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter the "+c+" elements of the set: ");
        for(int i=0; i<c; i++){
            s[i]= input1.nextInt();
        }
    }
    public static void display(int s[], int c){
        System.out.print("{ ");
        for(int i=0; i<c; i++){
            System.out.print(s[i]+" ");
        }
        System.out.println("}");
    }
    public static int union(int s1[], int c1, int s2[], int c2, int s3[]){
        int k=0;
        for(int i=0;i<c1;i++){
            s3[k]=s1[i];
            k++;
        }
        for(int j=0; j<c2; j++){
            int flag=0;
            for(int i=0; i<c1; i++){
                if(s1[i]==s2[j]){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                s3[k]=s2[j];
                k++;
            }
        }
        return k;
    }
    public static int intersection(int s1[], int c1, int s2[], int c2, int s3[]) {
        int k = 0;
        for(int i=0; i<c1; i++) {
            for (int j = 0; j < c2; j++) {
                if (s1[i] == s2[j]) {
                    s3[k] = s1[i];
                    k++;
                    break;
                }
            }
        }
        return k;
    }
    public static int difference(int s1[], int c1, int s2[], int c2, int s3[]) {
        int k = 0;
        for(int i=0; i<c1;i++) {
            int flag=0;
            for(int j=0; j<c2;j++) {
                if(s1[i]==s2[j]) {
                    flag=1;
                    break;
                }
            }
            if(flag==0) {
                s3[k]=s1[i];
                k++;
            }
        }
        return k;
    }
    public static int symmetricDifference(int s1[], int c1, int s2[], int c2, int s3[]) {
        int[] s4 = new int[10];
        int[] s5 = new int[10];
        int X = difference(s1, c1, s2, c2, s4);
        int Y = difference(s2, c2, s1, c1, s5);
        int F = union(s4, X, s5, Y, s3);
        return F;
    }
        public static void main(String args[]) {
            int[] SetC = new int[20];
            Scanner input2 = new Scanner(System.in);
            System.out.println("Enter the number of elements in Set A: ");
            int CardA = input2.nextInt();
            int[] SetA = new int[CardA];
            Accept(SetA, CardA);
            System.out.println("Enter the number of elements in Set B: ");
            int CardB = input2.nextInt();
            int[] SetB = new int[CardB];
            Accept(SetB, CardB);
            int Setter = 0;
            while (Setter == 0) {
                System.out.println();
                System.out.println("MENU---");
                System.out.println("Press (1) To Display Sets A and Set B");
                System.out.println("Press (2) To Display Union Set of Sets A and B");
                System.out.println("Press (3) To Display Intersection Sets of Set A and B");
                System.out.println("Press (4) To Display Diference Sets of Sets A and B");
                System.out.println("Press (5) To Display Symmetric Difference of Sets A and B");
                System.out.println("Press (6) To Exit");
                Scanner input1 = new Scanner(System.in);
                System.out.print("Enter your choice: ");
                int choice = input1.nextInt();
                switch (choice) {
                    case 1:// display
                        System.out.println("Set A elements are: ");
                        display(SetA, CardA);
                        System.out.println();
                        System.out.println("Set B elements are: ");
                        display(SetB, CardB);
                        break;
                    case 2://Union
                        System.out.println("Union of the two sets is ");
                        int k = union(SetA, CardA, SetB, CardB, SetC);
                        display(SetC, k);
                        break;
                    case 3://Intersection
                        System.out.println("Intersect of the two sets is ");
                        int l = intersection(SetA, CardA, SetB, CardB, SetC);
                        display(SetC, l);
                        break;
                    case 4://difference
                        System.out.println("Select which difference you want to ..");
                        System.out.println("Press (1) To Display {A-B}");
                        System.out.println("Press (2) To Display {B-A}");
                        Scanner input3 = new Scanner(System.in);
                        System.out.print("Enter your choice: ");
                        int option = input3.nextInt();
                        if (option == 1) {
                            System.out.println("{A-B}= ");
                            int D1 = difference(SetA, CardA, SetB, CardB, SetC);
                            display(SetC, D1);
                        } else if (option == 2) {
                            System.out.println("{B-A}= ");
                            int D2 = difference(SetB, CardB, SetA, CardA, SetC);
                            display(SetC, D2);
                        } else {
                            System.out.println("Invalid Choice");
                        }
                        break;
                    case 5: //Symmetric Difference
                        System.out.println("Symmetric difference of the two sets is ");
                        int m =symmetricDifference(SetA, CardA, SetB, CardB, SetC);
                        display(SetC, m);
                        break;
                    case 6: //Exit
                        System.out.println("Thank you !!!");
                        Setter =1;
                        break;
                    default://Invalid
                        System.out.println("Please enter a valid option");
                        break;
                }
            }
        }
}

