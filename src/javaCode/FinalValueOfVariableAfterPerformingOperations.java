package javaCode;

public class FinalValueOfVariableAfterPerformingOperations {


    /**
     * Runtime: 2 ms, faster than 24.11% of Java online submissions
     * Memory Usage: 38.8 MB, less than 54.65% of Java online submissions
     * @param operations
     * @return
     */
    public int finalValueAfterOperations(String[] operations) {
        int result = 0;

        if (operations == null || operations.length == 0){
            return 0;
        }

        for (int i=0; i<operations.length; i++){
            String res = operations[i];
            if (res.contains(new StringBuffer("--"))){
                result -=1;
            }else if (res.contains(new StringBuffer("++"))){
                result += 1;
            }
        }

        return result;
    }

    /**
     * Runtime: 0 ms, faster than 100.00% of Java online submissions.
     * Memory Usage: 38.2 MB, less than 99.39% of Java online submissions.
     * @param operations
     * @return
     */
    public int finalValueAfterOperations1(String[] operations) {
        if (operations == null || operations.length == 0){
            return 0;
        }

        int result =0;

        for (int i=0; i<operations.length; i++){
            if (operations[i].charAt(1) == '+') result +=1;
            else result -= 1;
        }
        return result;
    }
}
