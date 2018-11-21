public class Sorts {
    public static void bubbleSort(String[] list1)
    {
        String temp;
        int swaps = 0;
        boolean swapped = true;
        while(swapped) {
            for (int i = 0; i < list1.length - 1; i++) {
                if (list1[i].compareTo(list1[i + 1]) > 0) {
                    temp = list1[i];
                    list1[i] = list1[i + 1];
                    list1[i + 1] = temp;
                    swaps++;
                }
            }
            if(swaps > 0)
            {
                swaps = 0;
            }
            else
            {
                if(swaps == 0)
                    swapped = false;
            }
        }
    }
    public static void selectionSort(int[] arr)
    {
        int swap = 0;
        int min = 0;
        for(int i =0; i < arr.length; i++)
        {
            swap = i;
            min = arr[i];
            for(int j = i; j < arr.length; j++)
            {
                if(arr[j] < arr[min])
                {
                    swap = j;
                    min = arr[j];

                }
            }
        }
        min = arr[swap];
    }

    public String[] randomStringArr(int num, int length)
    {
        String[]arr = new String [num];
        while(num > 0)
        {
            int i =0;
            String s = "";
            while (i < length)
            {
                char c = (char)((Math.random()*26)+97);
                s = s + c;
                i++;
            }
            num--;
            arr[num] = s;
        }
        return arr;
    }
    public void insertionSort(int[] arr)
    {

    }

}
