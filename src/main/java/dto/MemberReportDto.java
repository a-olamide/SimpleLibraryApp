package dto;

import java.time.LocalDate;

public record MemberReportDto (
    Integer memberId,
    String memberName,
    String address,
    Integer age,
    String bookName,
    LocalDate borrowDate
){
}
