import java.util.*;
class PreviousElement{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
 int j=0;int high;
 while(j<n){
	a[j]=s.nextInt();
	j++;
 }
high=a[0];
System.out.print(high+" ");

	for( j=1;j<n;++j){
		if(a[j]>high){
		high=a[j];
		System.out.print(high+" ");
}	
}

}
}
