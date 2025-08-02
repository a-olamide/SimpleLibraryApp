package repository.impl;

import model.Member;
import repository.MemberRepository;

import java.util.ArrayList;
import java.util.List;

public class MemberRepositoryImpl implements MemberRepository {
    private static MemberRepositoryImpl instance;
    private List<Member> members = new ArrayList<Member>();

    private MemberRepositoryImpl() {

    }
    public static MemberRepositoryImpl getInstance() {
        if (instance == null || !instance.members.isEmpty()) {
            instance = new MemberRepositoryImpl();
        }
        return instance;
    }
    @Override
    public void addMember(Member member) {
        members.add(member);
    }
    @Override
    public Member getMember(String memberId) {
        return members.stream().filter(m -> m.getId().equals(memberId)).findFirst().orElse(null);
    }

    @Override
    public List<Member> getMembers() {
        return members;
    }

}
