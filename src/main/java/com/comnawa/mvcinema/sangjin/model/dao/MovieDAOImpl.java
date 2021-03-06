package com.comnawa.mvcinema.sangjin.model.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.comnawa.mvcinema.sangjin.model.dto.MovieDTO;

@Repository
public class MovieDAOImpl implements MovieDAO {
	@Inject
	SqlSession sqlSession;

	@Override
	public List<MovieDTO> movieList(String order_type) {
		return sqlSession.selectList("movie.movie_list", order_type);
	}

	@Override
	public List<MovieDTO> ScdmovieList() {
		return sqlSession.selectList("movie.scdmovie_list");
	}

	@Override
	public MovieDTO movie_view(int idx) {
		return sqlSession.selectOne("movie.movie_detail", idx);
	}

	@Override
	public List<MovieDTO> searchMovie(String keyword) {
		return sqlSession.selectList("movie.search_movie", keyword);
	}

}
