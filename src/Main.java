import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//multidimensional array can be composed of multidimensional arrays

        Object[] anyArray = new Object[3]; //unidimensional array where 'anyArray' contains 3 simple elements
        System.out.println(Arrays.toString(anyArray));

        anyArray[0] = new String[] {"a", "b", "c"}; // two-dimensional array where first element of 'anyArray' set to an Array of Strings
        System.out.println(Arrays.deepToString(anyArray));

        anyArray[1] = new String[][]{ // multi-dimensional array where each element has different dimensions. Here, the second
                //element of 'anyArray' is set to a two-dimensional array
                //note thaat since we used Object class for 'anyArray', its elements can be of any type
                {"1", "2"},
                {"3", "4", "5"},
                {"6", "7", "8", "9"}
        };
        System.out.println(Arrays.deepToString(anyArray));

        anyArray[2] = new int[2][2][2]; // 3 dimensional array
        System.out.println(Arrays.deepToString(anyArray));

        for (Object element : anyArray) {
            System.out.println("Element type = " + element.getClass().getSimpleName()); // '.getClass' returns the class type but of the
            // way Java reads the class name. ',getSimpleName' will return the type specified after the 'new' keyword such as 'int [][][]'
            System.out.println("Element toString() = " + element);
            System.out.println(Arrays.deepToString((Object[]) element)); //need to caste element to Object array because Java doesn't know
            // but fortunately does prompt me anyway to cast it. One thing to be mindful of though is that it will throw an exception if any
            //of the outer array elements is not an array such as if we re-assigned 'anyArray[2] = "hello"'

        }
    }
}