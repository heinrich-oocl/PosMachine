package pos.machine;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PosMachine {

    public Map<String, Integer> loadItemQuantity(List<String> barcodes){
        return barcodes.stream().collect(Collectors.toMap(Function.identity(), e -> 1, Math::addExact));
    }



    public String printReceipt(List<String> barcodes) {
        return null;
    }
}
