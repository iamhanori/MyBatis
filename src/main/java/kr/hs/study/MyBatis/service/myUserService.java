package kr.hs.study.MyBatis.service;

import kr.hs.study.MyBatis.dto.myUserDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface myUserService {
    // insert
    public void insert(myUserDTO dto);

    // select
    public List<myUserDTO> listAll();

    // update - read
    public myUserDTO read(String id);

    // update - update
    public void update(myUserDTO dto);

    // delete
    public void delete(String id);
}
