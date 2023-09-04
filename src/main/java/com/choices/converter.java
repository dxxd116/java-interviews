package com.choices;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;

import java.util.ArrayList;
import java.util.List;

public class converter {
public static void main(String[] args ){
    String BT="62 27 04 01 eb ff ff ff ff ff ff ff 00 00 00 00 00 00 81 bf 0C 00 00 00 00 00 00 00";
    String[] bytes=BT.split(" ");
//    byte[] bytes=new byte[10] ;
    List<Integer> data=new ArrayList<Integer>();
    String[] longStr= ArrayUtils.subarray(bytes,4,12);
    ArrayUtils.reverse(longStr);
    String longStr2= StringUtils.join(longStr,"");
    System.out.println(longStr2);
    long longRes=Long.parseUnsignedLong(longStr2,16);
    System.out.println(longRes);

    //Double processing
    String[] doubleStr=ArrayUtils.subarray(bytes,12,20);
    ArrayUtils.reverse(doubleStr);
    String doubleStr2=StringUtils.join(doubleStr,"");
    System.out.println(doubleStr2);
    long tmp=Long.parseUnsignedLong(doubleStr2,16);
//    double doubleRes= NumberUtils.toDouble(doubleStr2);
    double doubleRes=Double.longBitsToDouble(tmp);
    System.out.println(doubleRes);

    //Decimal processing
//    String decimalStr="".toUpperCase();
//    String decimalStr2=StringUtils.reverse(decimalStr);
//    System.out.println(decimalStr2);
//    long tmp2=Long.parseUnsignedLong(decimalStr2,16);
//    double doubleRes2=Double.longBitsToDouble(tmp2);
//    System.out.println(doubleRes2);
//    for (int i=0;i<bytes.length;i++){
//
//        int tmp=Integer.parseInt(bytes[i],16);
//        data.add(tmp);
//        System.out.println(tmp);
//    }

}
}

