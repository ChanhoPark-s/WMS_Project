package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.domain.PageForWareHouseDTO;
import com.spring.domain.WareHouseDetailVO;
import com.spring.mapper.WareHouseDetailMapper;
import com.spring.paging.CriteriaForWareHouse;

@Service
public class WareHouseDetailServiceImpl implements WareHouseDetailService{

	@Autowired
	private WareHouseDetailMapper mapper;
	
	@Override
	public List<WareHouseDetailVO> selectStockByWareNo(WareHouseDetailVO vo) {
		return mapper.selectStockByWareNo(vo);
	}

	@Override
	public List<WareHouseDetailVO> selectStockByAreaNo(WareHouseDetailVO vo) {
		return mapper.selectStockByAreaNo(vo);
	}

	@Override
	public List<WareHouseDetailVO> selectStockByRackNo(WareHouseDetailVO vo) {
		return mapper.selectStockByRackNo(vo);
	}

	@Override
	public List<WareHouseDetailVO> selectStockByCellNo(WareHouseDetailVO vo) {
		return mapper.selectStockByCellNo(vo);
	}

	/* ajax페이징 */
	@Override
	public PageForWareHouseDTO<WareHouseDetailVO> getListPage(CriteriaForWareHouse cri) {
		System.out.println(" 서비스impl에 도달 getCountAll 진입전");
		System.out.println("cri ware_no는:"+cri.getWare_no());
		System.out.println("cri area_no는:"+cri.getArea_no());
		System.out.println("cri rack_no는:"+cri.getRack_no());
		System.out.println("cri cell_no는:"+cri.getCell_no());
		int totalCount = mapper.getCountAll(cri);
		System.out.println("getCountAll 통과totalCount: "+totalCount);
		
		System.out.println("cri어마운트"+cri.getAmount()); 
		System.out.println("cri페이지넘"+cri.getPageNum()); 
		
		
		List<WareHouseDetailVO> list = mapper.getListWithPaging(cri); 
		System.out.println("getListWithPaging 통과list크기는: "+list.size());
		PageForWareHouseDTO<WareHouseDetailVO> pageDTO = new PageForWareHouseDTO<WareHouseDetailVO>(totalCount, list, cri);
		
		return pageDTO;
	}

}
