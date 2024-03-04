package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MetierImpl implements ImetierCatalogue {
	@Override
	public List<Concert> getConcertsParMotCle(String mc) {
		List<Concert> prods = new ArrayList<Concert>();
		Connection conn = SingletonConnection.getConnection();
		try {

			PreparedStatement ps = conn.prepareStatement("select * from CONCERT where NOM_Concert LIKE ?");

			ps.setString(1, "%" + mc + "%");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Concert p = new Concert();
				p.setIdConcert(rs.getLong("ID_CONCERT"));
				p.setNomConcert(rs.getString("NOM_CONCERT"));
				p.setPrix(rs.getDouble("PRIX"));
				prods.add(p);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return prods;
	}

	@Override
	public void addConcert(Concert c) {
// TODO Auto-generated method stub
	}
}