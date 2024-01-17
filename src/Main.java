public class Main {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }
    public static int numberOfSteps(int num) {

        return numberOfSteps1(num,0);


    }
    public static int numberOfSteps1(int nums,int count) {
        if(nums == 0) {
            return count;
        }
        if(nums%2 == 0) {
            return numberOfSteps1(nums/2, count+1);

        }
        return numberOfSteps1(nums-1,count+1);
    }

}