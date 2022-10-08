

#include <iostream>
#include <stack>
#include <ctime>
using namespace std;


bool isFound = false;

void printStackElements(stack<int> stack, int prediction) {

	while (!stack.empty() && !isFound) {

		if (stack.top() == prediction)
		{
			cout << "its inside and number of it is:" << stack.size() << endl;
			isFound = true;
		}
		else
			stack.pop();
	}
}



int main()
{
	//empty,size,push,pop,top
	stack<int>numbers;

	srand(time(NULL));

	for (int i = 0; i < 100; i++) {
		numbers.push(rand() % 100);
		cout << numbers.top() << endl;
	}

	printStackElements(numbers, 68);

}


