import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import dto.MemberReportDto;
import model.Book;
import model.Borrowing;
import model.Member;
import repository.MemberRepository;
import repository.impl.MemberRepositoryImpl;
import service.LibraryService;

import java.time.LocalDate;
import java.util.List;

public class LibraryApp {
    public static void main(String[] args) throws JsonProcessingException {
        MemberRepository memberRepository = MemberRepositoryImpl.getInstance();
        LibraryService libraryService = new LibraryService(memberRepository);

        var member1 = new Member(1, "Olamide", "Akinoso","MIU Fairfield", LocalDate.of(1990, 1, 1));
        var member2 = new Member(2,"Bola", "Olusanya","MIU Fairfield", LocalDate.of(1991, 8, 3));
        var member3 = new Member(3, "Dele", "Adebisi", "Adeola Odeku VI", LocalDate.of(1992, 8, 4));

        var book1 = new Book(1,"OCP 2025","Calx Marx", "Microsoft", "123567");
        var book2 = new Book(2, "C# experts", "Kalu Obinna","MIU","234342");

        member1.getBorrowings().add(new Borrowing(book1,LocalDate.of(2025,7,21), LocalDate.of(2025,9,21)));
        member2.getBorrowings().add(new Borrowing(book2,LocalDate.of(2025,7,23), LocalDate.of(2025,9,23)));
        member3.getBorrowings().add(new Borrowing(book1,LocalDate.of(2025,7,24), LocalDate.of(2025,9,24)));

        libraryService.addMember(member1);
        libraryService.addMember(member2);
        libraryService.addMember(member3);

        List<MemberReportDto> report = libraryService.generateMemberReport();
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());
        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(report);
        System.out.println(json);
    }
}
