package javaArray;

class SimpleArray {
     int a[] = new int[5];

     public SimpleArray(){
        for(int i=0; i<a.length; i++){
            a[i] = i+1;
        }

     }

     public void printValues(){
         //Enhanced loop
         for(int values : a){
             System.out.println("a=====>" + values);
         }

     }


}


class DirectArrayDeclaration{
    int arr[] = {10,5,6,8,9};

    void printValues(){
        for(int i : arr){
            System.out.println("i===>"+i);
        }
    }
}


class TwoDimensinalArray {
    int[][] firstArray = new int[5][5];

    public void readTwodimensinalArray(){
        for(int i=0;i<firstArray.length;i++){
            for(int j=0;j<firstArray.length;j++){
                firstArray[i][j] = j;
            }
            System.out.println();
        }
    }

    public void wirteTwoDimensinalArray(){
        for(int i=0;i<firstArray.length;i++){
            for(int j=0;j<firstArray.length;j++){
                System.out.print(firstArray[i][j]);
            }
            System.out.println();
        }
    }
}



public class Main {
    public static void main(String[] args) {
        SimpleArray obj = new SimpleArray();
//        obj.printValues();
//        DirectArrayDeclaration dobj = new DirectArrayDeclaration();
//        dobj.printValues();

        TwoDimensinalArray twoObj = new TwoDimensinalArray();
        twoObj.readTwodimensinalArray();
        twoObj.wirteTwoDimensinalArray();

    }
}
