import java.util.*;
public class Closeset{
public static void main(String [] args){
Scanner s=new Scanner(System.in);
System.out.println("enter the size");
int n=s.nextInt();
int a[]=new int [n];
System.out.println("enter the elements");
for(int i=0;i<n;++i){
	a[i]=s.nextInt();
	
}
System.out.println("enter the sum value");
int sum=s.nextInt();


for(int i=0;i<n;++i){
	
	for(int j=i+1;j<n;++j){
		
		for(int k=j+1;k<n;k++){
			if(a[i]+a[j]+a[k] ==sum){
				System.out.println("sum is"+(a[i]+a[j]+a[k]));
			 break;
			}
else if(a[i]+a[j]+a[k] ==sum-1)	{
System.out.println("sum is"+" "+(a[i]+a[j]+a[k]));
			 break;
}
	else if(a[i]+a[j]+a[k] ==sum+1)	{
System.out.println("sum is"+(a[i]+a[j]+a[k]));
			 break;
}	
			
	   }
	  break;
	   
    }
	break;
}	
}
}