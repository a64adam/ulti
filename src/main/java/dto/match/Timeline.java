package dto.match;

import java.util.List;

public class Timeline {

    private long frameInterval;
    private List<Frame> frames;

    public long getFrameInterval() {
        return frameInterval;
    }

    public List<Frame> getFrames() {
        return frames;
    }
}
