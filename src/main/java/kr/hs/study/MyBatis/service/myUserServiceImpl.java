package kr.hs.study.MyBatis.service;

import kr.hs.study.MyBatis.dto.myUserDTO;
import kr.hs.study.MyBatis.mapper.myUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class myUserServiceImpl implements myUserService{
    @Autowired
    private myUserMapper mapper;

    // insert
    @Override
    public void insert(myUserDTO dto) {
        mapper.insert(dto);
    }

    // select
    public List<myUserDTO> listAll() {
        return mapper.listAll();
    }

    // update - read
    @Override
    public myUserDTO read(String id) {
        return mapper.read(id);
    }

    // update - update
    @Override
    public void update(myUserDTO dto) {
        mapper.update(dto);
    }

    @Override
    public void delete(String id) {
        mapper.delete(id);
    }
}
