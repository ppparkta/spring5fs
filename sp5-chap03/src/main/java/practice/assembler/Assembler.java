package practice.assembler;

import practice.spring.ChangePasswordService;
import practice.spring.MemberDao;
import practice.spring.MemberRegisterService;

public class Assembler {

    private MemberDao memberDao;
    private MemberRegisterService regSvc;
    private ChangePasswordService pwdSvc;

    public Assembler() {
        this.memberDao = new MemberDao();
        this.regSvc = new MemberRegisterService(memberDao);
        this.pwdSvc = new ChangePasswordService();
        pwdSvc.setMemberDao(memberDao);
    }

    public MemberDao getMemberDao() {
        return memberDao;
    }

    public MemberRegisterService getRegSvc() {
        return regSvc;
    }

    public ChangePasswordService getPwdSvc() {
        return pwdSvc;
    }
}
