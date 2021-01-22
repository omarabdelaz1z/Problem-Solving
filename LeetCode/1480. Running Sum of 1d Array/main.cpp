#include <iostream>
#include <vector>

std::vector<int> runningSum(std::vector<int>& numbers) {
    for(int i = 1; i < numbers.size(); i++)
        numbers[i]+= numbers[i - 1];

    return numbers;
}

int main() {
    std::vector<int> numbers = {3, 1, 2, 10, 1};
    runningSum(numbers);

    for(auto number : numbers)
        std::cout << number << " ";

    return 0;
}
