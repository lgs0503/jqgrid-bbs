package com.bbs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.bbs.vo.BoardVO;

@Mapper
public interface BoardMapper {

	public List<BoardVO> getBoardList();
	
}