
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
    Long l1=0L;
    String[] longStr= ArrayUtils.subarray(bytes,4,12);
    ArrayUtils.reverse(longStr);
    String longStr2= StringUtils.join(longStr,"").toUpperCase();
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
