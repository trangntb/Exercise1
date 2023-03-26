package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import constant.SystemConstant;
import utils.ConnectionUtils;
import utils.StringUtils;

public class CustomerDAOInterface implements DAOInterface<CustomerDAO> {

	public static CustomerDAOInterface getInstance() {
		return new CustomerDAOInterface();
	}
	@Override
	public List<CustomerDAO> selectBy(CustomerDAO customerDAO) {
		
		List<CustomerDAO> results = new ArrayList<>();
		Connection con=null;
		try {
			StringBuilder sql= new StringBuilder("SELECT * FROM customer "+SystemConstant.ONE_EQUAL_ONE);
			
			if(!StringUtils.isNullOrEmpty(customerDAO.getFullname()))
				sql.append(" and fullname like '%" + customerDAO.getFullname()+"%'");
			if(!StringUtils.isNullOrEmpty(customerDAO.getPhone()))
				sql.append(" and phone like '%" + customerDAO.getPhone()+"%'");
			if(!StringUtils.isNullOrEmpty(customerDAO.getEmail()))
				sql.append(" and email like '%" + customerDAO.getEmail()+"%'");
			
			if(customerDAO.getCreatedate() != null )
				sql.append(" and createdate like '%" + customerDAO.getCreatedate()+"%'");
			
			if( customerDAO.getModifieddate() != null)
				sql.append(" and modifieddate like '%" + customerDAO.getModifieddate()+"%'");
			if(!StringUtils.isNullOrEmpty(customerDAO.getCreateby()))
				sql.append(" and createby like '%" + customerDAO.getCreateby()+"%'");
			if(!StringUtils.isNullOrEmpty(customerDAO.getModifiedby()))
				sql.append(" and modifiedby like '%" + customerDAO.getModifiedby()+"%'");
			System.out.println(sql);
			
			//Buoc 1: Tao ket noi den CSDL
			con = ConnectionUtils.getConnection();
			
			//Buoc 2: Tao doi tuong Statement
			Statement st = con.createStatement();
			
			//Buoc 3: Thuc thi cau lenh SQL
			ResultSet rs = st.executeQuery(sql.toString());
			
			//Buoc 4: 
			while(rs.next()) {
				CustomerDAO result = new CustomerDAO();
				result.setId(rs.getLong("id")); 
				result.setFullname(rs.getString("fullname"));
				result.setPhone(rs.getString("phone")); 
				result.setEmail(rs.getString("email"));
				result.setCreateby(rs.getString("createby"));
				result.setModifiedby(rs.getString("modifiedby"));
				result.setCreatedate(rs.getDate("createdate"));
				result.setModifieddate(rs.getDate("modifieddate"));
				
				results.add(result);
			}
			
			//Buoc 5: Ngat ket noi
			ConnectionUtils.closeConnection(con);
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return results;
	}
	
}
