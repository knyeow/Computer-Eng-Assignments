

#include <iostream>
using namespace std;
class Queue
{
	int* arr;
	int length;
	int first;
	int capacity;
	int order;

public:
	Queue(int size)
	{
		arr = new int[size];
		length = size;
		capacity = size;
		first = 0;
		order = 0;
	}
	void push(int x)
	{
		if (order < capacity)
		{
			arr[order] = x;
			order++;
		}
	}
	void pop()
	{
		if (capacity > 0)
		{
			first++;
			capacity--;
		}
		else
			cout << "No element left in queue" << endl;
	}
	int front()
	{
		if (arr[first] != NULL)
			return arr[first];
		else
			return -1;
	}
	int back()
	{
		return arr[order - 1];
	}
	int size()
	{
		return capacity;
	}
	int arrLength() {
		return length;
	}
	bool empty()
	{
		if (capacity == 0)
			return true;
		else
			return false;
	}

};

class Stack {
	int* arr;
	int last;
	int capacity;
public:
	Stack(int size) {
		arr = new int[size];
		capacity = size;
		last = -1;
	};


	int size() {
		return capacity;
	};
	int top() {
		if (last != -1)
			return arr[last];
		else return 0;

	};


	bool empty() {
		return last == -1;
	};


	void pop() {
		if (last != -1)
			last--;
		capacity--;
	};

	void push(int x) {
		arr[last + 1] = x;
		last++;
	};



};

int main()
{
	srand(time(NULL));

	Queue queue(100);
	Stack stack(100);

	for (int i = 0; i < queue.arrLength(); i++)
	{
		queue.push(rand() % 1001);
	}

	for (int i = 0; i < queue.arrLength(); i++) {
		stack.push(queue.front());
		queue.pop();

	}

}


