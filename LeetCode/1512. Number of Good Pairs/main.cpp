#include <iostream>
#include <vector>
#include <unordered_map>

// O(N^2) Solution

int numIdenticalPairs(std::vector<int>& numbers) {
    int identicalPairs = 0;

    for(int i = 0; i < numbers.size(); i++){
        for(int j = i + 1; j < numbers.size(); j++){
            if(numbers[i] == numbers[j])
                identicalPairs++;
        }
    }

    return identicalPairs;
}

// O(N) Solution
int numIdenticalPairsOptimized(std::vector<int>& numbers) {
    int identicalPairs = 0;
    std::unordered_map<int, int> occurrences;

    for(auto number: numbers) {
        if(occurrences.count(number))
            occurrences[number]++;
        else
            occurrences[number] = 0;

        identicalPairs += occurrences[number];
    }
    return identicalPairs;
}

int main() {
    std::vector<int> numbers = {1, 1, 1, 1};

    std::cout << "- Number of Identical Pairs: " << numIdenticalPairs(numbers) << std::endl;
    std::cout << "- Number of Identical Pairs: " << numIdenticalPairsOptimized(numbers) << std::endl;
    return 0;
}
