package connect;

public class APP {
	public static void main(String [] arg) throws ClassNotFoundException {
		VilleFranceDAOImpl villeFrance = new VilleFranceDAOImpl();
		villeFrance.findVille();
	}

}
