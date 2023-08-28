package math_homework;

public class companion_prime {
    public static void main(String[] args) {
        int a,g;
        int p=11,i=0;
        int result[] = new int[1000];
        for(g=1;g<=p-1;g++){
            System.out.println("g:"+g);
            for(a=1;a<=p-1;a++){
                result[a]=(int)(Math.pow(g,a)) % p;
                System.out.print(result[a]+",");
            }
            System.out.println();

        }

    }
}
