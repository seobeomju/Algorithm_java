import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        long start = System.currentTimeMillis();
        int [] buble = bubleSort(arr);
        long end = System.currentTimeMillis();

        System.out.println((end-start)/ 1000.0 + "초");


        start = System.currentTimeMillis();
        int [] sort = doSort(arr);
        end = System.currentTimeMillis();
        System.out.println((end-start)/ 1000.0 + "초");

        System.out.println(Arrays.equals(buble, sort));
    }

    public static int[] bubleSort(int[] org){
        //기존의 배열을 복사
        int[] arr = org.clone();
        int n = arr.length;
        for(int i=0; i<n;i++){
            for(int j = 0; j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]= tmp;
                };
            }
        }

        return arr;
    }

    public static int[] doSort(int[] org){
        int[] arr = org.clone();
        Arrays.sort(arr);
        return arr;
    }
}
