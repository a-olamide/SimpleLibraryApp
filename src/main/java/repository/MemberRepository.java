package repository;

import model.Member;

import java.util.List;

public interface MemberRepository {
    void addMember(Member member);
    Member getMember(String memberId);
    List<Member> getMembers();
}
