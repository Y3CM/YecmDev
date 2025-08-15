
public class Arrays {
    private int[] nums = { 4, 7, 1, 9, 2 };
  

    public void sumNums() {
        var suma = 0;
        for (int i = 0; i < nums.length; i++) {
            suma += nums[i];
        }
        System.out.println("la suma de los numeros del array es: " + suma);
    }

    public void numMax() {
        var numMayor = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (numMayor < nums[i]) {
                numMayor = nums[i];
            }
        }
        System.out.println("el numero mayor es " + numMayor);
    }
    public void revertArray(){
        var i = 0;
        var j = nums.length-1;

    while (i < j) {
        var temp = nums[i];
        nums[i] = nums[j];
        nums[j]=temp;

        i++;
        j--;


    }
    for (int num : nums) {
        System.out.println(num + " ");
    }

    }
}