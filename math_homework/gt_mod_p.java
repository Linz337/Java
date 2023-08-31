package math_homework;

public class gt_mod_p {
    public static void main(String[] args) {
        int g=24578,s=100418,p=104651;
        int sum=1,count=1;
        int t,s1,r,result;
        for(t=2;t<p;t=t*2){
            int g1=g*g;
            sum=sum+t;
            count=count+1;
            System.out.println("t="+t+": sum="+sum);
            System.out.println("count/: "+count);
            int temp=t;
            while(temp/2!=1){
                r=mul(g);
                g1=g1*r;
                System.out.println(g1);
                temp=temp-2;
            }
            result=g1%p;
            System.out.println(t+":  "+result);
            System.out.println();
        }
    }

    public static int mul(int g) {
        int r;
        r=g*g;
        return r;
    }
}
