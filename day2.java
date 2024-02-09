/*In main(), there is a variable called subtotal, which represents the subtotal of an amount to pay on a bill, and a variable called tax, which represents the tax rate that will be applied to that subtotal.

Create a double variable, total, that holds subtotal plus the product of subtotal and tax.

Print the total variable!


Stuck? Get a hint
Checkpoint 2 Passed
2.
There were 4 people who bought this meal together and want to split the cost.

Create a double variable called perPerson that holds total divided by 4.

Print the perPerson variable!*/

public class day2 {
	public static void main(String[] args) {   
		double subtotal = 30;
    double tax = 0.0875;
    double total = subtotal+(subtotal*tax);
    double perPerson = total/4;
    System.out.println(perPerson);
	}
}
