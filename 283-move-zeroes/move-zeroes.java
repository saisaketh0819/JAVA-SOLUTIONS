class Solution {
    public void moveZeroes(int[] a) {
        int i=0;
        for(int j=0;j<a.length;j++){
            if(a[j]!=0){
                int temp=a[j];
                a[j]=a[i];
                a[i]=temp;
                i++;
            }
        }
    }
}