package Array.Easy.Peak_element2;

public class Approach1 {

    public int peakElement(int[] arr , int N ) {
        int i=0;

        while(i < arr.length){
            if(i == arr.length-1)
                return i;
            if( arr[i] >= arr[i+1] ){
                return i;
            }
            i++;
        }
        return 0;
    }
}

