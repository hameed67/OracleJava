/**
 * Class defining the elements of a wood type
 */
package model;

/**
 * @author USER
 *
 */
public class WoodItem {

	String type;
	Double baseDeliveryTime;
	Double price;
	
	/**
	 * Default constructor 
	 */
	public WoodItem(){
		this.type = "Empty";
		this.baseDeliveryTime = 0.0;
		this.price = 0.0;
	}
	
	/**
	 * Constructor of a WoodItem element with parameters
	 * @param type Name of the wood type
	 * @param daseDeliveryTime base delivery time
	 * @param price price per Bare Foot
	 */
	public WoodItem(String type, Double baseDeliveryTime, Double price) {
		this.type = type;
		this.baseDeliveryTime = baseDeliveryTime;
		this.price = price;
	}

	/**
	 * Get the type of Wood
	 * 
	 * @return Name of the WoodItem
	 */
	public String getType() {
		return type;
	}
	
	/*
	 * Ensure the type entered by the customer is valid 
	 * 
	 */
	public boolean verifyType(String type){
		if (!type.equals("Cherry") | !type.equals("Curly Maple") | !type.equals("Genuine Mahogany") | !type.equals("Wenger")
				| !type.equals("White Oak") | !type.equals("Sawdust")){
			return false;
		}
		return true;
	}

	/**
	 * Get the base delivery time
	 * 
	 * @return the baseDeliverytime
	 */
	public Double getDaseDeliveryTime() {
		return baseDeliveryTime;
	}

	/**
	 * 
	 * Get the price per Bare Foot
	 * 
	 * @return the price for 1 Bare Foot of this WoodItem
	 */
	public Double getPrice() {
		return price;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 * You may implement this method to fit your needs
	 */
	@Override
	public String toString() {	
		return "";
	}
	
}
