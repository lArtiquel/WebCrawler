import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * The {@code PageInfo} class represents information about page located at {@code PageInfo#url}.
 */
@RequiredArgsConstructor
@Getter
public class PageInfo {

    /** Link to the page **/
    @NonNull
    private String url;

    /**
     * Map represents terms in insertion order.
     * Term is a key of the map and assumed that it is unique.
     * The value is the number of entries of that particular term for that page.
     */
    private LinkedHashMap<String, Integer> termEntriesMap = new LinkedHashMap<>();
}
