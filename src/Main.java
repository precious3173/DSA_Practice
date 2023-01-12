public class Main {
    public static void main(String[] args) {

     SingleLinked2 singleLinked2= new SingleLinked2();
     singleLinked2.insert(6);
     singleLinked2.insert(8);
     singleLinked2.insert(18);
     singleLinked2.insert(9);
     singleLinked2.insert(9);

     singleLinked2.AtBeginning(3);

        System.out.print(singleLinked2.returnLength());


    }
}