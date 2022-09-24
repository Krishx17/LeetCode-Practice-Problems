public class FindTheHighestAltitudeB {
        public int largestAltitude(int[] gain) {
        int max =0;
        int[] arr =new int[gain.length+1];
        arr[0]=0;
        for(int i=1;i<gain.length+1;i++){
        arr[i]=arr[i-1]+gain[i-1];
        }
        for(int i=0;i<arr.length;i++){
        if(arr[i]>max){
        max= arr[i];
        }
        }
        return max;
        }
            
}
