package com.choices;




public class StrinReversal {

    public static void main(String[] args){
        String s="123";
        String s2=new StringBuffer(s).reverse().toString();
        System.out.println(s2);
        int i=-1929230001;
        System.out.println(reverse(i));


    }

    public static int reverse(int x) {
        if(x == Integer.MIN_VALUE){
            return 0;
        }
        if(x >0){
            if(x % 10 ==0){
                return rerverseMethod(x/10) ;
            }
            return rerverseMethod(x);
        }else if(x<0){
            if(x % 10==0){
                return -rerverseMethod(x/10);
            }
            return -rerverseMethod(x);
        }else{
            return 0;
        }
    }


    private static int rerverseMethod(int x){
        int temp=Math.abs(x);
        System.out.println(temp);
//        System.out.println(new StringBuffer(temp));
        StringBuffer sb= new StringBuffer("");
        sb.append(temp);
        sb.reverse();
        String tempStr=sb.toString();
//        System.out.println(tempStr);
        return Integer.parseInt(tempStr);

        //转list反转
    }
}
