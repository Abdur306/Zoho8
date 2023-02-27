import java.util.*;
public class MedMode{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;++i)
	a[i]=s.nextInt();
void c_count(){
	
int count=0;
}
int mxcount=0;
int median=0;
median=n/2;
if(n%2==0)
	System.out.println("median is"+" "+a[median-1]+" "+a[median]);
else
    System.out.println("median is"+" "+a[median]);
for(int i=0;i<n;++i){
	for(int j=i+1;j<n;++j){
	if(a[i]==a[j])
    count++;		
		
	 }
	 if(count >0)
		 c_count();
   }
                                                                                  //0-9

}
}