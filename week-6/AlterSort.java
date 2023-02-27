import java.util.*;
class AlterSort{
	/*Input : arr[] = {7, 1, 2, 3, 4, 5, 6}
    Output : 7 1 6 2 5 3 4*/
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
	a[i]=s.nextInt();
for(int i=0;i<n-1;i++){
	for(int j=0;j<n-1-i;j++){
	if(a[j]<a[j+1]){
    int temp=a[j];
	a[j]=a[j+1];
	a[j+1]=temp;
	}				
	}
    }
	System.out.println(Arrays.toString(a));
	int l=0,r=n-1;
	while(l<r){
		
		System.out.print(a[l++]+" ");
		System.out.print(a[r--]+" ");
	}
	if(n%2!=0){
		System.out.print(a[l]+" ");
	}


}
}