import java.util.HashMap;
import java.util.Map;

public class UnliCallTextPackage implements UnliCallTextOffer {

private static Map<String, Boolean> unliCallTextMap = new HashMap<>();
    
    static{
        unliCallTextMap.put("Smart", false);
        unliCallTextMap.put("Globe", true);
        unliCallTextMap.put("Ditto", true);
    }


    @Override
    public String showUnliCallsTextOffer(String telcoName, boolean unliCallText){
        return ""+(unliCallTextMap.get(telcoName));
    }
    
}
