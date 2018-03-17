public class MugPromotion implements IPromotion{

    public boolean CanCalculate(Cart cart) {
        double koszykBrutto = cart.totalPriceOfProducts();
        if (koszykBrutto >= 200)
            return true;
        else
            return false;
    }

    boolean mugAdded(Cart cart) {
        boolean itIs = false;
        for(CartItem it : cart.getItems()) {
            if (it.getProduct().getName().equals("Kunek promocyjny")) {
                itIs = true;
            }
        }
        return itIs;
    }
    public void CalculateOffer(Cart cart) {
        if (this.CanCalculate(cart) && !this.mugAdded(cart))
            cart.addProduct(new Product("Kubek promocyjny", 0.01));
    }
    public String toString() {
        return "MugPromotion [Kubek promocyjny]";
    }
}
