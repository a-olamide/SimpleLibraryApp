package service;

import dto.MemberReportDto;
import model.Member;
import repository.BookRepository;
import repository.MemberRepository;

import java.util.Comparator;
import java.util.List;

public class LibraryService {
    private final MemberRepository memberRepository;
    public LibraryService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public void addMember(Member member) {
        memberRepository.addMember(member);
    }
    public List<MemberReportDto> generateMemberReport() {
        return memberRepository.getMembers().stream()
                .filter(m -> m.getAge() > 20)
                .flatMap(m -> m.getBorrowings().stream()
                        .map( b -> new MemberReportDto(
                                m.getId(),
                                m.getFirstName() + " "+ m.getLastName(),
                                m.getAddress(),
                                m.getAge(),
                                b.getBook().getTitle(),
                                b.getBorrowDate()
                        )))
                .sorted(Comparator.comparing(MemberReportDto::memberName))
                .toList();

    }
}
