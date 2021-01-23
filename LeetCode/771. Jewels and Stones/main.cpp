#include <iostream>
#include <set>

// Wrong Solution because

int numJewelsInStones(const std::string& jewels, const std::string& stones) {
    int count = 0;

    for(auto stone: stones)
    {
        for(auto jewelry: jewels)
            if(stone == jewelry) count++;
    }

    return count;
}

// Correct Solution
int numJewelsInStonesCorrect(const std::string& jewels, const std::string& stones) {
    int count = 0;
    std::set<char> uniqueJewels;

    for(auto jewelry: jewels)
        uniqueJewels.insert(jewelry);

    for(auto stone: stones){
        if(uniqueJewels.count(stone))
            count++;
    }

    return count;
}

int main() {
    std::cout << "- Number of stones that are jewels: " << numJewelsInStones("aAAAAAAA", "aAAbbbb") << std::endl;
    std::cout << "- Number of stones that are jewels: " << numJewelsInStonesCorrect("aA", "aAAbbbb") << std::endl;
    return 0;
}
