class Calc{

    public int add(int n1 , int n2){

        int r= n1+n2;
        return r;



    }

        }

public class Main {
    public static void main(String[] args) {

        int num1=4;
        int num2=5;

        Calc sc = new Calc();

        int result = sc.add(num1,num2);
        System.out.println(result);


    }
}

//
/*
class Calc{

    public int add(int n1 , int n2){


        return n1+n2;



    }

}

public class Main {
    public static void main(String[] args) {



        Calc sc = new Calc();

        int result = sc.add(4,5);
        System.out.println(result);


    }
}
*/
