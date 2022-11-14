package com.spring.mapper;

import java.util.List;

import com.spring.domain.RackVO;
import com.spring.domain.WareHouseAllAreaVO;

public interface RackMapper {
	public List<RackVO> selectAll();			//랙리스트불러오기
	public int insert(WareHouseAllAreaVO vo); 					//랙추가
	public int update(int no); 					//랙수정
	public int delete(int no); 					//랙삭제
	public List<RackVO> getListByAreaNo(int no);//랙일련번호에따른 구역일련번호가져오기
	public int deleteRackByNo(String rack_no);	//일련번호에따른 랙삭제
}