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

}
