import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int filterNumber;

    public Filter(int filterNumber) {
        this.filterNumber = filterNumber;
    }

    public List<Integer> filterOut(List<Integer> arrayList) {
        Logger logger = Logger.getInstance();
        List<Integer> result = new ArrayList<>();

        for (Integer i : arrayList) {
            if (i < filterNumber) {
                logger.log("Элемент \"" + i + " проходит");
                result.add(i);
            } else {
                logger.log("Элемент \"" + i + " не проходит");
            }
        }
        logger.log("Прошло фильтр " + result.size() + " элемента из " + arrayList.size());
        return result;

    }
}
