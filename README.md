# Incubyte Assignment

- Version: 0.1.0

**Steps to create this project**
* Create a Maven project with java 8.
* add dependency in the pom file.
* create a add method in the StringCalculator class.
* implement the addition code in the add method.
* take input from user and handle the scenerios like negative numbers, empty number, delimeters.
* based on the scenerios, create some testcases and add assertions and check the ans.

**Some Testcases are:**
> An empty string will return 0. 
* input -> " " : ans -> 0. 

> Start with simplest testcase of a number this will return it.
* input -> "1" : ans -> 1 

> Start with simplest testcase of a number this will add up.
* input -> "1" : ans -> 1 , input -> "1,2" : ans -> 3

> Allow the Add method to handle new lines between numbers (instead of commas)
* input: “1\n2,3” should return 6.
* input: “1,\n” should return 1.

> Numbers bigger than 1000 should be ignored.
* input -> “1001,2” returns 2

> Allow the Add method to handle a different delimiter.
* input -> “//;\n1;2” should return 3 (the delimiter is ;)

> Add with a negative number will throw an exception “Negatives not allowed: “ listing all negative numbers that were in the list of numbers.
* input -> “-1,2” throws “Negatives not allowed: -1”
* input -> “2,-4,3,-5” throws “Negatives not allowed: -4,-5”
