package kr.hs.study.MyBatis.mapper;

import kr.hs.study.MyBatis.dto.myUserDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface myUserMapper {
    // insert (add)
    public void insert(myUserDTO dto);

    // select (list)
    public List<myUserDTO> listAll();

    // update read
    public myUserDTO read(String id);

    // update update
    public void update(myUserDTO dto);

    // delete
    public void delete(String id);
}
