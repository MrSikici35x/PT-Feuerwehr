package application;

import java.util.Random;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;

public class Controller {
	
	@FXML
	private ImageView house1 = new ImageView();
	@FXML
	private ImageView house2 = new ImageView();
	@FXML
	private ImageView house3 = new ImageView();
	@FXML
	private ImageView house4 = new ImageView();
	@FXML
	private ImageView house5 = new ImageView();
	@FXML
	private ImageView house6 = new ImageView();
	@FXML
	private ImageView house7 = new ImageView();
	@FXML
	private ImageView house8 = new ImageView();
	@FXML
	private ImageView house9 = new ImageView();
	@FXML
	private ImageView house10 = new ImageView();
	@FXML
	private ImageView house11 = new ImageView();
	@FXML
	private ImageView house12 = new ImageView();
	@FXML
	private ImageView house13 = new ImageView();
	@FXML
	private ImageView house14 = new ImageView();
	@FXML
	private ImageView house15 = new ImageView();
	@FXML
	private ImageView house16 = new ImageView();
	@FXML
	private ImageView house17 = new ImageView();
	@FXML
	private ImageView house18 = new ImageView();
	@FXML
	private ImageView house19 = new ImageView();
	@FXML
	private ImageView house20 = new ImageView();
	@FXML
	private ImageView house21 = new ImageView();
	@FXML
	private ImageView house22 = new ImageView();
	@FXML
	private ImageView house23 = new ImageView();
	@FXML
	private ImageView house24 = new ImageView();
	@FXML
	private ImageView fireStation = new ImageView();

	private Model model;
	
	private int maxX = 1080;
	private int minX = 40;
	private int maxY = 655;
	private int minY = 60;
	private double visible= 1.0;
	private double unvisible= 0.0;
	
	public void initModel(Model model) {
		if (this.model != null) {
			throw new IllegalStateException("Model can only be initialized once");
		}
		this.model = model;
	}
	
	public void generateHouses() {
		fireStation.setOpacity(unvisible);
		house1.setX(RandomNumber(maxX, minX));
		house1.setY(RandomNumber(maxY, minY));
		house2.setX(RandomNumber(maxX, minX));
		house2.setY(RandomNumber(maxY, minY));
		house3.setX(RandomNumber(maxX, minX));
		house3.setY(RandomNumber(maxY, minY));
		house4.setX(RandomNumber(maxX, minX));
		house4.setY(RandomNumber(maxY, minY));
		house5.setX(RandomNumber(maxX, minX));
		house5.setY(RandomNumber(maxY, minY));
		house6.setX(RandomNumber(maxX, minX));
		house6.setY(RandomNumber(maxY, minY));
		house7.setX(RandomNumber(maxX, minX));
		house7.setY(RandomNumber(maxY, minY));
		house8.setX(RandomNumber(maxX, minX));
		house8.setY(RandomNumber(maxY, minY));
		house9.setX(RandomNumber(maxX, minX));
		house9.setY(RandomNumber(maxY, minY));
		house10.setX(RandomNumber(maxX, minX));
		house10.setY(RandomNumber(maxY, minY));
		house11.setX(RandomNumber(maxX, minX));
		house11.setY(RandomNumber(maxY, minY));
		house12.setX(RandomNumber(maxX, minX));
		house12.setY(RandomNumber(maxY, minY));
		house13.setX(RandomNumber(maxX, minX));
		house13.setY(RandomNumber(maxY, minY));
		house14.setX(RandomNumber(maxX, minX));
		house14.setY(RandomNumber(maxY, minY));
		house15.setX(RandomNumber(maxX, minX));
		house15.setY(RandomNumber(maxY, minY));
		house16.setX(RandomNumber(maxX, minX));
		house16.setY(RandomNumber(maxY, minY));
		house17.setX(RandomNumber(maxX, minX));
		house17.setY(RandomNumber(maxY, minY));
		house18.setX(RandomNumber(maxX, minX));
		house18.setY(RandomNumber(maxY, minY));
		house19.setX(RandomNumber(maxX, minX));
		house19.setY(RandomNumber(maxY, minY));
		house20.setX(RandomNumber(maxX, minX));
		house20.setY(RandomNumber(maxY, minY));
		house21.setX(RandomNumber(maxX, minX));
		house21.setY(RandomNumber(maxY, minY));
		house22.setX(RandomNumber(maxX, minX));
		house22.setY(RandomNumber(maxY, minY));
		house23.setX(RandomNumber(maxX, minX));
		house23.setY(RandomNumber(maxY, minY));
		house24.setX(RandomNumber(maxX, minX));
		house24.setY(RandomNumber(maxY, minY));
	}
	
	public void generateFireStation() {
		fireStation.setX(RandomNumber(maxX, minX));
		fireStation.setY(RandomNumber(maxY, minY));
		fireStation.setOpacity(visible);
	}
	
	/**
	 * Normal Methode just to create random numbers in a given range
	 * 
	 * @param max
	 * @param min
	 * @return
	 */
	public int RandomNumber(int max, int min) {
		Random randomNumber = new Random();
		int answer = randomNumber.nextInt(max - min + 1) + min;
		return answer;
	}
}
