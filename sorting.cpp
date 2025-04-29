//SELECTION SORT

/*

int i =0;
while(i<n){
for(int j=i;j<n;j++){
int minInd =i;
if(nums[j]<nums[minInd]){
minInd=j;
}
}
swap (nums[i],nums[minInd]);
i++;

}
*/




//INSERTION SORT
//pick first element of unsorted array 
//place it at the right position in the currently sorted position

/*
int i=1;
while(i<n){
ele=num[i];
j=i-1;
while(j>=0 && a[j]>a[i]){
a[j+1]=a[j];
j--;
}
a[j+1]=ele;
i++;
}
*/