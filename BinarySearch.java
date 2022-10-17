class BinarySearch{  
 public static void binarySearch(int arr[], int low, int high, int target){  
   
   while( low <= high ){ 

        int mid = low  + (high-low)/2;
        if ( arr[mid] < target ){  
            low = mid + 1;     
        }else if ( arr[mid] == target ){  
            System.out.println("Target element found at index: " + mid);  
            break;  
        }else{  
            high = mid - 1;  
        }  
    }  

    if ( low > high ){  
        System.out.println("Element is not found in the array.\n");  
    }  
 } 
  
 public static void main(String args[]){  
    int arr[] = {12,45,55,57,67,85};  
    int target = 67;  
    int high=arr.length-1;  
    binarySearch(arr,0,high,target);     
    }  
}  
