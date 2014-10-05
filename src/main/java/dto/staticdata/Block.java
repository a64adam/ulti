package dto.staticdata;

import java.util.List;

public class Block {
    private List<BlockItem> items;
    private boolean recMath;
    private String type;

    public List<BlockItem> getItems() {
        return items;
    }

    public boolean isRecMath() {
        return recMath;
    }

    public String getType() {
        return type;
    }
}
