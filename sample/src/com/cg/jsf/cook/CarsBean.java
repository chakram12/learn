package com.cg.jsf.cook;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;

// this class contain collection of cars ( we simulates the table data base with few manual instances)


@ManagedBean(name="carsBean")
@SessionScoped
public class CarsBean {
	
	private HashMap<Integer, CarBean> myCars = new HashMap<Integer,CarBean>();
	private List<SelectItem> carItems = new LinkedList<SelectItem>();
	private CarBean selectedCar;
	
	public CarsBean(){
		CarBean car_1 = new CarBean(1,"Ferrari");
		CarBean car_2 = new CarBean(2,"Tata");
		CarBean car_3 = new CarBean(3,"Scoda");
		CarBean car_4 = new CarBean(4,"Ford");
		CarBean car_5 = new CarBean(5,"Adi");
		carItems.add(new SelectItem(car_1,car_1.getCarName()));
		myCars.put(car_1.getCarNumber(), car_1);
		
		carItems.add(new SelectItem(car_2,car_2.getCarName()));
		myCars.put(car_2.getCarNumber(), car_2);
		carItems.add(new SelectItem(car_3,car_3.getCarName()));
		myCars.put(car_3.getCarNumber(), car_3);
		carItems.add( new SelectItem(car_4,car_4.getCarName()));
		myCars.put(car_4.getCarNumber(), car_4);
		carItems.add( new SelectItem(car_5,car_5.getCarName()));
		myCars.put(car_5.getCarNumber(), car_5);
		
	}
public CarBean getCar(Integer number) {
	return (CarBean)myCars.get(number);
	
}
public List<SelectItem>getCarItems() {
	return carItems;
}
public void setCarItems(List<SelectItem>carItem){
	this.carItems =carItem;
}
public CarBean getSeleCar(){
	return this.selectedCar;
}
public void setSelectedCar(CarBean selectedCar){
	this.selectedCar =selectedCar;
}
public CarBean getSelectedCar() {
	return selectedCar;
}


}
