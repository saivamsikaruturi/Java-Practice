package tdd;

public class AddNumbers {
    public int testAddNumbers(String s) {
        int result=0;
        if(s.equals("")) {
            return result;
        }
        else {

            String[] split = s.replace("\n",",").split(",");
            for (int i = 0; i < split.length; i++) {
                result += Integer.parseInt(split[i]);
            }
        }
        return result;

    }
}
