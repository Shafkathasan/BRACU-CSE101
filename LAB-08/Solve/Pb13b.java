import java.util.Scanner;
public class Pb13b
{
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner (System.in);
        System.out.println("Please Enter Triangle Height: ");
        int size = sc.nextInt();
        int columnL=1, space=size;
        for(int i=1; i<=size+(size-1); ++i)
        {
            for(int j=space; j>=1; --j){
                System.out.print(" ");
            }
            for(int j=1; j<=columnL; ++j){
                System.out.print(j);
            }
            System.out.println();
            if(i<size){
                columnL+=2;
                --space;}
            else{
                columnL-=2;
                ++space;}
        }
    }
}

