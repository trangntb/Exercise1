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


public class BuildingDAOInterface implements DAOInterface<BuildingDAO>{

	public static BuildingDAOInterface getInstance() {
		return new BuildingDAOInterface();
	}
	
	@Override
	public List<BuildingDAO> selectBy(BuildingDAO buildingDAO)
	{
		List<BuildingDAO> results = new ArrayList<>();
		Connection con=null;
		try {
			String name = buildingDAO.getName();
			String street =buildingDAO.getStreet();
			String ward=buildingDAO.getWard();
			String district=buildingDAO.getDistrict(); 
			String floorarea=buildingDAO.getFloorarea();
			String type = buildingDAO.getType();
			StringBuilder sql= new StringBuilder("SELECT * FROM building "+SystemConstant.ONE_EQUAL_ONE);
			if(!StringUtils.isNullOrEmpty(name))
				sql.append(" and name like '%" + name+"%'");
			if(!StringUtils.isNullOrEmpty(street))
				sql.append(" and street like '%" + street+"%'");
			if(!StringUtils.isNullOrEmpty(ward))
				sql.append(" and ward like '%" + ward+"%'");
			if(!StringUtils.isNullOrEmpty(district))
				sql.append(" and district like '%" + district+"%'");
			if(floorarea != null) 
				sql.append(" and floorarea = " + floorarea);
			if(!StringUtils.isNullOrEmpty(type))
				sql.append(" and type like '%" + type+"%'");
			System.out.println(sql);
			
			//Buoc 1: Tao ket noi den CSDL
			con = ConnectionUtils.getConnection();
			
			//Buoc 2: Tao doi tuong Statement
			Statement st = con.createStatement();
			
			//Buoc 3: Thuc thi cau lenh SQL
			ResultSet rs = st.executeQuery(sql.toString());
			
			//Buoc 4: 
			while(rs.next()) {
				BuildingDAO result = new BuildingDAO();
				result.setId(rs.getString("id")); 
				result.setName(rs.getString("name"));
				result.setStreet( rs.getString("street")); 
				result.setWard(rs.getString("ward"));
				result.setDistrict (rs.getString("district"));
				result.setFloorarea(rs.getString("floorarea"));
				result.setType(rs.getString("type"));
				
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
