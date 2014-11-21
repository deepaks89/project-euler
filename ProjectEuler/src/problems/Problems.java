package problems;
public class Problems {

	public void problem1() {
		int sum = 0;

		for (int i = 1; i < 1000; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println("Sum: " + sum);
	}

	public void problem2() {
		int i = 1;
		int j = i;
		int temp = 0;
		int sum = 0;

		while (sum <= 4000000) {
			temp = i + j;
			if (temp % 2 == 0) {
				sum += temp;
			}
			i = j;
			j = temp;
		}
		System.out.println("Sum: " + sum);
	}
	
	public void problem3() {
		long number = 600851475143l;
		boolean prime = true;
		long largest = 0;

		for (long i = number/2; i >= 2; i--) {
			if (number % i == 0) {
				for (long j = 2; j <= i / 2; j++) {
					if (i % j == 0) {
						prime = false;
						break;
					}
				}
				if (prime) {
					largest = i;
					break;
				}
				prime = true;
			}
		}
		System.out.println("Largest: " + largest);
	}
	
	public void problem4() {
		boolean palin = false;
		String product = null;
		int largest = 0;
		
		for (int i=999;i>=1;i--) {
			for (int j=999;j>=1;j--) {
				product = "" + i*j;
				for (int k=0; k<product.length();k++) {
					if(product.charAt(k) == product.charAt(product.length() - 1 - k)) {
						palin = true;
					} else {
						palin = false;
						break;
					}
				}
				if(palin && Integer.parseInt(product) > largest) {
					largest = Integer.parseInt(product);
				}
			}
		}
		System.out.println("Largest Palindrome: " + largest);
	}
	
	public void problem5() {
		boolean result = false;
		int number = 20;
		while(!result) {
			for (int i=1; i<=20; i++) {
				if(number % i == 0) {
					result = true;
				} else {
					result = false;
					break;
				}
			}
			if(result) {
				System.out.println("Smallest number: " + number);
				break;
			} else {
				number++;
			}
		}
	}
	
	public void problem6() {
		int sum = 0;
		int squares = 0;
		int difference = 0;
		
		for (int i=1;i<=100;i++) {
			sum += i*i;
			squares += i;
		}
		squares = squares * squares;
		
		difference = Math.abs(sum - squares);
		System.out.println("Difference: " + difference);
	}
	
	public void problem7() {
		boolean prime = true;
		boolean end = false;
		int n = 0;
		
		for(int i=2; !end;i++){
			for(int j=2; j<=i/2;j++) {
				if(i%j == 0) {
					prime = false;
					break;
				}
			}
			if(prime) {
				n+=1;
				if(n == 10001) {
					end = true;
					System.out.println("10001th prime: " + i);
				}
			}
			prime = true;
		}
	}
	
	public void problem8() {
		String number = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450";
		int length = number.length();
		long product = 1;
		long greatest = 0;
		
		for(int i=0; i<length - 12;i++) {
			for(int j=0; j<13; j++) {
				product = product * Character.getNumericValue(number.charAt(i + j));
			}
			if(product > greatest) {
				greatest = product;
			}
			product = 1;
		}
		System.out.println("Greatest Product: " + greatest);
	}
	
//	bjfkjfhkjdsahfkj
}

