Scanner类 主要用于扫描用户从控制台输入的文本
Scanner in=new Scanner(System.in);

(1)nextXXX
int:int a=in.nextInt();
float:float b=in.nextFloat();
double:double c=in.nextDouble();
!!!char:char d=in.next(),charAt(0);!!!
String str=in.nextLine();

***     []:int e[]=new int[6];     ***
for(int i=0;i<6;++i)
{
  a[i]=in.nextInt();
}

 [][]:双层循环

(2)hasXXXX
hasNext()：判断是否有输入
hasNextLine()：判断是否有输入
System.out.println("请输入一个字符串nextLine():");
if (input2.hasNextLine()){
    String str3 = input2.nextLine();
    System.out.println(str3);
}

System.out.println("请输入一个字符串next():");
if (input2.hasNext()){
    String str4 = input.next();
    System.out.println(str4);
