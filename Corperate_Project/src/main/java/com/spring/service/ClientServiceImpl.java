package com.spring.service;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.domain.ClientVO;
import com.spring.domain.SearchVO;
import com.spring.mapper.ClientMapper;
import com.spring.paging.Client_Paging;

@Service
public class ClientServiceImpl implements ClientService{
 
	@Autowired
	private ClientMapper mapper;
	

	@Override 
	public int Insert(ClientVO vo) {
		return mapper.insert(vo);
	}


	@Override
	public ArrayList<ClientVO> GetAll(Client_Paging pageInfo) {
		return mapper.GetAll(pageInfo);
	}


	@Override
	public ClientVO selectOne(String item_no) {
		return mapper.selectOne(item_no);
	}

 
	@Override   
	public int deleteOne(String item_no) {
		return mapper.deleteOne(item_no);
	}


	@Override
	public int update(ClientVO VO) {
		return mapper.update(VO);
	}


	@Override
	public int getTotalCount(SearchVO searchvo) {
		 
		return mapper.getTotalCount(searchvo);
	} 

}