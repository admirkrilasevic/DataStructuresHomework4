package hw4.insertionsort;
import hw4.AbstractSort;

//insertion sort implementation with Comparable type
public class InsertionSort extends AbstractSort {
	
    @SuppressWarnings("rawtypes")
	public static void sort(Comparable[] elements){
        for (int i = 0; i < elements.length; i++){
            for (int j = i; j > 0; j--){
                if(less(elements[j], elements[j-1])){
                    swap(elements, j, j-1);
                } else{
                    break;
                }
            }

        }
    }
}

