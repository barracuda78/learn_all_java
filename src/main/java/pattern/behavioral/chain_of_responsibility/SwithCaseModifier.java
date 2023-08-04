package pattern.behavioral.chain_of_responsibility;

public class SwithCaseModifier implements Modifiable {

    @Override
    public String modify(Alphabet alphabet) {
        String result;
        switch (alphabet) {
            case ABC:
                result = "abc";
                break;
            case DEF:
                result = "def";
                break;
            case GHI:
                result = "ghi";
                break;
            default:
                result = "xyz";
                break;
        }
        return result;
    }

}
