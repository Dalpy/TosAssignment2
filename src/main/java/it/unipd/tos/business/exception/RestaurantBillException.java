////////////////////////////////////////////////////////////////////
// Simone Dal Pont 1143262
////////////////////////////////////////////////////////////////////
package it.unipd.tos.business.exception;

public class RestaurantBillException extends Throwable {
	private String message;

	public RestaurantBillException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
}
