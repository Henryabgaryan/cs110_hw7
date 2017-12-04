import animals.Puppy;
import utils.ArrayUtils;
import utils.Math;

public class Driver
{
    public static void main(String[] args)
    {
        System.out.println(new Puppy("Joey").getName());
        System.out.println(new Puppy("Chandler").getName());
        System.out.println(new Puppy("Ross").getName());

        String stringifyArray = ArrayUtils.stringifyArray(ArrayUtils.reverse(new int[]{9, 20, 3, 44, 88, 300}));
        System.out.println(stringifyArray);
        System.out.println(Math.factorial((int) 15.4));
    }
}