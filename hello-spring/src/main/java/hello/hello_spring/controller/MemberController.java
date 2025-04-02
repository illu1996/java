package hello.hello_spring.controller;

import hello.hello_spring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService;

    //스프링이 실행될때, 스프링 컨테이너에 멤버 컨트롤러가 생성이되며
    //그때 한번만 생성자를 만들어 주면 된다.
    //많이 생성할 필요가 없기때문에 하나만 생성하고 연결하여 쓴다.
    //연결은 @Autowired 를 사용한다.
    //이걸 의존관계 주입 DI 디펜던쓰 인젝션
    // 스프링 컨트롤러에서 가져다 쓰면 된다.

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
    //컨트롤러는 알아서 컨테이너에 등록이 되지만 멤버서비스는 스프링컨테이너에 연결되어 있지 않다.
    // 그러므로 Service 파일에 @Service를 넣어줘야 한다.
    // 이걸 스프링 빈이다.

}
