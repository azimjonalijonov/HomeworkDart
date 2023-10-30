//Task1
// void main(){
//   print('Azimjon Alijonov');
// }

//Task2

// void main(){
// int num =12;
//   if(num%2==0){
//     print('EVEN');
//   }else{
//     print('ODD');
//   }
// }

//Task3

// void main() {
//   print('Even numbers up to 100:');
//   for (int i = 0; i <= 100; i++) {
//     if (i % 2 == 0) {
//       print(i);
//     }
//   }

//   print('Odd numbers up to 100:');
//   for (int i = 0; i <= 100; i++) {
//     if (i % 2 != 0) {
//       print(i);
//     }
//   }
// }


//TASK4

// void main() {
//   List<int> a = [1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89];

//    List<int> squaredList = a.map((element) => element * element).toList();

//    print('Original List: $a');
//   print('Squared List: $squaredList');
// }

//TASK5
// void main() {
//   int number = 4;

//   List<int> divisors = findDivisors(number);

//   print('Divisors of $number (excluding 1):');
//   for (int divisor in divisors) {
//     print(divisor);
//   }
// }

// List<int> findDivisors(int number) {
//   List<int> divisors = [];

//   for (int i = 2; i <= number; i++) {
//     if (number % i == 0) {
//       divisors.add(i);
//     }
//   }

//   return divisors;
// }

// Task6
// void main() {
//   List<int> a = [1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89];
//   List<int> b = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 89];

//   List<int> matchingElements = findMatchingElements(a, b);

//   print('Matching elements between List a and List b:');
//   for (int element in matchingElements) {
//     print(element);
//   }
// }

// List<int> findMatchingElements(List<int> list1, List<int> list2) {
//   List<int> result = [];

//   for (int element in list1) {
//     if (list2.contains(element) && !result.contains(element)) {
//       result.add(element);
//     }
//   }

//   return result;
// }

// Task7
// import 'dart:io';

// void main() {
//   stdout.write('Enter a number: ');
//   int number = int.parse(stdin.readLineSync());

//   if (isPrime(number)) {
//     print('$number is a prime number.');
//   } else {
//     print('$number is not a prime number.');
//   }
// }

// bool isPrime(int number) {
//   if (number <= 1) {
//     return false;
//   }

//   for (int i = 2; i * i <= number; i++) {
//     if (number % i == 0) {
//       return false;
//     }
//   }

//   return true;
// }


// task8
// void main() {
//   List<int> numbers = [1, 1, 2, 3, 3, 4, 5, 5, 6, 6];

//   List<int> distinctNumbers = findDistinctElements(numbers);

//   print('Distinct elements in the list:');
//   for (int number in distinctNumbers) {
//     print(number);
//   }
// }

// List<int> findDistinctElements(List<int> numbers) {
//   List<int> distinctNumbers = [];
//   for (int number in numbers) {
//     if (!distinctNumbers.contains(number)) {
//       distinctNumbers.add(number);
//     }
//   }
//   return distinctNumbers;
// }




// TAK9
// void main() {
//   int limit = 100;
//   List<int> fibonacciSequence = generateFibonacciSequence(limit);

//   print('Fibonacci sequence up to $limit:');
//   print(fibonacciSequence);
// }

// List<int> generateFibonacciSequence(int limit) {
//   List<int> sequence = [];
//   int a = 0, b = 1;

//   while (a <= limit) {
//     sequence.add(a);
//     int next = a + b;
//     a = b;
//     b = next;
//   }

//   return sequence;
// }


// TASK10

// void main() {
//   int n = 10;
//   int result = generateFibonacciWithMemoization(n);

//   print('Fibonacci number at position $n is $result');
// }

// Map<int, int> memoizationCache = {};

// int generateFibonacciWithMemoization(int n) {
//   if (n <= 1) {
//     return n;
//   }

//   if (memoizationCache.containsKey(n)) {
//     return memoizationCache[n];
//   }

//   int result = generateFibonacciWithMemoization(n - 1) + generateFibonacciWithMemoization(n - 2);
//   memoizationCache[n] = result;
//   return result;
// }


// TAsK11

// void main() {
//   String password = "MyPassword123";
//   String strength = checkPasswordStrength(password);

//   print('Password strength: $strength');
// }

// String checkPasswordStrength(String password) {
//   if (password.length < 8) {
//     return 'Weak';
//   }

//   bool hasUppercase = false;
//   bool hasLowercase = false;
//   bool hasDigit = false;

//   for (int i = 0; i < password.length; i++) {
//     if (password[i].toUpperCase() != password[i]) {
//       hasLowercase = true;
//     }
//     if (password[i].toUpperCase() == password[i]) {
//       hasUppercase = true;
//     }
//     if (int.tryParse(password[i]) != null) {
//       hasDigit = true;
//     }
//   }

//   if (hasUppercase && hasLowercase && hasDigit) {
//     return 'Strong';
//   } else if (hasUppercase || hasLowercase || hasDigit) {
//     return 'Normal';
//   } else {
//     return 'Weak';
//   }
// }


// task12



void main() {
        generateTable(3, 3);
        }

        void generateTable(int rows, int cols) {
        for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
        print('--- ');
        }


        for (int j = 0; j < cols; j++) {
        print('| | ');
        }

        }

        for (int j = 0; j < cols; j++) {
        print('--- ');
        }

        }
