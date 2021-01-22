#include <iostream>
#include <vector>

// O(N) space
// O(N/2) time

std::vector<int> shuffle(std::vector<int>& numbers, int n){
    std::vector<int> result;

    for(int i = 0; i < n; i++){
        result.push_back(numbers[i]);
        result.push_back(numbers[i + n]);
    }
    return result;
}

// works for lists of odd size..
// I will figure out a solution for the even numbers and update..

std::vector<int> shuffle2(std::vector<int>& numbers, int n) {
    int j = n;

    for(int i = 1; i < 2*n; i++){
        if(i == n && j == 2*n - 1){
            std::swap(numbers[i], numbers[i - 1]);
            break;
        }
        std::swap(numbers[i], numbers[j]);
        j++;
    }
    return numbers;
}

int main() {
    std::vector<int> numbers = {2, 5, 1, 3, 4, 7};

    shuffle(numbers, 3);

    for(auto number: numbers)
        std::cout << number << " ";

    return 0;
}
