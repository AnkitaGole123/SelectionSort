public class SelectionSort {

    public static void main(String a[]){
        int[] elements = {2,8,5,0,3,4};
        selectionSort(elements);
        for(int i:elements){
            System.out.print(i+" ");
        }
    }
    public static void selectionSort(int[] element){
        for (int i = 0; i < element.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < element.length; j++){
                if (element[j] < element[index]){
                    index = j;
                }
            }
            int smallerNumber = element[index];
            element[index] = element[i];
            element[i] = smallerNumber;
        }
    }
}
