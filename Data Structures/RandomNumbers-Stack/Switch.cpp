#include <iostream>
#include <ctime>


using namespace std;


bool isFound = false;




 class Heap {
	int* arr;
	int last;
	int capacity;
public:
	Heap(int size) {
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

 void checkHeap(Heap heap,int prediction){
	 while (!heap.empty())
	 {
		 if (heap.top() == prediction) {
			 cout <<"------------------" << heap.size() << ". number is " << prediction << endl;
			 return;
		 }
		 else
			 heap.pop();

	 }

}

 int main()
 {

	 srand(time(NULL));

	 Heap heap(100);
	 for (int i = 0; i < 100; i++) {
		 heap.push(rand() % 1001);

	 }
	 checkHeap(heap, 68);

 }

