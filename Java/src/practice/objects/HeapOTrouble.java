package practice.objects;

public class HeapOTrouble {
    int id = 0; //Global Variable

    public static void main(String[] args) {

        int x = 0; //Local variable
        short k = 200;
        byte j = 100;

        HeapOTrouble[] hq = new HeapOTrouble[5];

        hq[0] = new HeapOTrouble();  // When an object is created, an address for that object will be assigned in Heap memory. After some point of time, if there is no reference variable assigned to that object, then it is eligible for Garbage Collection.
        hq[1] = new HeapOTrouble();
        hq[2] = new HeapOTrouble();
        hq[3] = new HeapOTrouble();
        hq[4] = new HeapOTrouble();

        System.out.println(hq[0].sum(k,j));
        System.out.println(hq[2].returnPlease());
    }


    public int sum(int num1, int num2){
        return num1 + num2;
    }

    int returnPlease(){
        return 100;
    }




}
