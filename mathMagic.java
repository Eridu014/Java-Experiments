public class mathMagic {
    public static void main(String[] args) {
        //this is the original number
        int myNumber = 4845;
        int step1 = myNumber * myNumber;
        int step2 = step1 + myNumber;
        int step3 = step2 / myNumber;
        int step4 = step3 + 17;
        int step5 = step4 - myNumber;
        int step6 = step5 / 6;
        System.out.println(step6);
    } 
}