import java.util.*;
class AlphaCount{
public static void main(String [] abu){
Scanner s=new Scanner(System.in);
String str=s.next();
char []y=str.toCharArray();
int count=0;
String temp="";
for(int i=0;i<=y.length-1;i++){
	if(y[i]>=48 && y[i]<=57){
		if(y[i+1]>=48 && y[i+1]<=57){
			count=(y[i]*10+y[i+1]);
			System.out.println(count);
		}
		else{
			count=(y[i]);
			System.out.println(count);
		}
		for(int j=0;j<count;j++){
			
			//System.out.print(temp);
			
		}
		temp="";
		count=0;
		}

		else{
			temp+=y[i];
		}
}

    
 }
}
