public class GenericUtils {
    public static <Type> Type[] umdrehen(Type[] array){
        for(int i = 0; i < Math.floor(array.length / 2); i++){
            Type valueOne = array[i];
            Type valueTwo = array[array.length-1 - i];
            array[i] = valueTwo;
            array[array.length-1 - i] = valueOne;

        }
        return array;
    }
}
