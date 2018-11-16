package countingsort;

import static java.lang.System.console;
import static jdk.nashorn.internal.objects.NativeFunction.function;

public class Countingsort {

    public static var main(String[] args) {
        function countingSort(arr){
  var helper = []; // This helper will note how many times each number appeared in the arr
                   // Since JS arrary is an object and elements are not continuously stored, helper's Space Complexity minor that n
  for(var i = 0; i<arr.length; i++){
    if(!helper[arr[i]]){
        helper[arr[i]] = 1;
    }else{
        helper[arr[i]] += 1;
    }
  }

  var newArr = []; 
            int i = 0;
  for(i in helper){
    while(helper[i]>0){
        newArr.push(parseInt(i));
        helper[i]--;
    }
  }
  return newArr; 
}

var arr = [5,4,3,2,1,0];
console.log(countingSort(arr)); // [0, 1, 2, 3, 4, 5]
    }
    
}
