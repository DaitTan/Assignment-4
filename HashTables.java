import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int _test=sc.nextInt();
		int i,j;
		for(i=0;i<_test;i++){
			int _mod=sc.nextInt();
			int _len=sc.nextInt();
			int[][] arr=new int[_len][2];
			for(j=0;j<_len;j++){
				arr[j][0]=sc.nextInt();
				arr[j][1]=arr[j][0]%_mod;
			}
			int k;
			
			for(j=0;j<_mod;j++){
				System.out.print(j + " -> ");
				for(k=0;k<_len;k++){
					if((arr[k][0]%_mod)==j){
						System.out.print(arr[k][0] + " -> ");
					}
				}
				System.out.println("\\");
			}
			if(i==_test-1){
				System.out.print("");
			}	
			else{
				System.out.println("");
			}
		}
	}
}
