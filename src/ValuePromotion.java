public class ValuePromotion implements IPromotion {


    public boolean CanCalculate(Cart cart){
        double koszykBrutto = cart.totalPriceOfProducts();
        if (koszykBrutto >= 300)
            return true;
        else
            return false;

    }

    public void CalculateOffer(Cart cart){
        if (this.CanCalculate(cart)){
            cart.promotionSumOfProducts = cart.totalPriceOfProducts() * 0.95;

        }
    }
    public String toString() {
        return "ValuePromotion [5% off]";
    }
}
