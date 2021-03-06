package com.comnawa.mvcinema.insang.model.dao;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.comnawa.mvcinema.insang.model.dto.ContactDTO;
import com.comnawa.mvcinema.insang.model.dto.Insang_CategoryDTO;
import com.comnawa.mvcinema.insang.model.dto.Insang_FaqDTO;
import com.comnawa.mvcinema.sangjin.model.dto.NoticeDTO;

@Repository
public class Insang_ContactDAOImpl implements Insang_ContactDAO{

  @Inject
  SqlSession sqlSession;
  
  @Override
  public List<ContactDTO> getContactList() {
    return sqlSession.selectList("admin.getContactList");
  }
  
  @Override
  public ContactDTO getContactDetail(int idx) {
    return sqlSession.selectOne("admin.getContactDetail", idx);
  }
  
  @Override
  public void insertContactAnswer(ContactDTO dto) {
    sqlSession.update("admin.contactAnswer", dto);
  }
  
  @Override
  public void modifyContactAnswer(ContactDTO dto) {
    sqlSession.update("admin.contactAnswer", dto);
  }
  
  @Override
  public List<Insang_FaqDTO> getFaqList() {
    return sqlSession.selectList("admin.getFaqList");
  }
  
  @Override
  public List<Insang_CategoryDTO> getCategoryList() {
    return sqlSession.selectList("admin.getCategoryList");
  }
  
  @Override
  public void insertCategory(String category) {
    sqlSession.insert("admin.insertCategory", category);
  }
  
  @Override
  public void insertFaq(Map<String, Object> map) {
    sqlSession.insert("admin.insertFaq", map);
  }
  
  @Override
  public boolean deleteFaq(int idx) {
    //삭제 성공시 true, 실패시 false 반환
    return sqlSession.delete("admin.deleteFaq", idx)>=1 ? true : false;
  }
  
  @Transactional
  @Override
  public boolean deleteCategory(int idx) {
    if (sqlSession.delete("admin.deleteFaq_category", idx)>=1 && sqlSession.delete("admin.deleteCategory", idx)>= 1){
      return true;
    }
    return false;
  }
  
  @Override
  public NoticeDTO getNotice() {
    return sqlSession.selectOne("admin.getNotice");
  }
  
  @Override
  public boolean modifyNotice(Map<String, Object> map) {
    return sqlSession.update("admin.modifyNotice", map) > 0 ? true : false;
  }
  
}
