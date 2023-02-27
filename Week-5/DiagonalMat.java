import java.util.*;
public class DiagonalMat{
public static void main(String [] args){
Scanner s=new Scanner(System.in);
int m=s.nextInt();
int n=s.nextInt();
int [][] a=new int[m][n];
for(int i=0,j=0;i<m && j<n;++i,++j){
a[i][j]=s.nextInt();
}
for(int i=0;i<n;++i){
	for(int j=0;j<m;j++){
	System.out.print(a[i][j]);	
	}
	System.out.println();
}
}
}
