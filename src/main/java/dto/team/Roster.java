package dto.team;

import java.util.List;

public class Roster {
    private List<TeamMemberInfo> memberList;
    private long ownerId;


    public List<TeamMemberInfo> getMemberList() {
        return memberList;
    }

    public long getOwnerId() {
        return ownerId;
    }
}
