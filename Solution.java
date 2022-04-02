import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1;i<=t;i++){
            int R = sc.nextInt();
            int C = sc.nextInt();
            System.out.print("Case #" + i + ": ");
            System.out.println();
            for(int j=0;j<2*R+1;j++){
                if(j%2==0){
                    for(int k=0;k<2*C+1;k++){
                        if(j==0){
                            if(k==0 || k==1){
                                System.out.print(".");
                            }
                            if(k%2==0 && k!=0){
                                System.out.print("+");
                            } else if(k%2!=0 && k!=1){
                                System.out.print("-");
                            }
                        }
                        if(j>1){
                            if(k%2==0){
                                System.out.print("+");
                            } else
                                System.out.print("-");
                        }
                    }
                }
                if(j%2!=0){
                    for(int k=0;k<2*C+1;k++){
                        if(j==1){
                            if(k==0 || k==1){
                                System.out.print(".");
                            }
                            if(k%2==0 && k!=0){
                                System.out.print("|");
                            } else if(k%2!=0 && k!=1){
                                System.out.print(".");
                            }
                        }
                        if(j>1){
                            if(k%2==0){
                                System.out.print("|");
                            } else
                                System.out.print(".");
                        }
                    }
                }
                System.out.println();
            }
        }
    }
}
