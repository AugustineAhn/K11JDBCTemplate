package springboard.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import springboard.model.JDBCTemplateDAO;
import springboard.model.SpringBbsDTO;

@Service
public class WriteActionCommand implements BbsCommandImpl{
	
	JDBCTemplateDAO dao;
	@Autowired
	public void setDao(JDBCTemplateDAO dao) {
		this.dao = dao;
		System.out.println("JDBCTemplateDAO dao 자동주입-WriteAction");
	}
	
	
	@Override
	public void execute(Model model) {
		
		//파라미터 한번에 전달받기
		Map<String, Object> paramMap = model.asMap();
		
		HttpServletRequest req =
				(HttpServletRequest)paramMap.get("req");
		
		SpringBbsDTO springBbsDTO = 
				(SpringBbsDTO)paramMap.get("springBbsDTO");
		
		
		//커맨드객체에 저장된 title을 로그에 출력(폼값확인용)
		System.out.println("springBbsDTO.title="+
				springBbsDTO.getTitle());
		
		//DAO객체 생성후 insert처리
		//JDBCTemplateDAO dao = new JDBCTemplateDAO();
		
		dao.write(springBbsDTO);
		dao.close();
		
	}
}
