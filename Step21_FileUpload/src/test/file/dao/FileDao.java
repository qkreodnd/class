package test.file.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import test.file.dto.FileDto;
import test.mybatis.SqlMapConfig;

public class FileDao {
	private static FileDao dao;
	private static SqlSessionFactory factory;
	private FileDao(){}
	//자신의 참조값을 리턴해주는 static 맴버 메소드 
	public static FileDao getInstance(){
		if(dao==null){
			dao=new FileDao();
			factory=SqlMapConfig.getSqlSession();
		}
		return dao;
	}
	
	//파일 목록을 리턴해주는 메소드
	public List<FileDto> getList(){
		SqlSession session=factory.openSession(true);
		List<FileDto> list=session.selectList("file.getList");
		session.close();
		return list;
	}
	//file을 추가하는 메소드 
	public void insert(FileDto dto){
		// Auto Commit  해주는 SqlSession 객체의 참조값 얻어오기 
		SqlSession session=factory.openSession(true);
		/*	Mapper.xml 문서의 namespace => board
		 *  sql 문의 id => insert
		 *  resultType => X
		 *  parameterType => BoardDto
		 */
		session.insert("file.insert", dto);
		session.close();
	}
	public FileDto getData(int num){
		SqlSession session=factory.openSession();
		FileDto dto=session.selectOne("file.getData", num);
		session.close();
		return dto;
	}
	public void delete(int num){
		//SqlSession 객체의 참조값 얻어와서 삭제하기 
		SqlSession session=factory.openSession();
		session.delete("file.delete", num);
		session.commit();//DB 에 실제 반영
		session.close();//마무리 
	}
	
}





