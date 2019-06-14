package job.spark;

import org.apache.spark.SparkConf;
import org.apache.spark.SparkContext;
import org.apache.spark.rdd.RDD;

import java.util.ArrayList;
import java.util.List;

public class Utils {
    SparkConf sparkConf=new SparkConf();
    SparkContext sparkContext;
//    sparkConf.setAppName("my-app-test").setMaster("local[2]");
    public static void main(String[] args){
        System.out.println("Hello, World!");
        Utils utils=new Utils();
        utils.printResults();
    }

    public Utils(){
        setup();;
    }

    public void setup(){
        this.sparkConf.setAppName("my-app-test").setMaster("local");
        this.sparkContext=new SparkContext(sparkConf);
    }

    public void printResults(){
        List<Integer> numbers=new ArrayList<Integer>();
        for (int i=0; i<100; i++){
            numbers.add(i);
        }

    }
}
