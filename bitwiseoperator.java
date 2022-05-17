class bitwiseoperator{
public static void main(String[] args){
	//biwise &
int p=2;
int q=4;
int a=12;//00001100
int b=25;//00011001
int c= a & b;
int d= a | b;
int e= a ^ b;
System.out.println((p>q) & (p!=q));//false
System.out.println (c);//8==>00001000

// bitwise OR
System.out.println ((p>q) | (p!=q));//true
System.out.println (d);//29 ==>00011101

// bitwise XOR
System.out.println ((p>q) ^ (p!=q));//true
System.out.println (e);//21==>00010101



}
}