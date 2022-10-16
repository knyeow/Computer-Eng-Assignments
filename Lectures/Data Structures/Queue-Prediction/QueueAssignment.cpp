#include <iostream>
#include <ctime>


using namespace std;

class Queue {
	int* arr;
	int first;	
	int capacity;
	int order;
public:
	Queue(int size) {
		arr = new int[size];
		capacity = size;
		first = 0;
		order = 0;
	
	}
	void push(int x) {
		if (order < capacity) {
			arr[order] = x;
			order++;
			
		}

	}
	void pop() {
		if (capacity >0) {
			first++;
			capacity--;
		}
		else
			cout << "No element left in queue" << endl;

	}
	int front() {
		if (arr[first] != NULL)
			return 	arr[first];
		else
			return -1;


	}
	int back() {
		return 	arr[order - 1];
	}
	int size() {
		return capacity;

	}
	int head() {
		return first + 1;
	}
	bool empty() {
		if (capacity ==0 )
			return true;
		else
			return false;

	}




};

void CheckQueue(Queue queue, int prediction) {
	while (!queue.empty()) {
		if (queue.front() == prediction) {
			cout << queue.head() << ". element is your prediction" << endl;
			return;
		}
		else queue.pop();

	}
	if(queue.empty()){
		cout << "There is no " << prediction << " in the queue" << endl;
	}



}


 int main()
 {
	 
	 srand(time(NULL));

	 Queue queue(100);

	 for (int i = 0; i < 100; i++) {
		 queue.push(rand() % 1001);		 
	 }
	 CheckQueue(queue, 63);
	
		 //heap.push(rand() % 1001);


 }

 
