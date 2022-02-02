/**
 * @author waleed
 *
 * 02-Feb-2022
 */

package com.Spring_Jdbc;

import java.sql.Connection;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("dao")
public class DbOperations {

	DataSource dataSource;

	JdbcTemplate jdbcTemplate;

	String qry;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	Integer getCountOfStudents() {

		return jdbcTemplate.queryForObject("select count(*) from students", Integer.class);
	}

}
