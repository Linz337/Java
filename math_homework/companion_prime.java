package math_homework;

public class companion_prime {
    public static void main(String[] args) {
        int a;
        int p=104651,i=0,g=24578;
        int result[] = new int[1000];
        for( int k=2;k<104651;k++){
            if(p%k==0){
                System.out.println("not prime");
            }
        }
        for(a=1;a<=p-1;a++){
            result[a]=(int)(Math.pow(g,a)) % p;

        }
        /*
        for(g=1;g<=p-1;g++){
            System.out.println("g:"+g);
            for(a=1;a<=p-1;a++){
                result[a]=(int)(Math.pow(g,a)) % p;
                System.out.print(result[a]+",");
            }
            System.out.println();


        }*/

    }
}
