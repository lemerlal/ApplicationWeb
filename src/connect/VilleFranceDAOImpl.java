package connect;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class VilleFranceDAOImpl {
	
	Double latitudeVille1;
	Double longitudeVille1;
	Double latitudeVille2;
	Double longitudeVille2;
	Double distance;
	
	public Double findVille(String ville1, String ville2) throws ClassNotFoundException {
		
		
		try {
			Connection con =JDBCConfigurationSol2.getConnection();
			
			Statement statement = con.createStatement();
			
			ResultSet resultSetVille1 = statement.executeQuery("Select Latitude, Longitude From ville_france where Nom_commune = '"+ville1+"' LIMIT 1;");			

			while(resultSetVille1.next()) {
				latitudeVille1 = Double.parseDouble(resultSetVille1.getString("Latitude"));
				longitudeVille1 = Double.parseDouble(resultSetVille1.getString("Longitude"));
			}
			resultSetVille1.close();
			
			ResultSet resultSetVille2 = statement.executeQuery("Select Latitude, Longitude From ville_france where Nom_commune = '"+ville2+"' LIMIT 1;");

			while(resultSetVille2.next()) {
				latitudeVille2 = Double.parseDouble(resultSetVille2.getString("Latitude"));
				longitudeVille2 = Double.parseDouble(resultSetVille2.getString("Longitude"));
			}
			resultSetVille2.close();
			
			distance = distance(latitudeVille1,longitudeVille1,latitudeVille2,longitudeVille2);
			System.out.println("La distance est" +distance+ " Km");


			statement.close();
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return distance;
		
	}
	
	private static double distance(double lat1, double lon1, double lat2, double lon2) {
		if ((lat1 == lat2) && (lon1 == lon2)) {
			return 0;
		} else {
			double theta = lon1 - lon2;
			double dist = Math.sin(Math.toRadians(lat1)) * Math.sin(Math.toRadians(lat2))
					+ Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * Math.cos(Math.toRadians(theta));
			dist = Math.acos(dist);
			dist = Math.toDegrees(dist);
			dist = dist * 60 * 1.1515 * 1.609344;
			return (dist);
		}
	}

}
